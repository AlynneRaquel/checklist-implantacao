package com.el.implantacao.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.el.implantacao.domain.model.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}
