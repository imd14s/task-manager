package com.app.taskmanager.model;

import java.util.List;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="task_projects")
public class TaskProject {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @OneToMany(mappedBy = "project", cascade = CascadeType.ALL)
    private List<TaskColumns> columns;
}
