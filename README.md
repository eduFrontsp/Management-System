Management System é uma aplicação destinada a gerenciar ordens de compra ou serviço. 
O sistema permite o registro, visualização e gerenciamento de ordens em um ambiente empresarial. 
É útil para qualquer organização que precise rastrear e administrar pedidos de clientes, gerenciar inventários e analisar dados de vendas.

TECNOLOGIAS E FERRAMENTAS

- Spring Boot para o desenvolvimento da aplicação.
- PostgreSQL para o banco de dados.
- Testes unitários(JUnit e Mockito)
- Docker para containerização.
- Jenkins para CI/CD.

  Descrição da Aplicação
  
Objetivo:

O Order Management System é uma aplicação destinada a gerenciar ordens de compra ou serviço. 
O sistema permite o registro, visualização e gerenciamento de ordens em um ambiente empresarial. 
É útil para qualquer organização que precise rastrear e administrar pedidos de clientes, gerenciar inventários e analisar dados de vendas.

Funcionalidades Principais

1- Criação de Ordens: Permite que os usuários criem novas ordens, incluindo informações como descrição do pedido e valor.

2- Visualização de Ordens:Exibe uma lista de todas as ordens cadastradas no sistema. Os usuários podem visualizar detalhes de cada ordem.

3- Armazenamento Persistente: Utiliza um banco de dados PostgreSQL para armazenar todas as informações das ordens, garantindo persistência e integridade dos dados.

4- Mensageria: Integra-se com o Kafka para processamento assíncrono e troca de mensagens entre serviços, como notificações sobre novas ordens.

5- Testes e Qualidade: Inclui testes unitários e de performance para garantir a qualidade e o desempenho do sistema.
Usa Sonar para análise contínua da qualidade do código.

6- Containerização e Deploy: Utiliza Docker para criar containers da aplicação, facilitando o deploy em diferentes ambientes.
Integra-se com Jenkins para automação do processo de construção e deploy, incluindo integração contínua (CI) e entrega contínua (CD).


