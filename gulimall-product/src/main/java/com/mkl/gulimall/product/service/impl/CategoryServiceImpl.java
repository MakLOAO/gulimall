package com.mkl.gulimall.product.service.impl;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mkl.common.utils.PageUtils;
import com.mkl.common.utils.Query;

import com.mkl.gulimall.product.dao.CategoryDao;
import com.mkl.gulimall.product.entity.CategoryEntity;
import com.mkl.gulimall.product.service.CategoryService;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

    /** 
    * @Description: 三级菜单分类，递归获取子菜单
    * @Param: []
    * @return: java.util.List<com.mkl.gulimall.product.entity.CategoryEntity>
    * @Author: makaloo
    * @Date: 2021/2/1
    */
    
    @Override
    public List<CategoryEntity> listWithTree() {
        // 1.查出所有分类
        List<CategoryEntity> entities = baseMapper.selectList(null);
        // 2.组装成父子树形结构
        // 2.1 找出所有一级分类及其子分类
        List<CategoryEntity> level1Menus = entities
                .stream()
                .filter(categoryEntity -> categoryEntity.getParentCid() == 0)
                .map((menu) -> {
                    menu.setChildren(getChildren(menu, entities));
                    return menu;
                })
                .sorted((menu1, menu2) -> {
                    return (menu1.getSort() == null ? 0 : menu1.getSort()) - (menu2.getSort() == null ? 0 : menu2.getSort());
                })
                .collect(Collectors.toList());
        return entities;
    }

    /** 
    * @Description: 递归获取子菜单
    * @Param: [root, all]
    * @return: java.util.List<com.mkl.gulimall.product.entity.CategoryEntity>
    * @Author: makaloo
    * @Date: 2021/2/1
    */
    
    private List<CategoryEntity> getChildren(CategoryEntity root, List<CategoryEntity> all) {
        return all
                .stream()
                .filter(categoryEntity -> { return categoryEntity.getParentCid() == root.getCatId(); })
                .map(categoryEntity -> {
                    categoryEntity.setChildren(getChildren(categoryEntity, all));
                    return categoryEntity;
                })
                .sorted((menu1, menu2) -> { return (menu1.getSort() == null ? 0 : menu1.getSort()) - (menu2.getSort() == null ? 0 : menu2.getSort());})
                .collect(Collectors.toList());
    }
}