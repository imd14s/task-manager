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

2. Suba os containers com Docker Compose

```bash
docker compose up --build -d
```

3. Acesse:

- Backend: http://localhost:8080  
- Frontend: http://localhost:5173 

4. Para parar os containers:

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