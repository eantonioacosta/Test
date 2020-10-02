/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.io.Serializable;


public class DocenteComite extends Docente implements Serializable{

    public DocenteComite() {
    }
    public DocenteComite(String id, int tipo, int estado, String nombre, String apellidos, String email,String pass) {
        super(id,tipo,estado, nombre, apellidos, email, pass);
    }
}
