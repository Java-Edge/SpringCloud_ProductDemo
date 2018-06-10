package com.sss.product.service;

import com.sss.product.ProductApplicationTests;
import com.sss.product.dataobject.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
/**
 * @author shishusheng
 * @date 2018/6/10 01:42
 */
@Component
public class CategoryServiceTest extends ProductApplicationTests {

    @Autowired
    private CategoryService categoryService;

    @Test
    public void findByCategoryTypeIn() {
        List<ProductCategory> list = categoryService.findByCategoryTypeIn(Arrays.asList(11, 22));
        Assert.assertTrue(list.size() > 0);
    }
}