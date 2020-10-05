import javax.xml.xpath.XPath;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
      Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the Filename with extension : ");
        String filename = scanner.nextLine();

    InputFromFile n = new InputFromFile();

    Path location = FindLocation.findloc(filename) ;
    List<Student> classA =  n.inputFromFile(location);
    List<List<Student>> Outputdata = new ArrayList<List<Student>>();
    Queue<Integer> recordUserInput = new PriorityQueue<>();
    boolean stillthere = true ;
    while(stillthere)
    {
        print();

        int userinput = -1 ;
      try{
          userinput = scanner.nextInt();
      }
      catch (InputMismatchException e)
      {
          System.out.println();
          System.out.println("Please enter the valid number ");
          continue;
           }
          if (userinput == 0) {
              stillthere = false;
          } else {
              recordUserInput.add(userinput);
              Sorting.sorting(classA, userinput);
              Printing.print(classA);
              Outputdata.add(classA);
          }

    }
        File result = new File("Result.txt");
        Path path = FileSystems.getDefault().getPath("Result.txt");
        OutputWritter.fileWrite(path,Outputdata,recordUserInput);
        System.out.println("You can find the  report in Following location ");
        System.out.println(path.toAbsolutePath());


    }
    public static void print()
    {

        System.out.println();
        System.out.println();
        System.out.println("Please enter your choice from below : ");
        System.out.println("1 - Sort the students with English mark");
        System.out.println("2 - Sort the students with Tamil mark");
        System.out.println("3 - Sort the students with Maths mark");
        System.out.println("4 - Sort the students with Science mark");
        System.out.println("5 - Sort the students with Social mark");
        System.out.println("Anynumber - Sort the students with Total mark");
        System.out.println("0 - for exit");
    }
}
