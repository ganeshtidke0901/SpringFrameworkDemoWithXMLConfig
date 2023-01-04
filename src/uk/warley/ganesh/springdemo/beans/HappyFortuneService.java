package uk.warley.ganesh.springdemo.beans;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortuneService() {
		return "This is Happy Fortune service";
	}
}
