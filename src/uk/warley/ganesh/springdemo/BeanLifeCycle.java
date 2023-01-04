package uk.warley.ganesh.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import uk.warley.ganesh.springdemo.beans.Coach;

public class BeanLifeCycle {
	public static void main(String[] args) {

		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("BeanLifeCycleDemo.xml");

		Coach coach3 = applicationContext.getBean("myCoach", Coach.class);
		System.out.println(coach3.getDailyWorkout());
		applicationContext.close();

//		Dec 22, 2022 6:19:50 PM org.springframework.beans.factory.support.DefaultSingletonBeanRegistry getSingleton
//		FINE: Creating shared instance of singleton bean 'myHappyFortuneService'
//		Dec 22, 2022 6:19:50 PM org.springframework.beans.factory.support.DefaultSingletonBeanRegistry getSingleton
//		FINE: Creating shared instance of singleton bean 'myCoach'
//		here i can do any intialization,open connection to db etc
//		This is football coach
//		Dec 22, 2022 6:19:50 PM org.springframework.context.support.AbstractApplicationContext doClose
//		FINE: Closing org.springframework.context.support.ClassPathXmlApplicationContext@3e6fa38a, started on Thu Dec 22 18:19:49 GMT 2022
//		here i clean any objects or close db connections etc
	
	
	//Note: For "prototype" scoped beans, Spring does not call the destroy method.
	}
}
