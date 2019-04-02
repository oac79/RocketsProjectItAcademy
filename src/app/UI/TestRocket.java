package app.UI;

import java.util.Arrays;
import java.util.List;

import app.controller.RocketHandlers;
import app.model.Propeller;
import app.model.Rocket;

public class TestRocket {
	static RocketHandlers rocketHandlers = new RocketHandlers();

	public static void main(String[] args) throws Exception
		{
			List<Propeller> propellers1, propellers2;
			Rocket rocket1, rocket2;
			String code1 = "32WESSDS";
			String code2 = "LDSFJA32";

			Propeller p1, p2, p3, p4, p5, p6, p7, p8, p9;
			p1 = new Propeller(10);
			p2 = new Propeller(30);
			p3 = new Propeller(80);
			p4 = new Propeller(30);
			p5 = new Propeller(40);
			p6 = new Propeller(50);
			p7 = new Propeller(50);
			p8 = new Propeller(30);
			p9 = new Propeller(80);

			propellers1 = Arrays.asList(p1, p2, p3);
			propellers2 = Arrays.asList(p4, p5, p6, p7, p8, p9);

			rocket1 = new Rocket(code1, propellers1);
			rocket2 = new Rocket(code2, propellers2);

			Propeller.printMaxPower(propellers1);
			Propeller.printMaxPower(propellers2);
			System.out.println("-------------------------------------------------------------------------");
			Propeller.printSpeed(propellers1);
			Propeller.printSpeed(propellers2);

			rocketHandlers.addSpeed(3, propellers1);
			rocketHandlers.addSpeed(3, propellers2);
			System.out.println("-------------------------------------------------------------------------");

			Propeller.printSpeed(propellers1);
			Propeller.printSpeed(propellers2);
			System.out.println("-------------------------------------------------------------------------");

			rocketHandlers.lowerSpeed(5, propellers1);
			rocketHandlers.addSpeed(7, propellers2);
			Propeller.printSpeed(propellers1);
			Propeller.printSpeed(propellers2);
			System.out.println("-------------------------------------------------------------------------");

			rocketHandlers.addSpeed(15, propellers1);
			rocketHandlers.addSpeed(15, propellers2);
			Propeller.printSpeed(propellers1);
			Propeller.printSpeed(propellers2);
			System.out.println("-------------------------------------------------------------------------");

			double sumPower = rocketHandlers.rocketSpeed(propellers1);
			System.out.println("POWER ROCKET-1" + sumPower);
			double sumPower2 = rocketHandlers.rocketSpeed(propellers2);
			System.out.println("POWER ROCKET-2" + sumPower2);

		}

}
