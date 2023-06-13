package com.el.implantacao.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.el.implantacao.domain.model.Type;

@Repository
public interface TypeRepository extends JpaRepository<Type, Long> {

}
