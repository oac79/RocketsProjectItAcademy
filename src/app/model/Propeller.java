package app.model;

public class Propeller {
	private static final int MAX_POWER = 100;
	private int power;

	public Propeller()
		{

		}

	public Propeller(int power) throws Exception
		{
			if (power > MAX_POWER)
				throw new Exception();
			this.power = power;
		}

	public int getPower()
		{
			return power;
		}

	public void setPower(int power)
		{
			this.power = power;
		}

	@Override
	public String toString()
		{
			return " [power=" + power + "]";
		}

}
