package com.example.dataserviceplatform.Repository;

import com.example.dataserviceplatform.Entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProjectRepository extends JpaRepository<Project,Integer> {
    List<Project> findAllByPid(Integer pid);
}
