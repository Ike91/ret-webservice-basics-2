package com.springbootbasics2.springbootbasics2;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BooksController {

	@GetMapping("/books")
	public List<Book> getAllBooks()
	{
		return Arrays.asList(new Book(1l, "lEARNING SPRING BOOT", "ISAAC MHLANGA"));
	}
}
