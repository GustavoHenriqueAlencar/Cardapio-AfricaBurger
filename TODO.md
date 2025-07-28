# 📋 TODO List do Projeto Cardápio Digital

## 1. Configuração Inicial
- Configurar o Spring Boot com as dependências do Maven:  
  `Spring Web`, `Spring JPA`, `Lombok`, `H2`, `PostgreSQL`. ✅
- Configurar banco de dados:
  - **PostgreSQL** como banco principal 🔲
  - **H2** para testes ✅

## 2. Estrutura do Projeto
Criar pacotes:
- `Business` ✅
- `Controller` ✅
- `DTOs` ✅
- `Exceptions` ✅
- `Infrastructure` ✅
    - `Entitys` ✅
    - `Repository` ✅ 

## 3. Entidades (Model)
Criar as entidades para os itens do cardápio:
- `Lanche` 🔲
- `Bebida` 🔲
- `Promoção` 🔲
- `Combo` 🔲

Criar a entidade de Informações da Empresa (Contato, Localização, Horário de funcionamento, etc.) 🔲

## 4. Repositórios
Criar interfaces `JPA Repository` para todas as entidades:
- `LancheRepository` 🔲
- `BebidaRepository` 🔲
- `PromocaoRepository` 🔲
- `ComboRepository` 🔲
- `InformacaoRepository` 🔲

## 5. Controllers
Criar os controllers para as operações de CRUD:
- `LanchesController` 🔲
- `BebidasController` 🔲
- `PromocoesController` 🔲
- `CombosController` 🔲
- `InformacoesController` 🔲

## 6. Business
Criar business para lógica de negócio:
- `LancheService` 🔲
- `BebidaService` 🔲
- `PromocaoService` 🔲
- `ComboService` 🔲
- `InformacaoService` 🔲

## 7. Endpoints (Rotas de API)
Definir endpoints para cada CRUD:

### Lanches
- `POST /lanches` – Criar novo lanche  🔲
- `GET /lanches` – Listar todos os lanches  🔲
- `GET /lanches/{id}` – Buscar um lanche pelo ID  🔲
- `PUT /lanches/{id}` – Atualizar lanche  🔲
- `DELETE /lanches/{id}` – Deletar lanche  🔲

### Repetir padrão para:
- `Bebidas` 🔲
- `Promoções` 🔲
- `Combos` 🔲
- `Informações` 🔲

## 8. Front-end

- Página inicial com cardápio digital: listar todos os itens com categorias e preços. 🔲
- Formulários para adicionar/editar:
  - Lanches 🔲
  - Bebidas 🔲
  - Promoções 🔲
  - Combos 🔲
- Sistema de pesquisa para encontrar rapidamente produtos. 🔲
- Filtro de categorias: permitir aos usuários filtrar o cardápio por tipo de item (ex: "Vegetariano", "Novo", etc.) 🔲
- Página de Informações: Contato, localização, horário, etc. 🔲

## 9. Testes
- Testar CRUDs utilizando **H2**. 🔲
- Testar integração com **PostgreSQL**. 🔲
- Criar testes unitários para cada service e controller (opcional, mas recomendado). 🔲

## 10. Extras
- Adicionar **avaliações** aos produtos (opcional, mas interessante). 🔲
- Sistema de **tags** para os produtos (ex: "Vegano", "Sem glúten"). 🔲
- Desenvolver API com base **RESTful** para consumo em outras plataformas ou para um app futuro. 🔲

## 11. Documentação
- Documentar o projeto no `README.md`, explicando as funcionalidades e como rodar a aplicação. 🔲
- Adicionar exemplo de uso da API REST no `README.md`. 🔲

## 12. Deploy
- Fazer deploy da aplicação. 🔲
