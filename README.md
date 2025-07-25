# Task Manager

Organizador de tarefas com:

- Tela de login  
- Criação de colunas  
- Mover tarefas entre colunas  
- Criação de grupo de trabalho  
- Adicionar e remover membros  

---

## Tecnologias

- Backend: Java Spring Boot + MySQL  
- Frontend: React.js com TypeScript + Tailwind CSS  
- Banco de dados: MySQL  
- Containerização: Docker + Docker Compose  

---

## Checklist para finalizar o projeto

- [ ] Implementar tela de login  
- [ ] Criar funcionalidades de colunas para organizar tarefas  
- [ ] Implementar movimentação de tarefas entre colunas  
- [ ] Desenvolver criação de grupos de trabalho  
- [ ] Permitir adicionar e remover membros nos grupos  
- [ ] Configurar banco MySQL integrado ao backend  
- [ ] Estilizar frontend com Tailwind CSS  
- [ ] Testar integração entre frontend, backend e banco  
- [ ] Criar pipeline CI/CD (opcional)  

---

## Como rodar o projeto localmente

### Pré-requisitos

- Docker e Docker Compose instalados  
- Git  

### Passos

1. Clone o repositório

```bash
git clone <url-do-repositorio>
cd task-manager
```

2. Crie o arquivo `.env` na raiz com as variáveis:

```env
# Banco de dados MySQL
MYSQL_ROOT_PASSWORD=sua_senha_root
MYSQL_DATABASE=taskmanager
MYSQL_USER=taskuser
MYSQL_PASSWORD=taskpassword

# Backend
SPRING_DATASOURCE_URL=jdbc:mysql://mysql:3306/taskmanager
SPRING_DATASOURCE_USERNAME=taskuser
SPRING_DATASOURCE_PASSWORD=taskpassword

# Frontend
# (adicione aqui se necessário)
```

3. Suba os containers com Docker Compose

```bash
docker compose up --build -d
```

4. Acesse:

- Backend: http://localhost:8080  
- Frontend: http://localhost:5173 

5. Para parar os containers:

```bash
docker compose down
```

---

## Estrutura do projeto

```
task-manager/
├── backend/         # Backend Java Spring Boot
├── frontend/        # Frontend React + TypeScript + Tailwind CSS
├── docker-compose.yml
├── .env
└── README.md
```

---

Se precisar de ajuda para implementar ou configurar qualquer coisa, me avise!