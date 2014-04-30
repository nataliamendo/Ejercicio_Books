package edu.upc.eetac.dsa.nmendo.books.api.model;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.core.Link;

import edu.upc.eetac.dsa.nmendo.books.api.model.Book;

public class BookCollection {
	private List<Book> books;
	
	public BookCollection(){
		super();
		books = new ArrayList<Book>();
	}
	public List<Book> getBooks() {
		return books;
	}

	public void setStings(List<Book> books) {
		this.books = books;
	}

	public void addBook(Book book) {
		books.add(book);
	}

	
}
