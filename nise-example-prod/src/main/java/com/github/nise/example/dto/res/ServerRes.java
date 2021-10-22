/**
 * https://github.com/zhihuihu
 * Copyright (c) 2016-2021 All Rights Reserved.
 */
package com.github.nise.example.dto.res;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author huzhihui
 * @version $ v 0.1 2021/10/22 20:23 huzhihui Exp $$
 */
@ApiModel("服务信息返回对象")
@Data
public class ServerRes {

    @ApiModelProperty(value = "服务详情描述")
    private String desc;
}
