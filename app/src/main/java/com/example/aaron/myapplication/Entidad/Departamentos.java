package com.example.aaron.myapplication.Entidad;

public class Departamentos {

    int CODCIU;
    String NOMCIU;
    String DESCRIP;
    String PLATOS;
    int IMGCIU;

    public int getCODCIU() {
        return CODCIU;
    }

    public void setCODCIU(int CODCIU) {
        this.CODCIU = CODCIU;
    }

    public String getNOMCIU() {
        return NOMCIU;
    }

    public void setNOMCIU(String NOMCIU) {
        this.NOMCIU = NOMCIU;
    }

    public String getDESCRIP() {
        return DESCRIP;
    }

    public void setDESCRIP(String DESCRIP) {
        this.DESCRIP = DESCRIP;
    }

    public String getPLATOS() {
        return PLATOS;
    }

    public void setPLATOS(String PLATOS) {
        this.PLATOS = PLATOS;
    }

    public int getIMGCIU() {
        return IMGCIU;
    }

    public void setIMGCIU(int IMGCIU) {
        this.IMGCIU = IMGCIU;
    }

    public Departamentos(int CODCIU, String NOMCIU, String DESCRIP, String PLATOS, int IMGCIU) {
        this.CODCIU = CODCIU;
        this.NOMCIU = NOMCIU;
        this.DESCRIP = DESCRIP;
        this.PLATOS = PLATOS;
        this.IMGCIU = IMGCIU;
    }
}
