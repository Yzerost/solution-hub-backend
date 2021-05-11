package com.h3c.solution.service;

import com.h3c.solution.entity.SolutionVersion;
import java.util.List;

public interface SolutionVersionService {
    /**
     * 获取所有内容
     * @return
     */
    List<SolutionVersion> findAll();

    /**
     * 根据 id 查询一条记录
     * @param id
     * @return
     */
    SolutionVersion getSolutionVersionById(Integer id);

    /**
     * 根据 solution_id查询记录
     * @param solution_id
     * @return
     */

    List<SolutionVersion> getSolutionVersionBySolutionId(Integer solution_id);

    /**
     * 增加一条记录
     * @param solutionVersion
     */
    void insertSolutionVersion(SolutionVersion solutionVersion);

    /**
     * 更新一条记录
     * @param solutionVersion
     */
    void updateSolutionVersion(SolutionVersion solutionVersion);

    /**
     * 删除一条记录
     * @param id
     */
    void deleteSolutionVersion(Integer id);

    /**
     * 批量删除记录
     * @param ids
     */
    void batchDeleteSolutionVersion(List<String> ids);
}
