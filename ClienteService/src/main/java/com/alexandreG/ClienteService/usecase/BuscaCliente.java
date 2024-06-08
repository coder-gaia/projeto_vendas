/**
 * @author alexandre.gaia
 */

package com.alexandreG.ClienteService.usecase;

import com.alexandreG.ClienteService.domain.Cliente;
import com.alexandreG.ClienteService.exception.EntityNotFoundException;
import com.alexandreG.ClienteService.repository.IClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class BuscaCliente {

    private IClienteRepository clienteRepository;

    @Autowired
    public BuscaCliente(IClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }
    public Page<Cliente> buscar(Pageable pageable) {
        return clienteRepository.findAll(pageable);
    }

    public Cliente buscarPorId(String id) throws Throwable {
        return (Cliente) clienteRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException(Cliente.class, "id", id));
    }

    public Boolean isCadastrado(String id) {
        Optional<Cliente> cliente = clienteRepository.findById(id);
        return cliente.isPresent() ? true : false;
    }

    public Cliente buscarPorCpf(Long cpf) {
        return clienteRepository.findByCpf(cpf)
                .orElseThrow(() -> new EntityNotFoundException(Cliente.class, "cpf", String.valueOf(cpf)));
    }


}
