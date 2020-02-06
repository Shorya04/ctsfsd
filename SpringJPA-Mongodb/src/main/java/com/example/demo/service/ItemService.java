package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.model.Item;


public interface ItemService {
	
	public Item createItem(Item item);
	public List<Item> findAllItems();
	public Optional<Item> findById(String itemId);
	public List<Item> findByItemName(String itemName);
	public List<Item> findByPrice(double price);
	public List<Item> findByItemNameAndPrice(String itemName,double price);
	public List<Item> findByItemNameOrPrice(String itemName,double price);
	public void deleteById(String itemId);
	public void deleteAll();


}
