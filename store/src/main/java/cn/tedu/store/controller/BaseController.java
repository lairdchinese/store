package cn.tedu.store.controller;
/**
 * 当前项目中所有控制器类的基类
 * @author laird
 *
 */

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.tedu.store.service.exception.DuplicateKeyException;
import cn.tedu.store.service.exception.InsertException;
import cn.tedu.store.service.exception.PasswordNotMatchException;
import cn.tedu.store.service.exception.ServiceException;
import cn.tedu.store.service.exception.UserNotFoundException;
import cn.tedu.store.util.ResponseResult;

public abstract class BaseController {
	/**
	 * 正确响应时的代号
	 */
	public static final Integer SUCCESS = 200;
	@ExceptionHandler(ServiceException.class)
	@ResponseBody
	public ResponseResult<Void> handleException(Exception e) {
		if(e instanceof DuplicateKeyException) {
			//400-违反了unique约束的异常
			return new ResponseResult<>(400,e);
		}else if(e instanceof UserNotFoundException) {
			//401-用户名不存在异常
			return new ResponseResult<>(401,e);
		}else if(e instanceof PasswordNotMatchException) {
			//402-密码错误
			return new ResponseResult<>(402,e);
		}else if(e instanceof InsertException) {
			//500-插入数据异常
			return new ResponseResult<>(500,e);
		}
		return null;
	}
}
