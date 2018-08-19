
public class Date
{
	private int year=0;
	private String month="0";
	private int day=0;
	
	public Date(int month, int day, int year)
	{
		this.year = year;
		this.month = Integer.toString(month);
		this.day = day;
	}
	
	public Date(String month, int day, int year)
	{
		/*
		switch(month)
		{
			case "Januar": this.month = 1;
				break;
			case "Februar": this.month = 2;
				break;
			case "März": this.month = 3;
				break;
			case "April": this.month = 4;
				break;
			case "Mai": this.month = 5;
				break;
			case "Juni": this.month = 6;
				break;
			case "Juli": this.month = 7;
				break;
			case "August": this.month = 8;
				break;
			case "September": this.month = 9;
				break;
			case "Oktober": this.month = 10;
				break;
			case "November": this.month = 11;
				break;
			case "Dezember": this.month = 12;
				break;
		}
		*/
		this.month = month;
		this.day = day;
		this.year = year;
	}
	
	public Date(int month, int year)
	{
		this.month = Integer.toString(month);
		this.year = year;
	}
	
	public int getDay()
	{
		return day;
	}
	
	public String getMonth()
	{
		return month;
	}
	
	public int getYear()
	{
		return year;
	}
	public String toString()
	{
		return ((getDay()==0) ? "" : (getDay()) + ".") 
				+ ((getMonth()=="0") ? "" : getMonth())+ "." 
					+ ((getYear()==0) ? "" : getYear()) ;
	}
	
}
