package chapter17;

import java.util.Objects;

public class Book {
	private String title;
	private int price;

	public Book(String title, int price) {
		this.title = title;
		this.price = price;
	}

	@Override
	public String toString() {
		return title + "(" + price + "원)";
	}

	@Override
	public boolean equals(Object obj) {
		Book other = (Book) obj;
		String otherTitle = other.getTitle();
		int otherPrice = other.getPrice();
		
		boolean sameTitle = title.equals(otherTitle);
		boolean samePrice = price == otherPrice;
		return super.equals(obj);
	}

	@Override
	public int hashCode() {
		return Objects.hash(title, price);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
