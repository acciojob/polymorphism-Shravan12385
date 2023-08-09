package com.driver;

public class Main {
    public static void main(String args[])
    {
        //task 2
        Product p = new Product();
        int a = p.product(5,10);

        int b = p.product(2,4,5);

        double c = p.product(2.0,3.0);

        System.out.println(a+" "+b+" "+c);

    }
    //task 1
    static  class   Product
    {
        //task3

        public  int product(int x, int y)
        {
            return x*y;
        }
        //task 4
        public  int product(int x, int y, int z)
        {
            return x*y*z;
        }
        //task 5
        public double product(double x, double y)
        {
            return x*y;
        }
    }

}