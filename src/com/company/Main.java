package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        System.out.println(generateRandomAge() + " " + Принц_в_белом_коне(generateRandomAge(),10));
        System.out.println(Принц_в_белом_коне(25,25));
        System.out.println(Принц_в_белом_коне(46,-9));
        System.out.println(Принц_в_белом_коне(-65,73));
        System.out.println(Принц_в_белом_коне(77,18));
    }
    public static String Принц_в_белом_коне(int age,int temp ) {
        String result = "Можно итди гулять";
        String result2 = "Оставайтесь дома";
        if (age > 20 && age >= 45 && temp >= -20 && temp <= 30) {
            return result;
        } else if (age < 20 && temp > 0 && temp >= 28) {
            return result;
        } else if (age < 45 && temp > -10 && temp >= 25) {
            return result;
        } else
            return result2;
    }
    public static int generateRandomAge(){
        Random random = new Random();
        int фцык = random.nextInt(99);
        return фцык;
    }
}
