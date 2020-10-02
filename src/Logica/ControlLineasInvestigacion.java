/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Entidades.LineaInvestigacion;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


public class ControlLineasInvestigacion {
    public ArrayList<LineaInvestigacion> lista;

    public ControlLineasInvestigacion() {
        lista = new ArrayList<>();
    }
    
    
    private void Guardar(){  
        try{
            FileOutputStream ruta =  new FileOutputStream("src/Archivos/LineasInvestigacion.bin");
            ObjectOutputStream archivo = new ObjectOutputStream(ruta);
            
            if(archivo!=null){
                archivo.writeObject(lista);
                archivo.close();   
            }      
        }catch(IOException e){

        }
        
    }
       
    private void Lectura(){        
            try{  
               FileInputStream ruta = new FileInputStream("src/Archivos/LineasInvestigacion.bin");
               ObjectInputStream archivo = new ObjectInputStream(ruta);
               
               if(archivo!=null){
                   lista = (ArrayList<LineaInvestigacion>) archivo.readObject();
                   archivo.close();
                } 
            }catch(Exception ex){
                System.out.println(ex.getMessage());
            }
    }

    public String addLineaInvestigacion(LineaInvestigacion linea){
        if(buscar(linea.getCodigo())){
            return "Codigo ya registrada";
        }else{
            lista.add(linea);
            Guardar();
            return "Agregado";
        }
    }
    public ArrayList<LineaInvestigacion> getLista(){
        Lectura();
        return lista;
    }
    public boolean buscar(String codigo){
        Lectura();
        for (LineaInvestigacion linea : lista) {
            if(linea.getCodigo().equals(codigo)) return true;
        }
        return false;
    }
    public LineaInvestigacion buscarLinea(String codigo){
        Lectura();
        for (LineaInvestigacion linea : lista) {
            if(linea.getCodigo().equals(codigo)) return linea;
        }
        return null;
    }
    public LineaInvestigacion buscarLinea(int item){
        Lectura();
        return lista.get(item);
    }
    
    public String elimiarLinea(String codigo){
        Lectura();
        for (int i = 0; i < lista.size(); i++) {
            if(lista.get(i).getCodigo().equals(codigo)){
                lista.remove(i);
                Guardar();
                return "Registro Eliminado";
            }
            
        }
        
        return "Registro no encontrado, ERROR";     
    }
    public String actualizarLinea(String codigo, LineaInvestigacion newLinea){
        Lectura();
        for (int i = 0; i < lista.size(); i++) {
            if(lista.get(i).getCodigo().equals(codigo)){
                lista.remove(i);
                lista.add(i, newLinea);
                Guardar();
                return "Registro Actualizado";
            }          
        }
        return "Registro no encontrado, ERROR";    

    }
}
