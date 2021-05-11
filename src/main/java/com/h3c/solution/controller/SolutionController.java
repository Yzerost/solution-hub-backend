package com.h3c.solution.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.h3c.solution.entity.Solution;
import com.h3c.solution.service.SolutionService;
/**
 * SolutionType 控制层
 *
 */
@CrossOrigin(origins = "*",maxAge = 3600)
@RestController
@RequestMapping("/solution")
public class SolutionController {
    @Autowired
    private SolutionService solutionService;

    /**
     * 查询所有 URl：http://localhost:8080/solution/findAll
     * @return
     */
    @RequestMapping(path = "/findAll", method = RequestMethod.GET)
    public List<Solution> findAll() {
        return solutionService.findAll();
    }

    /**
     * 查询一条记录 URl：http://localhost:8080/solution/getSolutionById?id={id}
     * @param id
     * @return
     */
    @RequestMapping("/getSolutionById")
    public Solution getSolutionById(Integer id) {
        return solutionService.getSolutionById(id);
    }

    /**
     * 根据type查询记录 URl：http://localhost:8080/solution/getSolutionByType?type={type}
     * @param type
     * @return
     */
    @RequestMapping("/getSolutionByType")
    public List<Solution> getSolutionById(String type) {
        return solutionService.getSolutionByType(type);
    }
    /**
     * 增加一条记录 URl：http://localhost:8080/solution/insertSolution
     * @param solution
     */
    @RequestMapping(path = "/insertSolution",method = RequestMethod.POST)
    public void insertSolution(@RequestBody Solution solution) {
        solutionService.insertSolution(solution);
    }

    /**
     * 更新一条记录 URl：http://localhost:8080/solution/updateSolution?
     * @param solution
     */
    @RequestMapping(value = "/updateSolution",method = RequestMethod.PUT)
    public void updateSolution(@RequestBody Solution solution) {
        solutionService.updateSolution(solution);
    }

    /**
     * 删除一条记录 URl：http://localhost:8080/solution/deleteSolution?id={id}
     * @param id
     */
    @RequestMapping(path ="/deleteSolution",method = RequestMethod.DELETE)
    public void deleteSolution(Integer id) {
        solutionService.deleteSolution(id);
    }

    /**
     * 批量删除多条记录 URl：http://localhost:8080/solution/batchDeleteSolution
     * @param params
     */
    @RequestMapping(path ="/batchDeleteSolution",method = RequestMethod.POST)
    public void batchDeleteSolution(@RequestBody Map<String,Object> params){
        String idsString = params.get("ids").toString();
        String[] ids = idsString.split(",");
        List<String> idList = Arrays.asList(ids);
        solutionService.batchDeleteSolution(idList);


    }


}
