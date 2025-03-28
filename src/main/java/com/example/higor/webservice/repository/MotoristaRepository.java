/**
 * @author higor.robinn on 26/03/2025.
 */

package com.example.higor.webservice.repository;

import com.example.higor.webservice.model.Motorista;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MotoristaRepository extends JpaRepository<Motorista, Long> {
}
