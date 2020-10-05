import java.util.ArrayList;
import java.util.List;

public class FiletoSkip {
    private  static List<String> DirSkip ;
    static
    {   DirSkip = new ArrayList<>();
        DirSkip.add("$WINDOWS.~BT");
        DirSkip.add("$WinREAgent");
        DirSkip.add("Intel");
        DirSkip.add("MinGW");
        DirSkip.add("OneDriveTemp");
        DirSkip.add("PerfLogs");
        DirSkip.add("Program Files");
        DirSkip.add("Program Files(x86)");
        DirSkip.add("ProgramData");
        DirSkip.add("PerfLogs");
        DirSkip.add("System.sav");
        DirSkip.add("Python38");
        DirSkip.add("Windows");
        DirSkip.add("Doc2");
    }
    public static void adddir(String d)
    {
        DirSkip.add(d);
    }
    public  static  boolean presentInDirList(String file)
    {
        return DirSkip.contains(file);
    }

}
