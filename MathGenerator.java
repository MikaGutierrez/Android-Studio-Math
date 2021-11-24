package com.example.test2;

public class MathGenerator {

    private double result;
    public String getProblem() {
        double a = getRandom(-50, 50);
        double b = getRandom(0, 50);
        char sign = getRandomSign();
        if (sign == '+') {
            result = a + b;
            return a + " + " + b;
        }
        if (sign == '-') {
            result = a - b;
            return a + " - " + b;
        }
        if (sign == '*') {
            result = a * b;
            return a + " * " + b;
        }
        else {
            double result1 = a / b;
            double result2 = Math.pow(10, 2);
            result = Math.ceil(result1 * result2) / result2;
            return a + " / " + b;
        }
    }

    public char getRandomSign() {
        int a = getRandom(5, 1); // 1 2 3 4
        if (a == 1) return '+';
        if (a == 2) return '-';
        if (a == 3) return '*';
        else return '/';
    }

    public String getResult() {
        return String.valueOf(result);
    }

    public String getNoiseResult() {
        return String.valueOf(result + getRandom(-5, 5));
    }

    public int getRandom(int max, int min) {
        int random = 0;
        while (random == 0)
            random = (int) (Math.random() * (max - min) + min);
        return random;
    }
}