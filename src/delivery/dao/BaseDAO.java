package delivery.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BaseDAO {
	protected void cerrarConexion(Connection con) 
		throws RuntimeException{
		
		try {
			if (con !=null && !con.isClosed()) {
				con.close();
			}
		} catch (SQLException e) {
			Logger.getLogger(BaseDAO.class.getName()).log(Level.SEVERE, null, e);
			System.err.println("Error: cerra conexion " + e);
		}
		
	}
	protected void cerrarResultSet(ResultSet rs) 
		throws RuntimeException{
		
		try {
			if (rs !=null) {
				rs.close();
			}
		} catch (SQLException e) {
			Logger.getLogger(BaseDAO.class.getName()).log(Level.SEVERE, null, e);
			System.err.println("Error: cerra ResultSet " + e);
		}
		
	}
	
	protected void cerrarStatement(PreparedStatement stmt) 
		throws RuntimeException{
		
		try {
			if (stmt !=null) {
				stmt.close();
			}
		} catch (SQLException e) {
			Logger.getLogger(BaseDAO.class.getName()).log(Level.SEVERE, null, e);
			System.err.println("Error: cerra ResultSet " + e);
		}
		
	}
	
	protected void cerrarCallable(CallableStatement callstmt) 
		throws RuntimeException{
		
		try {
			if (callstmt !=null) {
				callstmt.close();
			}
		} catch (SQLException e) {
			Logger.getLogger(BaseDAO.class.getName()).log(Level.SEVERE, null, e);
			System.err.println("Error: cerra Callav " + e);
		}
		
	}
	
}
