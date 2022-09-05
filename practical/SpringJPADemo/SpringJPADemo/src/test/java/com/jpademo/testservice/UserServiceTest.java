package com.jpademo.testservice;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import com.jpademo.entity.User;
import com.jpademo.repository.UserRepository;
import com.jpademo.service.UserService;

//testing service class
@SpringBootTest
public class UserServiceTest {
	
	@Autowired
	private UserService us;
	
	@MockBean
	private UserRepository userrepo;
	
	// testing saveuser() of service
	@Test
	public void testSaveUser() {
		User u = new User();
		u.setId(105);
		u.setUName("Surya");
		u.setUserEmail("surya@gmail.com");
		u.setUserPhone(765432190);
		
		Mockito.when(userrepo.save(u)).thenReturn(u);
		assertThat(us.saveUser(u)).isEqualTo(u);
	}
	
	//testing getAllUser() of service
	@Test
	public void testGetAllUser() {
		User u1 = new User();
		u1.setId(106);
		u1.setUName("Suman");
		u1.setUserEmail("suman@gmail.com");
		u1.setUserPhone(765400190);
		
		User u2 = new User();
		u2.setId(107);
		u2.setUName("Sai");
		u2.setUserEmail("sai@gmail.com");
		u2.setUserPhone(665400190);
		
		List<User> al = new ArrayList<User>();
		al.add(u1);
		al.add(u2);
		Mockito.when(userrepo.findAll()).thenReturn(al);
		assertThat(us.getAllUser()).isEqualTo(al);
	}
	
	
	// testing updateUserById() of service
	@Test
	public void testupdateUserById() {
		User u3 = new User();
		u3.setId(108);
		u3.setUName("Vishal");
		u3.setUserEmail("vish123@gmail.com");
		u3.setUserPhone(776655443);
		
		Optional <User> a = Optional.of(u3);
		User ua = a.get();
		
		Mockito.when(userrepo.findById(108)).thenReturn(a);
		
		//updated phone
		ua.setUserPhone(654321890);
		Mockito.when(userrepo.save(ua)).thenReturn(ua);
		assertThat(us.updateUserById(ua, 108)).isEqualTo(ua);
	}
	
	//testing deleteUserById() of service
	@Test
	public void testdeleteUserById() {
			User u4 = new User();
			u4.setId(109);
			u4.setUName("Rohan");
			u4.setUserEmail("roh@gmail.com");
			u4.setUserPhone(678905432);
			
			Optional<User> b = Optional.of(u4);
			Mockito.when(userrepo.existsById(109)).thenReturn(false);
			assertThat(userrepo.existsById(b.get().getId()));
	}
	
	@Test
    public void testUpdateSerByIdd() {
    User u3 = new User();
    u3.setId(110);
   u3.setUName("Tejas");
   u3.setUserEmail("Tejas@gmail.com");
   u3.setUserPhone(1212121217);

   Optional<User> b = Optional.of(u3);
   User uu = b.get();

   Mockito.when(userrepo.findById(110)).thenReturn(b);
   uu.setUserPhone(1818181819);
   Mockito.when(userrepo.save(uu)).thenReturn(uu);
   assertThat(us.updateUserById(uu, 110)).isEqualTo(uu);
     }
}
