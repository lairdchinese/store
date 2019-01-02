package cn.tedu.store.service;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import cn.tedu.store.entity.User;
import cn.tedu.store.mapper.UserMapper;
import cn.tedu.store.service.exception.ServiceException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTestCase {
	@Autowired
	IUserService userService;
	@Test
	public void addnew() {
		try {
			User user = new User();
			user.setUsername("springMVC");
			user.setPassword("1234");
			user.setSalt(user.getSalt());
			user.setGender(1);
			user.setPhone("1234564567899");
			user.setEmail("spring@tedu.cn");
			
			User result = userService.reg(user);
			System.err.println(result);
		} catch (ServiceException e) {
			System.out.println("错误类型"+e.getClass().getName());
			System.out.println("异常类型"+e.getMessage());
		}
	}
	@Test
	public void login() {
		try {
			String username = "mybatis1";
			String password = "1234";
			User user = userService.login(username, password);
		} catch (ServiceException e) {
			System.out.println("错误类型"+e.getClass().getName());
			System.out.println("异常类型"+e.getMessage());
		}
	}
}
