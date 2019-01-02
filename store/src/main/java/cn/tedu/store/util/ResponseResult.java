package cn.tedu.store.util;

import java.io.Serializable;
/**
 * 服务器向客户端响应的结果的类型
 * @author laird
 *
 * @param <E> 服务器向客户端响应的数据的类型
 */
public class ResponseResult<E> implements Serializable{
	
	private static final long serialVersionUID = -329804680415220056L;
	private Integer state;
	private String message;
	private E date;//T:泛型占位符需要在类上声明
	public Integer getState() {
		return state;
	}
	public void setState(Integer state) {
		this.state = state;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public E getDate() {
		return date;
	}
	public void setDate(E date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "ResponseResult [state=" + state + ", message=" + message + ", date=" + date + "]";
	}
	public ResponseResult() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ResponseResult(Integer state) {//表示操作成功时
		super();
		setState(state);
	}
	public ResponseResult(Integer state, String message) {//表示操作失败时
		this(state);
		setMessage(message);
	}
	public ResponseResult(Integer state, Exception e) {
		this(state,e.getMessage());
		
		
	}
	public ResponseResult(Integer state, E date) {
		this(state);
		setDate(date);
	}
	
	
}
