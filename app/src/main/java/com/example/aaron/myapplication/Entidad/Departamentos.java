package com.example.aaron.myapplication.Entidad;

public class Departamentos {

    int CODDEP;
    String NOMDEP;
    String DESCRIP;
    int IMGDEP;

    public int getCODDEP() {
        return CODDEP;
    }

    public void setCODDEP(int CODDEP) {
        this.CODDEP = CODDEP;
    }

    public String getNOMDEP() {
        return NOMDEP;
    }

    public void setNOMDEP(String NOMDEP) {
        this.NOMDEP = NOMDEP;
    }

    public String getDESCRIP() {
        return DESCRIP;
    }

    public void setDESCRIP(String DESCRIP) {
        this.DESCRIP = DESCRIP;
    }

    public int getIMGDEP() {
        return IMGDEP;
    }

    public void setIMGDEP(int IMGDEP) {
        this.IMGDEP = IMGDEP;
    }

    public Departamentos(int CODDEP, String NOMDEP, String DESCRIP, int IMGDEP) {
        this.CODDEP = CODDEP;
        this.NOMDEP = NOMDEP;
        this.DESCRIP = DESCRIP;
        this.IMGDEP = IMGDEP;
    }

    public Departamentos() {}
}
