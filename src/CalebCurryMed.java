import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CalebCurryMed {

    public static void main(String[] args) throws FileNotFoundException {

       /*Scanner input = new Scanner(System.in);
        System.out.println("Enter name");
        String s = input.nextLine();

      if (s.equals("CALEB")){
          System.out.println("Hey Caleb");
      }else if (s.equals("Sally")){
          System.out.println("Hello Sally");
      }else{
          System.out.println(input + ", you are not welcome here");
      }*/


       Scanner input = new Scanner(new File("students.txt"));// collections from file directly
       /* System.out.println("Give us a size:");

       int size = input.nextInt();
        System.out.println("Enter : " + size + " numbers. Press enter after each");

       int [] grades = new int[size];
     for (int i = 0; i < size;i++){
         grades[i] = input.nextInt();

     }*/

       List<String> students = new ArrayList<String>();

       while (input.hasNextLine()){
           students.add(input.nextLine());
           System.out.println(input.nextLine());
       }

       for (int i = 0; i < students.size();i++){
           System.out.println("name: " + students.get(i));
       }

        input.close();

    /* for (int i = 0; i < size;i++){
         System.out.println(grades[i]);
     }*/



    }
}
