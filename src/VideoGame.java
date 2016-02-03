/**
 * Created by KevinBozic on 2/1/16.
 */
public class VideoGame {

    public String title;
    public double rating;
    public boolean simRacer;
    public int copiesSold;
    public boolean replayability;

    public VideoGame(String title, double rating, boolean simRacer, int copiesSold, boolean replayability) {
        setTitle(title);
        setRating(rating);
        setSimRacer(simRacer);
        setCopiesSold(copiesSold);
        setReplayability(replayability);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String newTitle) {
        title = newTitle;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double newRating) {
        if (newRating >= 0 && newRating <= 10) {
            rating = newRating;
        }
    }

    public boolean getSimRacer() {
        return simRacer;
    }

    public void setSimRacer(boolean newSimRacer) {
        simRacer =  newSimRacer;
    }

    public int getCopiesSold() {
            return copiesSold;
    }

    public void setCopiesSold(int newCopiesSold) {
        copiesSold = newCopiesSold;
    }

    public boolean getReplayability() {
        return replayability;
    }

    public void setReplayability(boolean newReplayability) {
        replayability = newReplayability;
    }
}
