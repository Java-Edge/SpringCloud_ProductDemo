package com.sss.product.service;

import com.sss.product.dataobject.ProductCategory;

import java.util.List;

/**
 * 类目
 *
 * @author shishusheng
 * @date 2018/6/9 14:37
 */
public interface CategoryService {

    /**
     *
     * @param categoryTypeList
     * @return
     */
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);
}
