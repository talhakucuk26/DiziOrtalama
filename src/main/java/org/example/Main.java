package org.example;

public class Main {
    public static void main(String[] args) {

        int [] list = {1, 2, 3, 4, 5};

        double sum = 0.0;
        for (int i = 0; i < list.length; i++) {
            sum += list[i];
        }
        double har = list.length / (1 + ((1 / 1) + (1 / 2) + (1 / 3) + (1 / 4) + (1 / 5)));
        System.out.println(har);
    }
}