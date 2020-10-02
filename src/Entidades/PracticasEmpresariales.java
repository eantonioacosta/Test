
package Entidades;

import java.io.Serializable;


public class PracticasEmpresariales extends TrabajoGrado implements Serializable{
    //Datos de la Empresa
    String coontacto;
    String representanteLegal;
    String area;
    String funciones;

    public PracticasEmpresariales() {
    }

    public PracticasEmpresariales(String coontacto, String representanteLegal, String area, String funciones, String codigoRadicado, int tipo, int estado, String conceptoComite, DocenteEvaluador docente1, DocenteEvaluador docente2, Fecha fecha, String dni, String nombres, String email, String asesor, String descripcion, LineaInvestigacion linea, String nombreArchivo, String urlPDF) {
        super(codigoRadicado, tipo, estado, conceptoComite, docente1, docente2, fecha, dni, nombres, email, asesor, descripcion, linea, nombreArchivo, urlPDF);
        this.coontacto = coontacto;
        this.representanteLegal = representanteLegal;
        this.area = area;
        this.funciones = funciones;
    }



    public PracticasEmpresariales(String codigoRadicado, int tipo, int estado, Fecha fecha, String dni, String nombres, String email, String asesor, String descripcion, LineaInvestigacion linea, String nombreArchivo, String urlPDF) {
        super(codigoRadicado, tipo, estado, fecha, dni, nombres, email, asesor, descripcion, linea, nombreArchivo, urlPDF);

    }
    
    
}
