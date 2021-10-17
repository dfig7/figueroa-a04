package baseline;


import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import com.google.gson.JsonParser;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Diego Figueroa
 */

public class ProductSearch {
    //Array productList
    ArrayList<Product> mainProductList = new ArrayList<Product>();


    //method Array readData
    public boolean readData() {
        JSONParser parser = new JSONParser();
        try {
            File file = new File("./data/exercise44_input.json");
            FileReader fileReader = new FileReader("./data/exercise44_input.json");
            //reads the JSON file and puts each product in an array;
            JSONObject jsonObject = (JSONObject) parser.parse(fileReader);
            JSONArray productList = (JSONArray) jsonObject.get("products");

            //loop through products list and add product recorded to global productList
            for(Object counter: productList){
                //create product
                Product product = new Product();
                JSONObject newObject = (JSONObject) counter;
                product.name = (String) newObject.get("name");
                product.price = (double) newObject.get("price");
                product.quantity = (long) newObject.get("quantity");


                //calls Product class
                //stores product name, price, and quantity into class
                mainProductList.add(product);
                //return list
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }


    //method Boolean findProduct(
    public boolean findProduct(String productName) {
        //finds product in productList
        for(Product counter: mainProductList){
            if(counter.name.equals(productName)){
                //return true
                //return print for answer
                System.out.printf("Name: "+ counter.name+"%n");
                System.out.printf("Price: "+ counter.price+"%n");
                System.out.printf("Quantity: "+ counter.quantity+ "%n");
                return true;
            }

        }

        //returns false
        return false;
    }

    //method void getProduct
    public void getProduct() {
        readData();
        Scanner input = new Scanner(System.in);
        //asks user for product
        System.out.printf("What is the product name?");
        //product = nextline
        //while(found)
        while(!findProduct(input.nextLine())) {
            //find product in product list
            //if not found
            //print sorry not found and ask again
            System.out.printf("Sorry, that product was not found in our inventory.%n" +
                    "What is the product name?");

        }
    }


}
