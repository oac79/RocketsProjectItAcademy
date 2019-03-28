package app.controller;

import java.util.ArrayList;
import java.util.List;

import app.model.Propeller;

public class RocketHandlers {

	public RocketHandlers()
		{
			super();
		}

	// Method fase2
	public int maxPropeller(List<Propeller> propellers)
		{
			int i;
			int max = propellers.get(0).getPower();
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
	public int averageSpeed(List<Integer> propellersList)
		{
			int i;
			int speed = propellersList.get(0);
			int propellers = propellersList.size();
			for (i = 1; i < propellersList.size(); i++)
				{
					speed += propellersList.get(i);
				}
			return speed / propellers;
		}

	// Method fase3
	public List<Integer> speedUp(List<Integer> propellersList)
		{
			List<Integer> speedUpTen = new ArrayList<Integer>();
			int i;
			for (i = 0; i < propellersList.size(); i++)
				{
					speedUpTen.add(propellersList.get(i) + 10);
				}
			return speedUpTen;

		}

	// Method fase3
	public List<Integer> brake(List<Integer> propellersList)
		{

			return null;
		}
}