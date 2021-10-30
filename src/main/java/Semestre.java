/********************************************************/
/****** Created by El Hadji M. NDONGO ******************/
/****** on 10/29/2021 ************************************/
/****** Project: relationJPA *********************/
/****************************************************/

public class Semestre {
    private Long id;
    private String intitule; //1er semestre ou 2em semestre
    private int totalCredit;

    public Semestre() {
    }

    public Semestre(Long id, String intitule, int totalCredit) {
        this.id = id;
        this.intitule = intitule;
        this.totalCredit = totalCredit;
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

    public int getTotalCredit() {
        return totalCredit;
    }

    public void setTotalCredit(int totalCredit) {
        this.totalCredit = totalCredit;
    }
}
