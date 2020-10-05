import java.util.Comparator;

public class TamilSort implements Comparator<Student> {
    @Override
    public int compare(Student Student1, Student Student2) {
        if(Student1.getTamilMark()>=Student2.getTamilMark())
        {
            if(Student1.getTamilMark()==Student2.getTamilMark())
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
