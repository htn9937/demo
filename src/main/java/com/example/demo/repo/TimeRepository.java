package com.example.demo.repo;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Time;

@Repository
public interface TimeRepository extends JpaRepository<Time, UUID>{

}
