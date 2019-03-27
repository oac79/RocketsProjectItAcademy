package fase1;

import java.util.List;

import fase1.controller.RocketHandlers;

public class Rocket {
	private RocketHandlers rocketMan;
	private String code;
	private List<Integer> propellers;

	public Rocket()
		{
			super();
		}

	public Rocket(String code, List<Integer> propellers) throws Exception
		{

			boolean checkCode;
			rocketMan = new RocketHandlers();
			checkCode = rocketMan.checkCode(code);
			if (!checkCode)
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

	public List<Integer> getPropellers()
		{
			return propellers;
		}

	public void setPropellers(List<Integer> propellers)
		{
			this.propellers = propellers;
		}

	@Override
	public String toString()
		{
			return "Rocket [code=" + code + ", propellers=" + propellers + "]";
		}

}
