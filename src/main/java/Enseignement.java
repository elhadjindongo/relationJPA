/********************************************************/
/****** Created by El Hadji M. NDONGO ******************/
/****** on 10/29/2021 ************************************/
/****** Project: relationJPA *********************/

import java.util.Date;

/****************************************************/

public class Enseignement {
    private Long id;
    private Date dateDebut;
    private Date dateFin;

    public Enseignement() {
    }

    public Enseignement(Long id, Date dateDebut, Date dateFin) {
        this.id = id;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }
}
