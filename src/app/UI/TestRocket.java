package app.UI;

import java.util.Arrays;
import java.util.List;

import app.controller.RocketHandlers;
import app.model.Propeller;
import app.model.Rocket;

public class TestRocket {
	static RocketHandlers rocketMan = new RocketHandlers();

	public static void main(String[] args) throws Exception
		{
			List<Propeller> propellers1, propellers2;
			Rocket rocket1, rocket2;
			String code1 = "32WESSDS";
			String code2 = "LDSFJA32";

			Propeller p1, p2, p3, p4, p5, p6;
			p1 = new Propeller(10);
			p2 = new Propeller(20);
			p3 = new Propeller(30);
			p4 = new Propeller(40);
			p5 = new Propeller(50);
			p6 = new Propeller(60);

			propellers1 = Arrays.asList(p1, p2, p3);
			propellers2 = Arrays.asList(p1, p2, p3, p4, p5, p6);

			rocket1 = new Rocket(code1, propellers1);
			System.out.println(rocket1.toString());

		}

}
