
package Logica;

import Entidades.Docente;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


public class ControlDocentes{
    ArrayList<Docente> lista;

    public ControlDocentes(){
        lista = new ArrayList<>();
    }
    
    public String addDocente(Docente docente){
        if(buscar(docente.getId())){
            return "Identificacion ya registrada";
        }else{
            lista.add(docente);
            Guardar();
            return "Registrado!!";
        }
    }
    public ArrayList<Docente> getLista(){
        Lectura();
        return lista;
    }
    public boolean buscar(String id){
        Lectura();
        for (Docente docente : lista) {
            if(docente.getId().equals(id)) return true;
        }
        return false;
    }
    public Docente buscarDocente(String id){
        Lectura();
        for (Docente docente : lista) {
            if(docente.getId().equals(id)) return docente;
        }
        return null;
    }
    
    public Docente buscarDocenteItem(int item){
        Lectura();
        return lista.get(item);
    }
    
    public String elimiarDocente(String id){
        Lectura();
        for (int i = 0; i < lista.size(); i++) {
            if(lista.get(i).getId().equals(id)){
                lista.remove(i);
                Guardar();
                return "Registro Eliminado";
            }
            
        }
        
        return "Registro no encontrado, ERROR";     
    }
    
    public String actualizarDocente(String id, Docente newDocente){
        Lectura();
        for (int i = 0; i < lista.size(); i++) {
            if(lista.get(i).getId().equals(id)){
                lista.remove(i);
                lista.add(i, newDocente);
                Guardar();
                return "Registro Actualizado";
            }          
        }
        return "Registro no encontrado, ERROR";    

    }
    
    private void Guardar(){  
        try{
            FileOutputStream ruta =  new FileOutputStream("src/Archivos/Docentes.bin");
            ObjectOutputStream archivo = new ObjectOutputStream(ruta);
            
            if(archivo!=null){
                archivo.writeObject(lista);
                archivo.close();   
            }
            
        }catch(IOException e){}   
    }
       
    private void Lectura() {
        try {

            FileInputStream ruta = new FileInputStream("src/Archivos/Docentes.bin");
            ObjectInputStream archivo = new ObjectInputStream(ruta);

            if (archivo != null) {
                lista = (ArrayList<Docente>) archivo.readObject();
                archivo.close();
            }
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    // CONTROL DE ACCESO
    
    public Docente validarSesion(String user, String pass){
        Lectura();
        for (Docente docente : lista) {
            if(docente.getId().equals(user) & docente.getPassword().equals(pass))return docente;    
        }
        return null;
    }
    
    
}
