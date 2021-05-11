package com.h3c.solution.dao;

import java.util.List;

import org.apache.ibatis.annotations.*;

import com.h3c.solution.entity.SolutionType;

@Mapper
public interface SolutionTypeDao {

    /**
     * 1、获取所有类型数据
     * @return
     */
    @Select("select * from solution_type")
    List<SolutionType> findAll();

    /**
     * 2、根据id查询一条记录
     * @param id
     * @return
     */
    @Select("select * from solution_type where id=#{id}")
    SolutionType getSolutionTypeById(Integer id);

    /**
     * 3、增加一条记录
     * @param solutionType
     */
    @Insert("insert into solution_type(solution_type,description) values(#{solution_type},#{description}) ")
    void insertSolutionType(SolutionType solutionType);

    /**
     * 4、更新一条记录
     * @param solutionType
     */
    @Update("update solution_type set solution_type=#{solution_type},description=#{description} where id=#{id}")
    void updateSolutionType(SolutionType solutionType);

    /**
     * 5、删除一条记录
     * @param id
     */
    @Delete("delete from solution_type where id=#{id}")
    void deleteSolutionType(Integer id);

    /**
     * 6、批量删除记录
     * @param ids
     */
    @DeleteProvider(type = BatchSolutionType.class, method = "batSolutionTypeDel")
    void batchDeleteSolutionType(List<String> ids);

}
