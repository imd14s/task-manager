package com.app.taskmanager.model;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ActiveProfiles;

import jakarta.persistence.EntityManager;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
@ActiveProfiles("test")
class UserTest {

    @Autowired
    private EntityManager entityManager;

    @Test
    void deveSalvarERecuperarUsuario() {
        User user = new User();
        user.setUsername("everson");
        user.setPassword("123456");
        user.setEmail("everson@email.com");

        entityManager.persist(user);
        entityManager.flush();

        User encontrado = entityManager.find(User.class, user.getId());
        assertThat(encontrado).isNotNull();
        assertThat(encontrado.getUsername()).isEqualTo("everson");
    }
}
