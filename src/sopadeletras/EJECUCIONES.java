
package sopadeletras;
import java.util.Scanner;
public class EJECUCIONES {
     /////////////////////////////////////////////////////////////////GUARDAR TAMAÑO DE TECLADO
    private int n;
    public int Regresar_Tablero(){
    //PARA DEVOLVER EL TAMAÑO DEL TABLERO
        return n; 
    }
    public void Ingresar_Tablero(int n){
       ////GUARDA EL TAMÑAO DEL TABLERO
       this.n=n;
    }
    ////////////////////////////////////////////////////////////GUARDAR SOLO UN NOMBRE
    private String nombre;
    public String Regresar_Nombre(){
       return nombre;
    }  
    public void Retener_Nombre(String nombre){
        this.nombre=nombre;
    }
    ///////////////////////////////////////////////////////////GUARDAR PALABRAS
    private String palabra;
    public String Regresar_Palabra(){
        return palabra;
    }
    public void Retener_Palabra(String palabra){
        this.palabra=palabra;
    }
    /////////////////////////////////////////////////////////NUMERO DE PALBRAS;
    private int numero_palabra;
    public int Regresar_numero_Palabra(){
        return numero_palabra;
    }
    public void Retener_numero_Palabra(int numero_palabra){
        this.numero_palabra=numero_palabra;
    }
    ///////////////////////////////////////////////////////
    private int uno;
    private int dos;
    public int Regresar_alea_u(){
        return uno;
    }
    public int Regresa_alea_d(){
        return dos;
    }
    public void Retener_alea(int uno, int dos){
        this.uno=uno;
        this.dos=dos;
    }
    ////////////////////////////////////////////////////
    private int puntos;
    private int fails;
    private int encontradas;
    public int Regresar_puntos(){
        return puntos;
    }
    public void Retener_puntos(int puntos){
        this.puntos = puntos;
    }
    ////////
    public int Regresar_fails(){
        return fails;
    }
    public void Retener_fails(int fails){
        this.fails=fails;
    }
    /////
    public int Regresar_econtrados(){
        return encontradas;
    }
    public void Retener_econtradas(int encontradas){
         this.encontradas=encontradas;
    }
}




   