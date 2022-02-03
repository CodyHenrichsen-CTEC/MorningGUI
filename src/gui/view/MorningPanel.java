package gui.view;

import gui.controller.Controller;


/*
 * Swing imports
 * */
import javax.swing.SpringLayout;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;

import java.awt.Color;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MorningPanel extends JPanel
{
	private Controller app;
	private JButton demoButton;
	private JLabel demoLabel;
	private JButton duckButton;
	private JLabel duckLabel;
	
	private SpringLayout layout;

	public MorningPanel(Controller app)
	{
		super();
		this.app = app;

		this.demoButton = new JButton("Click me please!");
		this.demoLabel = new JLabel("Results here :D");
		this.duckButton = new JButton("Click for ducks!");
		this.duckLabel = new JLabel("Duck status here");
		
		this.layout = new SpringLayout();

		setupPanel();
		setupListeners();
		setupLayout();

	}

	private void setupPanel()
	{
		this.setLayout(layout);
		this.setBackground(new Color(132, 3, 45));
		this.add(demoButton);
		this.add(demoLabel);
		this.add(duckButton);
		this.add(duckLabel);
	}

	private void setupListeners()
	{
		demoButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				String current = "The current random number is: " + app.getRandom();
				demoLabel.setText(current);
			}
		});

		duckButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				String duckInfo = app.generateDuckData();
				duckLabel.setText(duckInfo);
			}
		});

	}

	private void setupLayout()
	{

	}

}
