package com.yf.exam.modules.exam.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yf.exam.modules.exam.entity.ExamDepart;

import java.util.List;

/**
* <p>
* 考试院系业务类
* </p>
*/
public interface ExamDepartService extends IService<ExamDepart> {

    /**
     * 保存全部
     * @param examId
     * @param departs
     */
    void saveAll(String examId, List<String> departs);


    /**
     * 根据考试查找对应的院系
     * @param examId
     * @return
     */
    List<String> listByExam(String examId);
}
