package h30531.p18;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventTest implements ActionListener {
	private Frame f;
	private Button btn1, btn2, btn3, btn4, btn5;

	public EventTest() {
		f = new Frame("event handler example");
		btn1 = new Button("button 1");
		btn2 = new Button("button 2");
		btn3 = new Button("button 3");
		btn4 = new Button("button 4");
		btn5 = new Button("button 5");
	}

	public void startFrame() {
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		btn4.addActionListener(this);
		btn5.addActionListener(this);

		f.add(btn1, "North");
		f.add(btn2, "South");
		f.add(btn3, "West");
		f.add(btn4, "East");
		f.add(btn5, "Center");

		f.setSize(300, 300);
		f.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("button 1")) {
			System.out.println("button 1 Click!");
		}
		if (e.getActionCommand().equals("button 2")) {
			System.out.println("button 2 Click!");
		}
		if (e.getActionCommand().equals("button 3")) {
			System.out.println("button 3 Click!");
		}
		if (e.getActionCommand().equals("button 4")) {
			System.out.println("button 4 Click!");
		}
		if (e.getActionCommand().equals("button 5")) {
			System.out.println("button 5 Click!");
		}

	}

	public static void main(String[] args) {
		EventTest g = new EventTest();
		g.startFrame();
	}

}
