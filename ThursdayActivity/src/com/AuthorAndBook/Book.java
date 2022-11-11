package com.AuthorAndBook;

public class Book {
	private String Book;
	private int yearofpublished;
	private float price;
	private Author author;

	public Book()
	{
		super();
	}
	public Book(String Book,int yearofpublished,float price,Author author) {
	super();
	this.Book=Book;
	this.yearofpublished=yearofpublished;
	this.price=price;
	this.author=author;
	}
	public String getBook() 
	{
		return Book;
	}
	public void setBook(String book) 
	{
		
		Book = book;
	}

	public int getyearofpublished() 
	{
		return yearofpublished;
	}
	public void setyearofpublished(int yearofpublished) 
	{
		this.yearofpublished = yearofpublished;
	}
	
	public float getPrice() 
	{
		return price;
	}
	public void setPrice(float price)
	{
		this.price = price;
	}
	public Author getAuthor()
	{
		return author;
		
	}
	 public void setAuthor(Author author)
	 {
		 this.author=author;
	 }
	  
	    
	}

