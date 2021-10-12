package chapter17;

import java.util.HashSet;
import java.util.Set;

public class Ex8 {

	public static void main(String[] args) {
		Book book1 = new Book("Java Master", 34500);
		Book book2 = new Book("JSP/Servlet 입문", 29000);
		
		Set<Book> bookList = new HashSet<>();
		bookList.add(book1);
		bookList.add(book2);
		
		System.out.println(bookList);
		
		Book book3 = new Book("JSP/Servlet 입문", 29000);
		bookList.add(book3);
		
		System.out.println(bookList);
		
	}
}
