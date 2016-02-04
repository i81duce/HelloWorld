/**
 * Created by KevinBozic on 2/1/16.
 */
public class NBA {

    public int numOfTeams;
    public String teamName;
    public String athleteName;
    public boolean champTitle;
    public int teamRank; // Unsure why my teamRank keeps printing out '0' even though I set a value for it.

    public NBA(int numOfTeams, String teamName, String athleteName, boolean champTitle, int teamRank) {
        setNumOfTeams(numOfTeams);
        setTeamName(teamName);
        setAthleteName(athleteName);
        setChampTitle(champTitle);
        setTeamRank(teamRank);
    }

    public int getNumOfTeams() {
        return numOfTeams;
    }

    public void setNumOfTeams(int newNumOfTeams) {
        numOfTeams = newNumOfTeams;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String newTeamName) {
        teamName = newTeamName;
    }

    public String getAthleteName() {
        return athleteName;
    }

    public void setAthleteName(String newAthleteName) {
        athleteName = newAthleteName;
    }

    public boolean getChampTitle() {
        return champTitle;
    }

    public void setChampTitle(boolean newChampTitle) {
        champTitle = newChampTitle;
    }

    public int getTeamRank() {
        return teamRank;
    }

    public void setTeamRank(int newTeamRank) {
        if (newTeamRank >= 1 && newTeamRank <= 30) {
            teamRank = newTeamRank;
            System.out.println("The " + teamName + " are " + teamRank + " overall.");

        }
    }
}
