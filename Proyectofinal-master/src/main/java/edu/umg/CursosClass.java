package edu.umg;

import java.util.Collection;

public class CursosClass {
    private int idCurso;
    private String nombreCurso;
    private String profesor;
    private Collection<InscripcionesClass> inscripcionesByIdCurso;

    public int getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(int idCurso) {
        this.idCurso = idCurso;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public String getProfesor() {
        return profesor;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CursosClass that = (CursosClass) o;

        if (idCurso != that.idCurso) return false;
        if (nombreCurso != null ? !nombreCurso.equals(that.nombreCurso) : that.nombreCurso != null) return false;
        if (profesor != null ? !profesor.equals(that.profesor) : that.profesor != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idCurso;
        result = 31 * result + (nombreCurso != null ? nombreCurso.hashCode() : 0);
        result = 31 * result + (profesor != null ? profesor.hashCode() : 0);
        return result;
    }

    public Collection<InscripcionesClass> getInscripcionesByIdCurso() {
        return inscripcionesByIdCurso;
    }

    public void setInscripcionesByIdCurso(Collection<InscripcionesClass> inscripcionesByIdCurso) {
        this.inscripcionesByIdCurso = inscripcionesByIdCurso;
    }
}
