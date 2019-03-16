
public class Date implements Comparable<Date>  {
	 private int year;
     private int month;
     private int day;
     
   public Date(int year,int month,int day) {
	   this.year=year;
	   this.month=month;
	   this.day=day;   
   }
   public int getyear() {
	return year;
   }
   public void setyear(int newyear) {
	   newyear=year;
   }
   public int getmonth() {
	return month;	   
   }
   public void setmonth(int newmonth) {
	   newmonth=month;
   }
   public int getday() {
	return day;   
   }
   public void setday(int newday) {
	   newday=day;
   }

public int compareTo(Date o) {
	if(year==o.year) {
		if(month==o.month) {
			if(day==o.day) {
				
			}
			return month-o.month;
		}
		return year-o.year;
	}
	return day-o.day;
	
}
public String toString() {
	return year+"/"+month+"/"+day;
	
	
}
}
