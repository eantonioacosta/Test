
package Entidades;

import java.io.Serializable;


public class Docente implements Serializable{
    private String id;
    private int tipo; //2 Comite; 1 Docente Evaluador
    private int estado; // 1 activo; 2 desactivo
    private String nombre;
    private String apellidos;
    private String email;
    private String password;

    public Docente() {

    }

    public Docente(String id, int tipo, int estado, String nombre, String apellidos, String email, String password) {
        this.id = id;
        this.tipo = tipo;
        this.estado = estado;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
        this.password = password;
    }



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }



    public String getNombreCompleto() {
        return apellidos+" "+nombre;
    }
    public String getTipoText() {
        if(tipo==1){
            return "DOCENTE EVALUADOR";
        }else{
            return "COMITE DE PROYECTOS";
        }
    }
    public String getEstadoText() {
        if(estado==1){
            return "ACTIVO";
        }else{
            return "INACTIVO";
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    
    
    
}
