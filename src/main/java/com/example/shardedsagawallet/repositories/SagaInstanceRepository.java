package com.example.shardedsagawallet.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.shardedsagawallet.entities.SagaInstance;
import org.springframework.stereotype.Repository;

@Repository
public interface SagaInstanceRepository extends JpaRepository<SagaInstance, Long> {

}