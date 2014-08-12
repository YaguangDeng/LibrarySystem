package librarySystem;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


public class admin extends User {
	
	ArrayList users = new ArrayList();
	ArrayList books = new ArrayList();
	
	
	public void addBook(String name, String catogary){
		Book newBook = new Book(name, catogary);
		books.add(newBook);
		FileOutputStream fileStream;
		try {
			fileStream = new FileOutputStream("Books.txt");
			ObjectOutputStream os = new ObjectOutputStream(fileStream);
			os.writeObject(books);
			os.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	
	public void addUsers(String userName){
		User newUser = new User(userName);
		users.add(newUser);
		FileOutputStream fileStream;
		try {
			fileStream = new FileOutputStream("Users.txt");
			ObjectOutputStream os = new ObjectOutputStream(fileStream);
			os.writeObject(newUser);
			os.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	
	public void deleteBook(String name){
		for(int i = 0; i < books.size(); i++){
			if(books.contains(name)){
			books.remove(i);
				}
			}
		FileOutputStream fileStream;
		try {
			fileStream = new FileOutputStream("Books.txt");
			ObjectOutputStream os = new ObjectOutputStream(fileStream);
			os.writeObject(books);
			os.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	
	public void deleteUser(String name){
		for(int i = 0; i < users.size(); i++){
			if(users.contains(name)){
			users.remove(i);
				}
			}
		FileOutputStream fileStream;
		try {
			fileStream = new FileOutputStream("Users.txt");
			ObjectOutputStream os = new ObjectOutputStream(fileStream);
			os.writeObject(users);
			os.close();
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
	
	}

}
