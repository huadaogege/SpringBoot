package com.cygproject.cygproject.service.impl;

import com.cygproject.cygproject.common.RepResult;
import com.cygproject.cygproject.common.ResponseBody;
import com.cygproject.cygproject.dao.AppleProductDao;
import com.cygproject.cygproject.model.database.AppleProduct;
import com.cygproject.cygproject.service.AppleProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppleProductServiceImpl implements AppleProductService {

    @Autowired
    private AppleProductDao appleProductDao;

    @Override
    public ResponseBody findApple() {
        List<AppleProduct> apl = appleProductDao.findApple();
        ResponseBody rep = RepResult.getResult(RepResult.SUCCESS_CODE, apl);
        return rep;
    }

    @Override
    public ResponseBody findAppleByName(String name) {
        List<AppleProduct> apl = appleProductDao.findAppleByName(name);
        ResponseBody rep = RepResult.getResult(RepResult.SUCCESS_CODE, apl);
        return rep;
    }
}
