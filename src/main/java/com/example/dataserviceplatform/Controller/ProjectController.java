package com.example.dataserviceplatform.Controller;

import com.example.dataserviceplatform.Entity.Project;
import com.example.dataserviceplatform.Result.ResponseVO;
import com.example.dataserviceplatform.Service.ProjectService;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import com.alibaba.fastjson.JSONObject;

import static org.apache.logging.log4j.message.MapMessage.MapFormat.JSON;

/*
* @author zyt
* @date 2022-9-21
*
* */
@RestController
@CrossOrigin(origins={"http://106.14.72.92:8002","http://106.14.72.92:8001","http://106.14.72.92","http://localhost:8082","http://localhost:8083","http://localhost","http://localhost:8080"}
        , allowCredentials = "true")
@RequestMapping("/projectMsg")
public class ProjectController {
    @Autowired
    private ProjectService projectService;

    @GetMapping("/getAllProject")
    public ResponseVO getAllProject(){
        return ResponseVO.buildSuccess(projectService.getAllProject());
    }

    @PostMapping("/addProject")
    public ResponseVO addProject(@RequestBody JSONObject jsonObject){
       Project project=jsonObject.toJavaObject(Project.class);

        //project.setProjectLevel(jsonObject.get("123").toString());
//        System.out.println("controller");
//        System.out.println(jsonObject);
//        System.out.println(project);
        projectService.addProject(project);
//        projectService.addProject(project);
        return ResponseVO.buildSuccess();
    }

    @GetMapping("/modifyProjectLevel/{project_id}/{project_level}")
    public ResponseVO modifyProjectLevel(@PathVariable("project_id") Integer pid ,@PathVariable("project_level") Integer level){
        projectService.modifyProjectLevel(pid,level);
        return ResponseVO.buildSuccess();
    }

    @GetMapping("/deleteProject")
    public ResponseVO deleteProject(Integer id){
        projectService.deleteById(id);
        return ResponseVO.buildSuccess();
    }

    @GetMapping("/Statistics")
    public ResponseVO projectStatis(){
        return ResponseVO.buildSuccess(projectService.projectStastic());
    }
}
