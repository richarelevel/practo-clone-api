package com.api.practoclone.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.practoclone.model.Doctor;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Long>   {

}
