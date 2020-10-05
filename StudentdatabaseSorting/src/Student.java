public class Student implements Comparable<Student>{
    private int rollNo ;
    private String fullName;
    private int englishMark;
    private int tamilMark;
    private int mathsMark;
    private int scienceMark ;
    private int socialMark ;
    private int total ;
    private float percentage;



    public Student(int rollNo, String fullName, int englishMark, int tamilMark, int mathsMark, int scienceMark, int socialMark) {
        this.rollNo = rollNo;
        this.fullName = fullName;
        this.englishMark = englishMark;
        this.tamilMark = tamilMark;
        this.mathsMark = mathsMark;
        this.scienceMark = scienceMark;
        this.socialMark = socialMark;
        this.total = findTotal(englishMark,tamilMark,mathsMark,scienceMark,socialMark);
        this.percentage =findPercentage(this.total);
    }
    private float findPercentage (int total)
    {   Integer tot = new Integer(total);
        float result = tot.floatValue();
        result=(result/500)*100;
        return result;
    }
    public boolean passOrFail()
    {
        if( this.englishMark >=50 && this.tamilMark>=50 &&this.mathsMark>=50&&this.scienceMark>=50&&this.socialMark>=50)
        {
            return true ;
        }
        else
        {
            return false;
        }
    }


    private int findTotal (int englishMark, int tamilMark, int mathsMark, int scienceMark, int socialMark )
    {
        return englishMark+tamilMark+mathsMark+scienceMark+socialMark;
    }

    public int getRollNo() {
        return rollNo;
    }

    public String getFullName() {
        return fullName;
    }

    public int getEnglishMark() {
        return englishMark;
    }

    public int getTamilMark() {
        return tamilMark;
    }

    public int getMathsMark() {
        return mathsMark;
    }

    public int getScienceMark() {
        return scienceMark;
    }

    public int getSocialMark() {
        return socialMark;
    }

    public int getTotal() {
        return total;
    }

    public float getPercentage() {
        return percentage;
    }
    @Override
    public int hashCode() {
        return ((Integer)(this.getRollNo())).hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if(obj==this)
        { // System.out.println("1");
            return true ;
        }
        if(obj instanceof Student)
        {
            if((((Student)obj).getRollNo()==this.getRollNo())||(((Student)obj).getFullName().equals(this.getFullName())))
            {
               // System.out.println("2");
                return true;
            }
            else
            { //  System.out.println(" 3");
                return false ;
            }
        }
        //System.out.println("4");
        return false;
    }

    @Override
    public int compareTo(Student student) {
        return this.getFullName().compareToIgnoreCase(student.getFullName());
    }
}
