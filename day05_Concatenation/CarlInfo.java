package day05_Concatenation;

public class CarlInfo {
    public static void main(String[] args) {

        int year = 2022;
        String make = "Jaguar",
                model = "F-Type",
                miles = "5000 miles",
                color = "red",
                price = "$19000";

        System.out.println(year + " " + make +" " + model + ", " + miles + ", " + color + ", " + price + ".");
    }
}

/*
. Create a class called CarInfo.java
2. Declare the following variables:
1.year
2.make
3.model
4.miles
5.color
6.price
3. Use concatenation to print the full info of the car in
the following format:
Year  Make  Model,  Miles,  Color,  Price.
Example:
2018 Toyota Camry, 50000 miles, Red, $19000.
 */