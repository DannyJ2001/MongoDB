package com.example.ProyectoMongo.repositories;

import com.example.ProyectoMongo.models.ProductDTO;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductDAO extends MongoRepository<ProductDTO, String> {
	
	
}
