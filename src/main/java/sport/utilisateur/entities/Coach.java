package sport.utilisateur.entities;

public class Coach extends Utilisateur {
    private float salaire;

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(float salaire) {
        this.salaire = salaire;
    }

    public Coach() {
        super();
    }

    public Coach(int id) {
        super(id);
    }
    public Coach(int id,String nom ,String prenom,String sexe,String email, String telephone,String password,float salaire){
        super(nom, prenom, sexe, email, telephone, password);
        this.salaire=salaire;
        setRole("Coach");
        this.id=id;
    }


    public Coach(String nom, String prenom, String sexe, String email, String telephone, String password,float salaire) {
        super(nom, prenom, sexe, email, telephone, password);
        this.salaire=salaire;
        setRole("Coach");
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
