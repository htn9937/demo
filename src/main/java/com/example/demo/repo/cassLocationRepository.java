package com.example.demo.repo;

import java.util.UUID;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.cassandraEntity.CassLocation;


@Repository
public interface CassLocationRepository extends CassandraRepository<CassLocation,UUID>{
	
}
