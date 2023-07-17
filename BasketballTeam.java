
public class BasketballTeam extends SportsTeam {

	private int fieldGoals, fieldGoalsAttempted, freeThrows, freeThrowsAttempted;
	
	public BasketballTeam() {
		super();
		setFieldGoals(0);
		setFieldGoalsAttempted(0);
		setFreeThrows(0);
		setFreeThrowsAttempted(0);
	}
	
	public BasketballTeam(String teamName, String teamMascot, String headCoach) {
		super(teamName,teamMascot,headCoach);
		setFieldGoals(0);
		setFieldGoalsAttempted(0);
		setFreeThrows(0);
		setFreeThrowsAttempted(0);
	}
	
	public int getFieldGoals() {
		return fieldGoals;
	}



	public void setFieldGoals(int fieldGoals) {
		this.fieldGoals = fieldGoals;
	}



	public int getFieldGoalsAttempted() {
		return fieldGoalsAttempted;
	}



	public void setFieldGoalsAttempted(int fieldGoalsAttempted) {
		this.fieldGoalsAttempted = fieldGoalsAttempted;
	}



	public int getFreeThrows() {
		return freeThrows;
	}



	public void setFreeThrows(int freeThrows) {
		this.freeThrows = freeThrows;
	}



	public int getFreeThrowsAttempted() {
		return freeThrowsAttempted;
	}



	public void setFreeThrowsAttempted(int freeThrowsAttempted) {
		this.freeThrowsAttempted = freeThrowsAttempted;
	}

	
	public double fieldGoalPercentage() {
		return fieldGoals/fieldGoalsAttempted;
	}
	
	public double freeThrowPercentage() {
		return freeThrows/freeThrowsAttempted;
	}
	


	@Override
	public double[] getStats() {
		double [] stat = {super.getWinPercentage(),fieldGoalPercentage(),freeThrowPercentage()};
		return stat;
	}
	public void setStats(int wins, int losses, int fieldGoals, int fieldGoalsAttempted, int freeThrows, int freeThrowsAttempted) {
		this.wins = wins;
		this.losses = losses;
		this.fieldGoals = fieldGoals;
		this.fieldGoalsAttempted = fieldGoalsAttempted;
		this.freeThrows = freeThrows;
		this.freeThrowsAttempted = freeThrowsAttempted;
	}

}
