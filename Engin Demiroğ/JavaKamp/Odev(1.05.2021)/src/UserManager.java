
public class UserManager {
	public static void add(User user) {
		System.out.println(user.getFirstName() +" "+ user.getLastName() +" Eklendi");
	}
	public static void remove(User user) {
		System.out.println(user.getFirstName() +" "+ user.getLastName()+" Silindi");
	}
	public static void update(User user) {
		System.out.println(user.getFirstName() +" "+ user.getLastName()+" Güncellendi");
	}
	

}
