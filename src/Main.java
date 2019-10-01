import java.io.*;

public class Main
{

    public static void main(String[] args)
    {
        //Program to show the given number is ODD or EVEN
        /*int a;
        // This variable is used to store the type of number | 1->Even 2->Odd 3->Zero
        int isNumberEvenODDZero=0;

        a=11;

        *//*if(a==0)
        {
            System.out.println("The given number is 0");
            return;
        }

        if(a%2==0)
            isEven=true;
        else
            isEven=false;*//*

        *//*if(a==0)
            isZero=true;
        else if(a%2==0)
            isEven=true;
        else
            isEven=false;
*//*

        if(a==0)
            isNumberEvenODDZero=3;
        else
            if(a%2==0)
                isNumberEvenODDZero=1;
            else
                isNumberEvenODDZero=2;


*//*        if (isNumberEvenODDZero==3)
            System.out.println("The given number is 0");
        else if(isNumberEvenODDZero==1)
            System.out.println("The given number is EVEN");
        else
            System.out.println("The given number is ODD");*//*

        switch(isNumberEvenODDZero)
        {
            case 1:
                System.out.println("The given number is EVEN");
                break;
            case 2:
                System.out.println("The given number is ODD");
                break;
            case 3:
                System.out.println("The given number is 0");
                break;
        }*/

        //Create a program to show Even numbers between 1 and 20

        /*int start;
        int end;
        int steps;

        end=20;
        steps=2;

        for(start=0;start<=end;start=start+steps)
        {
            if(start%2==0)
                System.out.println(start);
        }*/

/*        for(int count=0;count<=20;count+=2)
        {
            System.out.println(count);
        }*/

/*
        int count=0;
        while(count<=20)
        {
            System.out.println(count);
            count+=2;
        }
*/

//Program to show if the given number is a prime
//Program to print each digits of a given number
//Program to display only Even digits in a given number
//Program to generate Prime numbers between 1 and 100


int a;

a=0;

/*
while(a!=0)
{
    System.out.println(a%10);
    a/=10; //a=a/10
}
*/

        do
        {
            System.out.println(a%10);
            a/=10; //a=a/10
        }while(a!=0);



    }
}
