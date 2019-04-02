package app.model;

import java.util.List;

public class Propeller {
	private double maxPower;
	private double power;

	public Propeller()
		{

		}

	public Propeller(int maxPower)
		{
			this.maxPower = maxPower;
			this.power = 0;
		}

	public double getPower()
		{
			return power;
		}

	public void setPower(double d)
		{
			this.power = d;
		}

	public double getMaxPower()
		{
			return maxPower;
		}

	public void setMaxPower(int maxPower)
		{
			this.maxPower = maxPower;
		}

	@Override
	public String toString()
		{
			return "Propeller [power=" + power + "]";
		}

	public static void printMaxPower(List<Propeller> propellers)
		{
			int num = 1;
			for (Propeller maxPower : propellers)
				{
					System.out.print("Propeller:" + num + " [MAX POWER=" + maxPower.getMaxPower() + "] ");
					num++;
				}
			System.out.println("");

		}

	public static void printSpeed(List<Propeller> propellers)
		{
			int num = 1;
			for (Propeller propeller : propellers)
				{
					System.out.print("Propeller:" + num + "[POWER=" + propeller.getPower() + "] ");
					num++;
				}
			System.out.println("");
		}

}
