package kodlamaio;

public class UserManager {

	  public void signIn (User user) {
	        System.out.println("Kay�t olundu :" + user);
	    }
	    public void logIn(User user) {
	        System.out.println("giri� yap�ld� " +user.lastName);
	    }
	    public void logOut(User user) {
	        System.out.println("��k�� yap�ld� " +user.lastName);
	    }
	    public void delete(User user) {
	        System.out.println("Hesap silindi" +user.Id);
	}
}
