package com.thehit.domain;

import com.thehit.interfaces.Songwriter;
import com.thehit.domain.Song;

public class SongwriterImpl implements Songwriter{
	
	private String firstName;
	private String lastName;
	private String age;
	private Song song;
	
	@Override
	public void compose(Song song) {
		System.out.println("Composer " + firstName + 
				" composed a song called " +song.getName() +
				". This song has the following lyrics "+ song.getLyrics());    
	}
	
	public SongwriterImpl() {
		System.out.println("We are here in the blank constructor");
	}

	public SongwriterImpl(String firstName, String lastName, 
			String age, Song song) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.song= song;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public Song getSong() {
		return song;
	}

	public void setSong(Song song) {
		this.song = song;
	}
	
	

}
