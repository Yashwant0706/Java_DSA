package Loops;

public class Continue {
    public static void main(String args[]){

        for(int i = 1; i <= 20; i++){
            System.out.println(i);
            if(i==13) continue;  // i=13 hone par Good Morning print nahi hoga
            System.out.println("Good Morning :)");
        }
    }
}

//
//Continue Statement in Java
//The continue statement is used to skip the current iteration of a loop and move to the next iteration (Condition).
//In simple words, whenever the continue statement executes, the remaining code inside that iteration(condition) is skipped.