package uk.warley.ganesh.springdemo.beans;

public class FootballCoach implements Coach {

	private FortuneService fortuneService;

	public FootballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "This is football coach";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortuneService();
	}

	// init method

	public void initSomething() {
		System.out.println("here i can do any intialization,open connection to db etc");
	}

	// destroy method
	public void shutdownSomething() {
		System.out.println("here i clean any objects or close db connections etc");
	}

}
