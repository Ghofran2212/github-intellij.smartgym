package sport.utilisateur.tests;
import sport.utilisateur.entities.Admin;
import sport.utilisateur.entities.Coach;
import sport.utilisateur.entities.Membre;
import sport.utilisateur.services.AService;
import sport.utilisateur.services.CService;
import sport.utilisateur.services.MService;
import sport.utilisateur.tools.MyConnection;

public class MainClass {
    public static void main(String[] args) {
        MyConnection mc = new MyConnection();
       // Membre m1 = new Membre("dsqdsqdqsd","hhh","gggg","hhhggg","hghghgh","hhjhjhjhjjhhj", "jjhjhhjhjjhhjhjj");
       // MService ms = new MService();
      //  ms.ajouterUtilisateur(m1);
        //Admin a= new Admin ("hajj","gho","homme","ghofhajj@gmail.com","25444858","888");
       // AService as = new AService();
        //as.ajouterUtilisateur(a);
        //us.ajouterUtilisateur(u);

       // Utilisateur u1 = new Utilisateur("2");
        //us.supprimerUtilisateur(u1);

        //Utilisateur u2 = new Utilisateur("3","jwdewuhd@gmail.com","23456789");
       // us.updateUtilisateur("3",u2);
       // Utilisateur u3 = new Utilisateur("3" ,"hajj@esprit.tn","97213990");
       // us.updateUtilisateur("3",u3);
        //Utilisateur u4 =new Utilisateur("22","ronaldo","cristiano","cr7@madrid.tn","256666","coach","98754");
       // us.ajouterUtilisateur(u4);
        //Coach c1 =new Coach(8,"ghofrane","mm","pp","kk","nn","987",
                //8522);
        CService cs= new CService();
        //cs.ajouterUtilisateur(c1);
        //Coach c2= new Coach ("bchir","tarek","homme","trk@eprit.tn","98745632","123",80000);
        //c1.setPrenom("ghpfran");
       // cs.supprimerUtilisateur(c1);
       Membre m2 =new Membre("laaribi","haythem","homme","haaribi@gmail.com","25252525","987","22/12/2025");
       MService ms=new MService();
       //ms.ajouterUtilisateur(m2);
       Membre m3=new Membre(11,"aaaa","hammrouni","med","homme","mham@gmail.tn","2525252","25/11/2006");
       ms.updateUtilisateur(m3);
       Membre m4= new Membre(11,"Sana","gar","f","sg@gmail.com","26451235","password","25/05/2025");
       ms.updateUtilisateur(m4);
       ms.supprimerUtilisateur(m4);
       Admin a1 = new Admin("hh","mm","h","hm@gmail.tn","525888","225");
       AService as = new AService();
       as.ajouterUtilisateur(a1);
       //Admin a5 = new Admin("alaya","mohamed","sexe","alm@gmail.com","97546321","258");
       //as.ajouterUtilisateur(a5);
       Admin a6= new Admin(15,"hh","mm","homme","hhhhh","111");

