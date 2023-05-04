package exam_interface;

import java.util.Arrays;

public class MusicCDInfo extends CDInfo {
	private String artist;
	private String[] songTitle;
	
		
	MusicCDInfo(String title,String artist,String[] songTitle){
		super(title);
		this.artist = artist;
		this.songTitle = songTitle;
	}

	public void printInfo() {
		System.out.printf("[관리번호: %d] %s %s[ %s ]음반\n\n",getRegisterNo(),artist,getTitle(),Arrays.toString(songTitle));
	}
}
