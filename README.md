# 📝 Todo API

API REST para gerenciamento de tarefas, desenvolvida com Java e Spring Boot.

## 🚀 Tecnologias utilizadas

- Java 17
- Spring Boot
- Spring Data JPA
- H2 Database
- Maven
- Swagger (OpenAPI 3.0)

## ⚙️ Como rodar o projeto

### Pré-requisitos
- Java 17+
- Maven 3.x+

### Rodando a aplicação
```bash
# Clone o repositório
git clone https://github.com/Leonardocarneio6554/todo-api.git

# Acesse a pasta
cd todo-api

# Rode o projeto
mvn spring-boot:run
```

## 📌 Endpoints

| Método | Rota | Descrição |
|--------|------|-----------|
| GET | /tarefas | Lista todas as tarefas |
| POST | /tarefas | Cria uma nova tarefa |
| PUT | /tarefas/{id} | Atualiza uma tarefa |
| DELETE | /tarefas/{id} | Deleta uma tarefa |

## 📄 Documentação

Acesse a documentação completa via Swagger:
http://localhost:8080/swagger-ui/index.html


## 👨‍💻 Autor

Leonardo Carneio — [GitHub](https://github.com/Leonardocarneio6554)