package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Item;
import com.example.demo.service.ItemService;

@RestController
@RequestMapping("/api")
public class ItemController {
	
	private ItemService itemService;

	@Autowired
	public ItemController(ItemService itemService) {
		super();
		this.itemService = itemService;
	}
	
	@PostMapping("/items")
	public Item createItem(@RequestBody Item item) {
		return itemService.createItem(item);
	}
	
	@GetMapping("/items")
	public List<Item> findAllItems(){
		return itemService.findAllItems();
	}
	
	@GetMapping("/items/{itemId}")
	public Optional<Item> findById(@PathVariable String itemId){
		return itemService.findById(itemId);
	}
	
	@GetMapping("/items/findByItemName/{itemName}")
	public List<Item> findByItemName(@PathVariable String itemName) {
		return itemService.findByItemName(itemName);
	}
	@GetMapping("/items/findByPrice/{price}")
	public List<Item> findByPrice(@PathVariable double price) {
		return itemService.findByPrice(price);
	}
	@GetMapping("/items/findByItemNameAndPrice/{itemName}/{price}")
	public List<Item> findByItemNameAndPrice(@PathVariable String itemName, @PathVariable double price) {
		return itemService.findByItemNameAndPrice(itemName, price);
	}
	@GetMapping("/items/findByItemNameOrPrice/{itemName}/{price}")
	public List<Item> findByItemNameOrPrice(@PathVariable String itemName,@PathVariable double price) {
		return itemService.findByItemNameOrPrice(itemName, price);
	}
	@DeleteMapping("/items/{itemId}")
	public void deleteById(@PathVariable String itemId) {
		 itemService.deleteById(itemId);
	}
	@DeleteMapping("/items")
	public void deleteAll() {
		itemService.deleteAll();
	}



	



	
	
}
