# Projeto Desktop - Hibernate e Java Swing

## 👤 Autor

**Erick Daniel Teixeira Vier**  
**RA:** 235908-1

---

## 📌 Descrição do Projeto

Sistema **desktop** para **gestão de clientes, aparelhos eletrônicos, serviços e vendas**, desenvolvido com:

- **Java Swing** para a interface gráfica
- **Hibernate** para a persistência de dados

### Principais funcionalidades:

- Cadastro e gerenciamento de **clientes**
- Registro e venda de **aparelhos eletrônicos**
- Controle de **serviços de manutenção**

---

## 🛠️ Tecnologias Utilizadas

- `Java` — Linguagem de programação principal  
- `Hibernate` — Framework ORM para persistência de dados  
- `Java Swing` — Biblioteca gráfica para interface do usuário  
- `PostgreSQL` — Banco de dados utilizado  

---

## 🧱 Arquitetura do Sistema

O sistema é dividido em camadas, seguindo boas práticas de organização e desacoplamento:

- **DAO (Data Access Object):** Acesso e manipulação dos dados no banco
- **Domínio:** Contém as entidades e regras de negócio
- **GerenciadorTarefas:** Coordena interações entre as camadas
- **Interfaces:** Interface gráfica com o usuário (GUI)

---

## ✅ Funcionalidades

- 📇 **Cadastro de Clientes**  
- 🔌 **Cadastro de Aparelhos**  
- 💰 **Venda de Aparelhos**  
- 🛠️ **Cadastro de Serviços**

---

## 🖼️ Imagens

### 🔐 Tela de Login

![Tela Login](https://github.com/ErickDaniel7/oficina-eletronica/blob/main/telas/TelaLogin.png)

### 📋 Menu Principal

![Tela Menu Principal](https://github.com/ErickDaniel7/oficina-eletronica/blob/main/telas/TelaMenuPrincipal.png)

---

## 🚀 Como Executar o Projeto

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
