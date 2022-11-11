package com.AuthorAndBook;

public class Author {
	
		public String Authorname;
		public  int age;

	    public Author()
		{
		  super();	
		}
	    public Author(String n,int a)
	    {
			 this.Authorname=n;
			 this.age=a;
		}
		public String getAuthorname() 
		{
				return Authorname;
	    }
		public void setAuthorname(String authorname) 
		{
				this.Authorname = authorname;
		}		
		public int getAge() {
			return age;
		}
		public void setAge(int age)
		{
			this.age = age;
		}
		
		public String toString() 
		{
			return(Authorname+"Age of the author is:"+getAge());
		}
		}

