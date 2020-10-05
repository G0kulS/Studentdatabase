import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.text.Format;
import java.util.List;
import java.util.Queue;

public class OutputWritter {

    public static void fileWrite(Path path , List<List<Student>> students, Queue<Integer> sortingType) throws IOException
    {
         try(BufferedWriter writer = Files.newBufferedWriter(path))
         {  for(List<Student> Class :students)
         {
             writer.newLine();
             writer.write("STUDENTS REPORT"+" --- "+FindSortingType.findsortingtype(sortingType.remove()));
             writer.newLine();
             writer.write(returnline());

             for(Student i:Class)
             {
                 writer.newLine();
                 writer.write(OutputWritter.returnString(i));

             }
             writer.newLine();
             writer.write(returnline());}
         }
    }
    private static String returnString(Student G)
    {   String percentage = String.format("%.02f",G.getPercentage());
        String result = Integer.toString(G.getRollNo())+" "+G.getFullName()+" "+Integer.toString(G.getEnglishMark())+" "+Integer.toString(G.getTamilMark())+" "+Integer.toString(G.getMathsMark())+" "+Integer.toString(G.getScienceMark())+" "+Integer.toString(G.getSocialMark())+" "+Integer.toString(G.getTotal())+" "+percentage+" Result : "+(G.passOrFail()?"PASS":"FAIL");
        return  result;
    }
    private static String returnline()
    {
        String line ="---------------------------------------------------------";
        return line;
    }
}
