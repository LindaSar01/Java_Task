public class Movie extends HighestRatings{
    
    private String title;
    private double rating;

    public Movie(String t, double r)
    {
        title = t;
        rating = r;
    }

    public Movie() {
    }

    public String getTitle()
    {
        return title;
    }

    public double getRating()
    {
        return rating;
    }

    public void setTitle(String t)
    {
        title = t;
    }

    public void setRating(double r)
    {
        rating = r;
    }
    
}
