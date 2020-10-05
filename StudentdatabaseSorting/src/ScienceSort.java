import java.util.Comparator;

public class ScienceSort implements Comparator<Student> {
    @Override
    public int compare(Student Student1, Student Student2) {
        if(Student1.getScienceMark()>=Student2.getScienceMark())
        {
            if(Student1.getScienceMark()==Student2.getScienceMark())
            {
                return 0;
            }
            else
            {
                return 1;
            }
        }
        else
        {
            return -1;
        }

    }
}
