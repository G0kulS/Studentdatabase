import java.util.Comparator;

public class EnglishSort implements Comparator<Student> {
    @Override
    public int compare(Student Student1, Student Student2) {
        if(Student1.getEnglishMark()>=Student2.getEnglishMark())
        {
            if(Student1.getEnglishMark()==Student2.getEnglishMark())
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
