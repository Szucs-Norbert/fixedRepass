import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int success=0;
        
        aboutShow();
        bekeres();
       
        
       
        

    public static bekeres(){
        Scanner scan = new Scanner(System.in);        

        System.out.print("Felhasználónév: ");    
        String user = scan.nextLine();
        System.out.print("Jelszó: ");
        String password = scan.nextLine();
        System.out.print("Hely: ");
        String place = scan.nextLine();
        scan.close();

        return 

    }

    public static void ellenorzes(){
        try {
            
            Profile profile = new Profile(user , password, place);
            FileWriter writeFile = new FileWriter("password.txt");
            PrintWriter writePrint = new PrintWriter(writeFile);
            writePrint.print(profile.user);
            if(!profile.isPassEmpty()) { writePrint.print(profile.getPass()); }
            writePrint.print(profile.place);
            writePrint.close();
            success = 1;

        } catch (IOException exception) {
            System.err.println("Hiba! A fájlbaírás sikertelen. Keresse meg a fejlesztőt.");
        }

        if(success == 1) {
             System.out.println("Ok. A kiírás sikeres.");  }
        else {  System.out.println("Hiba! A kiírás sikertelen"); }
   
    }

    public static void aboutShow() {
        System.out.println("Nagy János");
        System.out.println("Jelszavak");     
        System.out.println("Verzió: 0.0.1");
    }
    
}
