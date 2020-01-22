package programme;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Eleve extends User {

	private String dateNaissance;
	
	public Eleve(int id, String nom, String prenom, String mail, String adresse, String telephone, String dateNaissance) {
		super(id, nom, prenom, mail, adresse, telephone);
		this.dateNaissance = dateNaissance;
	}

	public void   setDateNaissance  (String dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	
	public String getDateNaissance  () {
		return dateNaissance;
	}

	public static boolean ajout(String nom, String prenom, String mail, String adresse, String telephone, String dateNaissance) {
		Connection cn = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			cn = DriverManager.getConnection("jdbc:mysql://localhost/ensup_epreuve", "root", "");
			st = cn.createStatement();
			String sql = "INSERT into etudiants (et_nom, et_prenom, et_mail, et_adresse, et_tel, et_naissance) VALUES "
					+ "('"+nom+"'"
					+ ",'"+prenom+"'"
					+ ",'"+mail+"'"
					+ ", '"+adresse+"'"
					+ ", '"+telephone+"'"
					+ ", '"+dateNaissance+"'"
					+")";
			st.executeUpdate(sql);
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
		return true;
	}
	
	public static void supprimerEtudiant(String id) {
		Connection cn = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			cn = DriverManager.getConnection("jdbc:mysql://localhost/ensup_epreuve", "root", "");
			st = cn.createStatement();
			String sql = "DELETE FROM etudiants WHERE et_id = '"+id+"'";
			st.executeUpdate(sql);
			System.out.println("");
 		    System.out.print("Etudiant supprimé !");
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
	}
	
public static void listerEtudiants() {
		
		Connection cn = null;
		Statement st = null;
		ResultSet rs = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			cn = DriverManager.getConnection("jdbc:mysql://localhost/ensup_epreuve", "root", "");
			st = cn.createStatement();
			String sql = "SELECT * FROM etudiants";
			rs = st.executeQuery(sql);
			while(rs.next()) {
				System.out.println("Code = "+rs.getString("et_id") + " | " + rs.getString("et_prenom") + " " + rs.getString("et_nom") + " | " +rs.getString("et_mail"));
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
	}
}
