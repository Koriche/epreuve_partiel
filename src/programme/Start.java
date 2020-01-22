package programme;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import programme.Prof;
import programme.Eleve;

public class Start {
	
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			
           System.out.println("connexion requise :");
           System.out.print("mail : ");
           String login = br.readLine();
           System.out.println("");
           System.out.print("Mot de passe : ");
           String mdp = br.readLine();
           System.out.println("");
			
           if(Prof.authentification(login, mdp)) {
        	   System.out.println("A - Créer un étudiant: ");
        	   System.out.println("B - Lister les étudiants inscrits");
        	   System.out.println("C - Supprimer un étudiant");
        	   String menu = br.readLine();
        	   if(menu.equals("A")) {
                   System.out.println("Préom etudiant : ");
                   String prenom = br.readLine();
        		   System.out.println("Nom etudiant : ");
                   String nom = br.readLine();
                   System.out.println("Date de naissance etudiant : ");
                   String dateNaissance = br.readLine();
                   System.out.println("Mail etudiant : ");
                   String mail = br.readLine();
                   System.out.println("Adresse etudiant : ");
                   String adresse = br.readLine();
                   System.out.println("Téléphone etudiant : ");
                   String telephone = br.readLine();
                   Eleve.ajout(nom, prenom, mail, adresse, telephone, dateNaissance);
                   System.out.println("Etudiant créé");
        	   }
        	   
        	   else if(menu.equals("B")) {
        		   System.out.println("");
                   Eleve.listerEtudiants();
        		   System.exit(0);
        	   }
        	   else  if(menu.equals("3")) {
        		   System.out.println("");
        		   System.out.print("Id de l'étudiant : ");
        		   String id = br.readLine();
        		   System.out.println("");
                   Eleve.supprimerEtudiant(id);
        		   System.exit(0);
        	   }
        	   
           } else {
        	   //Redémarrer le logiciel
               Start.main(args);
           }
           
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
