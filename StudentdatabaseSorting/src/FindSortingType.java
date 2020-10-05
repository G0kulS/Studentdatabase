
public class FindSortingType {
    public static String findsortingtype(int num)
    {
        switch (num)
        {

            case 1 :
            {
                return "Sorted by English Marks";

            }
            case 2 :
            {

                return "Sorted by Tamil Marks";
            }
            case 3 :
            {

                return "Sorted by Maths Marks";
            }
            case 4 :
            {

                return "Sorted by Science Marks";
            }
            case 5 :
            {

                return "Sorted by Social Marks";
            }
            default:
            {
                return "Sorted by Total Marks";
            }
        }
    }
}
