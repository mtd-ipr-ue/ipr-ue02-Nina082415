import libraries.In;
import libraries.Out;

public class ue02_1 {
    public static void main(String[] args) {
 Out.println("please enter number");
        int number1 = In.readInt();

        Out.println("please enter number");
        int number2 = In.readInt();

        Out.println("please enter number");
        int number3 = In.readInt();

        if (number1 >= number2 && number1 >= number3) {
            Out.print ("max");
            Out.print (number1); }

            else if ( number2 >= number1 && number2 >= number3) { 
                Out.print ("max:");
                Out.print (number2);
            }

                else 
                Out.print ("max:");
                Out.print (number3);
        }
    
  }

