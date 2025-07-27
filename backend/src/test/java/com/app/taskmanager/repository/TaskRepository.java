package com.app.taskmanager.repository;

import com.app.taskmanager.model.Task;
import com.app.taskmanager.model.TaskColumns;
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
class TaskRepositoryTest {

    @Autowired
    private TaskRepository taskRepository;

    @Autowired
    private TaskColumnsRepository columnsRepository;

    @Autowired
    private TaskProjectRepository projectRepository;

    @Autowired
    private UserRepository userRepository;

    @Test
    void deveSalvarEBuscarTarefasPorColuna() {
        User user = new User();
        user.setUsername("test");
        user.setPassword("123456");
        user.setEmail("test@email.com");
        userRepository.save(user);

        TaskProject project = new TaskProject();
        project.setName("Projeto test");
        project.setUser(user);
        projectRepository.save(project);

        TaskColumns coluna = new TaskColumns();
        coluna.setName("To Do");
        coluna.setProject(project);
        columnsRepository.save(coluna);

        Task task = new Task();
        task.setName("Criar Backend");
        task.setAbout("Desenvolver API com Spring Boot");
        task.setColumn(coluna);
        taskRepository.save(task);

        List<Task> foundTask = taskRepository.findByColumnId(coluna.getId());
        assertThat(foundTask).hasSize(1);
        assertThat(foundTask.get(0).getName()).isEqualTo("Criar Backend");
    }
}
