package sport.utilisateur.services;

import sport.utilisateur.entities.Admin;
import sport.utilisateur.entities.Coach;
import sport.utilisateur.tools.MyConnection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CService implements UtilisateurService<Coach>{
    @Override
    public void ajouterUtilisateur(Coach c) {
        try {
            String requete ="INSERT INTO utilisateur(Nom, Prenom, Sexe, Email, Telephone, Role , password,dateInscription,salaire)" +
                    "VALUES (?,?,?,?,?,?,?,?,?)";

            PreparedStatement pst = MyConnection.getInstance().getCnx().prepareStatement(requete);
            pst.setString(1,c.getNom());
            pst.setString(2,c.getPrenom());
            pst.setString(3,c.getSexe());
            pst.setString(4,c.getEmail());
            pst.setString(5,c.getTelephone());
            pst.setString(6,c.getRole());
            pst.setString(7,c.getPassword());
            pst.setDate(8, java.sql.Date.valueOf(LocalDate.now()));
            pst.setDouble(9,c.getSalaire());


            pst.executeUpdate();
            System.out.println("coach added...");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }


    }

    @Override
    public void supprimerUtilisateur(Coach c) {
        try {
            String requete = "DELETE FROM utilisateur WHERE ID = ?";
            PreparedStatement pst = MyConnection.getInstance().getCnx().prepareStatement(requete);
            pst.setInt(1, c.getId());
            int rowsDeleted = pst.executeUpdate();

            if (rowsDeleted > 0) {
                System.out.println("coach supprimé avec succès");
            } else {
                System.out.println("Aucun c trouvé avec cet ID");
            }
        } catch (Exception e) {
            System.out.println("Erreur lors de la suppression: " + e.getMessage());
        }


    }

    @Override
    public void updateUtilisateur(Coach c) {
        try {
            String requete = "UPDATE  utilisateur SET   Email = ?, Telephone = ?, Nom = ?, Prenom =?, password=?,Salaire=?,sexe=? WHERE ID = ?";
            PreparedStatement pst = MyConnection.getInstance().getCnx().prepareStatement(requete);
            pst.setString(1, c.getEmail());
            pst.setString(2, c.getTelephone());
            pst.setString(3, c.getNom());
            pst.setString(4, c.getPrenom());
            pst.setString(5, c.getPassword());
            pst.setDouble(6,c.getSalaire());
            pst.setString(7, c.getSexe());
            pst.setInt(8,c.getId());

            pst.executeUpdate();
            System.out.println("coach updated...");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }



    }

    @Override
    public List getAllData() {
        List<Coach> data = new ArrayList();
        try {
            String requete = "SELECT * FROM admin";
            Statement st = MyConnection.getInstance().getCnx().createStatement();
            ResultSet rs = st.executeQuery(requete);
            while (rs.next()){
                Coach c = new Coach();
                c.setId(rs.getInt(1));
                c.setNom(rs.getString(2));
                c.setPrenom(rs.getString(3));
                c.setSexe(rs.getString(4));
                c.setEmail(rs.getString(5));
                c.setTelephone(rs.getString(6));
                c.setRole(rs.getString(7));
                c.setPassword(rs.getString(8));
                c.setSalaire(rs.getFloat(9));
                data.add(c);
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return data;
    }


    }

