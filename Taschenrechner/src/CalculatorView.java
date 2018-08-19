import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class CalculatorView extends JFrame
{
	public CalculatorView(Calculator c)
	{
		JFrame myframe = new JFrame("Calc");
		myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container cont = myframe.getContentPane();
		cont.setLayout(new FlowLayout(FlowLayout.LEFT));
		cont.setBackground(Color.white);

		JMenuBar menubar = new JMenuBar();

		JMenu menu = new JMenu("Menu");
		JMenuItem resetItem = new JMenuItem("Reset");
		JMenuItem exitItem = new JMenuItem("Exit");

		menu.add(resetItem);
		menu.add(exitItem);
		menubar.add(menu);
		
		myframe.setJMenuBar(menubar);

		JTextField display = new JTextField();
		display.setPreferredSize(new Dimension(317, 50));
		display.setHorizontalAlignment(JTextField.CENTER);
		display.setFont(new Font("Currier New", Font.BOLD, 30));
		display.setFocusable(false);

		Button[] numberButtons = new Button[10];
		for (int i = 0; i < 10; i++)
			numberButtons[i] = new Button(Integer.toString(i), 75, 50);
		Button plusButton = new Button("+", 75, 50);
		Button minusButton = new Button("-", 75, 50);
		Button multButton = new Button("*", 75, 50);
		Button divButton = new Button("/", 75, 50);
		Button commaButton = new Button(",", 75, 50);
		Button resetButton = new Button("reset", 75, 50);
		Button equalsButton = new Button("=", 315, 50);

		ActionListener listenButtons = (e) ->
		{
			if (e.getSource() == numberButtons[0])
				display.setText(display.getText() + "0");
			if (e.getSource() == numberButtons[1])
				display.setText(display.getText() + "1");
			if (e.getSource() == numberButtons[2])
				display.setText(display.getText() + "2");
			if (e.getSource() == numberButtons[3])
				display.setText(display.getText() + "3");
			if (e.getSource() == numberButtons[4])
				display.setText(display.getText() + "4");
			if (e.getSource() == numberButtons[5])
				display.setText(display.getText() + "5");
			if (e.getSource() == numberButtons[6])
				display.setText(display.getText() + "6");
			if (e.getSource() == numberButtons[7])
				display.setText(display.getText() + "7");
			if (e.getSource() == numberButtons[8])
				display.setText(display.getText() + "8");
			if (e.getSource() == numberButtons[9])
				display.setText(display.getText() + "9");
			if (e.getSource() == plusButton)
			{
				if (!display.getText().isEmpty() && c.getOpCode() == "UNDEF")
				{
					c.setOperand(Double.parseDouble(display.getText()));
					c.setOpcode(Calculator.OpCode.PLUS);
					display.setText(display.getText() + " + ");
				}
			}
			if (e.getSource() == minusButton)
			{
				if (!display.getText().isEmpty() && c.getOpCode() == "UNDEF")
				{
					c.setOperand(Double.parseDouble(display.getText()));
					c.setOpcode(Calculator.OpCode.MINUS);
					display.setText(display.getText() + " - ");
				}
			}
			if (e.getSource() == multButton)
			{
				if (!display.getText().isEmpty() && c.getOpCode() == "UNDEF")	
				{
					c.setOperand(Double.parseDouble(display.getText()));
					c.setOpcode(Calculator.OpCode.MULT);
					display.setText(display.getText() + " * ");
				}
			}
			if (e.getSource() == divButton)
			{
				if (!display.getText().isEmpty() && c.getOpCode() == "UNDEF")
				{
					c.setOperand(Double.parseDouble(display.getText()));
					c.setOpcode(Calculator.OpCode.DIV);
					display.setText(display.getText() + " / ");
				}
			}
			if (e.getSource() == commaButton)
			{
				if (display.getText().isEmpty())
					display.setText("0.");
				else if (display.getText().contains(".") == false)
					display.setText(display.getText() + ".");
			}
			if (e.getSource() == resetButton)
			{
				display.setText("");
				c.reset();
			}
			if (e.getSource() == equalsButton)
			{
				if (!display.getText().isEmpty() && display.getText().contains("+")  || display.getText().contains("-") || display.getText().contains("*") || display.getText().contains("/"))
				{
					String s = display.getText().substring(display.getText().indexOf(c.getOpCode())+1);
					c.setOperand(Double.parseDouble(s));
					c.calculate();
					c.setOpcode(Calculator.OpCode.NO_OPERATOR);
					display.setText(Double.toString(c.getResult()));
				}
			}
			if(e.getSource() == resetItem)
			{
				display.setText("");
				c.reset();
			}
			if(e.getSource() == exitItem)
			{
				System.exit(0);
			}
		};
		// Add ActionListener to Button 0-9
		for (JButton b : numberButtons)
			b.addActionListener(listenButtons);
		// Add ActionListener to other Buttons
		plusButton.addActionListener(listenButtons);
		minusButton.addActionListener(listenButtons);
		multButton.addActionListener(listenButtons);
		divButton.addActionListener(listenButtons);
		commaButton.addActionListener(listenButtons);
		resetButton.addActionListener(listenButtons);
		equalsButton.addActionListener(listenButtons);
		// Add ActionListener to Menuoptions
		resetItem.addActionListener(listenButtons);
		exitItem.addActionListener(listenButtons);

		cont.add(display);
		cont.add(numberButtons[7]);
		cont.add(numberButtons[8]);
		cont.add(numberButtons[9]);
		cont.add(plusButton);
		cont.add(numberButtons[4]);
		cont.add(numberButtons[5]);
		cont.add(numberButtons[6]);
		cont.add(minusButton);
		cont.add(numberButtons[1]);
		cont.add(numberButtons[2]);
		cont.add(numberButtons[3]);
		cont.add(multButton);
		cont.add(numberButtons[0]);
		cont.add(commaButton);
		cont.add(resetButton);
		cont.add(divButton);
		cont.add(equalsButton);

		myframe.setLocation(300, 60);
		myframe.setSize(332, 400);
		myframe.setResizable(false);
		myframe.setVisible(true);

		KeyListener keylistener = new KeyListener()
		{
			public void keyPressed(KeyEvent e)
			{
				if (e.getKeyChar() == '0')
					numberButtons[0].doClick();
				if (e.getKeyChar() == '1')
					numberButtons[1].doClick();
				if (e.getKeyChar() == '2')
					numberButtons[2].doClick();
				if (e.getKeyChar() == '3')
					numberButtons[3].doClick();
				if (e.getKeyChar() == '4')
					numberButtons[4].doClick();
				if (e.getKeyChar() == '5')
					numberButtons[5].doClick();
				if (e.getKeyChar() == '6')
					numberButtons[6].doClick();
				if (e.getKeyChar() == '7')
					numberButtons[7].doClick();
				if (e.getKeyChar() == '8')
					numberButtons[8].doClick();
				if (e.getKeyChar() == '9')
					numberButtons[9].doClick();
				if (e.getKeyChar() == '+')
					plusButton.doClick();
				if (e.getKeyChar() == '-')
					minusButton.doClick();
				if (e.getKeyChar() == '*')
					multButton.doClick();
				if (e.getKeyChar() == '/')
					divButton.doClick();
				if (e.getKeyChar() == ',')
					commaButton.doClick();
				if (e.getKeyCode() == 10)
					equalsButton.doClick();
			}

			public void keyReleased(KeyEvent e)
			{
			}

			public void keyTyped(KeyEvent e)
			{
			}
		};
		myframe.addKeyListener(keylistener);
	}
}