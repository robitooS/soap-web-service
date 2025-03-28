/**
 * @author higor.robinn on 26/03/2025.
 */

package com.example.higor.webservice.service;

import com.example.higor.webservice.model.Motorista;
import com.example.higor.webservice.repository.MotoristaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MotoristaService {

    @Autowired
    MotoristaRepository motoristaRepository;

    public Motorista criarMotorista(Motorista motorista) {
        return motoristaRepository.save(motorista);
    }
}
