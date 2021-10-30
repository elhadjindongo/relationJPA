/********************************************************/
/****** Created by El Hadji M. NDONGO ******************/
/****** on 10/29/2021 ************************************/
/****** Project: relationJPA *********************/
/****************************************************/

public class Cours {
    private Long id;
    private String intitule;
    private int nombreCredit;

    public Cours() {
    }

    public Cours(Long id, String intitule, int nombreCredit) {
        this.id = id;
        this.intitule = intitule;
        this.nombreCredit = nombreCredit;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIntitule() {
        return intitule;
    }

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    public int getNombreCredit() {
        return nombreCredit;
    }

    public void setNombreCredit(int nombreCredit) {
        this.nombreCredit = nombreCredit;
    }
}
