#  Catálogo de Produtos API

API REST desenvolvida para gerenciamento de um catálogo de produtos, permitindo criar, listar, atualizar e deletar itens. O projeto utiliza boas práticas de validação de dados e arquitetura em camadas.

##  Tecnologias Utilizadas
* **Java 21**
* **Spring Boot 3**
* **Spring Data JPA**
* **H2 Database** (Banco em memória para desenvolvimento rápido)
* **Bean Validation** (Validações como `@NotBlank`, `@Positive`)
* **Lombok**

---

##  Como Testar (Arquivo .http)

Este projeto dispensa o uso obrigatório do Postman. Inclui um arquivo de testes chamado **`test-api.http`** na raiz do projeto.

### Usando o IntelliJ IDEA:
O IntelliJ possui um **HTTP Client** nativo.
1.  Inicie a aplicação (Run `CatalogoApplication`).
2.  Abra o arquivo `.http`.
3.  Clique no ícone verde ▶️ (Play) ao lado de cada requisição (`GET`, `POST`, etc.) para ver a resposta em tempo real.

---

##  Endpoints Disponíveis

| Método | Rota | Descrição |
| :--- | :--- | :--- |
| `GET` | `/products` | Lista todos os produtos |
| `POST` | `/products` | Cadastra um novo produto |
| `GET` | `/products/{id}` | Busca um produto específico |
| `GET` | `/products/category/{nome}` | Filtra produtos por categoria |
| `PUT` | `/products` | Atualiza os dados de um produto |
| `DELETE` | `/products/{id}` | Remove um produto do banco |

##  Como Rodar o Projeto
```bash
# Clone este repositório
$ git clone [https://github.com/danielpf30/backend-ecommerce.git]

# Entre na pasta
$ cd NOME-DO-REPOSITORIO

# Execute a aplicação (via Maven)
$ ./mvnw spring-boot:run
