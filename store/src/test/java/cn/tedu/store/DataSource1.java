package cn.tedu.store;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DataSource1 {
	@Autowired
	DataSource dataSource;
	@Test
	public void getConnetion() throws SQLException {
		System.out.println(dataSource.getConnection());
	}
}
