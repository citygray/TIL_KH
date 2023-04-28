package exam_class;
/*
 * 노래를 나타내는 Song이라는 클래스를 생성하고자 한다. Song클래스는 다음과 같은 필드를 갖는다.
 * - 제목 titile
 * - 가수 artist
 * - 노래가 속한 앨범 제목을 나타내는 album
 * - 노래의 작곡자를 나타내는 composer, 작곡자는 여러명 있을 수 있다.
 * - 발매연도 year
 * - 노래가 속한 앨범에 트랙 번호 track
 * 
 * 생성자는 기본 생성자와 모든 필드를 초기화하는 생성자를 작성하고,
 * 노래의 정보를 화면에 출력하는  show()메서드도 작성하라. 각자 원하는 노래로 song객체를 생성하고
 * show()를 이용하여 이 노래의 정보를 출력하는 프로그램을 작성하라.
 */
class Song{
	private String title;
	private String artist;
	private String album;
	private String[] composer;
	private int year;
	private int track;
	
	public Song(){}
	
	public Song(String title,String artist,String album,String[] composer,int year,int track) {
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.composer = composer;
		this.year = year;
		this.track = track;
	}
	public void show() {
		System.out.println("제목: "+this.title);
		System.out.println("가수: "+this.artist);
		System.out.println("앨범: "+this.album);
		System.out.print("작곡가: ");
		for(int i =0; i<composer.length;i++) {
			if(i==composer.length-1) {
				System.out.print(composer[i]+"\n");
			}else {
				System.out.print(composer[i]+",");
			}
		}
		System.out.println("연도: "+this.year);
		System.out.println("트랙: "+this.track);
	}
}
public class SongMain {

	public static void main(String[] args) {
		String[] composer1 = {"GD","테디"};
		String[] composer2 = {"아이유"};
		Song[] songs = {
			 new Song("삐닥하게","GD","모름",composer1,2002,4),
			 new Song("잔소리","아이유","앨범1",composer2,2012,1)
		};
		
		for(Song song:songs) {
			song.show();	
			System.out.println("---------------------------");
		}
		
	}

}
