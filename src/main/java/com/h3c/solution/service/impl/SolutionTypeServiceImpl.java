package com.h3c.solution.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.h3c.solution.entity.SolutionType;
import com.h3c.solution.dao.SolutionTypeDao;
import com.h3c.solution.service.SolutionTypeService;

/**
 * SolutionType 事务实现类
 */
@Service
public class SolutionTypeServiceImpl implements SolutionTypeService{

    @Autowired
    private SolutionTypeDao solutionTypeDao;

    @Override
    public List<SolutionType> findAll() {
        return solutionTypeDao.findAll();
    }

    @Override
    public SolutionType getSolutionTypeById(Integer id) {
        return solutionTypeDao.getSolutionTypeById(id);
    }

    @Override
    public void insertSolutionType(SolutionType solutionType) {
        solutionTypeDao.insertSolutionType(solutionType);
    }

    @Override
    public void updateSolutionType(SolutionType solutionType) {
        solutionTypeDao.updateSolutionType(solutionType);
    }

    @Override
    public void deleteSolutionType(Integer id) {
        solutionTypeDao.deleteSolutionType(id);
    }

    @Override
    public void batchDeleteSolutionType(List<String> ids) {
        solutionTypeDao.batchDeleteSolutionType(ids);
    }
}
