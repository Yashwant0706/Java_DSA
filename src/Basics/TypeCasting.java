package Basics;

public class TypeCasting {
    static void main(String args[]) {
        // Type casting- ek data type se doosra data type mein conversion
        char ch = 'A';
        int x = ch;
        System.out.println(x); //implicit typecasting - converting value from one data type to another automatically

        char yashwant = 'a';
        int y = (int)yashwant;
        System.out.println(y); // explicit typecasting - converting value from one data type to another manually

        //integer to character typecasting
        int yash = 97;
        char yy = (char)yash;
        System.out.println(yy);

        //We can also perform arithematic operations on characters and get answer in integers
        char v = 'A'; // asci value of A=65
        int m  = (int)v;
        System.out.println(m*m);
    }
}
