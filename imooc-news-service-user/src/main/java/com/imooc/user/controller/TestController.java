package com.imooc.user.controller;

import com.imooc.api.controller.user.TestControllerApi;
import com.imooc.grace.result.IMOOCJSONResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController implements TestControllerApi {
    @GetMapping("/test")
    @Override
    public Object test() {
        return IMOOCJSONResult.errorMsg("error !");
    }
}
