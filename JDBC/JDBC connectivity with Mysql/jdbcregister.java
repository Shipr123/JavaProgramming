//step1 : register
package jdbc.genx;

public class jdbcregister {
	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			System.out.println("Driver Class Loaded");
		}catch(ClassNotFoundException e)
		{
			e.printStackTrace();
		}
	}
}
