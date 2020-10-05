import jdk.dynalink.beans.StaticClass;
import jdk.nashorn.api.tree.Tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.TreeSet;

public class InputFromFile
{


    public List<Student> inputFromFile(Path path) throws IOException
    {
        Path current = path;
        TreeSet<Student> listofStudent = new TreeSet<>();
        try(BufferedReader input = Files.newBufferedReader(current))
        {

            String student ;
            while((student=input.readLine())!=null)
            {
                String[] obj = student.split("-");
                int i =0 ;
                listofStudent.add(new Student(Integer.parseInt(obj[i]),obj[++i],Integer.parseInt(obj[++i]),Integer.parseInt(obj[++i]),Integer.parseInt(obj[++i]),Integer.parseInt(obj[++i]),Integer.parseInt(obj[++i])));
            }
        }
        SetIntoList<TreeSet<Student>> g = new SetIntoList<>();
        List<Student>  Studentlist  = g.convert(listofStudent);
        return Studentlist ;
    }

}
