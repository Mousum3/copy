import java.io.*;
//import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class copy {
    public static void main(String[] args) {

        String inputFileName = args[0], outputFileName = args[1] ;
        System.out.println(inputFileName);
        System.out.println(outputFileName);

        File inputFile;
        Scanner in = null;
        PrintWriter out = null;

        try{
            inputFile = new File(inputFileName);
            in = new Scanner(inputFile);
            out = new PrintWriter(outputFileName);
        }
        catch ( FileNotFoundException e){
            System.out.println(e.getMessage());
        }

        try {
            while (in.hasNextLine()) {              //NullPointerException still there in line 27,29,37
                String value = in.nextLine();       //What is Assertion
                out.printf("%s%n", value);
            }

            in.close();
            out.close();
        }catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }
}