/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author OHMASTER
 */
public class Ejemplo1 {
	private String name;
	private double weight;
	private String colour;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public void printToConsole() {
		System.out.print(" name: " + getName());
		System.out.print(" colour: " + this.colour);
		System.out.println(" weight: " + this.weight);
	}
}

 
