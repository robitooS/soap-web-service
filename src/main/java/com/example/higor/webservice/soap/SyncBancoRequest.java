/**
 * @author higor.robinn on 26/03/2025.
 */

package com.example.higor.webservice.soap;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "syncBancoRequest", namespace = "http://localhost:8080/motorista")
public class SyncBancoRequest {

    // Dados do Motorista
    private String nome;
    private String cpf;
    private String cnh;
    private String email;
    private String celular;
    private String cep;
    private String logradouro;
    private String complemento;
    private String cidade;
    private String estado;
    private String bairro;

    // Dados do Carro
    private String placa;
    private String marca;
    private String modelo;
    private int ano;
    private String cor;
    private String kmAtual;

    public SyncBancoRequest() {}

    // Getters e Setters com a anotação @XmlElement para mapeamento
    @XmlElement(name = "nome", namespace = "http://localhost:8080/motorista")
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    @XmlElement(name = "cpf", namespace = "http://localhost:8080/motorista")
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @XmlElement(name = "cnh", namespace = "http://localhost:8080/motorista")
    public String getCnh() {
        return cnh;
    }
    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    @XmlElement(name = "email", namespace = "http://localhost:8080/motorista")
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    @XmlElement(name = "celular", namespace = "http://localhost:8080/motorista")
    public String getCelular() {
        return celular;
    }
    public void setCelular(String celular) {
        this.celular = celular;
    }

    @XmlElement(name = "cep", namespace = "http://localhost:8080/motorista")
    public String getCep() {
        return cep;
    }
    public void setCep(String cep) {
        this.cep = cep;
    }

    @XmlElement(name = "logradouro", namespace = "http://localhost:8080/motorista")
    public String getLogradouro() {
        return logradouro;
    }
    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    @XmlElement(name = "complemento", namespace = "http://localhost:8080/motorista")
    public String getComplemento() {
        return complemento;
    }
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    @XmlElement(name = "bairro", namespace = "http://localhost:8080/motorista")
    public String getBairro() {
        return bairro;
    }
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    @XmlElement(name = "cidade", namespace = "http://localhost:8080/motorista")
    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    @XmlElement(name = "estado", namespace = "http://localhost:8080/motorista")
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }

    // Dados do Carro
    @XmlElement(name = "placa", namespace = "http://localhost:8080/motorista")
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    @XmlElement(name = "marca", namespace = "http://localhost:8080/motorista")
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    @XmlElement(name = "modelo", namespace = "http://localhost:8080/motorista")
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @XmlElement(name = "ano", namespace = "http://localhost:8080/motorista")
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }

    @XmlElement(name = "cor", namespace = "http://localhost:8080/motorista")
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }

    @XmlElement(name = "kmAtual", namespace = "http://localhost:8080/motorista")
    public String getKmAtual() {
        return kmAtual;
    }
    public void setKmAtual(String kmAtual) {
        this.kmAtual = kmAtual;
    }
}

