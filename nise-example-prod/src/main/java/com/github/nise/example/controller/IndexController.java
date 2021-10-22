/**
 * https://github.com/zhihuihu
 * Copyright (c) 2016-2021 All Rights Reserved.
 */
package com.github.nise.example.controller;

import com.github.nise.example.dto.res.ServerRes;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author huzhihui
 * @version $ v 0.1 2021/10/22 20:16 huzhihui Exp $$
 */
@Api(tags = {"首页接口"})
@RestController
public class IndexController {

    @ApiOperation(value = "欢迎页接口")
    @RequestMapping(value = {"","/"},method = RequestMethod.GET)
    public String welcome(){
        return "<h1 style='text-align:center'>welcome page!</h1>";
    }

    @ApiOperation(value = "欢迎页接口")
    @RequestMapping(value = {"/serverInfo"},method = RequestMethod.GET)
    public ServerRes serverInfo(){
        ServerRes serverRes = new ServerRes();
        serverRes.setDesc("服务运行良好");
        return serverRes;
    }
}
