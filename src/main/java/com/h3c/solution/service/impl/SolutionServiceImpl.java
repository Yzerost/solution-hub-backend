package com.h3c.solution.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.h3c.solution.entity.Solution;
import com.h3c.solution.dao.SolutionDao;
import com.h3c.solution.service.SolutionService;

/**
 * Solution 事务实现类
 */
@Service
public class SolutionServiceImpl implements SolutionService{

    @Autowired
    private SolutionDao solutionDao;

    @Override
    public List<Solution> findAll() {
        return solutionDao.findAll();
    }

    @Override
    public Solution getSolutionById(Integer id) {
        return solutionDao.getSolutionById(id);
    }

    @Override
    public List<Solution> getSolutionByType(String type) {
        return solutionDao.getSolutionByType(type);
    }

    @Override
    public void insertSolution(Solution solution) {
        solutionDao.insertSolutionType(solution);
    }

    @Override
    public void updateSolution(Solution solution) {
        solutionDao.updateSolution(solution);
    }

    @Override
    public void deleteSolution(Integer id) {
        solutionDao.deleteSolution(id);
    }

    @Override
    public void batchDeleteSolution(List<String> ids) {
        solutionDao.batchDeleteSolution(ids);
    }
}
