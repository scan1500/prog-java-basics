package schneemanngrid;

import java.awt.Container;

import javax.swing.JFrame;

public class GUIMain {

	public static void main(String args[]) {
		
		// Fenster erzeugen
		JFrame wnd = new JFrame("Das hier ist ein JFrame");
		wnd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// ContentPane holen
		Container c = wnd.getContentPane();
		// bedeutet: die Lage der Panels richtet sich ausschließlich nach deren Koordinaten/Größe
		c.setLayout(null);		
		
		
		// Panels erzeugen
		// Geometrie der einzelnen Panels im jeweiligen Konstruktor
		Schneemann sm = new Schneemann();
		Grid grid = new Grid();
		Triangle tri = new Triangle();
		
		
		// Panels in den Container
		// Reihenfolge beachten
		
		c.add(tri);
		c.add(grid);
		c.add(sm);

	
		// Hauptfenster Geometrie setzen
		wnd.setSize(700, 900);
		wnd.setLocation(100, 100);
		
		// Sichtbarkeit enstellen
		wnd.setVisible(true);
		
		
	}

}
