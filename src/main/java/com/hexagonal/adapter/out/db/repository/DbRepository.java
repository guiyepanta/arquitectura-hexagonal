package com.hexagonal.adapter.out.db.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hexagonal.adapter.out.db.model.TennisMatchEntity;

@Repository
public interface DbRepository extends JpaRepository<TennisMatchEntity, String> {

}
