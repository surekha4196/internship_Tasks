package com.test02;

public interface LibraryOperations {
	boolean issueBook(Book book,Member member);
	boolean returnBook(Book book,Member member);

}
