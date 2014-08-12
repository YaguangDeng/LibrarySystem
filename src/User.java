
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Date;

public class User{
	private String userName;
	private boolean isAdmin;
	
	ArrayList Transactions = new ArrayList();
	
	public User(){
		
	}

	public User(String userName){
		this.userName = userName;
	}

	public void setUserName(String name){
		this.userName = name;
	}

	public void setAsAdmin(){
		this.isAdmin = true;
	}
//rent a book
	public void rentBook(Book b){
		Transaction t = new Transaction(this.userName,b.getName());
		//t.userName = this.userName;
		//t.bookName = b.getName();
		//t.rentDate = new Date().toString();
		
		boolean a = b.getifRendted();
		a = true;
		Transactions.add(t);
		FileOutputStream fileStream;
		try {
			fileStream = new FileOutputStream("Books.txt");
			ObjectOutputStream os = new ObjectOutputStream(fileStream);
			os.writeObject(Transactions);
			os.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
//return a book
	public void returnBook(Book b,Transaction[] t ){
		for(int i=0;i< t.length;i++){
			if(t[i].getBookTitle() ==b.getName()){
				t[i].setReturndate(new Date());
			}
		}
	}

	public ArrayList getHistory(String username, Transaction[] t){
		ArrayList<Transaction> history = new ArrayList<Transaction>();
		for(int i=0;i<t.length;i++){
			if(t[i]. getUsername() == username){
				history.add(t[i]);
			}
		}
		return history;
	}

	public  ArrayList isRenting(String username, Transaction[] t){
		ArrayList<Transaction> isRent = new ArrayList<Transaction>();
		for(int i=0;i< t.length;i++){
			if(t[i]. getUsername() == username && t[i].getReturndate() ==null){
				isRent.add(t[i]);
			}
		}
		return isRent;
	}

	public ArrayList searchCatogary(String keyword,Book[] b){
		ArrayList<Book> listBooks = new ArrayList<Book>();
		for(int i=0;i<b.length;i++){
			if(b[i].getCatogary() == keyword){
				//return books
				listBooks.add(b[i]);
			}
		}
		return listBooks;
	}

}