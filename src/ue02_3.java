import java.util.Scanner;

import libraries.Out;

      import java.util.Scanner;

public class ue02_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double r = 4.0;
        double kreisRadiusQuadrat = Math.pow(r, 2);
        
        System.out.print("Geben Sie die x-Koordinate des Punktes ein: ");
        double x = scanner.nextDouble();
        
        System.out.print("Geben Sie die y-Koordinate des Punktes ein: ");
        double y = scanner.nextDouble();
        
        double abstandQuadrat = Math.pow(x, 2) + Math.pow(y, 2);
        
        // Prüfung, ob der Punkt innerhalb oder auf dem Kreis liegt
        if (abstandQuadrat <= kreisRadiusQuadrat) {
            System.out.println("Der Punkt (" + x + ", " + y + ") liegt innerhalb oder auf dem Kreis.");
        } else {
            System.out.println("Der Punkt (" + x + ", " + y + ") liegt außerhalb des Kreises.");
        }
        
        scanner.close();
    }


    }

