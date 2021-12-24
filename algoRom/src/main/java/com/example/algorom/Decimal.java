package com.example.algorom;

public class Decimal
{
    public static int convertToDecimal (String str){
        str = str.toUpperCase();
        int decimalNum= 0;
        int l=  str.length();
        int num=0;
        int previousnum = 0;
        for (int i=l-1;i>=0;i--)
        {
            char x =  str.charAt(i);
            x = Character.toUpperCase(x);
            switch(x)
            {
                case 'I':
                    previousnum = num;
                    num = 1;
                    break;
                case 'V':
                    previousnum = num;
                    num = 5;
                    break;
                case 'X':
                    previousnum = num;
                    num = 10;
                    break;
                case 'L':
                    previousnum = num;
                    num = 50;
                    break;
                case 'C':
                    previousnum = num;
                    num = 100;
                    break;
                case 'D':
                    previousnum = num;
                    num = 500;
                    break;
                case 'M':
                    previousnum = num;
                    num = 1000;
                    break;
            }
            if (num<previousnum)
            {decimalNum= decimalNum-num;}
            else
                decimalNum= decimalNum+num;
        }
        return decimalNum;
    }

}

