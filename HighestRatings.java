import java.util.ArrayList;
public abstract class HighestRatings {

    public abstract double getRating();
    public abstract String getTitle();
    
    public static double maxRating(ArrayList<HighestRatings> a)
    {
        double max = -1;
        for(int i = 0; i < a.size(); i++)
        {
            if(a.get(i) instanceof Movie)
            {
                if(a.get(i).getRating() > max)
                    max = a.get(i).getRating();

            }
        }
        return max;
    }

    public static void printMaxRating(ArrayList<HighestRatings> a)
    {
        System.out.println("The movie(s) with the highest rating(s)" + ":");
        int j = 1;
        double mr = maxRating(a);
        for(int i = 0; i < a.size(); i++)
        {
            if(a.get(i) instanceof Movie)
            {
                if(a.get(i).getRating() == mr)
                    System.out.println(j++ + " " + a.get(i).getTitle());
            }
        }
    }
    
    public static void main(String[] args){
        ArrayList<HighestRatings> list = new ArrayList<>();

        list.add(new Movie("The Shawshank Redemption", 9));
        list.add(new Cartoon("Tom and Jerry", 10));
        list.add(new Movie("Alien", 8));
        list.add(new Cartoon("SpongeBob SquarePants", 5));
        list.add(new Movie("Inception", 9));
        list.add(new Cartoon("The Simpsons", 6));
        list.add(new Cartoon("Gravity Falls", 10));
        list.add(new Movie("The Matrix", 9));
        list.add(new Cartoon("DuckTales", 4));
        list.add(new Cartoon("Rick and Morty", 10));
        list.add(new Movie("Interstellar", 9));

        printMaxRating(list);
    }
    
}
