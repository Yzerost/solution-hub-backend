package com.h3c.solution.service;

import com.h3c.solution.entity.Solution;
import java.util.List;

public interface SolutionService {

    /**
     * 获取所有内容
     * @return
     */
    List<Solution> findAll();

    /**
     * 根据 id 查询一条记录
     * @param id
     * @return
     */
    Solution getSolutionById(Integer id);

    /**
     * 根据 type 查询一条记录
     * @param type
     * @return
     */

    List<Solution> getSolutionByType(String type);

    /**
     * 增加一条记录
     * @param solution
     */
    void insertSolution(Solution solution);

    /**
     * 更新一条记录
     * @param solution
     */
    void updateSolution(Solution solution);

    /**
     * 删除一条记录
     * @param id
     */
    void deleteSolution(Integer id);

    /**
     * 批量删除记录
     * @param ids
     */
    void batchDeleteSolution(List<String> ids);
}
