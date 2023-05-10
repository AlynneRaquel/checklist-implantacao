package com.el.implantacao.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.el.implantacao.domain.model.Address;


@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {

}
