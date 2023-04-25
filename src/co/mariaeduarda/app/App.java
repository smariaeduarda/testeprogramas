package co.mariaeduarda.app;

import java.util.ArrayList;
import java.util.List;

public class App {
	
	public static void main(String[] args) {
		List<User> users = new ArrayList<>();
		
		for(int i = 0; i < 10; i++) {
			User actual = new User("Nome " + i, "sobrenome " + i);
			users.add(actual);
		}
		
		System.out.println(users.get(9).getFirstName());
		System.out.println(users.get(9).getLastName());
		
		User user11 = new User("Nome 11", "Sobrenome 11");
		users.add(user11);
		
		System.out.println(users.get(10).getFirstName());
		System.out.println(users.get(10).getLastName());
		
	}
}