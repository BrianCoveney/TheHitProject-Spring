package com.thehit.domain;

import com.thehit.interfaces.Songwriter;
import com.thehit.domain.Song;

public class SongWriterImpl implements Songwriter{
	
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
	
	public SongWriterImpl() {}

	public SongWriterImpl(String firstName, String lastName, 
			String age, Song song) {
		
	}

}
