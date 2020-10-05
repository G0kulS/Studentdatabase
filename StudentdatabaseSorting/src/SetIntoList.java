import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class SetIntoList <T extends Set<Student>>
{
   public  List<Student> convert(T students)
   {
       List<Student> result = new ArrayList<>(students);
       return result ;
   }
}

