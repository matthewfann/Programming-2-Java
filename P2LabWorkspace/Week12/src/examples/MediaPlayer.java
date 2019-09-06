package examples;

import java.util.HashSet;

public class MediaPlayer {

	private HashSet<Song> songs;
	
	
	public MediaPlayer(){
		this.songs = new HashSet<Song>();
	}
	
	public void add(Song song){
		songs.add(song);
	}
	
	public void printSongs(){
		for(Song s : songs)
			System.out.println(s);
	}

	
	public static void main(String[] args) {
		MediaPlayer mp = new MediaPlayer();
		mp.add(new Song("Sorry","Justin Bieber"));
		mp.add(new Song("7 Years","Lukas Graham"));
		mp.add(new Song("Faded","Alan Walker"));
		mp.add(new Song("Sorry","Justin Bieber"));
		mp.printSongs();
	}

}
