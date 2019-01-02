package cn.tedu.store.service;

import cn.tedu.store.entity.User;
import cn.tedu.store.service.exception.DuplicateKeyException;
import cn.tedu.store.service.exception.InsertException;
import cn.tedu.store.service.exception.PasswordNotMatchException;
import cn.tedu.store.service.exception.UserNotFoundException;

/**
 * 处理用户数据的业务层接口
 * @author laird
 *
 */
public interface IUserService {
	/**
	 * 用户注册
	 * @param user 用户的注册信息
	 * @return	成功注册的用户数据
	 * @throws DuplicateKeyException
	 * @throws InsertException
	 */
	User reg(User user)throws DuplicateKeyException,InsertException;
	/**
	 * 用户登录
	 * @param username 用户登录信息
	 * @param password 登录密码
	 * @return
	 * @throws UserNotFoundException 用户名不存在异常
	 * @throws PasswordNotMatchException 用户名密码输入错误异常
	 */
	User login(String username,String password)throws UserNotFoundException,PasswordNotMatchException;
}
