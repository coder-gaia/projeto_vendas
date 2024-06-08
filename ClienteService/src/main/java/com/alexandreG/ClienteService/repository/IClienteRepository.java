/**
 * @author alexandre.gaia
 */

package com.alexandreG.ClienteService.repository;

import com.alexandreG.ClienteService.domain.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IClienteRepository extends MongoRepository<Cliente, String> {
    @Autowired
    Optional<Cliente> findByCpf(Long cpf);
}
