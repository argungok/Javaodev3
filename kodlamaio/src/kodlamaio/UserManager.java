package kodlamaio;

public class UserManager {

	  public void signIn (User user) {
	        System.out.println("Kayýt olundu :" + user);
	    }
	    public void logIn(User user) {
	        System.out.println("giriþ yapýldý " +user.lastName);
	    }
	    public void logOut(User user) {
	        System.out.println("çýkýþ yapýldý " +user.lastName);
	    }
	    public void delete(User user) {
	        System.out.println("Hesap silindi" +user.Id);
	}
}
