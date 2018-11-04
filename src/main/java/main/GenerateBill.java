package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import factory.GetPlanFactory;
import plans.Plan;

public class GenerateBill {
	public static void main(String args[]) throws IOException {

		GetPlanFactory planFactory = new GetPlanFactory();

		System.out.print("Plan Name: ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String planName = br.readLine();

		System.out.print("Enter the number of units:  ");
		int units = Integer.parseInt(br.readLine());

		Plan plan = planFactory.getPlan(planName);
		plan.calculateBill(units);

	}

}
