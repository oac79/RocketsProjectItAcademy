package fase1.UI;

import java.util.Arrays;
import java.util.List;

import fase1.Rocket;
import fase1.controller.RocketHandlers;

public class TestRocket {
	static RocketHandlers rocketMan = new RocketHandlers();

	public static void main(String[] args) throws Exception
		{
			Rocket rocket1, rocket2;
			String code1, code2;
			List<Integer> propeller1, propeller2;

			code1 = "32WSSDSA";
			propeller1 = Arrays.asList(10, 70, 30);
			rocket1 = new Rocket(code1, propeller1);

			code2 = "LDSFJA32";
			propeller2 = Arrays.asList(20, 40, 640, 160, 320, 80);
			rocket2 = new Rocket(code2, propeller2);

			System.out.println("--1--" + rocket1.toString());
			System.out.println("--2--" + rocket2.toString());

			int maxPropeller;
			maxPropeller = rocketMan.maxPropeller(propeller2);
			System.out.println(
					"\nRocket_2 MAXIMUM POWER = " + maxPropeller + " number of propellers " + propeller2.size());
			maxPropeller = rocketMan.maxPropeller(propeller1);
			System.out.println(
					"\nRocket_1 MAXIMUM POWER = " + maxPropeller + " number of propellers " + propeller1.size());
		}

}
