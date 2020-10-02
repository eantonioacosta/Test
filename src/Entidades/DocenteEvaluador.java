
package Entidades;


import java.io.Serializable;
import java.util.ArrayList;


public class DocenteEvaluador extends Docente implements Serializable{
    LineaInvestigacion linea;

    public DocenteEvaluador() {
        linea = new LineaInvestigacion();
    }

    public DocenteEvaluador(String id, int tipo, int estado, String nombre, String apellidos, String email,String pass,LineaInvestigacion linea) {
        super(id,tipo,estado, nombre, apellidos, email, pass);
        
        this.linea= linea;
    }




    
}
