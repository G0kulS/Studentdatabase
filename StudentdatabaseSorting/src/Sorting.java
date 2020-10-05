import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Sorting {
    public static  void sorting (List<Student> students, int number)
    {
        switch(number)
        {
            case 1 :
            {
                Collections.sort(students,new EnglishSort());
                break;
            }
            case 2 :
            {
                Collections.sort(students,new TamilSort());
                break;
            }
            case 3 :
            {
                Collections.sort(students,new MathSort());
                break;
            }
            case 4 :
            {
                Collections.sort(students,new ScienceSort());
                break;
            }
            case 5 :
            {
                Collections.sort(students,new SocialSort());
                break;
            }
            default:
            {
                Collections.sort(students,new TotalSort());
            }
        }
    }
}
