package Pattern_Printing;


public class AlphabetPattern {
    public static void main(String args[]){

        for(int i = 1; i<=4; i++ ){     // logic for Column
            for(char ch='A'; ch<='D'; ch++){   // logic for rows
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}
