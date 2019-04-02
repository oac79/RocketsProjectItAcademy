package app.model;

import java.util.List;

import app.exception.MyException;

public class Rocket {
	private String code;
	private List<Propeller> propellers;

	public Rocket()
		{
			super();
		}

	public Rocket(String code, List<Propeller> propellers) throws MyException
		{
			if (!MyException.checkCode(code))
				throw new MyException("--WARNING CODE--");
			this.code = code;
			this.propellers = propellers;

		}

	public String getCode()
		{
			return code;
		}

	public void setCode(String code)
		{
			this.code = code;
		}

	// Method fase1

	@Override
	public String toString()
		{
			return "Rocket [code=" + code + " ---- " + propellers.toString() + "]";
		}

}
