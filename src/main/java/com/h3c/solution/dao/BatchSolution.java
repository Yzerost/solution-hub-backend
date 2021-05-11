package com.h3c.solution.dao;

import java.util.List;
import java.util.Map;

public class BatchSolution {
    /*
    批量删除Solution
     */
    public String batSolutionDel(Map map) {
        List<String> ids = (List<String>) map.get("list");
        StringBuffer sb = new StringBuffer();
        sb.append("delete from solution where id in (");
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
