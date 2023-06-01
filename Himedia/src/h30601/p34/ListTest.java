package h30601.p34;

import java.awt.Frame;
import java.awt.List;

public class ListTest {

	public static void main(String[] args) {
		Frame f = new Frame("List - Select");
		f.setSize(300, 200);
		f.setLayout(null);

		List selectOne = new List(6);
		selectOne.setLocation(20, 40);
		selectOne.setSize(100, 120);
		selectOne.add("Student");
		selectOne.add("Teacher");
		selectOne.add("Driver");
		selectOne.add("Computer Programmer");
		selectOne.add("Sales Man");
		selectOne.add("Musician");
		selectOne.add("Director");

		List seletMany = new List(6, true);
		seletMany.setLocation(150, 40);
		seletMany.setSize(100, 120);
		seletMany.add("Student");
		seletMany.add("Teacher");
		seletMany.add("Driver");
		seletMany.add("Computer Programmer");
		seletMany.add("StudeSales Mannt");
		seletMany.add("Musician");
		seletMany.add("Director");

		f.add(selectOne);
		f.add(seletMany);
		f.setVisible(true);

	}

}
