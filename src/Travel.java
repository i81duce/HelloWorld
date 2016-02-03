/**
 * Created by KevinBozic on 2/1/16.
 */
public class Travel {

    public String cityName;
    public int ranking; // 1-50 states
    public int rating; // 1-5 stars
    public boolean ifUber;
    public boolean ifAirport;

    public Travel(String cityName, int ranking, int rating, boolean ifUber, boolean ifAirport) {
        setCityName(cityName);
        setRanking(ranking);
        setRating(rating);
        setIfUber(ifUber);
        setIfAirport(ifAirport);
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String newCityName) {
        cityName = newCityName;
    }

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int newRanking) {
        ranking = newRanking;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int newRating) {
        if (newRating > 0 && newRating <= 5) {
            rating = newRating;
        }
    }

    public boolean getIfUber() {
        return ifUber;
    }

    public void setIfUber(boolean newIfUber) {
        ifUber = newIfUber;
    }

    public boolean getIfAirport() {
        return ifAirport;
    }

    public void setIfAirport(boolean newIfAirport) {
        ifAirport = newIfAirport;
    }
}
