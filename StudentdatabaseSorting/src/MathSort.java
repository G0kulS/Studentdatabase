import java.util.Comparator;

public class MathSort implements Comparator<Student> {

    @Override
    public int compare(Student Student1, Student Student2) {
        if(Student1.getMathsMark()>=Student2.getMathsMark())
        {
            if(Student1.getMathsMark()==Student2.getMathsMark())
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
