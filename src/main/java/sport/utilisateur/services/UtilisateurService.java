package sport.utilisateur.services;

import sport.utilisateur.entities.Utilisateur;
import java.util.List;

public interface UtilisateurService<T> {
    void ajouterUtilisateur(T t );
    void supprimerUtilisateur(T t);
    void updateUtilisateur( T t);
    List<T> getAllData();
}
