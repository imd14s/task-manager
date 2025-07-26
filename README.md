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

# Checklist Completo para Finalizar o Projeto

## 1. Preparação e Infraestrutura

- [x] Configurar ambiente Docker (docker-compose) com serviços:
  - MySQL
  - Backend (Spring Boot)
  - Frontend (React/Vite)
- [x] Configurar variáveis de ambiente (.env)
- [x] Garantir volumes para persistência do banco de dados
- [x] Criar redes customizadas para comunicação entre containers

---

## 2. Backend (Spring Boot)

- [x] Criar estrutura inicial do projeto Maven
- [x] Configurar conexão com MySQL no `application.properties`
- [x] Criar models / entidades JPA (`User`, `TaskProject`, `TaskColumns`, `Task`)
- [ ] Criar repositórios JPA (interfaces que estendem `JpaRepository`)
- [ ] Implementar serviços para lógica de negócio
- [ ] Criar controllers REST para expor APIs CRUD
- [ ] Configurar Spring Security para autenticação (login/logout)
- [ ] Implementar geração e validação de JWT para segurança
- [ ] Criar endpoints para:
  - Cadastro e autenticação de usuários
  - CRUD de projetos, colunas e tarefas
  - Movimentação de tarefas entre colunas
  - Gerenciamento de grupos e membros
- [ ] Criar testes unitários e de integração para backend

---

## 3. Frontend (React + Tailwind CSS)

- [x] Criar estrutura inicial do projeto com Vite ou Create React App
- [ ] Configurar comunicação com backend via Axios ou Fetch
- [ ] Implementar roteamento (React Router)
- [ ] Criar telas básicas:
  - Login e cadastro
  - Dashboard com lista de projetos
  - Visualização de colunas e tarefas dentro do projeto
- [ ] Criar formulários para criação/edição de projetos, colunas e tarefas
- [ ] Implementar movimentação de tarefas entre colunas (drag and drop)
- [ ] Gerenciar autenticação via JWT e armazenamento local (`localStorage`)
- [ ] Estilizar toda interface usando Tailwind CSS para responsividade e estética
- [ ] Criar componentes reutilizáveis (botões, modais, cards, etc)
- [ ] Criar testes front-end (unitários e end-to-end)

---

## 4. Integração e Testes

- [ ] Testar integração completa entre frontend, backend e banco de dados
- [ ] Validar autenticação, autorização e fluxo de dados
- [ ] Corrigir bugs encontrados nos testes
- [ ] Realizar testes manuais de usabilidade

---

## 5. Implantação e Manutenção

- [ ] Configurar pipeline CI/CD para builds automáticos (GitHub Actions, GitLab CI, etc)
- [ ] Preparar ambiente de produção (ex.: Docker em VPS ou Cloud)
- [ ] Configurar variáveis de ambiente para produção
- [ ] Monitorar logs e performance da aplicação
- [ ] Planejar futuras melhorias e novas funcionalidades


---

## Como rodar o projeto localmente

### Pré-requisitos

- Docker e Docker Compose instalados  
- Git  

### Passos

1. Clone o repositório

```bash
git clone https://github.com/imd14s/task-manager.git
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
