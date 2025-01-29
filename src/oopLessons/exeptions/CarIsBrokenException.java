package oopLessons.exeptions;

public class CarIsBrokenException extends Exception{
	public CarIsBrokenException() {
		super();
	}

	public CarIsBrokenException(String message) {
		super(message);
	}

	public CarIsBrokenException(String message, Throwable cause) {
		super(message, cause);
	}

	public CarIsBrokenException(Throwable cause) {
		super(cause);
	}

	protected CarIsBrokenException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}
}
