import java.util.Comparator;

public class TotalSort implements Comparator<Student> {
    @Override
    public int compare(Student Student1, Student Student2) {
        if(Student1.getTotal()>=Student2.getTotal())
        {
            if(Student1.getTotal()==Student2.getTotal())
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
