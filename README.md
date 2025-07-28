# Cardapio-AfricaBurger

# 📝 Descrição

Este projeto visa criar um **cardápio digital para um restaurante**, permitindo a visualização de:
- Lanches
- Bebidas
- Promoções
- Combos

Além disso, também exibe informações gerais sobre o restaurante, como:
- Horário de funcionamento
- Contato
- Localização

Este repositório utiliza:
- **Spring Boot** com **Maven**
- **PostgreSQL** como banco de dados principal
- **H2** para testes

---

# 🤝 Como Contribuir

## 0. Solicitar Permissão
Antes de tudo, caso não tenha visto a mensagem no grupo, me mande seu email para poder dar commits no github

## 1. Clonando o Repositório

Para começar a trabalhar no projeto, clone este repositório:

```bash
git clone https://github.com/GustavoHenriqueAlencar/Cardapio-AfricaBurger.git
```
## 2. Criando Sua Própria Branch

Cada membro deve criar sua própria branch para trabalhar de forma independente.  
O nome da branch deve seguir o formato:

```bash
nome-do-membro-develop
```
### Exemplo:

Se seu nome é **Lucas**, sua branch será:  
`lucas-develop`

Se seu nome é **Ana**, sua branch será:  
`ana-develop`

Para criar a branch, use o comando:

```bash
git checkout -b nome-do-membro-develop
```
Substitua "nome-do-membro" pelo seu nome.

## 3. Trabalhando na Sua Branch
Sempre trabalhe na sua própria branch e não faça alterações diretamente na branch main.

Para atualizar sua branch com as últimas alterações da main, execute:

```bash
git checkout main
git pull origin main
git checkout nome-do-membro-develop
git merge main
```
## 4. Comitando Suas Alterações
Após fazer alterações no projeto, siga os comandos abaixo para salvar e enviar ao GitHub:

```bash
git add .
git commit -m "Descrição clara do que foi feito"
git push origin nome-do-membro-develop
```
## 5. Abrindo um Pull Request (PR)
Quando você terminar sua tarefa e subir suas alterações para o GitHub:

- Vá até o repositório no GitHub.
- Clique em "Compare & pull request".
- Descreva o que foi feito.
- Clique em "Create pull request".


## 6. Revisão de Código
Outro membro da equipe revisará seu código.
Se necessário, faça as alterações solicitadas.
Antes de finalizar o PR, atualize sua branch com a main:

```bash
git checkout main
git pull origin main
git checkout nome-do-membro-develop
git merge main
```
## 7. Merge para a Main
Após a revisão e aprovação do seu Pull Request, suas alterações serão incluídas na branch main.

# 📌 Tarefas
As tarefas do projeto estão descritas no arquivo TODO.md.
Cada membro pode escolher uma tarefa de acordo com seu interesse e experiência.

Como funciona:
- Abra o arquivo TODO.md e veja as tarefas disponíveis.
- Escolha uma tarefa e crie uma branch com o sufixo -develop (seguindo o padrão).
- Implemente a tarefa.
- Abra um Pull Request (PR) e explique brevemente o que foi feito.


## ⚠️ Importante:

- Não há divisão fixa de tarefas (Vamos organizar isso).
- Não faça alterações diretamente na branch main.
- Trabalhe sempre na sua própria branch.
