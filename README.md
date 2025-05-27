# **Projeto Desktop - Hibernate e Java Swing**

## **Autor**
Erick Daniel Teixeira Vier  
RA: 235908-1

## **Descrição do Projeto**
Este projeto tem como objetivo o desenvolvimento de um **sistema desktop** para gestão de clientes, aparelhos eletrônicos, serviços e vendas, utilizando **Hibernate** para persistência de dados e **Java Swing** para a interface gráfica. O sistema permite o cadastro e venda de aparelhos, com o gerenciamento de clientes e serviços de manutenção.

## **Tecnologias Utilizadas**
- **Java**: Linguagem de programação principal.
- **Hibernate**: Framework para mapeamento objeto-relacional (ORM) e persistência de dados.
- **Java Swing**: Biblioteca gráfica para desenvolvimento da interface de usuário.
- **Postgresql**: Banco de dados utilizado para armazenar as informações do sistema.

## **Arquitetura do Sistema**
A arquitetura do sistema é baseada em camadas:
- **DAO (Data Access Object)**: Responsável pela persistência de dados.
- **Dominio**: Contém as classes de modelo e lógica de negócios.
- **GerenciadorTarefas**: Coordena o fluxo de atividades e interações entre as camadas.
- **Interfaces**: Responsável pela interação do usuário com o sistema.

## **Funcionalidades**
- **Cadastro de Clientes**: Permite o registro de novos clientes no sistema.
- **Cadastro de Aparelhos**: Registra aparelhos eletrônicos para venda ou serviço.
- **Venda de Aparelhos**: Gerencia o processo de venda de aparelhos para clientes.
- **Cadastro de Serviços**: Registra serviços realizados nos aparelhos, como consertos.

## **Imagens**

Telas principais:

### Login
![Tela Login](https://github.com/ErickDaniel7/oficina-eletronica/blob/main/telas/TelaLogin.png)

### Menu
![Tela Menu Principal](https://github.com/ErickDaniel7/oficina-eletronica/blob/main/telas/TelaMenuPrincipal.png)

## **Como Executar o Projeto**

1. Clone o repositório:
   ```bash
   git clone https://github.com/seu-usuario/seu-repositorio.git

2. Navegue até a Pasta do Projeto
   ```bash
   cd oficina-eletronica

3. Configuração do Banco de Dados

- O projeto utiliza o Hibernate para persistência de dados. Para configurá-lo corretamente, siga os seguintes passos:
- Abra o arquivo hibernate.cfg.xml localizado na pasta de configuração do projeto.
- Altere a URL do banco de dados para o seu banco local, por exemplo:
  
```bash
<property name="hibernate.connection.url">jdbc:postgresql://localhost:5432/eletronicaerick</property>
```

No exemplo acima, o nome da database é eletronicaerick. Substitua eletronicaerick pelo nome do banco de dados que você criou.

- Alterar o nome de usuário e senha de conexão: Certifique-se de modificar o usuário e senha de conexão conforme as credenciais configuradas no seu banco de dados.
```bash
<property name="hibernate.connection.username">seu-usuario</property>
<property name="hibernate.connection.password">sua-senha</property>
```

- Configuração do driver JDBC: Se estiver utilizando o PostgreSQL, certifique-se de que o driver JDBC correto está configurado:
```bash
<property name="hibernate.dialect">org.hibernate.dialect.PostgreSQLDialect</property>
```
Se você estiver usando outro banco de dados (como MySQL), altere o driver JDBC para o correspondente ao seu banco.

4. Compilar e Executar o Projeto

Após configurar o banco de dados, você pode compilar e executar o projeto utilizando a IDE de sua escolha (como IntelliJ IDEA, NetBeans ou Eclipse) ou via linha de comando.
