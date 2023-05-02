package exam_class_relation;

public class AlarmClock {
	private Time currentTime;
	private Time alarmTime;
	
	AlarmClock(){
		alarmTime = new Time(5,30,0);
		currentTime = new Time(15,0,0);
	};
	
	AlarmClock(Time a, Time c){
		alarmTime = a;
		currentTime = c;
		
	};
	
	public String toString() {
		return "AlarmClock [ alarm: "+ alarmTime.toString()+", current: "+currentTime.toString()+"]";
	}

}
