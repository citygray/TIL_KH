package exam_interface;


/* 자바에서는 객체의 크기를 비교하는데 사용되는 Comparable 인터페이스를 제공해준다
 * 다른 객체보다 크면 1, 같으면 0, 작은면 -1
 * 
 *  public int compareTo(T o);
 * */

@SuppressWarnings("rawtypes")
class Box implements Comparable{

	private double volume;
	
	public Box(double volume) {
		this.volume = volume;
	}
	
	public double getVolume() {
		return volume;
	}
	
	@Override
	public int compareTo(Object obj) { //Object obj = b2 업캐스팅
		Box other = (Box) obj;//(서브클래스명)부모클래스의 참조변수. 다운캐스팅
		if(this.volume < other.volume)
			return -1;
		else if(this.volume> other.volume)
			return 1;
		else
			return 0;
	}
}
