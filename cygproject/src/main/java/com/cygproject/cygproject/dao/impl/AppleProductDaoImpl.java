package com.cygproject.cygproject.dao.impl;

import com.cygproject.cygproject.dao.AppleProductDao;
import com.cygproject.cygproject.dao.mapper.AppleProductMapper;
import com.cygproject.cygproject.model.database.AppleProduct;
import com.cygproject.cygproject.model.database.AppleProductExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AppleProductDaoImpl implements AppleProductDao {

    @Autowired
    private AppleProductMapper appleProductMapper;


    @Override
    public List<AppleProduct> findApple() {
        AppleProductExample example = new AppleProductExample();
        return appleProductMapper.selectByExample(example);
    }

    @Override
    public List<AppleProduct> findAppleByName(String name) {
        AppleProductExample example = new AppleProductExample();
        AppleProductExample.Criteria criteria = example.createCriteria();
        criteria.andNameEqualTo(name);
        return appleProductMapper.selectByExample(example);
    }
}
