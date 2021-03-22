package com.imooc.api.controller.user;


import org.springframework.web.bind.annotation.GetMapping;

public interface HelloControllerApi {
    /**
     * api 的作用：
     *接口暴露给外部调用，统一在此进行管理调用
     * 运作：
     * 现在所有接口在此暴露，实现都在各自的微服务工程中
     * 只写接口，不写实现，实现在各自的微服务中
     * controller分散在各自的微服务中
     *
     * 微服务之间的调用都是基于接口的，接口的目的就是为了解耦
     *
     * Swagger2，基于接口的自动文档生成。
     * 所有的配置文件只需要一份，就能在当前项目中构建了
     * 方便管理，提高扩展度
     */
    @GetMapping("/hello")
    public Object hello();
}

