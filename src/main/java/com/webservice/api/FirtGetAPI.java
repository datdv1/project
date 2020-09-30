package com.webservice.api;

import com.webservice.dto.FirtResponse;
import com.webservice.service.ProjectService;
import com.webservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/firt-get")
public class FirtGetAPI {

    @Autowired
    private UserService userService;

    @Autowired
    private ProjectService projectService;

    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping
    public FirtResponse getFirt(){
        FirtResponse reponse = new FirtResponse();
        reponse.setUsers(userService.getAll());
        reponse.setProjects(projectService.getAll());
        return reponse;
    }
}
