package cn.tedu.store.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cn.tedu.store.entity.User;
import cn.tedu.store.service.IUserService;
import cn.tedu.store.util.ResponseResult;

@RestController
@RequestMapping("/user")
public class UserController extends BaseController {
	@Autowired
	private IUserService userService;
	/*
	 * 请求路径：/user/reg.do
	 * 请求方式：post
	 * 请求参数：user
	 * 响应数据：Void
	 */
	@PostMapping("/reg.do")
	public ResponseResult<Void> handleReg(User user){
		userService.reg(user);
		return new ResponseResult<>(SUCCESS);
	}
	/*
	 * 请求路径：/user/login.do
	 * 请求方式：post
	 * 请求参数：json
	 * 响应数据：无
	 */
	@PostMapping("/login.do")
	public ResponseResult<Void> handleLogin(@RequestParam("username")String username,@RequestParam("password") String password,HttpSession session){
		//执行登录
		User user = userService.login(username, password);
		//将相关信息存入到Session中
		session.setAttribute("uid", user.getId());
		session.setAttribute("username",user.getUsername());
		//返回
		return new ResponseResult<Void>(SUCCESS);
	}
}
	
