public class Service implements IService {
    private int id;
    private String libelle;

    public Service() {
    }

    public Service(int id, String libelle) {
        this.id=id;
        this.libelle=libelle;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    @Override
    public String affiche() {
      
        return null;
    }
}