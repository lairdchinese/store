package cn.tedu.store.service.exception;

/**
 * 违反了规定的异常
 * @author laird
 *
 */
public class DuplicateKeyException extends ServiceException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7342082855256795362L;

	public DuplicateKeyException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DuplicateKeyException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public DuplicateKeyException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public DuplicateKeyException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public DuplicateKeyException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}
	
}
