/**
 * Created by KevinBozic on 2/1/16.
 */
public class Music {

    public int trackNumber;
    public String songName;
    public int songLength;
    public String albumName;
    public int rating; // 1-5 stars

    public Music (int trackNumber, String songName, int songLength, String albumName, int rating) {
        setTrackNumber(trackNumber);
        setSongName(songName);
        setSongLength(songLength);
        setAlbumName(albumName);
        setRating(rating);
    }

    public int getTrackNumber() {
        return trackNumber;
    }

    public void setTrackNumber(int newTrackNumber) {
        trackNumber = newTrackNumber;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String newSongName) {
        songName = newSongName;
    }

    public int getSongLength() {
        return songLength;
    }

    public void setSongLength(int newSongLength) {
        songLength = newSongLength;
    }

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String newAlbumName) {
        albumName = newAlbumName;
    }

    public int getRating() {
            return rating;
    }

    public void setRating(int newRating) {
        if (newRating >= 1 && newRating <=5) {
            rating = newRating;
        }
    }

}