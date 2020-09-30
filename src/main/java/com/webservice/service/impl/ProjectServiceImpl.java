package com.webservice.service.impl;

import com.webservice.entity.ProjectEntity;
import com.webservice.repository.ProjectRepository;
import com.webservice.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectServiceImpl implements ProjectService {

    @Autowired
    private ProjectRepository projectRepository;

    @Override
    public List<ProjectEntity> getAll() {
        return projectRepository.findAll();
    }
}
