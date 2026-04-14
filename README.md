# 🚗 Car & Driver Sync Web Service (SOAP)

Este projeto consiste num **Web Service SOAP** desenvolvido com **Spring Boot 3.4.4** para a persistência e sincronização de dados entre aplicações de registo de carros e motoristas. Ele atua como um backend especializado que processa mensagens XML estruturadas para garantir a integridade da informação numa base de dados MySQL.

---

## 🎯 Foco e Objetivo

O principal objetivo deste serviço é fornecer uma interface de comunicação padronizada e segura para sistemas que necessitam sincronizar dados complexos:
- **Integridade de Dados:** Utiliza um esquema XSD para validar rigorosamente todas as entradas antes da persistência.
- **Sincronização Unificada:** Permite o envio conjunto de dados pessoais do motorista e especificações técnicas do veículo numa única transação.
- **Arquitetura SOAP:** Focado em ambientes que exigem contratos de serviço bem definidos (WSDL) para interoperabilidade entre sistemas.

---

## 🛠️ Tecnologias Utilizadas

* **Linguagem:** Java 17.
* **Framework:** Spring Boot 3.4.4.
* **Web Services:** Spring Boot Starter Web Services & WSDL4J.
* **Persistência:** Spring Data JPA com Hibernate.
* **Base de Dados:** MySQL.
* **Protocolo:** SOAP com contratos baseados em XSD.

---

## 📋 Funcionalidades

* **Sincronização de Cadastro:** Endpoint que recebe e processa o `syncBancoRequest`.
* **Dados do Motorista:** Processa Nome, CPF, CNH, Email, Telemóvel e morada detalhada (CEP, Bairro, Cidade, Estado).
* **Dados do Veículo:** Regista Placa, Marca, Modelo, Ano, Cor e Quilometragem atual.
* **Contrato Dinâmico:** Geração automática do WSDL para facilitar o consumo por clientes externos.

---

## ⚙️ Instalação e Configuração

### Pré-requisitos
* Java JDK 17.
* Maven 3.x.
* MySQL Server.

### Passo a Passo

1. **Configurar a Base de Dados:**
   No ficheiro `src/main/resources/application.properties`, configure as suas credenciais MySQL:
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/nome_da_base
   spring.datasource.username=seu_usuario
   spring.datasource.password=sua_senha

    Compilar o Projeto:
    Bash

    mvn clean install

    Executar a Aplicação:
    Bash

    mvn spring-boot:run

    Aceder ao Contrato:
    O WSDL estará disponível em http://localhost:8080/ws/motorista.wsdl após o arranque do serviço.
