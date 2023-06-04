package homework;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;

public class Calculator extends WindowAdapter implements ActionListener {
	private Frame f;
	private JButton[] bt;
	private TextField tf;
	private int num;
//	private String opr;

	public Calculator() {
//		프레임
		f = new Frame("Calculator");
		f.setSize(350, 550);
		f.setLayout(new FlowLayout());
		f.addWindowListener(this);
//		TextField
		tf = new TextField(25);
//		버튼달기
		bt = new JButton[16];
		for (int i = 0; i < bt.length; i++) {
			bt[i] = new JButton(Integer.toString(i));
			bt[i].setPreferredSize(new Dimension(70, 50));
			bt[i].addActionListener(this);
		}
		for (int i = 0; i < 3; i++) {
			bt[i].setText(Integer.toString(i + 7));
		}
		bt[3].setText("x");
		bt[7].setText("-");
		for (int i = 8; i < 11; i++) {
			bt[i].setText(Integer.toString(i - 7));
		}
		bt[11].setText("+");
		bt[12].setText("C");
		bt[13].setText(Integer.toString(0));
		bt[14].setText("=");
		bt[15].setText("/");
//		불러오기
		f.add(tf);
		for (int i = 0; i < bt.length; i++) {
			f.add(bt[i]);
		}
		f.setVisible(true);

	}

	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}

	public void actionPerformed(ActionEvent e) {
		String op = e.getActionCommand();
		if (op.equals("C")) {
			tf.setText("");
		} else if (op.equals("=")) {
			if (tf.getText().contains("/")) {
				String[] ex = tf.getText().split("/");
				num = Integer.parseInt(ex[0]) / Integer.parseInt(ex[1]);
				tf.setText(Integer.toString(num));
			} else if (tf.getText().contains("x")) {
				String[] ex = tf.getText().split("x");
				num = Integer.parseInt(ex[0]) * Integer.parseInt(ex[1]);
				tf.setText(Integer.toString(num));
			} else if (tf.getText().contains("+")) {
				String[] ex = tf.getText().split("[/+]"); // +만 쓰면 예외가 발생해요...
				num = Integer.parseInt(ex[0]) + Integer.parseInt(ex[1]);
				tf.setText(Integer.toString(num));
			} else if (tf.getText().contains("-")) {
				String[] ex = tf.getText().split("-");
				num = Integer.parseInt(ex[0]) - Integer.parseInt(ex[1]);
				tf.setText(Integer.toString(num));
			}

		} else if (op.equals("/") || op.equals("x") || op.equals("+") || op.endsWith("-")) {
			tf.setText(tf.getText() + op);

		} else {
			for (int i = 0; i < bt.length; i++) {
				if (op.equals(bt[i].getText())) {
					tf.setText(tf.getText() + op);
				}
			}
		}
	}

	public static void main(String[] args) {
		Calculator cal = new Calculator();
	}

}
