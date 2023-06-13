package com.el.implantacao.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.el.implantacao.domain.model.Ug;

@Repository
public interface UgRepository extends JpaRepository<Ug, Long> {

}
