package com.app.taskmanager.model;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ActiveProfiles;

import jakarta.persistence.EntityManager;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
@ActiveProfiles("test")
class TaskProjectTest {

    @Autowired
    private EntityManager entityManager;

    @Test
    void deveSalvarERecuperarProjeto() {
        User user = new User();
        user.setUsername("test");
        user.setPassword("123456");
        user.setEmail("test@email.com");
        entityManager.persist(user);

        TaskProject project = new TaskProject();
        project.setName("Projeto Test");
        project.setUser(user);

        entityManager.persist(project);
        entityManager.flush();

        TaskProject encontrado = entityManager.find(TaskProject.class, project.getId());
        assertThat(encontrado).isNotNull();
        assertThat(encontrado.getName()).isEqualTo("Projeto Test");
        assertThat(encontrado.getUser().getUsername()).isEqualTo("test");
    }
}
