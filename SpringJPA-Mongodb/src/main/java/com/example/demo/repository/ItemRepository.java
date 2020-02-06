package com.example.demo.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Item;

@Repository
public interface ItemRepository extends MongoRepository<Item, String> {
	
	public List<Item> findByItemName(String itemName);
	public List<Item> findByPrice(double price);
	public List<Item> findByItemNameAndPrice(String itemName,double price);
	public List<Item> findByItemNameOrPrice(String itemName,double price);
	public void deleteById(String itemId);
	public void deleteAll();




}
