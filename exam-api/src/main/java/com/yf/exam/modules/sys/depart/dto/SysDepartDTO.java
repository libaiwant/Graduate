package com.yf.exam.modules.sys.depart.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
* <p>
* 院系信息数据传输类
* </p>
*/
@Data
@ApiModel(value="院系信息", description="院系信息")
public class SysDepartDTO implements Serializable {

    private static final long serialVersionUID = 1L;
    
    
    @ApiModelProperty(value = "ID", required=true)
    private String id;
    
    @ApiModelProperty(value = "1院系2院系", required=true)
    private Integer deptType;
    
    @ApiModelProperty(value = "所属上级", required=true)
    private String parentId;
    
    @ApiModelProperty(value = "院系名称", required=true)
    private String deptName;
    
    @ApiModelProperty(value = "院系编码", required=true)
    private String deptCode;
    
    @ApiModelProperty(value = "排序", required=true)
    private Integer sort;
    
}
