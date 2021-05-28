package com.company;

public class Main {

    public static void main(String[] args) {

        String name = "Josh";
        int ageJosh = 15;
        int temp = 33;


        if (ageJosh >= 20 && ageJosh <= 45 && temp < 30 && temp > -20) {
            System.out.println(name + ", можете идти гулять!");
        } else if (ageJosh < 20 && temp > 0 && temp < 28) {
            System.out.println(name + ", можете идти гулять!");
        } else if (ageJosh > 45 && temp > -10 && temp < 25){
            System.out.println(name + ", можете идти гулять!");
        } else {
            System.out.println(name + ", оставайтесь дома и выпейте кружку чая :)");
        }
    }
}

