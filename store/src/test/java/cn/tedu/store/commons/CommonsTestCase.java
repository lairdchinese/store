package cn.tedu.store.commons;

import java.util.UUID;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
@RunWith(SpringRunner.class)
@SpringBootTest
public class CommonsTestCase {
	@Test
	public void uuid() {
		for (int i = 0; i <= 9; i++) {
			
			System.out.println(UUID.randomUUID().toString());
		}
	}
}
