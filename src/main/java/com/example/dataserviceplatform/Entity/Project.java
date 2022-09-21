package com.example.dataserviceplatform.Entity;


import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name="project")
public class Project {
    @GeneratedValue(generator = "id")
    @Id
    @Column(name="id")
    private Integer pid;
}
