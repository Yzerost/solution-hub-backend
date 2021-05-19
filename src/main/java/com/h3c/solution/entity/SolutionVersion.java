package com.h3c.solution.entity;

import java.util.ArrayList;

public class SolutionVersion {
    private int id;
    private String name;
    private String version;
    private int solution_id;
    private String solution;
    private String status;
    private String brief;
    private String read_role;
    private String write_role;
    private String files;

    public String getEdit_comment() {
        return edit_comment;
    }

    public void setEdit_comment(String edit_comment) {
        this.edit_comment = edit_comment;
    }

    private String edit_comment;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public int getSolution_id() {
        return solution_id;
    }

    public void setSolution_id(int solution_id) {
        this.solution_id = solution_id;
    }
    public String getSolution() {
        return solution;
    }

    public void setSolution(String solution) {
        this.solution = solution;
    }


    public String getBrief() {
        return brief;
    }

    public void setBrief(String brief) {
        this.brief = brief;
    }

    public String getRead_role() {
        return read_role;
    }

    public void setRead_role(String read_role) {
        this.read_role = read_role;
    }

    public String getWrite_role() {
        return write_role;
    }

    public void setWrite_role(String write_role) {
        this.write_role = write_role;
    }

    public String getFiles() {
        return files;
    }

    public void setFiles(String files) {
        this.files = files;
    }

}
