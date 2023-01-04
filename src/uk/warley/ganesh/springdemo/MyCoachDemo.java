package uk.warley.ganesh.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import uk.warley.ganesh.springdemo.beans.Coach;
import uk.warley.ganesh.springdemo.beans.CricketCoach;
import uk.warley.ganesh.springdemo.beans.FootballCoach;

public class MyCoachDemo {
	public static void main(String[] args) {

		// load spring configuration file

		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		// retrieve bean from spring container

		Coach coach = applicationContext.getBean("myCricketCoach", Coach.class);

		// call methods on the bean
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getDailyFortune());

		CricketCoach myCricketCoach = applicationContext.getBean("myCricketCoach", CricketCoach.class);

		System.out.println(myCricketCoach.getTeam());

		applicationContext.close();
	}
}
