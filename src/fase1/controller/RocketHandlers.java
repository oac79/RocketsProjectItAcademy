package fase1.controller;

import java.util.List;

public class RocketHandlers {

	public RocketHandlers()
		{
			super();
		}

	// Method fase1
	public boolean checkCode(String code)
		{
			return (code.length() == 8);
		}

	// Method fase2
	public int maxPropeller(List<Integer> propellers)
		{
			int i;
			int max = propellers.get(0);
			for (i = 0; i < propellers.size(); i++)
				{
					if (max < propellers.get(i))
						{
							max = propellers.get(i);
						}
				}
			return max;
		}

}
