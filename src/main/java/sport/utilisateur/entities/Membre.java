package sport.utilisateur.entities;

public class Membre extends Utilisateur{
    private String dateInscription;

    public String getDateInscription() {
        return dateInscription;
    }

    public void setDateInscription(String dateInscription) {
        this.dateInscription = dateInscription;
    }

    public Membre() {
        super();
    }

    public Membre(int id) {
        super(id);
    }
    public Membre(int id,String nom, String prenom, String sexe, String email, String telephone, String password,String dateInscription) {
        super(nom, prenom, sexe, email, telephone, password);
        this.dateInscription=dateInscription;
        setRole("Membre");
        this.id=id;
    }

    public Membre(String nom, String prenom, String sexe, String email, String telephone, String password,String dateInscription) {
        super(nom, prenom, sexe, email, telephone, password);
        this.dateInscription=dateInscription;
        setRole("Membre");
    }

    @Override
    public int getId() {
        return super.getId();
    }

    @Override
    public String getNom() {
        return super.getNom();
    }

    @Override
    public String getPrenom() {
        return super.getPrenom();
    }

    @Override
    public String getSexe() {
        return super.getSexe();
    }

    @Override
    public String getEmail() {
        return super.getEmail();
    }

    @Override
    public String getTelephone() {
        return super.getTelephone();
    }

    @Override
    public String getRole() {
        return super.getRole();
    }

    @Override
    public String getPassword() {
        return super.getPassword();
    }

    @Override
    public void setId(int id) {
        super.setId(id);
    }

    @Override
    public void setNom(String nom) {
        super.setNom(nom);
    }

    @Override
    public void setPrenom(String prenom) {
        super.setPrenom(prenom);
    }

    @Override
    public void setSexe(String sexe) {
        super.setSexe(sexe);
    }

    @Override
    public void setEmail(String email) {
        super.setEmail(email);
    }

    @Override
    public void setTelephone(String telephone) {
        super.setTelephone(telephone);
    }

    @Override
    public void setRole(String role) {
        super.setRole(role);
    }

    @Override
    public void setPassword(String password) {
        super.setPassword(password);
    }

    @Override
    public String toString() {
        return super.toString();
    }




}
