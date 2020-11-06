package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Laptop {
	
	
	private int Lid;
	private String brand;
	public int getLid() {
		return Lid;
	}
	public void setLid(int lid) {
		Lid = lid;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	@Override
	public String toString() {
		return "Laptop [Lid=" + Lid + ", brand=" + brand + "]";
	}
	public void compile() {
		System.out.println("compiling in compile method of Laptop class");
	}

}
