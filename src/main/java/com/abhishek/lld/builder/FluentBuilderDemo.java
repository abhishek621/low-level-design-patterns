package com.abhishek.lld.builder;

public class FluentBuilderDemo {

	public static void main(String[] args) {

		Home home = new Home.Builder().setFoundation("Concrete, brick, and stone foundation")
				.setStructure("Concrete structure with rebar reinforcement").setRoof("Concrete slab roof")
				.setInterior("Drywall and paint interior").build();

		System.out.println(home);
	}
}