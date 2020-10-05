import java.util.List;

public class Printing
        {
            public static void print(List<Student> obj)
           {
                for(Student s:obj)
                {
                    System.out.println(s.getRollNo()+" "+s.getFullName()+" "+s.getEnglishMark()+" "+s.getTamilMark()+" "+s.getMathsMark()+" "+s.getScienceMark()+" "+s.getSocialMark()+" Total - "+s.getTotal()+" Percentage - "+String.format("%.02f",s.getPercentage())+"              Result "+(s.passOrFail()?"PASS":"FAIL"));
                }
           }
          }
