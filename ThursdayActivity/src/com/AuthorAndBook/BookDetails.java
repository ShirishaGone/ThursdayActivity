package com.AuthorAndBook;

public class BookDetails 
{
	static void display(Book b)
	{
		System.out.println("Book name: " + b.getBook());
		System.out.println("Author name : " + b.getAuthor());
		System.out.println("Book price : " + b.getPrice());
		System.out.println("Year of published : " + b.getyearofpublished());

	}

	public static void main(String[] args) {
		
		Book b = new Book("production technology", 2000,340, new Author("Shireesha",23));
		display(b);
	}

}

