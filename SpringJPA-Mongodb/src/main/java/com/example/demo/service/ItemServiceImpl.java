package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.example.demo.model.Item;
import com.example.demo.repository.ItemRepository;
@Service
@EnableTransactionManagement
public class ItemServiceImpl implements ItemService {

	@Autowired
	private ItemRepository itemRepository;
	
	@Override
	public Item createItem(Item item) {
		// TODO Auto-generated method stub
		return itemRepository.insert(item);
	}

	@Override
	public List<Item> findAllItems() {
		// TODO Auto-generated method stub
		return itemRepository.findAll();
	}

	@Override
	public Optional<Item> findById(String itemId) {
		// TODO Auto-generated method stub
		return itemRepository.findById(itemId);
	}

	@Override
	public List<Item> findByItemName(String itemName) {
		// TODO Auto-generated method stub
		return itemRepository.findByItemName(itemName);
	}

	@Override
	public List<Item> findByPrice(double price) {
		// TODO Auto-generated method stub
		return itemRepository.findByPrice(price);
	}

	@Override
	public List<Item> findByItemNameAndPrice(String itemName, double price) {
		// TODO Auto-generated method stub
		return itemRepository.findByItemNameAndPrice(itemName, price);
	}

	@Override
	public List<Item> findByItemNameOrPrice(String itemName, double price) {
		// TODO Auto-generated method stub
		return itemRepository.findByItemNameOrPrice(itemName, price);
	}

	@Override
	public void deleteById(String itemId) {
		// TODO Auto-generated method stub
		itemRepository.deleteById(itemId);
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		itemRepository.deleteAll();
		
	}

}
