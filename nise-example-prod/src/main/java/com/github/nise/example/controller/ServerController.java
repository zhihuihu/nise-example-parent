/**
 * zhihuihu.github.io.
 * Copyright (c) 2016-2019 All Rights Reserved.
 */
package com.github.nise.example.controller;

import com.github.nise.common.utils.ResponseMessage;
import com.github.nise.example.dto.req.ServerReq;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * @author huzhi
 * @version $ v 0.1 2021/10/23 21:07 huzhi Exp $$
 */
@RestController
@RequestMapping(value = "server")
public class ServerController {

    @PostMapping(value = "add")
    public ResponseMessage add(@RequestBody @Valid ServerReq serverReq){
        ResponseMessage responseMessage = new ResponseMessage();
        return responseMessage;
    }
}
