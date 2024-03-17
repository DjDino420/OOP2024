package lab4_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        readFilePrintItsLineNumbered("labor-04/src/lab4_1/lab4_1_input.txt");
    }

    public static void readFilePrintItsLineNumbered( String fileName ){
        int nr=1;
        try(Scanner scanner=new Scanner(new File(fileName))){
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                System.out.println(nr + " " + line);
                nr++;
            }
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
    }


}


