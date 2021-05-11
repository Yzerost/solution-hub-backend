package com.h3c.solution.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.h3c.solution.entity.SolutionVersion;
import com.h3c.solution.service.SolutionVersionService;

/**
 * SolutionVersion 控制层
 *
 */

@CrossOrigin(origins = "*",maxAge = 3600)
@RestController
@RequestMapping("/solutionVersion")
public class SolutionVersionController {

    @Autowired
    private SolutionVersionService solutionVersionService;

    /**
     * 查询所有 URl：http://localhost:8080/solutionVersion/findAll
     * @return
     */
    @RequestMapping(path = "/findAll", method = RequestMethod.GET)
    public List<SolutionVersion> findAll() {
        return solutionVersionService.findAll();
    }

    /**
     * 查询一条记录 URl：http://localhost:8080/solutionVersion/getSoVerById?id={id}
     * @param id
     * @return
     */
    @RequestMapping("/getSoVerById")
    public SolutionVersion getSoVerById(Integer id) {
        return solutionVersionService.getSolutionVersionById(id);
    }

    /**
     * 根据solution_id查询记录 URl：http://localhost:8080/solutionVersion/getSoVerBySoId?solution_id={solution_id}
     * @param solution_id
     * @return
     */
    @RequestMapping("/getSoVerBySoId")
    public List<SolutionVersion> getSoVerBySoId(Integer solution_id) {
        return solutionVersionService.getSolutionVersionBySolutionId(solution_id);
    }

    /**
     * 增加一条记录 URl：http://localhost:8080/solutionVersion/insertSoVer
     * @param solutionVersion
     */
    @RequestMapping(path = "/insertSoVer",method = RequestMethod.POST)
    public void insertSolutionVersion(@RequestBody SolutionVersion solutionVersion) {
        solutionVersionService.insertSolutionVersion(solutionVersion);
    }

    /**
     * 更新一条记录 URl：http://localhost:8080/solutionVersion/updateSoVer?
     * @param solutionVersion
     */
    @RequestMapping(value = "/updateSoVer",method = RequestMethod.PUT)
    public void updateSolutionVersion(@RequestBody SolutionVersion solutionVersion) {
        solutionVersionService.updateSolutionVersion(solutionVersion);
    }

    /**
     * 删除一条记录 URl：http://localhost:8080/solutionVersion/deleteSoVer?id={id}
     * @param id
     */
    @RequestMapping(path ="/deleteSoVer",method = RequestMethod.DELETE)
    public void deleteSolutionVersion(Integer id) {
        solutionVersionService.deleteSolutionVersion(id);
    }

    /**
     * 批量删除多条记录 URl：http://localhost:8080/solutionVersion/batchDeleteSoVer
     * @param params
     */
    @RequestMapping(path ="/batchDeleteSoVer",method = RequestMethod.POST)
    public void batchDeleteSolutionVersion(@RequestBody Map<String,Object> params){
        String idsString = params.get("ids").toString();
        String[] ids = idsString.split(",");
        List<String> idList = Arrays.asList(ids);
        solutionVersionService.batchDeleteSolutionVersion(idList);


    }
}
