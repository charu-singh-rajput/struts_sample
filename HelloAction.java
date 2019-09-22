package example;

public class HelloAction
{
	private String Name;
	public String execute() throws Exception
	{
		System.out.println("Name: "+Name);
		return "success";
	}
	public String getName()
	{
		return Name;
	}
	public void setName(String Name)
	{
		this.Name=Name;
	}
	
}
