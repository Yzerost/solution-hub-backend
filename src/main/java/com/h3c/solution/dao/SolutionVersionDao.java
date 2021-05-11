package com.h3c.solution.dao;

import java.util.List;
import org.apache.ibatis.annotations.*;
import com.h3c.solution.entity.SolutionVersion;

@Mapper
public interface SolutionVersionDao {
    /**
     * 获取所有类型数据
     * @return List<SolutionVersion>
     */
    @Select("select * from solution_version")
    List<SolutionVersion> findAll();

    /**
     * 根据id查询一条记录
     * @param id
     * @return SolutionVersion
     */
    @Select("select * from solution_version where id=#{id}")
    SolutionVersion getSolutionVersionById(Integer id);

    /**
     * 根据solution_id查询solution版本记录
     * @param solution_id
     * @return
     */
    @Select("select * from solution_version where solution_id=#{solution_id}")
    List<SolutionVersion> getSolutionVersionBySolutionId(Integer solution_id);

    /**
     * 增加一条记录
     * @param solutionVersion
     */
    @Insert("insert into solution_version(name,version,solution_id,solution,status,brief,read_role,write_role,files) " +
            "values(#{name},#{version},#{solution_id},#{solution},#{status},#{brief},#{read_role},#{write_role},#{files}) ")
    void insertSolutionVersion(SolutionVersion solutionVersion);

    /**
     * 更新一条记录
     * @param solutionVersion
     */
    @Update("update solution_version set name=#{name},version=#{version},solution_id=#{solution_id},solution=#{solution}" +
            ",status=#{status},brief=#{brief},read_role=#{read_role},write_role=#{write_role},files=#{files} where id=#{id}")
    void updateSolutionVersion(SolutionVersion solutionVersion);

    /**
     * 删除一条记录
     * @param id
     */
    @Delete("delete from solution_version where id=#{id}")
    void deleteSolutionVersion(Integer id);

    /**
     * 批量删除记录
     * @param ids
     */
    @DeleteProvider(type = BatchSolutionVersion.class, method = "batSolutionVersionDel")
    void batchDeleteSolutionVersion(List<String> ids);
}
