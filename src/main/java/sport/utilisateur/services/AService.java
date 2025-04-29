package sport.utilisateur.services;


import sport.utilisateur.entities.Admin;
import sport.utilisateur.entities.Membre;
import sport.utilisateur.tools.MyConnection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class AService implements UtilisateurService<Admin> {
    @Override
    public void ajouterUtilisateur(Admin a) {
        try {
            String requete ="INSERT INTO utilisateur(Nom, Prenom, Sexe, Email, Telephone, Role , password,dateInscription)" +
                    "VALUES (?,?,?,?,?,?,?,?)";

            PreparedStatement pst = MyConnection.getInstance().getCnx().prepareStatement(requete);
            pst.setString(1,a.getNom());
            pst.setString(2,a.getPrenom());
            pst.setString(3,a.getSexe());
            pst.setString(4,a.getEmail());
            pst.setString(5,a.getTelephone());
            pst.setString(6,a.getRole());
            pst.setString(7,a.getPassword());
            pst.setDate(8, java.sql.Date.valueOf(LocalDate.now()));

            pst.executeUpdate();
            System.out.println("Admin added...");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }


    }

    @Override
    public void supprimerUtilisateur(Admin a) {
        try {
            String requete = "DELETE FROM admin WHERE ID = ?";
            PreparedStatement pst = MyConnection.getInstance().getCnx().prepareStatement(requete);
            pst.setInt(1, a.getId());
            int rowsDeleted = pst.executeUpdate();

            if (rowsDeleted > 0) {
                System.out.println("admin supprimé avec succès");
            } else {
                System.out.println("Aucun a trouvé avec cet ID");
            }
        } catch (Exception e) {
            System.out.println("Erreur lors de la suppression: " + e.getMessage());
        }


    }

    @Override
    public void updateUtilisateur(Admin a) {
        try {
            String requete = "UPDATE  admin SET   Email = ?, Telephone = ?,nom=?,prenom=?,password=?,sexe=? WHERE ID = ?";
            PreparedStatement pst = MyConnection.getInstance().getCnx().prepareStatement(requete);
            pst.setString(1, a.getEmail());
            pst.setString(2, a.getTelephone());
            pst.setString(3, a.getNom());
            pst.setString(4,a.getPrenom());
            pst.setString(5,a.getPassword());
            pst.setString(6,a.getSexe());
            pst.setInt(7, a.getId());
            pst.executeUpdate();
            System.out.println("admin updated...");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }

    @Override
    public List<Admin> getAllData() {
        List<Admin> data = new ArrayList();
        try {
            String requete = "SELECT * FROM admin";
            Statement st = MyConnection.getInstance().getCnx().createStatement();
            ResultSet rs = st.executeQuery(requete);
            while (rs.next()){
                Admin a = new Admin();
                a.setId(rs.getInt(1));
                a.setNom(rs.getString(2));
                a.setPrenom(rs.getString(3));
                a.setSexe(rs.getString(4));
                a.setEmail(rs.getString(5));
                a.setTelephone(rs.getString(6));
                a.setRole(rs.getString(7));
                a.setPassword(rs.getString(8));

                data.add(a);
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return data;
    }
}
