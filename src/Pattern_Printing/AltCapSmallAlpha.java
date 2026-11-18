package Pattern_Printing;

public class AltCapSmallAlpha {
    public static void main(String args[]){
        for (int i = 1; i <= 4; i++) {
            char ch = (char) ('a' + i - 1);

            if (i % 2 == 0) {
                ch = Character.toUpperCase(ch);
            }

            for (int j = 1; j <= 4; j++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
}
