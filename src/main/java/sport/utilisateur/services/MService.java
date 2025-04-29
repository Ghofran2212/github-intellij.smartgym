package sport.utilisateur.services;

import sport.utilisateur.entities.Membre;
import sport.utilisateur.entities.Utilisateur;
import sport.utilisateur.tools.MyConnection;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class MService implements UtilisateurService<Membre>{

    @Override
    public void ajouterUtilisateur(Membre m) {
        try {
        String requete ="INSERT INTO utilisateur(Nom, Prenom, Sexe, Email, Telephone, Role , password,dateInscription,Salaire)" +
                "VALUES (?,?,?,?,?,?,?,?,Null)";

        PreparedStatement pst = MyConnection.getInstance().getCnx().prepareStatement(requete);
        pst.setString(1,m.getNom());
        pst.setString(2,m.getPrenom());
        pst.setString(3,m.getSexe());
        pst.setString(4,m.getEmail());
        pst.setString(5,m.getTelephone());
        pst.setString(6,m.getRole());
        pst.setString(7,m.getPassword());
        pst.setString(8, m.getDateInscription());

        pst.executeUpdate();
        System.out.println("membre added...");

    } catch (SQLException e) {
        System.out.println(e.getMessage());
    }

    }

    @Override
    public void supprimerUtilisateur(Membre m) {
        try {
        String requete = "DELETE FROM utilisateur WHERE ID = ?";
        PreparedStatement pst = MyConnection.getInstance().getCnx().prepareStatement(requete);
        pst.setInt(1, m.getId());
        int rowsDeleted = pst.executeUpdate();

        if (rowsDeleted > 0) {
            System.out.println("membre supprimé avec succès");
        } else {
            System.out.println("Aucun m trouvé avec cet ID");
        }
    } catch (Exception e) {
        System.out.println("Erreur lors de la suppression: " + e.getMessage());
    }
    }



    @Override
    public void updateUtilisateur(Membre m) {
        try {
            String requete = "UPDATE  utilisateur SET   Email = ?, Telephone = ?,nom=?,prenom=?,sexe=?,password=?,dateInscription=? WHERE ID = ?";
            PreparedStatement pst = MyConnection.getInstance().getCnx().prepareStatement(requete);
            pst.setString(1, m.getEmail());
            pst.setString(2, m.getTelephone());
            pst.setString(3, m.getNom());
            pst.setString(4, m.getPrenom());
            pst.setString(5, m.getSexe());
            pst.setString(6, m.getPrenom());
            pst.setString(7, m.getDateInscription());
            pst.setInt(8, m.getId());
            pst.executeUpdate();
            System.out.println("membre updated...");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }




    }

    @Override
    public List getAllData() {
        List<Membre> data = new ArrayList();
        try {
            String requete = "SELECT * FROM utilisateur";
            Statement st = MyConnection.getInstance().getCnx().createStatement();
            ResultSet rs = st.executeQuery(requete);
            while (rs.next()){
                Membre m = new Membre();
                m.setId(rs.getInt(1));
                m.setNom(rs.getString(2));
                m.setPrenom(rs.getString(3));
                m.setSexe(rs.getString(4));
                m.setEmail(rs.getString(5));
                m.setTelephone(rs.getString(6));
                m.setRole(rs.getString(7));
                m.setPassword(rs.getString(8));
                m.setDateInscription(rs.getString(9));
                data.add(m);
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return data;
    }
}