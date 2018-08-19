import java.awt.Dimension;

import javax.swing.JButton;

@SuppressWarnings("serial")
public class Button extends JButton
{
	public Button(String name, int x, int y)
	{
		setText(name);
		setPreferredSize(new Dimension(x, y));
		setFocusable(false);
	}
}
