package cn.tedu.store.mapper;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import cn.tedu.store.entity.User;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTestCase {
	@Autowired
	UserMapper userMapper;
	@Test
	public void addnew() {
		User user = new User();
		user.setUsername("root");
		user.setPassword("1234");
		user.setSalt("hello,MD5");
		user.setGender(1);
		user.setPhone("1234564567899");
		user.setEmail("456+66@con.cn");
		Date date = new Date();
		user.setCreatedUser("admin");
		user.setModifiedUser("admin");
		user.setCreatedTime(date);
		user.setModifiedTime(date);
		Integer rows = userMapper.addnew(user);
		System.err.println(rows);
	}
	@Test
	public void findByUsername() {
		User user = userMapper.findByUsername("root");
		System.err.println(user);
	}
}
