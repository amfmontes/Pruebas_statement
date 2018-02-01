/**
 * 
 */
package curso.mysql;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author Curso ma�ana
 *
 */
public class Consultar {

	/**
	 * @param args
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/biblioteca", "root", "");

		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery("SELECT * FROM LIBROS");

		while (rs.next()) {
			System.out.println("titulo " + rs.getString(2));
			System.out.println("autor " + rs.getString(3));
			System.out.println("precio " + rs.getFloat(4));
			System.out.println("fecha " + rs.getDate(5));
		}
		
//				int insertar= st.executeUpdate("INSERT INTO libros(titulo, autor, precio, fechaDePublicacion) VALUES('El Quijote','Miguel Cervantes','9.45','1615-03-28')");
//				
//	
//		System.out.println("Fila insertada " + insertar);
//		
		PreparedStatement pstmt= conn.prepareStatement("SELECT * FROM LIBROS where titulo=?");
		pstmt.setString(1,"El Quijote");
		ResultSet rs1= pstmt.executeQuery();
		while (rs1.next()) {
			System.out.println("***Hecho con preparestatement***");
			System.out.println("titulo " + rs1.getString(2));
			System.out.println("autor " + rs1.getString(3));
			System.out.println("precio " + rs1.getFloat(4));
			System.out.println("fecha " + rs1.getDate(5));
		
							
			
}
//		CallableStatement cstmt= conn.prepareCall("{call listaLibros}");
//		ResultSet rs2= cstmt.executeQuery();
//		while (rs2.next()) {
//			System.out.println("***Hecho con callablestatement***");
//			System.out.println("titulo " + rs2.getString(2));
//			System.out.println("autor " + rs2.getString(3));
//			System.out.println("precio " + rs2.getFloat(4));
//			System.out.println("fecha " + rs2.getDate(5));
//		
//							
//}
//		
		CallableStatement cstmt= conn.prepareCall("{call listaLibrosPorAutor(?)}");
		cstmt.setString(1, "Mika Waltari");
		ResultSet rs2= cstmt.executeQuery();
		while (rs2.next()) {
			System.out.println("***Hecho con callablestatement***");
			System.out.println("titulo " + rs2.getString(2));
			System.out.println("autor " + rs2.getString(3));
			System.out.println("precio " + rs2.getFloat(4));
			System.out.println("fecha " + rs2.getDate(5));
		
							
}
		
		
		
	}

}
