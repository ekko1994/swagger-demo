package com.zh.swagger.config.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiParam;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @author zhanghao
 * @date 2020/7/4 - 15:20
 */
@ApiModel(value = "User对象")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class User {

    @ApiModelProperty("用户id")
    private Integer id;
    @ApiModelProperty("用户名字")
    private String name;
}
