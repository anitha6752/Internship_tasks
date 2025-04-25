import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class fileHandling {

       public static void main(String[] args) {

              // Code to create a new file
               File myFile = new File("fileHandling.txt");
              try {
                    myFile.createNewFile(); 
              } catch (IOException e) {
                     System.out.println("Unable to Create this file");
                     e.printStackTrace();
              } 

              // Code to write to a file

              try {
                     FileWriter myFileWriter = new FileWriter("fileHandling.txt");
                     myFileWriter.write("This is my new file in fileHandling project\nnow i am wring into this File\n");
                     myFileWriter.close();
                     
              } catch (IOException e) {
                     e.printStackTrace();
              }

             //Code to Reading a file
             
             File myfile = new File("fileHandling.txt");
             try {
                  Scanner sc  = new Scanner(myfile);
                  while(sc.hasNextLine()){
                     String line = sc.nextLine();
                     System.out.println(line);
                  }
                  sc.close();
             } catch (FileNotFoundException e) {
                    e.printStackTrace();
             }

             // Code to Append data into file
               String data = "This Data is Appended or Modified..";
             try {
              FileWriter output = new FileWriter("fileHandling.txt" , true);
              output.write(data);
              System.out.println("Data appended successfully.");
              output.close();
             } catch (IOException ex) {
               System.err.println("File append error.");
             }

             
             
       }
}