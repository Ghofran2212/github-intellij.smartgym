package sport.utilisateur.entities;

public class Utilisateur {
    int id;
    String nom;
    String prenom;
    String sexe;
    String email;
    String telephone;
    String role;
    String password;
    public Utilisateur(){}
    public Utilisateur(int id){
        this.id=id;
    }

    public Utilisateur(String nom, String prenom, String sexe , String email, String telephone, String password){
        this.nom=nom;
        this.prenom=prenom;
        this.sexe=sexe;
        this.email=email;
        this.telephone=telephone;

        this.password= password;
    }



    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getSexe() {
        return sexe;
    }

    public String getEmail() {
        return email;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getRole() {
        return role;
    }

    public String getPassword(){
        return password;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setPassword(String password){
        this.password =password;
    }

    @Override
    public String toString() {
        return "Utilisateur{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", sexe='" + sexe + '\'' +
                ", email='" + email + '\'' +
                ", telephone='" + telephone + '\'' +
                ", role='" + role + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

}
