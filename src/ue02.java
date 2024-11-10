import libraries.In;
import libraries.Out;




import java.util.Scanner;

public class ue02 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        
        System.out.print("Bitte geben Sie eine Jahreszahl ein: ");
        int jahr = scanner.nextInt();

        System.out.print("Bitte geben Sie einen Monat (1-12) ein: ");
        int monat = scanner.nextInt();

        // Überprüfung, ob der Monat gültig ist
        if (monat < 1 || monat > 12) {
            System.out.println("Fehler: Der Monat muss zwischen 1 und 12 liegen.");
        } else {
            int tage = 0;

            switch (monat) {
                case 1: // Januar
                case 3: // März
                case 5: // Mai
                case 7: // Juli
                case 8: // August
                case 10: // Oktober
                case 12: // Dezember
                    tage = 31;
                    break;
                case 4: // April
                case 6: // Juni
                case 9: // September
                case 11: // November
                    tage = 30;
                    break;
                case 2: // Februar
                    if (istSchaltjahr(jahr)) {
                        tage = 29;
                    } else {
                        tage = 28;
                    }
                    break;
            }

            System.out.println("Der Monat " + monat + " im Jahr " + jahr + " hat " + tage + " Tage.");
        }

        scanner.close();
    }

    public static boolean istSchaltjahr(int jahr) {
        if (jahr % 4 == 0) {
            if (jahr % 100 == 0) {
                return jahr % 400 == 0;
            } else {
                return true;
            }
        }
        return false;
    }
}
