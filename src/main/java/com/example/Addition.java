package com.example;

public class Addition {

    int a;
    int b;
    Addition(int aa, int bb)
    {
        a = aa;
        b = bb;
    }
    int add()
    {
       return a+b;
    }
    void addVoid()
    {   System.out.println(" change in master"+a +b);

    }

}
