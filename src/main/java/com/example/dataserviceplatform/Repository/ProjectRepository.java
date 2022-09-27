package com.example.dataserviceplatform.Repository;

import com.example.dataserviceplatform.Entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProjectRepository extends JpaRepository<Project,Integer>, JpaSpecificationExecutor<Project> {
    List<Project>   findAll();
    Project getProjectById(Integer id);

    @Modifying
    @Query("update Project set projectLevel=:projectLevel where id=:id")
    void modify(@Param("id")Integer id, @Param("projectLevel")Integer projectLevel);
}
