package com.app.taskmanager.model;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ActiveProfiles;

import jakarta.persistence.EntityManager;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
@ActiveProfiles("test")
class TaskColumnsTest {

    @Autowired
    private EntityManager entityManager;

    @Test
    void deveSalvarERecuperarColuna() {
        TaskProject project = new TaskProject();
        project.setName("Projeto Teste");
        entityManager.persist(project);

        TaskColumns column = new TaskColumns();
        column.setName("To Do");
        column.setProject(project);

        entityManager.persist(column);
        entityManager.flush();

        TaskColumns encontrada = entityManager.find(TaskColumns.class, column.getId());
        assertThat(encontrada).isNotNull();
        assertThat(encontrada.getName()).isEqualTo("To Do");
        assertThat(encontrada.getProject().getName()).isEqualTo("Projeto Teste");
    }
}
