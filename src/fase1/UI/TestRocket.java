package fase1.UI;

import java.util.Arrays;
import java.util.List;

import fase1.Rocket;
import fase1.controller.RocketManagement;

public class TestRocket {
	static RocketManagement rocketMan = new RocketManagement();

	public static void main(String[] args) throws Exception
		{
			Rocket rocket1, rocket2;
			String code1, code2;
			List<Integer> propeller1, propeller2;

			code1 = "32WSSDSA";
			propeller1 = Arrays.asList(10, 20, 30);
			rocket1 = new Rocket(code1, propeller1);

			code2 = "LDSFJA32";
			propeller2 = Arrays.asList(20, 40, 80, 160, 320, 640);
			rocket2 = new Rocket(code2, propeller2);

			System.out.println("--1--" + rocket1.toString());
			System.out.println("--2--" + rocket2.toString());
		}

}
