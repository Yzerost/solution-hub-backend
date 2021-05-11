package com.h3c.solution.dao;

import java.util.List;
import java.util.Map;

public class BatchSolutionType {

    /*
    批量删除SolutionType
     */
    public String batSolutionTypeDel(Map map) {
        List<String> ids = (List<String>) map.get("list");
        StringBuffer sb = new StringBuffer();
        sb.append("delete from solution_type where id in (");
        for (int i = 0; i < ids.size(); i++) {
            sb.append(Integer.parseInt(ids.get(i)));
            if (i < ids.size() - 1) {
                sb.append(",");
            }
        }
        sb.append(")");
        return sb.toString();

    }
}
