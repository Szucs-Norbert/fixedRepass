import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        nameCard();
        //Fejrész kiírása
        System.out.println("Jelszavak");
        //Verzió kiírása
        System.out.println("Verzió: 0.0.1");
        
        //Az a objektummal kérhetünk be a konzolról
        Scanner scan = new Scanner(System.in);        

        System.out.print("Felhasználónév: ");
        // A b változó tárolja a jelszót
        String name = scan.nextLine();
        System.out.print("Jelszó: ");
        String password = scan.nextLine();
        System.out.print("Hely: ");
        String place = scan.nextLine();
        scan.close();
        int success = 0;
        try {
            /* 
            A jelszó, a felhasználónév és a 
            használati helye a passList 
            objektumban van tárolva            
            */
            Store passList = new Store(name , password, place);
            FileWriter writeFile = new FileWriter("password.txt");
            PrintWriter writePrint = new PrintWriter(writeFile);
            writePrint.print(passList.user);
            if(!passList.hollow()) { writePrint.print(passList.retrieval()); }
            writePrint.print(passList.place);
            writePrint.close();
            success = 1;
        } catch (IOException exception) {
            System.err.println("Hiba! A fájlbaírás sikertelen. Keresse meg a fejlesztőt.");
        }

        if(success == 1) { System.out.println("Ok. A kiírás sikeres.");  }else {  System.out.println("Hiba! A kiírás sikertelen"); }

    }

    public static void nameCard() {
        System.out.println("Nagy János");
    }
}
