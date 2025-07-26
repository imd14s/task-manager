package com.app.taskmanager.model;

import java.util.List;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="task_columns")
public class TaskColumns {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "project_id")
    private TaskProject project;

    @OneToMany(mappedBy = "column", cascade = CascadeType.ALL)
    private List<Task> tasks;
}
