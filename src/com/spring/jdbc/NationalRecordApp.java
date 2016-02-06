package com.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class NationalRecordApp {

	public static void main(String... args ){
		ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		NationalRecordDAOIfc nationalDao=(NationalRecordDAOIfc)context.getBean("nationalDAO");
		PassportDetailsDAOIfc passportDao=(PassportDetailsDAOIfc)context.getBean("passportDAO");
		
		Passport passport=new Passport();
		passport.setRecordID(10001);
		passport.setPassID(98546365);
		passport.setCountry("Australia");
		
		National national=new National();
		national.setRecordID(10001);
		national.setName("Steve");
		national.setPassportDetails(passport);
	
		/*if(passportDao.setPassportDetails(passport)==1)
			if(nationalDao.setNationalDetails(national)==1)
				System.out.println("National Record has been saved");*/
		
		Passport passport1=passportDao.passportDetails(98546365);
		National national1=nationalDao.nationalDetails(98546365);
		System.out.println(national1.getName()+"   "+passport1.getPassID()+"  "+passport1.getCountry());
	}
}