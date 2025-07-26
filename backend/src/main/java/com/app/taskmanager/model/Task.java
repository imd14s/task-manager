package com.app.taskmanager.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name="task")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String about;

    @ManyToOne
    @JoinColumn(name = "column_id")
    private TaskColumns column;
}
