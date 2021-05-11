package com.h3c.solution.dao;

import java.util.List;

import org.apache.ibatis.annotations.*;

import com.h3c.solution.entity.Solution;

@Mapper
public interface SolutionDao {
    /**
     * 获取所有类型数据
     * @return
     */
    @Select("select * from solution")
    List<Solution> findAll();

    /**
     * 根据id查询一条记录
     * @param id
     * @return
     */
    @Select("select * from solution where id=#{id}")
    Solution getSolutionById(Integer id);

    /**
     * 根据type查询记录
     * @param type
     * @return
     */
    @Select("select * from solution where type=#{type}")
    List<Solution> getSolutionByType(String type);
    /**
     * 增加一条记录
     * @param solution
     */
    @Insert("insert into solution(type_id,type,name,description) values(#{type_id},#{type},#{name},#{description}) ")
    void insertSolutionType(Solution solution);

    /**
     * 更新一条记录
     * @param solution
     */
    @Update("update solution set type=#{type}, name=#{name},description=#{description} where id=#{id}")
    void updateSolution(Solution solution);

    /**
     * 删除一条记录
     * @param id
     */
    @Delete("delete from solution where id=#{id}")
    void deleteSolution(Integer id);

    /**
     * 批量删除记录
     * @param ids
     */
    @DeleteProvider(type = BatchSolution.class, method = "batSolutionDel")
    void batchDeleteSolution(List<String> ids);
}
