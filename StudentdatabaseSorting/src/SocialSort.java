import java.util.Comparator;

public class SocialSort implements Comparator<Student> {
    @Override
    public int compare(Student Student1, Student Student2) {
        if(Student1.getSocialMark()>=Student2.getSocialMark())
        {
            if(Student1.getSocialMark()==Student2.getSocialMark())
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
