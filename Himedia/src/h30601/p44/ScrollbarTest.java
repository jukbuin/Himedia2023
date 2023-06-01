package h30601.p44;

import java.awt.Frame;
import java.awt.Scrollbar;

public class ScrollbarTest {

	public static void main(String[] args) {
		Frame f = new Frame("Comments");
		f.setSize(300, 200);
		f.setLayout(null);

		Scrollbar hor = new Scrollbar(Scrollbar.HORIZONTAL, 0, 50, 0, 100);
		hor.setSize(100, 15);
		hor.setLocation(60, 30);

		Scrollbar var = new Scrollbar(Scrollbar.VERTICAL, 50, 20, 0, 100);
		var.setSize(15, 100);
		var.setLocation(30, 30);

		f.add(hor);
		f.add(var);
		f.setVisible(true);
	}

}
