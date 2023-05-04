package exam_interface;

public class BookCDMS {

	public static void main(String[] args) {
		//(int requestNo,String bookTitle,String writer){
		//AppCDInfo(int registerNo,String title,boolean state){
		Lendable[] lendable = {
				new SeparateVolume("엄마를 부탁해","신경숙"),
				new AppCDInfo("Redhat Fedora"),
				new SeparateVolume("엄마를 부탁해2","신경숙2")
		};
		
		lendable[0].checkOut("홍길동", "20210801");
		System.out.println("대출가능여부 "+ ((SeparateVolume)lendable[0]).isState());
		lendable[0].checkIn();
		/*
		lendable[1].checkOut("김난이", "20230504");
		lendable[1].checkIn();
		lendable[1].checkIn();
		*/
		
		lendable[2].checkOut("김난이", "20230504");
		System.out.println("대출가능여부 "+ ((SeparateVolume)lendable[2]).isState());
		lendable[2].checkIn();
		/*
		
		String[] songTitle = {"고백", "청춘", "내 사람"};
		MusicCDInfo musicCd = new MusicCDInfo("동행","김동률",songTitle); 
		musicCd.printInfo();
		
		MusicCDInfo musicCd1 = new MusicCDInfo("crazy","GD",new String[] {"삐닥하게","cryoung"}); 
		musicCd1.printInfo();
		*/

	}

}
