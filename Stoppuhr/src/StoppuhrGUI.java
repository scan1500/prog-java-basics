import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.Timer;

public class StoppuhrGUI
{
	public static void main(String[] args)
	{
		JFrame myframe = new JFrame("Stoppuhr 1.0");
		myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Stoppuhr stopwatch = new Stoppuhr();

		Container c = myframe.getContentPane();
		c.setLayout(new FlowLayout(FlowLayout.LEFT));
		c.setBackground(Color.black);

		JButton bStart = new JButton("Start!");
		bStart.setPreferredSize(new Dimension(150, 75));
		JButton bStop = new JButton("Stop!");
		bStop.setPreferredSize(new Dimension(150, 75));
		JButton bReset = new JButton("Reset!");
		bReset.setPreferredSize(new Dimension(150, 75));

		c.add(bStart);
		c.add(bStop);
		c.add(bReset);
		c.add(stopwatch);

		myframe.setSize(475, 230);
		myframe.setResizable(false);
		myframe.setVisible(true);

		//1000 Millisekunden enspricht 1 Sekunde
		//100 Millisekunden entspricht 0.1 Sekunde
		//Der ActionListener, der dem Timer t übergeben wird,
		//führt alle 100ms Aktionen mittels actionPerformed aus. 


		class CommandStart implements ActionListener
		{
			public void actionPerformed(ActionEvent e)
			{
				if (e.getSource() == bStart)
				{
					stopwatch.t.start();
				}
			}
		}

		class CommandStop implements ActionListener
		{
			public void actionPerformed(ActionEvent e)
			{
				if (e.getSource() == bStop)
				{
					stopwatch.t.stop();
				}
			}
		}

		class CommandReset implements ActionListener
		{
			public void actionPerformed(ActionEvent e)
			{
				if (e.getSource() == bReset)
				{
					stopwatch.t.stop();
					stopwatch.resetTime();
					myframe.repaint();
				}
			}
		}

		ActionListener alStart = new CommandStart();
		ActionListener alStop = new CommandStop();
		ActionListener alReset = new CommandReset();

		bStart.addActionListener(alStart);
		bStop.addActionListener(alStop);
		bReset.addActionListener(alReset);

	}
}
