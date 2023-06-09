package loginInfo;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

public class Main extends WindowAdapter implements ActionListener {
	private Frame f, f2;
	private TextField tfId, tfPwd, tfMsg;
	private Button bLogin;
	private MemberDAO dao;

	public Main() {
		dao = new MemberDAO();

		f = new Frame("Login");
		f.setSize(500, 300);
		f.setLayout(null);
		f.addWindowListener(this);

		Label lid = new Label("ID : ");
		lid.setBounds(50, 60, 100, 40);

		tfId = new TextField();
		tfId.setBounds(150, 60, 190, 30);

		Label lpwd = new Label("Password : ");
		lpwd.setBounds(50, 125, 100, 40);

		tfPwd = new TextField();
		tfPwd.setBounds(150, 130, 190, 30);
		tfPwd.setEchoChar('*');

		bLogin = new Button("Login");
		bLogin.setBounds(380, 90, 70, 50);
		bLogin.addActionListener(this);

		tfMsg = new TextField("Message");
		tfMsg.setBounds(50, 190, 400, 40);
		tfMsg.setEditable(false);
		tfMsg.setFocusable(false);

		f2 = new Frame("새로운창");
		f2.setSize(300, 300);
		f2.setLayout(null);
		f2.addWindowListener(this);

		f.add(lid);
		f.add(tfId);
		f.add(lpwd);
		f.add(tfPwd);
		f.add(bLogin);
		f.add(tfMsg);

		f.setVisible(true);
	}

	public static void main(String[] args) {
		Main m = new Main();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(tfId.getText());
		System.out.println(tfPwd.getText());

		String strId = tfId.getText();

		ArrayList<MemberVo> list = dao.list(strId);

		if (list.size() == 1) {
			MemberVo data = (MemberVo) list.get(0);
			String id = data.getId();
			String pwd = data.getPassword();

			System.out.println("DB ==> " + id + " : " + pwd);

			if (tfPwd.getText().equals(pwd)) {
				tfMsg.setText("로그인에 성공했습니다!");
				f2.setVisible(true);
				f.dispose();
			} else {
				tfMsg.setText("다시 입력하세요ㅠㅠ");
			}
		} else {
			tfMsg.setText("다시 입력하세요ㅠㅠ");
		}
	}

	public void windowClosing(WindowEvent e) {
		f.dispose();
		f2.dispose();
	}

}
