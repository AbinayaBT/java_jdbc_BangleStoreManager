package com.bangle.product;



public class Bangle {

    private int id;

    private String name;

    private double price;



    public Bangle(int id, String name, double price) {

        this.id = id;

        this.name = name;

        this.price = price;

    }





    public Bangle() {

		// TODO Auto-generated constructor stub

	}





	public int getId() {

        return id;

    }



    public void setId(int string) {

        this.id = string;

    }



    public String getName() {

        return name;

    }



    public void setName(String name) {

        this.name = name;

    }



    public double getPrice() {

        return price;

    }



    public void setPrice(double price) {

        this.price = price;

    }



    @Override

    public String toString() {

        return "Bangle ID: " + id + ", Color: " + name + ", Price: Rs." + price;

    }





	public void setId1(int nextInt) {

		// TODO Auto-generated method stub

		

	}

}