
package Entidades;


import java.io.Serializable;


public class InvesticacionAplicada extends TrabajoGrado implements Serializable{
    private String resumen;
    private String ObjetivosGenerales;
    private String ObjetivosEspecificos;
    private String Justificacion;

    public InvesticacionAplicada() {
    }

    public InvesticacionAplicada(String resumen, String ObjetivosGenerales, String ObjetivosEspecificos, String Justificacion) {
        this.resumen = resumen;
        this.ObjetivosGenerales = ObjetivosGenerales;
        this.ObjetivosEspecificos = ObjetivosEspecificos;
        this.Justificacion = Justificacion;
    }

    public InvesticacionAplicada(String codigoRadicado, int tipo, int estado, Fecha fecha, String dni, String nombres, String email, String asesor, String descripcion, LineaInvestigacion linea, String nombreArchivo, String urlPDF) {
        super(codigoRadicado, tipo, estado, fecha, dni, nombres, email, asesor, descripcion, linea, nombreArchivo, urlPDF);

    }



    public String getJustificacion() {
        return Justificacion;
    }

    public void setJustificacion(String Justificacion) {
        this.Justificacion = Justificacion;
    }

    public String getResumen() {
        return resumen;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }

    public String getObjetivosGenerales() {
        return ObjetivosGenerales;
    }

    public void setObjetivosGenerales(String ObjetivosGenerales) {
        this.ObjetivosGenerales = ObjetivosGenerales;
    }

    public String getObjetivosEspecificos() {
        return ObjetivosEspecificos;
    }

    public void setObjetivosEspecificos(String ObjetivosEspecificos) {
        this.ObjetivosEspecificos = ObjetivosEspecificos;
    }
    
    
}
