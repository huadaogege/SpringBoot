package com.cygproject.cygproject.service;

import com.cygproject.cygproject.common.ResponseBody;

public interface AppleProductService {


    public ResponseBody findApple();

    public ResponseBody findAppleByName(String name);
}
