package com.webservice.dto;

import com.webservice.entity.ProjectEntity;
import com.webservice.entity.UserEntity;

import java.util.List;

public class FirtResponse {

    private List<UserEntity> users;
    private List<ProjectEntity> projects;

    public List<UserEntity> getUsers() {
        return users;
    }

    public void setUsers(List<UserEntity> users) {
        this.users = users;
    }

    public List<ProjectEntity> getProjects() {
        return projects;
    }

    public void setProjects(List<ProjectEntity> projects) {
        this.projects = projects;
    }
}
