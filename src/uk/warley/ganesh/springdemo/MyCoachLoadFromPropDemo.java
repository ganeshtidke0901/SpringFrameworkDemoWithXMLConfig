package uk.warley.ganesh.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import uk.warley.ganesh.springdemo.beans.Coach;
import uk.warley.ganesh.springdemo.beans.CricketCoach;
import uk.warley.ganesh.springdemo.beans.FootballCoach;

public class MyCoachLoadFromPropDemo {
	public static void main(String[] args) {

		// load spring configuration file

		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		// retrieve bean from spring container

		CricketCoach coach = applicationContext.getBean("myCricketCoach2", CricketCoach.class);

		System.out.println(coach.getTeam());

		applicationContext.close();
	}
}
