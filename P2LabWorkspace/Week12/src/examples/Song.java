package examples;

public class Song {

	private String title;
	private String artist;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}

	public Song(String title,String artist){
		this.setTitle(title);
		this.setArtist(artist);
	}

	public String toString(){
		return ("Title: "+this.getTitle()+" artist: "+this.getArtist());
	}




	@Override
	public int hashCode(){
		return title.hashCode()+artist.hashCode();
	}


	@Override
	public boolean equals(Object y){
		if(!(y instanceof Song))
			return false;

		Song x = (Song) y;
		return((this.artist.contentEquals(x.getArtist()))&&(this.title.contentEquals(x.getTitle())));
	}
}
