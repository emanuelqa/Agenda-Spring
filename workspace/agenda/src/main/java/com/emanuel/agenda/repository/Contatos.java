package com.emanuel.agenda.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.emanuel.agenda.model.Contato;

public interface Contatos extends JpaRepository<Contato, Long> {

}
