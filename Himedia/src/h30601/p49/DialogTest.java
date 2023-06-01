package h30601.p49;

import java.awt.Button;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class DialogTest extends WindowAdapter {
	private Frame f;
	private Dialog info;
	private Label msg;
	private Button ok;

	public DialogTest() {
		f = new Frame("Parent");
		f.setSize(300, 200);

		info = new Dialog(f, "Information", true);
		info.addWindowListener(this);
		info.setSize(140, 100);
		info.setLocation(50, 50);
		info.setLayout(new FlowLayout());

		msg = new Label("Tis is modal Dialog", Label.CENTER);
		ok = new Button("ok");
		info.add(msg);
		info.add(ok);

		f.setVisible(true);
		info.setVisible(true);
	}

	public void windowClosing(WindowEvent e) {
		info.dispose();
	}

	public static void main(String[] args) {
		DialogTest d = new DialogTest();
	}

}
