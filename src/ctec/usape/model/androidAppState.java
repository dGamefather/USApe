package ctec.usape.model;

import android.app.Application;

public class androidAppState extends Application
{
	private String name;
	private String phrase;
	private String otherThings;
	private String age;
	
	public void onCreate()
	{
		super.onCreate();

		name = "";
		phrase = "";
		otherThings = "";
		age = "";
	}
	
	public String getName()
	{
		return name;
	}
	public String getPhrase()
	{
		return phrase;
	}
	public String getOtherThings()
	{
		return otherThings;
	}
	public String getAge()
	{
		return age;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public void setPhrase(String phrase)
	{
		this.phrase = phrase;
	}
	public void setOtherThings(String otherThings)
	{
		this.otherThings = otherThings;
	}
	public void setAge(String age)
	{
		this.age = age;
	}
}
