package com.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.entities.Doctor;

public interface DoctorRepository extends JpaRepository<Doctor,Integer> 
{
}
