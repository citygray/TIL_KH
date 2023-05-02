package exam_class;

public class Publisher {
	//출판사는 출판사와 국가명을 필드로 가진다.
	private String publisherName;
	private String nation;
	
	Publisher(){};
	Publisher(String publisherName,String nation){
		this.publisherName = publisherName;
		this.nation = nation;
	}
	public String getPublisherName() {
		return publisherName;
	}
	public void setPublisherName(String publisherName) {
		this.publisherName = publisherName;
	}
	public String getNation() {
		return nation;
	}
	public void setNation(String nation) {
		this.nation = nation;
	}

	
}
