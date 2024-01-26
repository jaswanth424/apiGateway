package com.example.one.App1.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
class Book {
	String name;
}

@RestController
@RequestMapping("/books")
public class MainController {
	@GetMapping
	public ResponseEntity<List<Book>> getRandom() {
		List<Book> list = Arrays.asList(new Book("one"), new Book("two"));
		return new ResponseEntity<List<Book>>(list, HttpStatus.OK);
	}

}
