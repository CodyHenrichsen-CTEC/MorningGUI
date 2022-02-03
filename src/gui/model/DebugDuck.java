package gui.model;

public class DebugDuck
{
	private String name;
	private int questionCount;
	
	public DebugDuck(String name)
	{
		this.name = name;
		this.questionCount = 0;
	}

	public String getName()
	{
		return name;
	}

	public int getQuestionCount()
	{
		return questionCount;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public void setQuestionCount(int questionCount)
	{
		this.questionCount = questionCount;
	}
	
	@Override
	public String toString()
	{
		String description = "Hi, I am a duck, my name is " + name + ". I have answered ";
		description += questionCount + " questions so far!";
		
		return description;
	}
	
}
