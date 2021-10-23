/**
 * zhihuihu.github.io.
 * Copyright (c) 2016-2019 All Rights Reserved.
 */
package com.github.nise.example.dto.req;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotEmpty;

/**
 * @author huzhi
 * @version $ v 0.1 2021/10/23 21:01 huzhi Exp $$
 */
@ApiModel("服务信息请求对象")
@Data
public class ServerReq {

    @NotEmpty(message = "{server_name_not_empty}")
    @ApiModelProperty(value = "名称")
    private String name;

    @ApiModelProperty(value = "服务详情描述")
    private String desc;

}
