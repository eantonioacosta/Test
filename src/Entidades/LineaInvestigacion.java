/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.io.Serializable;

public class LineaInvestigacion implements Serializable{
    private String codigo;
    private String nombre;
    private String detalles;

    public LineaInvestigacion() {
    }

    public LineaInvestigacion(String codigo, String nombre, String detalles) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.detalles = detalles;
    }

    public String getDetalles() {
        return detalles;
    }

    public void setDetalles(String detalles) {
        this.detalles = detalles;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
