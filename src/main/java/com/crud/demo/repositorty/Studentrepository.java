package com.crud.demo.repositorty;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crud.demo.entity.Entityclass;

@Repository
public interface Studentrepository extends JpaRepository<Entityclass, Integer>{

}
