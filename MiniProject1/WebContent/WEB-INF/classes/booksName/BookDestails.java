package booksName;
import java.io.Serializable;

public class BookDestails implements Serializable {
	
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
