package com.checkpoint.clinica.repository;

import com.checkpoint.clinica.model.Endereco;
import com.checkpoint.clinica.model.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IRepositoryEndereco extends JpaRepository<Endereco, Integer> {
    Endereco findEnderecoById(Integer id);
}
