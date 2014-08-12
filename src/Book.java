
public class Book {

	private String bookName;
	private String catogary;
	private boolean isRented;
	
	public Book(String name, String catogary){
		this.bookName = bookName;
		this.catogary = catogary;
		isRented = false;
	}
	
	public void setName(String name){
		this.bookName = bookName;
	}
	
	public void setCatogary(String catogary){
		this.catogary = catogary;
	}
	
	public void setifRented(boolean ifRented){
		this.isRented = ifRented;
	}
	
	public String getName(){
		return this.bookName;
	}
	
	public String getCatogary(){
		return this.catogary;
	}
	
	public boolean getifRendted(){
		return this.isRented;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
