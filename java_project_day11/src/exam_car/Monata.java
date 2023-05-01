package exam_car;

public class Monata extends Car{
	private String series;
	private String use;
	
	public Monata(){};
	public Monata(String color,int account, String use,String series){
		super(color,account);
		this.use = use;
		this.series = series;
		
	};
	
	public String toString() {
		return super.toString()+ String.format("[용도] %s\t[시리즈] %s",use,series);
	}

}
