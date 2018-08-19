import java.awt.Container;
import javax.swing.JFrame;

public class SchachbrettGUI
{
	public static void main(String[] args)
	{
		JFrame myframe = new JFrame("Schachbrett 1.0");
		myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container c = myframe.getContentPane();
		c.setLayout(null);

		Schachbrett sb = new Schachbrett();

		c.add(sb);

		// Hauptfenster Geometrie setzen
		
		myframe.setSize(800, 800);
		myframe.setLocation(400, 100);

		// Sichtbarkeit enstellen
		myframe.setVisible(true);

	}
}
