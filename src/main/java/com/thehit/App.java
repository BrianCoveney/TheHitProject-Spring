package com.thehit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.thehit.domain.SongwriterImpl;
import com.thehit.interfaces.Songwriter;

public class App {

	private static ApplicationContext context;	
	public static void main (String args[]){
		
	context=new ClassPathXmlApplicationContext
                ("configuration.xml");
		
	/** Simple bean blank constructor **/
	Songwriter simpleBeanExample=(Songwriter)context.
              getBean("ourFirstBean");
	
	SongwriterImpl songwriter = (SongwriterImpl)context.getBean("mary");
	 System.out.println("The songwriters firstname is: "+ songwriter.getFirstName() +"\n"+ 
			 ": The songwriters lastname is: "+ songwriter.getLastName() +"\n"+
	         " The songwriters age is: " + songwriter.getAge() +"\n"+ 
	         " The songwriters song name is: " + songwriter.getSong().getName() +"\n"+
	         " The songwriters song lyrics are: "+ songwriter.getSong().getLyrics());
         }
	}