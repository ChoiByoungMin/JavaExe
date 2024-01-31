package ch08.class09;
//노래를 나타내는 Song이라는 클래스를 설계하세요.
//<필드>
// 노래제목 title
// 가수    artist
// 앨범제목 album
// 작곡가  composer
// 노래가 발표된 연도 year
// 노래가 속한 앨범에서의 트랙 번호를 나타내는 track
//
//<메서드>
// 노래의 정보를 저장하는 setSongInfo(...) : 관련된 매개변수를 인자로 넘겨줌
// 노래의 정보를 나타내는 show()
//
//<main 실행>
// ABBA의 "Dancing Queen"노래를 Song객체로 생성하고
// Show()로 출력하세요
public class Resolve3 {
	
	private String title,artist,album,composer, year, track;
	
	public Resolve3 (String title,String artist, String album,
			String composer,String year, String track) {
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.composer = composer;
		this.year = year;
		this.track = track;
	}
	// 노래의 정보를 저장하는 setSongInfo(...) : 관련된 매개변수를 인자로 넘겨줌
	public void setSongInfo (String title,String artist, String album,
			String composer,String year, String track) {
		
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.composer = composer;
		this.year = year;
		this.track = track;
		
	}
	
	public void show() {
		System.out.println("노래 정보를 열람합니다");
		System.out.println("노래 : " + title);
		System.out.println("가수 : " + artist);
		System.out.println("앨범 제목 : " + album);
		System.out.println("작곡가 : "+ composer);
		System.out.println("노래가 발표된 연도 : "+year);
		System.out.println("노래가 속한 앨범에서의 트랙 번호 : "+ track);
		
	}
	public static void main(String[] args) {
		
		Resolve3 song = new Resolve3("Dancing Queen"
				,"ABBA","arrival","벤뉘 안데르손, 비에른 울바에우스"
				,"1976년 8월 15일 ","2번");
		
		song.show();
		
	}

}
