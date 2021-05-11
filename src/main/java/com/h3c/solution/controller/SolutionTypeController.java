package com.h3c.solution.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.h3c.solution.entity.SolutionType;
import com.h3c.solution.service.SolutionTypeService;


/**
 * SolutionType 控制层
 *
 */
@CrossOrigin(origins = "*",maxAge = 3600)
@RestController
@RequestMapping("/solutionType")
public class SolutionTypeController {

    @Autowired
    private SolutionTypeService solutionTypeService;

    /**
     * 1、查询所有 URl：http://localhost:8080/solutionType/findAll
     * @return
     */
    @RequestMapping(path = "/findAll", method = RequestMethod.GET)
    public List<SolutionType> findAll() {
        return solutionTypeService.findAll();
    }

    /**
     * 2、查询一条记录 URl：http://localhost:8080/solutionType/getSolutionTypeById?id={id}
     * @param id
     * @return
     */
    @RequestMapping("/getSolutionTypeById")
    public SolutionType getSolutionTypeById(Integer id) {
        return solutionTypeService.getSolutionTypeById(id);
    }

    /**
     * 3、增加一条记录 URl：http://localhost:8080/solutionType/insertSolutionType
     * @param solutionType
     */
    @RequestMapping(path = "/insertSolutionType",method = RequestMethod.POST)
    public void insertSolutionType(@RequestBody SolutionType solutionType) {
        solutionTypeService.insertSolutionType(solutionType);
    }

    /**
     * 4、更新一条记录 URl：http://localhost:8080/solutionType/updateSolutionType?
     * id={id}&solution_type={solution_type}&description={description}
     * @param solutionType
     */
    @RequestMapping(value = "/updateSolutionType",method = RequestMethod.PUT)
    public void updateSolutionType(@RequestBody SolutionType solutionType) {
        solutionTypeService.updateSolutionType(solutionType);
    }

    /**
     * 5、删除一条记录 URl：http://localhost:8080/solutionType/deleteSolutionType?id={id}
     * @param id
     */
    @RequestMapping(path ="/deleteSolutionType",method = RequestMethod.DELETE)
    public void deleteSolutionType(Integer id) {
        solutionTypeService.deleteSolutionType(id);
    }

    /**
     * 6、批量删除多条记录 URl：http://localhost:8080/solutionType/batchDeleteSolutionType
     * @param params
     */
    @RequestMapping(path ="/batchDeleteSolutionType",method = RequestMethod.POST)
    public void batchDeleteSolutionType(@RequestBody Map<String,Object> params){
        String idsString = params.get("ids").toString();
        String[] ids = idsString.split(",");
        List<String> idList = Arrays.asList(ids);
//        System.out.println(idList);
        solutionTypeService.batchDeleteSolutionType(idList);

//        solutionTypeService.deleteSolutionType(id);
    }


}


