package exam_file;

import java.io.Serializable;

public class Food implements Serializable{
	private String name;
	private int kcal;


	public Food(){};


	public Food(String name,int kcal){
		this.name = name;
		this.kcal = kcal;
	}


	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return this.name;
	}



	public void setKcal(int kcal){
		this.kcal = kcal;
	}



	public int getKcal(){
		return this.kcal;
	}



	@Override

	public String toString(){
		return "이름: "+name +" kcal: "+kcal;
	}

}
