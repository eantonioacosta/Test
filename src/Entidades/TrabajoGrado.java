/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.io.Serializable;


public class TrabajoGrado implements Serializable{
    private String codigoRadicado;
    private int tipo;
    private int estado; //1 rechazado; 2 aceptado
    private String conceptoComite;
    private DocenteEvaluador docente1;
    private DocenteEvaluador docente2;
    private Fecha fecha;
    
    private String dni;
    private String nombres;
    private String email;
    
    private String asesor;
    private String descripcion;
    private LineaInvestigacion linea;
    private String nombreArchivo;
    private String urlPDF;

    public TrabajoGrado() {
        docente1 = new DocenteEvaluador();
        docente2 = new DocenteEvaluador();
        fecha = new Fecha();
        linea = new LineaInvestigacion();
    }

    public TrabajoGrado(String codigoRadicado, int tipo, int estado, String conceptoComite, DocenteEvaluador docente1, DocenteEvaluador docente2, Fecha fecha, String dni, String nombres, String email, String asesor, String descripcion, LineaInvestigacion linea, String nombreArchivo, String urlPDF) {
        this.codigoRadicado = codigoRadicado;
        this.tipo = tipo;
        this.estado = estado;
        this.conceptoComite = conceptoComite;
        this.docente1 = docente1;
        this.docente2 = docente2;
        this.fecha = fecha;
        this.dni = dni;
        this.nombres = nombres;
        this.email = email;
        this.asesor = asesor;
        this.descripcion = descripcion;
        this.linea = linea;
        this.nombreArchivo = nombreArchivo;
        this.urlPDF = urlPDF;
    }
        public TrabajoGrado(String codigoRadicado, int tipo, int estado,Fecha fecha, String dni, String nombres, String email, String asesor, String descripcion, LineaInvestigacion linea, String nombreArchivo, String urlPDF) {
        this.codigoRadicado = codigoRadicado;
        this.tipo = tipo;
        this.estado = estado;
        this.fecha = fecha;
        this.dni = dni;
        this.nombres = nombres;
        this.email = email;
        this.asesor = asesor;
        this.descripcion = descripcion;
        this.linea = linea;
        this.nombreArchivo = nombreArchivo;
        this.urlPDF = urlPDF;
    }





    public LineaInvestigacion getLinea() {
        return linea;
    }

    public void setLinea(LineaInvestigacion linea) {
        this.linea = linea;
    }

    public String getCodigoRadicado() {
        return codigoRadicado;
    }

    public void setCodigoRadicado(String codigoRadicado) {
        this.codigoRadicado = codigoRadicado;
    }

    public int getEstado() {
        return estado;
    }
    public String getEstadoString() {
        if(estado==1){
            return "PENDIENTE";
        }else if(estado==2){
            return "RECHAZADA";
        }else{
            return "ACEPTADA";
        }
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public String getConceptoComite() {
        return conceptoComite;
    }

    public void setConceptoComite(String conceptoComite) {
        this.conceptoComite = conceptoComite;
    }

    public DocenteEvaluador getDocente1() {
        return docente1;
    }

    public void setDocente1(DocenteEvaluador docente1) {
        this.docente1 = docente1;
    }

    public DocenteEvaluador getDocente2() {
        return docente2;
    }

    public void setDocente2(DocenteEvaluador docente2) {
        this.docente2 = docente2;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }



    public String getAsesor() {
        return asesor;
    }

    public void setAsesor(String asesor) {
        this.asesor = asesor;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNombreArchivo() {
        return nombreArchivo;
    }

    public void setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    public String getUrlPDF() {
        return urlPDF;
    }

    public void setUrlPDF(String urlPDF) {
        this.urlPDF = urlPDF;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
    
    
    
    
}
