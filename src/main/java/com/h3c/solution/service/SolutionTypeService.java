package com.h3c.solution.service;

import java.util.List;

import com.h3c.solution.entity.SolutionType;

public interface SolutionTypeService {

    /**
     * 1、获取所有内容
     * @return
     */
    List<SolutionType> findAll();

    /**
     * 2、根据 id 查询一条记录
     * @param id
     * @return
     */
    SolutionType getSolutionTypeById(Integer id);

    /**
     * 3、增加一条记录
     * @param solutionType
     */
    void insertSolutionType(SolutionType solutionType);

    /**
     * 4、更新一条记录
     * @param solutionType
     */
    void updateSolutionType(SolutionType solutionType);

    /**
     * 5、删除一条记录
     * @param id
     */
    void deleteSolutionType(Integer id);

    /**
     * 6、批量删除记录
     * @param ids
     */
    void batchDeleteSolutionType(List<String> ids);
}
