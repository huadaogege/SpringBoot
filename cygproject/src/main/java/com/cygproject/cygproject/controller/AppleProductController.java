package com.cygproject.cygproject.controller;

import com.cygproject.cygproject.common.ResponseBody;
import com.cygproject.cygproject.service.AppleProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/apple")
public class AppleProductController {

    private final Logger logger = LoggerFactory.getLogger(AppleProductController.class);

    @Autowired
    private AppleProductService appleProductService;

    @RequestMapping(value = "/getApple")
    public ResponseBody findApple(){
        logger.info("getApple method start...");
        ResponseBody responseBody = appleProductService.findApple();

        return responseBody;
    }

    @RequestMapping(value = "/getAppleByName", method = RequestMethod.GET)
    public ResponseBody findAppleByName (@RequestParam("name") String name) {
        logger.info("findAppleByName method start...");
        ResponseBody responseBody = appleProductService.findAppleByName(name);
        return responseBody;
    }
}
