package com.api.practoclone.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.practoclone.model.Specialization;

@Repository
public interface SpecializationRepository extends JpaRepository<Specialization, Long> {

}
