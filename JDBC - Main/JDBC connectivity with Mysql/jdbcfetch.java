//step 5 fetch
package jdbc.genx;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class jdbcfetch {
public static void main(String[] args) throws SQLException {
		
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		
		String qry = "select * from genx.salary";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			System.out.println("Driver Class Loaded");
			
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=7011630679");
			
			System.out.println("Connetion Establish with db server");
			
			pstmt=con.prepareStatement(qry);
			
			rs=pstmt.executeQuery();
			
			while(rs.next())
			{
				int id=rs.getInt("Id");
				String EmployeesName = rs.getString(2);
				int salary = rs.getInt(3);
				String EmailId=rs.getString(4);
				
				System.out.println(id+ " " +EmployeesName+" " +salary+ " "+ EmailId);
			}
			
			
			
		}catch(ClassNotFoundException|SQLException e)
		{
			e.printStackTrace();
		}
		
		finally
		{
			if(rs!=null)
			{
				try {
					rs.close();
				}catch(SQLException e)
				{
					e.printStackTrace();
				}
				
			}
			if(pstmt!=null)
			{
				try {
					pstmt.close();
				
				}catch(SQLException e)
				{
					e.printStackTrace();
				}
				
			}
			if(con!=null)
			{
				try {
					con.close();
				}catch(SQLException e)
				{
					e.printStackTrace();
				}
				
			}
			System.out.println("Closed All Resources");
		}
		
	}


}
