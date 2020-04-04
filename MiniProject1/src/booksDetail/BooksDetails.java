package booksDetail;
import java.io.*;

public class BooksDetails implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String authorname,name;
	private int price;
	
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public void setAuthorName(String authorname){
		this.authorname=authorname;
	}
	public String getAuthorName(){
		return authorname;
	}
	public void setPrice(int price){
		this.price=price;
		
	}
	public int getPrice(){
		return price;
	}

}
