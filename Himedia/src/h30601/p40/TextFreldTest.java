package h30601.p40;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TextFreldTest extends WindowAdapter implements ActionListener {
	private Frame f, f2;
	private Button bt;
	private TextField id, pwd, msg;
	private final String STRING_ID = "babo";
	private final String STRING_PWD = "1234";

	public TextFreldTest() {
		f = new Frame("Login");
		f.setSize(400, 100);
		f.setLayout(new FlowLayout());

		f2 = new Frame("Main");
		f2.setSize(500, 500);
		f.addWindowListener(this);
		f2.addWindowListener(this);

		Label lid = new Label("ID : ", Label.RIGHT);
		Label lpwd = new Label("Password : ", Label.LEFT);

		id = new TextField(10);
		pwd = new TextField(10);
		pwd.setEchoChar('*');

		bt = new Button("Login");
		bt.addActionListener(this);

		msg = new TextField(35);
		msg.setEditable(false);

		f.add(lid);
		f.add(id);
		f.add(lpwd);
		f.add(pwd);
		f.add(bt);
		f.add(msg);
		f.setVisible(true);

	}

	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (id.getText().equals(STRING_ID) && pwd.getText().equals(STRING_PWD)) {
			msg.setText("로그인에 성공했습니다!");
			f2.setVisible(true);
			f.dispose();
		} else {
			msg.setText("아이디나 비밀번호를 확인해주세요.");
		}

	}

	public static void main(String[] args) {
		TextFreldTest t = new TextFreldTest();

	}

}