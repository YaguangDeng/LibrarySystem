import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by franklin on 8/12/14.
 */
public class Library {
    private static ArrayList<Book> Books;
    private static ArrayList<Transaction> Transactions;
    private static ArrayList<User> Users;
    private FileInputStream fileIn;
    private FileOutputStream fileOut;
    private ObjectInputStream ios;
    private ObjectOutputStream oos;

    public void setBook(){
        try {
            fileIn = new FileInputStream("books.txt");
            ios = new ObjectInputStream(fileIn);
            Books = new ArrayList<Book>();
            Object obj = null;
            while((obj=ios.readObject())!=null){
                if(obj instanceof Book){
                    Book oneBook = (Book) obj;
                    Books.add(oneBook);
                }
            }
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }catch(ClassNotFoundException e){
            e.printStackTrace();;
        }
    }

    public void setUsers(){
        try {
            fileIn = new FileInputStream("users.txt");
            ios = new ObjectInputStream(fileIn);
            Users = new ArrayList<User>();
            Object obj = null;
            while((obj=ios.readObject())!=null){
                if(obj instanceof User){
                    User oneUser = (User) obj;
                    Users.add(oneUser);
                }
            }
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }catch(ClassNotFoundException e){
            e.printStackTrace();;
        }
    }

    public void setTransactions(){
        try {
            fileIn = new FileInputStream("transactions.txt");
            ios = new ObjectInputStream(fileIn);
            Transactions = new ArrayList<Transaction>();
            Object obj = null;
            while((obj=ios.readObject())!=null){
                if(obj instanceof Transaction){
                    Transaction oneTran = (Transaction) obj;
                    Transactions.add(oneTran);
                }
            }
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }catch(ClassNotFoundException e){
            e.printStackTrace();;
        }
    }

    public void login(String name, String password){
        Iterator<User> it= Users.iterator();
        while(it.hasNext()){
            if(it.next().getUserName().equals(name)&&it.next().getPassWord().equals(password)){
                if(name.equals("admin")){
                    //admin interface
                }
                else{
                    //user interface
                }
            }
        }

    }



    public void saveObject(ArrayList arr, String path){
        try {
            fileOut = new FileOutputStream(path);
            ObjectOutputStream os = new ObjectOutputStream(fileOut);
            os.writeObject(arr);
            os.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
