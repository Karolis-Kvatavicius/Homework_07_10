package homework;

//
//ND 07,10
//
//        Tarkime, kad turime Mokinių klasės objektų sąrašą. Parašykite
//        metodus kurie galėtų išsaugoti mokinių sąrašą faile ir nuskaityti
//        mokinius iš failo.
//        ** Pabandykite padaryti, kad informacija būtų išsaugoma
//        tekstiniame pavidale, t.y. ją būtų galima paprastai perskaityti
//        atsidarius failą.


import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;



public class Main {
    public static void main(String[] args) throws IOException {

            List<Student> klase = generateRandomClass( 12 );
            FileWriter writer = new FileWriter("output.txt");

            for (Student s : klase) {
                writer.write(s.getName() + "  " + s.getSurname() + "  " + s.getAge());
                writer.write( "\n" );
                System.out.println(s);
            }
            writer.close();



    }

   private static List<Student> generateRandomClass(int size) {
       List<Student> class8C = new ArrayList<>();
       for(int i = 0; i < size; i++) {
          class8C.add( new Student( generateRandomString(6), generateRandomString(10), randInt( 13, 15 )));
       }
       return class8C;
   }



    private static String generateRandomString(int length) {
        String symbols = "abcdefghijklmnoprstuvwzyqx";
        String generated = "";
        for (int i = 0; i < length; i++) {
          generated += symbols.charAt( randInt( 0, 25 ) );
        }
        return generated;
    }



    private static int randInt(int min, int max) {
        Random rand = new Random( );
        int randomNum = rand.nextInt((max - min) + 1) + min;
        return randomNum;
    }
}
