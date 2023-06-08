package p15;

import java.sql.*;

public class OracleInsert {

	public static void main(String[] args) {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "c##himedia";
		String password = "himedia";

		try {
			Class.forName(driver);
			System.out.println("jdbc driver loading success.");
			Connection conn = DriverManager.getConnection(url, user, password);
			System.out.println("oracle connection success.\n");
			Statement stmt = conn.createStatement();
			
			String sql3 = "SELECT MAX(deptno) from dept";
			ResultSet rs2 = stmt.executeQuery(sql3);
			String max = "";
			while(rs2.next()) {
				max = rs2.getString("MAX(deptno)");
			}
			int ideptno = Integer.parseInt(max);
			ideptno += 10;
			String sdname = "IT", sloc = "SEOUL";
			String sql = "INSERT INTO dept VALUES ('" + ideptno + "','" + sdname + "','" + sloc + "')";
			boolean b = stmt.execute(sql);

			if (!b) {
				System.out.println("Insert success.\n");
			} else {
				System.out.println("Insert fail.\n");
			}

			String sql2 = "SELECT deptno, dname, loc FROM dept order by deptno";
			ResultSet rs = stmt.executeQuery(sql2);
			while (rs.next()) {
				System.out.print(rs.getString("deptno") + "\t");
				System.out.print(rs.getString("dname") + "\t");
				System.out.println(rs.getString("loc") + " ");
			}
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		} catch (SQLException e) {
			System.out.println(e);
		}
	}

}
