package com.h3c.solution.service.impl;

import java.util.List;

import com.h3c.solution.dao.SolutionVersionDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.h3c.solution.entity.SolutionVersion;
import com.h3c.solution.service.SolutionVersionService;

/**
 * SolutionVersion事务实现类
 */
@Service
public class SolutionVersionServiceImpl implements SolutionVersionService {

    @Autowired
    private SolutionVersionDao solutionVersionDao;
    @Override
    public List<SolutionVersion> findAll() {
        return solutionVersionDao.findAll();
    }

    @Override
    public SolutionVersion getSolutionVersionById(Integer id) {
        return solutionVersionDao.getSolutionVersionById(id);
    }

    @Override
    public List<SolutionVersion> getSolutionVersionBySolutionId(Integer solution_id) {
        return solutionVersionDao.getSolutionVersionBySolutionId(solution_id);
    }

    @Override
    public void insertSolutionVersion(SolutionVersion solutionVersion) {
        solutionVersionDao.insertSolutionVersion(solutionVersion);
    }

    @Override
    public void updateSolutionVersion(SolutionVersion solutionVersion) {
        solutionVersionDao.updateSolutionVersion(solutionVersion);
    }

    @Override
    public void deleteSolutionVersion(Integer id) {
        solutionVersionDao.deleteSolutionVersion(id);
    }

    @Override
    public void batchDeleteSolutionVersion(List<String> ids) {
        solutionVersionDao.batchDeleteSolutionVersion(ids);
    }
}
