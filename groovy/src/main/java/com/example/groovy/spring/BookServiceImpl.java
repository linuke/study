package com.example.groovy.spring;

import com.example.groovy.spring.bean.Book;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Service
public class BookServiceImpl implements BookService {
	
	private Map<Integer, Book> bookMap;

	@PostConstruct
	public void init() {
		bookMap = new HashMap<Integer, Book>();
		bookMap.put(1, new Book(1, "java in action"));
		bookMap.put(2, new Book(2, "spring in action"));
		bookMap.put(3, new Book(3, "jquery in action"));
	}

	@Override
	public String getName(Integer id) {
		Book book = bookMap.get(id);
		return book != null ? book.getName() : "book isn't exist!";
	}

}
