import libraries.In;
import libraries.Out;

public class ue02_2 {
    public static void main(String[] args) {
        Out.println("Year");
        int year = In.readInt();

        Out.println("Month");
        int month = In.readInt(); 

        Out.print.ln("days");
        int days = In.readInt();
        
        switch (month) {
            case 1: //Jänner
            case 3: //März 
            case 5: //Mai 
            case 7: //Juli 
            case 8: //August
            case 10: //Oktober
            case 12: //Dezember 
                Out.print(31);
                break;
            case 4: //April 
            case 6: //Juni 
            case 9: //September 
            case 11: //Novmber 
                Out.print (30); 
                break; 
        }
    }
}

            
            
        
        

    