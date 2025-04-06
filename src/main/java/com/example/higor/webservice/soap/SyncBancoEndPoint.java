/**
 * @author higor.robinn on 26/03/2025.
 */

package com.example.higor.webservice.soap;

import com.example.higor.webservice.model.Motorista;
import com.example.higor.webservice.service.MotoristaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class SyncBancoEndPoint {

    private static final String NAMESPACE_URI = "http://localhost:8080/motorista";
    @Autowired
    private MotoristaService motoristaService;

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "syncBancoRequest")
    @ResponsePayload
    public SyncBancoResponse syncBanco(@RequestPayload SyncBancoRequest syncBancoRequest) {
        Motorista motorista = new Motorista();
        
        // Dados do motorista  
        motorista.setNome(syncBancoRequest.getNome());
        motorista.setCpf(syncBancoRequest.getCpf());
        motorista.setCnh(syncBancoRequest.getCnh());
        motorista.setEmail(syncBancoRequest.getEmail());
        motorista.setCelular(syncBancoRequest.getCelular());
        motorista.setCep(syncBancoRequest.getCep());
        motorista.setLogradouro(syncBancoRequest.getLogradouro());
        motorista.setComplemento(syncBancoRequest.getComplemento());
        motorista.setCidade(syncBancoRequest.getCidade());
        motorista.setEstado(syncBancoRequest.getEstado());
        motorista.setBairro(syncBancoRequest.getBairro());

        // Dados do carro do motorista 
        motorista.setPlaca(syncBancoRequest.getPlaca());
        motorista.setMarca(syncBancoRequest.getMarca());
        motorista.setModelo(syncBancoRequest.getModelo());
        motorista.setAno(syncBancoRequest.getAno());
        motorista.setCor(syncBancoRequest.getCor());
        motorista.setKmAtual(syncBancoRequest.getKmAtual());

        motoristaService.criarMotorista(motorista);

        SyncBancoResponse response = new SyncBancoResponse();
        response.setStatus("Banco sincronizado com sucesso!");
        return response;
    }
}