package com.example.dataserviceplatform.Controller;

import com.example.dataserviceplatform.Result.ResponseVO;
import com.example.dataserviceplatform.Service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

public class Project {
    @Autowired
    private ProjectService projectService;

    @GetMapping("")
    public ResponseVO getProject(){
        return ResponseVO.buildSuccess(projectService.getProject(0));
    }
}
