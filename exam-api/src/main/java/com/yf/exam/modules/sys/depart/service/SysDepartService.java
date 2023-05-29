package com.yf.exam.modules.sys.depart.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.yf.exam.core.api.dto.PagingReqDTO;
import com.yf.exam.modules.sys.depart.dto.SysDepartDTO;
import com.yf.exam.modules.sys.depart.dto.response.SysDepartTreeDTO;
import com.yf.exam.modules.sys.depart.entity.SysDepart;

import java.util.List;

/**
* <p>
* 院系信息业务类
* </p>
*/
public interface SysDepartService extends IService<SysDepart> {

    /**
     * 保存
     * @param reqDTO
     */
    void save(SysDepartDTO reqDTO);

    /**
    * 分页查询数据
    * @param reqDTO
    * @return
    */
    IPage<SysDepartTreeDTO> paging(PagingReqDTO<SysDepartDTO> reqDTO);

    /**
     * 查找院系树结构
     * @return
     */
    List<SysDepartTreeDTO> findTree();

    /**
     * 查找院系树
     * @param ids
     * @return
     */
    List<SysDepartTreeDTO> findTree(List<String> ids);

    /**
     * 排序
     * @param id
     * @param sort
     */
    void sort(String id, Integer sort);


    /**
     * 获取某个院系ID下的所有子院系ID
     * @param id
     * @return
     */
    List<String> listAllSubIds( String id);
}
