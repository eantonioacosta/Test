
package Logica;

import Entidades.InvesticacionAplicada;
import Entidades.PracticasEmpresariales;
import Entidades.TrabajoGrado;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


public class ControlTrabajoGrado {
    ArrayList<TrabajoGrado> lista;

    public ControlTrabajoGrado() {
        lista= new ArrayList<>();
    }

    public ControlTrabajoGrado(ArrayList<TrabajoGrado> lista) {
        this.lista = lista;
    }

    
    public String addTrabajo(TrabajoGrado trabajo) {
        lista.add(trabajo);
        GuardarRadicado(Integer.parseInt(trabajo.getCodigoRadicado()));
        Guardar();
        return "Registrado!!";
    }

    public boolean buscar(String codigo){
        Lectura();
        for (TrabajoGrado trabajo : lista) {
            if(trabajo.getCodigoRadicado().equals(codigo)) return true;
        }
        return false;
    }
    public TrabajoGrado buscarTrabajo(String codigo){
        Lectura();
        for (TrabajoGrado trabajo : lista) {
            if(trabajo.getCodigoRadicado().equals(codigo)) return trabajo;
        }
        return null;
    }
    
    public TrabajoGrado buscarTrabajoItem(int item){
        Lectura();
        return lista.get(item);
    }
    
    public String elimiarTrabajo(String codigo){
        Lectura();
        for (int i = 0; i < lista.size(); i++) {
            if(lista.get(i).getCodigoRadicado().equals(codigo)){
                lista.remove(i);
                Guardar();
                return "Registro Eliminado";
            }
            
        }
        
        return "Registro no encontrado, ERROR";     
    }
    
    public String actualizarTrabajo(String codigo, TrabajoGrado newTrabajo){
        Lectura();
        for (int i = 0; i < lista.size(); i++) {
            if(lista.get(i).getCodigoRadicado().equals(codigo)){
                lista.remove(i);
                lista.add(i, newTrabajo);
                Guardar();
                return "Registro Actualizado";
            }          
        }
        return "Registro no encontrado, ERROR";    

    }
    
    private void Guardar(){  
        try{
            FileOutputStream ruta =  new FileOutputStream("src/Archivos/TrabajoGrado.bin");
            ObjectOutputStream archivo = new ObjectOutputStream(ruta);
            
            if(archivo!=null){
                archivo.writeObject(lista);
                archivo.close();   
            }
            
        }catch(IOException e){}   
    }
       
    private void Lectura() {
        try {

            FileInputStream ruta = new FileInputStream("src/Archivos/TrabajoGrado.bin");
            ObjectInputStream archivo = new ObjectInputStream(ruta);

            if (archivo != null) {
                lista = (ArrayList<TrabajoGrado>) archivo.readObject();
                archivo.close();
            }
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }
    // Consultar
    public ArrayList<TrabajoGrado> consultarTodos(){
        Lectura();
        return lista;
    }
    public ArrayList<InvesticacionAplicada> consultarInvesticacion(){
        Lectura();
        ArrayList<InvesticacionAplicada> listaInves = new ArrayList<>();
        for (TrabajoGrado trabajoGrado : lista) {
            if(trabajoGrado instanceof InvesticacionAplicada){
                listaInves.add((InvesticacionAplicada)trabajoGrado);
            }
        }
        return listaInves;
    }
    public ArrayList<PracticasEmpresariales> consultarPracticas(){
        Lectura();
        ArrayList<PracticasEmpresariales> listaPracticas = new ArrayList<>();
        for (TrabajoGrado trabajoGrado : lista) {
            if(trabajoGrado instanceof PracticasEmpresariales){
                listaPracticas.add((PracticasEmpresariales)trabajoGrado);
            }
        }
        return listaPracticas;
    }
    private void GuardarRadicado(int radicado){  
        try{
            FileOutputStream ruta =  new FileOutputStream("src/Archivos/Radicado.bin");
            ObjectOutputStream archivo = new ObjectOutputStream(ruta);
            
            if(archivo!=null){
                archivo.writeObject(radicado);
                archivo.close();   
            }
            
        }catch(IOException e){}   
    }
       
    public int LecturaRadicado() {
        try {
            int radicado;
            FileInputStream ruta = new FileInputStream("src/Archivos/Radicado.bin");
            ObjectInputStream archivo = new ObjectInputStream(ruta);

            if (archivo != null) {
                radicado = (int) archivo.readObject();
                archivo.close();
                return radicado+1;
            }
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            
        }
        return 0;
    }
}
