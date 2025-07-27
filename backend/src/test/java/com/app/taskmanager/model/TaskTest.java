package com.app.taskmanager.model;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ActiveProfiles;

import jakarta.persistence.EntityManager;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
@ActiveProfiles("test")
class TaskTest {

    @Autowired
    private EntityManager entityManager;

    @Test
    void deveSalvarERecuperarTask() {
        TaskColumns column = new TaskColumns();
        column.setName("Coluna 1");
        entityManager.persist(column);

        Task task = new Task();
        task.setName("Criar API");
        task.setAbout("Desenvolver endpoints para autenticação");
        task.setColumn(column);

        entityManager.persist(task);
        entityManager.flush();

        Task encontrada = entityManager.find(Task.class, task.getId());
        assertThat(encontrada).isNotNull();
        assertThat(encontrada.getName()).isEqualTo("Criar API");
        assertThat(encontrada.getColumn().getName()).isEqualTo("Coluna 1");
    }
}
