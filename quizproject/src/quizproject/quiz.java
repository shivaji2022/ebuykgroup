package quizproject;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class quiz {
	// update data
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver"); // load the establish
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/quizproject","root","root");
			
			// Single update value
			PreparedStatement ps = conn.prepareStatement("select * from mcqtable");
		    ResultSet rs = ps.executeQuery();
		    
		    	while(rs.next()) {
		    		System.out.println("id"+rs.getInt(1));
		    		System.out.println("Name="+rs.getString(2));
		    		System.out.println("Marks="+rs.getString(3));
		    		System.out.println("Class"+rs.getString(4));
		    	}
		    	con.close();
		    	ps.close();
		    	rs.close();
		    
		}
		    catch(Exception e) {
		    	e.printStackTrace();
		    }
			
	}
}
	

