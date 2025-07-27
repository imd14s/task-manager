package com.app.taskmanager.repository;

import com.app.taskmanager.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ActiveProfiles;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
@ActiveProfiles("test")
class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    void deveSalvarEBuscarUsuarioPorUsername() {
        // Cria e salva um usuário
        User user = new User();
        user.setUsername("test");
        user.setPassword("123456");
        user.setEmail("test@email.com");

        userRepository.save(user);

        // Busca por username
        var foundUser = userRepository.findByUsername("test");

        // Valida
        assertThat(foundUser).isPresent();
        assertThat(foundUser.get().getEmail()).isEqualTo("test@email.com");
    }
}
