package Constructors;

/**
 * Created by David on 27.04.2017.
 */

public class Intervention {

    private long idIntervention;
    private String interName;
    private String interPriority;
    private String intDescription;
    private String DateBegin;
    private String DateEnd;
    private String Localisation;

    public Intervention(){

    }

    public Intervention(long idIntervention, String interName, String interPriority, String intDescription, String DateBegin, String DateEnd, String Localisation, int idOfficer, int idTeam){

        this.idIntervention = idIntervention;
        this.interName = interName;
        this.interPriority = interPriority;
        this.intDescription = intDescription;
        this.DateBegin = DateBegin;
        this.DateEnd = DateEnd;
        this.Localisation = Localisation;
    }

    public long getIdIntervention() {
        return idIntervention;
    }

    public void setIdIntervention(long idIntervention) {
        this.idIntervention = idIntervention;
    }

    public String getInterName() {
        return interName;
    }

    public void setInterName(String interName) {
        this.interName = interName;
    }

    public String getInterPriority() {
        return interPriority;
    }

    public void setInterPriority(String interPriority) {
        this.interPriority = interPriority;
    }
    public String getIntDescription() {
        return intDescription;
    }

    public void setIntDescription(String intDescription) {
        this.intDescription = intDescription;
    }

    public String getDateBegin() {
        return DateBegin;
    }

    public void setDateBegin(String dateBegin) {
        DateBegin = dateBegin;
    }

    public String getDateEnd() {
        return DateEnd;
    }

    public void setDateEnd(String dateEnd) {
        DateEnd = dateEnd;
    }

    public String getLocalisation() {
        return Localisation;
    }

    public void setLocalisation(String localisation) {
        Localisation = localisation;
    }

}
