package com.cygproject.cygproject.dao;

import com.cygproject.cygproject.model.database.AppleProduct;

import java.util.List;

public interface AppleProductDao {

    public List<AppleProduct> findApple();

    public List<AppleProduct> findAppleByName(String name);
}
