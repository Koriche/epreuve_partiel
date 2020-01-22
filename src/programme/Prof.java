package programme;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Prof extends User {
	
	private String matiereEnseigne;
	
	public Prof(int id, String nom, String prenom, String mail, String adresse, String telephone, String matiereEnseigne) {
		super(id, nom, prenom, mail, adresse, telephone);
		this.matiereEnseigne = matiereEnseigne;
	}

	public static boolean authentification(String mail, String pass) {
		Connection cn = null;
		Statement st = null;
		ResultSet rs = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			cn = DriverManager.getConnection("jdbc:mysql://localhost/ensup_epreuve", "root", "");
			st = cn.createStatement();
			String sql = "SELECT * FROM enseignants WHERE en_mail = '"+mail+"' AND en_pass = '"+pass+"'";
			
			rs = st.executeQuery(sql);
			
			if(rs.next()) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e ) {
			e.printStackTrace();
		} finally {
			try {
				cn.close();
				st.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return false;
	}
	
	public String getMatiereEnseigne() {
		return matiereEnseigne;
	}

	public void setMatiereEnseigne(String matiereEnseigne) {
		this.matiereEnseigne = matiereEnseigne;
	}
}
