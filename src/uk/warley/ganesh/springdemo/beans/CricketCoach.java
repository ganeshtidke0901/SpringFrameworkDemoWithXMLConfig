package uk.warley.ganesh.springdemo.beans;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	private String team;

	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "This is cricket Dailyworkout";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortuneService();
	}

	public String getTeam() {
		return "My CricketCoach team name:" + team;
	}

	public void setTeam(String team) {
		this.team = team;
	}
}
