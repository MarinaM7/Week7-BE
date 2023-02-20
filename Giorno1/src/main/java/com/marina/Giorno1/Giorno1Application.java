package com.marina.Giorno1;

import java.util.HashSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.marina.Giorno1.dao.RoleService;
import com.marina.Giorno1.dao.UserService;
import com.marina.Giorno1.entities.Role;
import com.marina.Giorno1.entities.RoleType;
import com.marina.Giorno1.entities.User;

@SpringBootApplication
public class Giorno1Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Giorno1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		//saveData();
		//pwCryptUserById(1);
		
		//addCryptedValue(1, "ciao2222");
		//addCryptedValue(2, "hello1234");
		
	}
	
	@Autowired
	RoleService rs;
	
	@Autowired
	UserService us;
	
	public void saveData() {
		Role r1 = Role.builder().role(RoleType.ADMIN).build();
		Role r2 = Role.builder().role(RoleType.USER).build();
		
		User u1 = User.builder().fullname("Marina Muntenita").username("marina").password("marina").roles(new HashSet<>(){{
			add(r1);
			}}).build();
		User u2 = User.builder().fullname("Luigi Verdi").username("gigi").password("gigi").roles(new HashSet<>(){{
			add(r2);
			}}).build();
		
		rs.saveRole(r1);
		rs.saveRole(r2);
		
		us.saveUser(u1);
		us.saveUser(u2);
	}
	
	@Autowired
	PasswordEncoder pwEncorder;
	
	public void pwCryptUserById(int id) {
		User u = us.getUserById(id).get();
		String pw = u.getPassword();
		u.setPassword(pwEncorder.encode(pw));
		us.saveUser(u);
		
		System.out.println("password criptata correttamente");
	}
	
	public void addCryptedValue(int id, String s) {
		
		User u = us.getUserById(id).get();
		
		u.setCryptoValue1(s);
		
		us.saveUser(u);
		
		System.out.println("Crypted the value for userId: " + id);
		
	}
	
//	public String secretCode(String attribute ) {
//		
//		if(attribute == null) {
//			return "";
//		}
//	
//		String stringResponse = "";
//
//		for (char c : attribute.toCharArray()) {
//			String x = c + "";
//			
//			if(attribute.indexOf(c) % 2 == 0) {
//				stringResponse += x + "xy";
//			}else {
//				stringResponse += x + "jk";
//			}
//			
//		}
//		return stringResponse;
//	}
//	
//	public String decryptCode(String code) {
//		
//		if(code == null) {
//			return "";
//		}
//	
//		String one = code.replace("xy", "");
//		
//		String two = one.replace("jk", "");
//		
//		return two;
//		
//	}
}


