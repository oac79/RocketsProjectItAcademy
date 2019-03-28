package app.model;

import java.util.List;

import app.controller.RocketHandlers;

public class Rocket {
	private RocketHandlers rocketMan;
	private String code;
	private List<Propeller> propellers;

	public Rocket()
		{
			super();
		}

	public Rocket(String code, List<Propeller> propellers) throws Exception
		{
			if (!checkCode(code))
				throw new Exception("--Code ERROR--");

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
	public boolean checkCode(String code)
		{
			return (code.length() == 8);
		}

	@Override
	public String toString()
		{
			return "Rocket [code=" + code + " ---- [Propeller" + propellers.toString() + "]";
		}

}
