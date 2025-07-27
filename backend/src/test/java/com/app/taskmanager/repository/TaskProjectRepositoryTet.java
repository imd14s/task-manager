package com.app.taskmanager.repository;

import com.app.taskmanager.model.TaskProject;
import com.app.taskmanager.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.ActiveProfiles;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
@ActiveProfiles("test")
class TaskProjectRepositoryTest {

    @Autowired
    private TaskProjectRepository projectRepository;

    @Autowired
    private UserRepository userRepository;

    @Test
    void deveSalvarEBuscarProjetosPorUsuario() {
        User user = new User();
        user.setUsername("test");
        user.setPassword("123456");
        user.setEmail("test@email.com");
        userRepository.save(user);

        TaskProject project = new TaskProject();
        project.setName("Projeto test");
        project.setUser(user);
        projectRepository.save(project);

        List<TaskProject> foundProjects = projectRepository.findByUserId(user.getId());
        assertThat(foundProjects).hasSize(1);
        assertThat(foundProjects.get(0).getName()).isEqualTo("Projeto test");
    }
}
