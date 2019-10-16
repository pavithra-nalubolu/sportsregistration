package basketballmanager;

import java.util.Date;

public class Match {

    private BasketballClub teamA;
    private BasketballClub teamB;
    private int teamAScore;
    private int teamBScore;
    private Date date;
    
    
    public BasketballClub getTeamA() {
        return teamA;
    }
    
    public BasketballClub getTeamB() {
        return teamB;
    }
    
    public int getTeamAScore(){
        return teamAScore;
    }
    
    public int getTeamBScore(){
        return teamBScore;
    }
    
    public Date getDate() {
        return date;
    }
    
    public void setTeamA(BasketballClub teamA) {
        this.teamA = teamA;
    }
    
    public void setTeamB(BasketballClub teamB) {
        this.teamB = teamB;
    }
    
    public void setTeamAScore(int teamAScore) {
        this.teamAScore = teamAScore;
    }
    
    public void setTeamBScore(int teamBScore) {
        this.teamBScore = teamBScore;
    }
    
    public void setDate(Date date) {
        this.date = date;
    }
}


