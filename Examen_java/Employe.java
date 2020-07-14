public abstract class Employe implements IService {
    protected int id;
    protected String nomComplet;
    public Employe(){
    }
    public Employe(int id, String nomComplet) {
        this.id=id;
        this.nomComplet=nomComplet;
    }
    //getters et setters de id
    public int getId(){
        return this.id;
    }
    public void setId(int id){
		this.id=id;
    }
    //getters et setters de nom
    public String getNomComplet(){
        return this.nomComplet ;
    }
    public void setNomComplet(String nomComplet){
		this.nomComplet=nomComplet;
    }
    public boolean isEmbauche(){
        return false ;
    }
    public boolean isJournalier(){
        return false ;
    }

    @Override
    public String affiche(){
       return "Id: "+id+" Nom et Prenom : "+nomComplet;
    }
}