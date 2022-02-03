package gui.view;

import gui.controller.Controller;
import javax.swing.JFrame;

public class MorningFrame extends JFrame
{
	private Controller app;
	
	private MorningPanel panel;
	
	public MorningFrame(Controller app)
	{
		super();
		this.app = app;
		this.panel = new MorningPanel(this.app);
		
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(panel);
		this.setTitle("Make a cool window");
		this.setSize(800, 600);
		this.setResizable(false);
		this.setVisible(true);
	}
}
