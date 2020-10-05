import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

public class FindLocation {

    public static Path findloc(String file) throws IOException
    {
    Iterable<Path> rootdir = FileSystems.getDefault().getRootDirectories();
    // Path path = Paths.get("C:"+File.separator+"Users"+File.separator+"Gokul"+File.separator+"IdeaProjects"+File.separator+"learningjava");
    // Path path = FileSystems.getDefault().getPath("");
    Path Location =null;
        for(Path root:rootdir) {

        Path path = root;
        System.out.println(path.toAbsolutePath());
        Filefinder n = new Filefinder(file);
        Files.walkFileTree(path,n);
        if(n.returningPath()!=null)
        {
            Location = n.returningPath();
            break;
        }
    }
        if(Location==null)
        {
            throw new FileNotFoundException("*******File not found ****** \n *****Please enter correct file name & restart the program****** ");

        }
        return Location;
}}
