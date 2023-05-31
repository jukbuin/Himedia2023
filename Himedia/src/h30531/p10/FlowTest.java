package h30531.p10;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class FlowTest implements WindowListener, ActionListener {
	private Frame frame;
	private Button button1, button2, button3;

	public FlowTest() {
		frame = new Frame("adapter example");
		button1 = new Button("확인");
		button2 = new Button("열기");
		button3 = new Button("닫기");
	}

	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}

	public void windowClosed(WindowEvent e) {
	}

	public void windowActivated(WindowEvent e) {
	}

	public void windowDeactivated(WindowEvent e) {
	}

	public void windowDeiconified(WindowEvent e) {
	}

	public void windowIconified(WindowEvent e) {
	}

	public void windowOpened(WindowEvent e) {
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("닫기")) {
			System.exit(0);
		}

	}

	public void startFrame() {
		frame.addWindowListener(this);
		frame.setLayout(new FlowLayout());
		
		button3.addActionListener(this);

		frame.add(button1);
		frame.add(button2);
		frame.add(button3);
		frame.setSize(300, 300);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		FlowTest flow = new FlowTest();
		flow.startFrame();
	}

}
