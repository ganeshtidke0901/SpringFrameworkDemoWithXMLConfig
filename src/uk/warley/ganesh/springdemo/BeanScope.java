package uk.warley.ganesh.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import uk.warley.ganesh.springdemo.beans.Coach;

public class BeanScope {
	public static void main(String[] args) {

		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("BeanScopeDemo.xml");

		// Singleton scope(default one)
		Coach coach1 = applicationContext.getBean("myCricketCoach", Coach.class);
		Coach coach2 = applicationContext.getBean("myCricketCoach", Coach.class);

		System.out.println(coach1);
		System.out.println(coach2);
		System.out.println(coach1 == coach2);

		// result
		// uk.warley.ganesh.springdemo.beans.CricketCoach@4a883b15
		// uk.warley.ganesh.springdemo.beans.CricketCoach@4a883b15
		// true
		// Prototype scope- every time creates new object when getBean is called
		Coach coach3 = applicationContext.getBean("myCoach", Coach.class);
		Coach coach4 = applicationContext.getBean("myCoach", Coach.class);

		System.out.println(coach3);
		System.out.println(coach4);
		System.out.println(coach3 == coach4);
		// uk.warley.ganesh.springdemo.beans.FootballCoach@2a7f1f10
		// uk.warley.ganesh.springdemo.beans.FootballCoach@46cdf8bd
		// false

		
		
	}
}
