package com.yf.exam.modules.sys.depart.dto.response;

import com.yf.exam.modules.sys.depart.dto.SysDepartDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
* <p>
* 院系树结构响应类
* </p>
*/
@Data
@ApiModel(value="院系树结构响应类", description="院系树结构响应类")
public class SysDepartTreeDTO extends SysDepartDTO {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "子列表", required=true)
    private List<SysDepartTreeDTO> children;

    
}
