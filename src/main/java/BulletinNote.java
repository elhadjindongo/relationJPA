/********************************************************/
/****** Created by El Hadji M. NDONGO ******************/
/****** on 10/29/2021 ************************************/
/****** Project: relationJPA *********************/
/****************************************************/

public class BulletinNote {
    private Long id;
    private Session session;
    private String moyenne;
    private String AnneeScolaire;
    public BulletinNote() { }

    public BulletinNote(Long id, String moyenne, String anneeScolaire) {
        this.id = id;
        this.moyenne = moyenne;
        this.AnneeScolaire = anneeScolaire;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNote() {
        return moyenne;
    }

    public void setNote(String moyenne) {
        this.moyenne = moyenne;
    }

    public String getAnneeScolaire() {
        return AnneeScolaire;
    }

    public void setAnneeScolaire(String anneeScolaire) {
        AnneeScolaire = anneeScolaire;
    }
}
