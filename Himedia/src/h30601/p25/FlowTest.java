package h30601.p25;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FlowTest extends WindowAdapter {
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

	public void startFrame() {
		frame.addWindowListener(this);
		frame.setLayout(new FlowLayout());

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
