package app.exception;

public class MyException extends Exception {

	public MyException()
		{

		}

	public MyException(String msg)
		{
			super(msg);
		}

	public static boolean checkCode(String code)
		{
			return (code.length() == 8);
		}

	public void printStopRocket()
		{
			System.err.println("-------------STOP--------------");
		}

}
