package gui.controller;

import gui.view.MorningFrame;
import gui.model.DebugDuck;

public class Controller
{
	private MorningFrame frame;
	private DebugDuck codyDuck;
	private DebugDuck otherDuck;

	public Controller()
	{
		this.codyDuck = new DebugDuck("Cody");
		this.otherDuck = new DebugDuck("The Doctor");
		
		this.frame = new MorningFrame(this);
		
	}
	
	public void start()
	{
		
	}
	
	public String generateDuckData()
	{
		String result = "I have two ducks!";
		result += "\n";
		result += "The first duck is named " + codyDuck.getName();
		result += "\n";
		result += "The second duck is named " + otherDuck.getName();
		result += "\n";
		result += "first questions: " + codyDuck.getQuestionCount() + " second questions: " + otherDuck.getQuestionCount();
		codyDuck.setQuestionCount(codyDuck.getQuestionCount() + getRandom());
		result += codyDuck.toString();
		
		return result;
	}
	
	private int calculateRandomNumber(int scalar, int shift)
	{
		int result = 0;
		
		result = (int) (Math.random() * scalar) + shift;
		
		return result;
	}
	
	public int getRandom()
	{
		int scale = 10;
		int shift = 5;
		
		int random = calculateRandomNumber(scale, shift);
		
		return random;
	}
	
}
