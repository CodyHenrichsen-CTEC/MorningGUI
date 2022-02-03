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
import java.awt.Dimension;

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
		this.setPreferredSize(new Dimension(800,600));
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
		layout.putConstraint(SpringLayout.WEST, demoButton, 0, SpringLayout.WEST, duckButton);
		layout.putConstraint(SpringLayout.EAST, demoButton, 0, SpringLayout.EAST, duckButton);
		layout.putConstraint(SpringLayout.WEST, duckButton, 50, SpringLayout.WEST, this);
		layout.putConstraint(SpringLayout.EAST, duckButton, -50, SpringLayout.EAST, this);
		layout.putConstraint(SpringLayout.WEST, demoLabel, 0, SpringLayout.WEST, duckLabel);
		layout.putConstraint(SpringLayout.WEST, duckLabel, 20, SpringLayout.WEST, this);
		layout.putConstraint(SpringLayout.EAST, duckLabel, -20, SpringLayout.EAST, this);
		layout.putConstraint(SpringLayout.NORTH, demoLabel, 62, SpringLayout.SOUTH, demoButton);
		layout.putConstraint(SpringLayout.EAST, demoLabel, 0, SpringLayout.EAST, duckLabel);
		layout.putConstraint(SpringLayout.NORTH, demoButton, 72, SpringLayout.SOUTH, duckLabel);
		layout.putConstraint(SpringLayout.NORTH, duckLabel, 46, SpringLayout.SOUTH, duckButton);
		layout.putConstraint(SpringLayout.NORTH, duckButton, 185, SpringLayout.NORTH, this);

	}

}
