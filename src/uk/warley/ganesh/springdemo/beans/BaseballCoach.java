package uk.warley.ganesh.springdemo.beans;

public class BaseballCoach implements Coach {

	private FortuneService fortuneService;

	public BaseballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "This is Baseball coach";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortuneService();
	}
}
