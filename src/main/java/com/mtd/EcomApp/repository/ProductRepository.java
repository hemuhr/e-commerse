package com.mtd.EcomApp.repository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.mtd.EcomApp.entity.Product;

@Repository
public interface ProductRepository extends MongoRepository<Product,String>
{

}