package app.controller;

import java.util.List;

import app.model.Propeller;

public class RocketHandlers {

	public RocketHandlers()
		{
			super();
		}

	// Method fase2
	public double maxPropeller(List<Propeller> propellers)
		{
			int i;
			double max = propellers.get(0).getPower();
			for (i = 1; i < propellers.size(); i++)
				{
					if (max < propellers.get(i).getPower())
						{
							max = propellers.get(i).getPower();
						}
				}
			return max;
		}

	// Method fase3
	public double averageSpeed(List<Propeller> propellersList)
		{
			int i;
			double speed = propellersList.get(0).getPower();
			double propellers = propellersList.size();
			for (i = 1; i < propellersList.size(); i++)
				{
					speed += propellersList.get(i).getPower();
				}
			return speed / propellers;
		}

	// Method fase3
	public double speedUp(List<Propeller> propellersList)
		{
			int i;
			double power = 0;
			for (i = 0; i < propellersList.size(); i++)
				{
					power = propellersList.get(i).getPower();
					if (power < propellersList.get(i).getMaxPower())
						{
							propellersList.get(i).setPower(power + 10);
						}
				}
			return power;
		}

	// Method fase3
	public void brake(List<Propeller> propellersList)
		{
			int j;
			double power;

			for (j = 0; j < propellersList.size(); j++)
				{
					power = propellersList.get(j).getPower();
					if (power >= 10)
						{
							propellersList.get(j).setPower(power - 10);
						}
				}
		}

	// Method fase3
	private double getAllMaxPower(List<Propeller> maxPowerList)
		{
			int i;
			double powerMax = 0;
			for (i = 0; i < maxPowerList.size(); i++)
				{
					powerMax += maxPowerList.get(i).getMaxPower();
				}
			return powerMax;
		}

	// Method fase3
	private double getAllPower(List<Propeller> powerList)
		{
			int j;
			double power = 0;
			for (j = 0; j < powerList.size(); j++)
				{
					power += powerList.get(j).getPower();
				}
			return power;
		}

	public void addSpeed(int num, List<Propeller> propellers)
		{
			for (int i = 0; i < num; i++)
				{
					speedUp(propellers);
				}
		}

	public void lowerSpeed(int num, List<Propeller> propellers)
		{
			for (int i = 0; i < num; i++)
				{
					brake(propellers);
				}
		}

	// Method fase3
	public double rocketSpeed(List<Propeller> propellers)
		{
			double speed;
			double power;
			double maxPower;
			power = getAllPower(propellers);
			maxPower = getAllMaxPower(propellers);
			speed = power + 100 * Math.sqrt(maxPower);
			return speed;

		}
}