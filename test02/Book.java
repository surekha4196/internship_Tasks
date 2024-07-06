package com.test02;

public class Book {
	private int bookID;
	private String title;
	private String author;
	private boolean isIssued;

public Book(int bookID,String title,String author){
	this.bookID=bookID;
	this.title=title;
	this.author=author;
	this.isIssued=false;
}

public int getBookID() {
	return bookID;
}


public String getTitle() {
	return title;
}


public String getAuthor() {
	return author;
}



public void setIssued(boolean b) {
	// TODO Auto-generated method stub
	
}



public boolean isIssued() {
	// TODO Auto-generated method stub
	return false;
}


	



}
