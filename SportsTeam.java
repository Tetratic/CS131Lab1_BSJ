
public abstract class SportsTeam {

	protected String teamName, teamMascot, headCoach;
	protected int wins, losses;
	
	public SportsTeam() {
		setTeamName("");
		setTeamMascot("");
		setHeadCoach("");
		setWins(0);
		setLosses(0);
	}

	public SportsTeam(String teamName, String teamMascot, String headCoach) {
		setTeamName(teamName);
		setTeamMascot(teamMascot);
		setHeadCoach(headCoach);
		setWins(0);
		setLosses(0);
	}
	
	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getTeamMascot() {
		return teamMascot;
	}

	public void setTeamMascot(String teamMascot) {
		this.teamMascot = teamMascot;
	}

	public String getHeadCoach() {
		return headCoach;
	}

	public void setHeadCoach(String headCoach) {
		this.headCoach = headCoach;
	}

	public int getWins() {
		return wins;
	}

	public void setWins(int wins) {
		this.wins = wins;
	}

	public int getLosses() {
		return losses;
	}

	public void setLosses(int losses) {
		this.losses = losses;
	}
	
	
	public double getWinPercentage() {
		return (wins/(wins+losses));
	}
	
	public abstract double[] getStats();
}
