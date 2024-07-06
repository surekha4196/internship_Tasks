package com.test02;

import java.util.ArrayList;
import java.util.List;

public class Member {

	private int memberID;
	private String name;
	private int maxBooksIssued;
	private List<Book> currentIssuedBooks;

	public Member(int memberID, String name, int maxBooksIssued) {
		this.memberID = memberID;
		this.name = name;
		this.maxBooksIssued = maxBooksIssued;
		this.currentIssuedBooks = new ArrayList<>();//intialize list here
	}

	public int getMemberID() {
		return memberID;
	}

	public String getName() {
		return name;
	}

	public int getMaxBooksIssued() {
		return maxBooksIssued;
	}

	public List<Book> getCurrentIssuedBooks() {
		return currentIssuedBooks;
	}

	public boolean addBook(Book book) {
		if (currentIssuedBooks.size() < maxBooksIssued) {
			currentIssuedBooks.add(book);
			book.setIssued(true);
			return true;
		}
		return false;
	}

	public boolean removeBook(Book book) {
		if (currentIssuedBooks.remove(book)) {
			book.setIssued(false);
			return true;
		}
		return false;
	}

	

	
}
