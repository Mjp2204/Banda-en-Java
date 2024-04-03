/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.com.Mjpv.Banda.logica;

import java.util.Random;
/**
 *
 * @author Estudiantes
 */
public class Banda {
    
    private Instrumento[] instrumentos;
    
    public void conformarBanda(int cantidadInstrumentos){
        Random r = new Random();
        this.instrumentos = new Instrumento[cantidadInstrumentos];
        for (int i = 0; i < cantidadInstrumentos; i++){
            int aleatorio = r.nextInt(1,4);
            this.instrumentos[i] = this.generarInstrumento(aleatorio);
        }
    }
    
    public void afinarBanda(){
        for (Instrumento instrumento : instrumentos){
            System.out.println(instrumento.afinar());
        }
    }

    public void tocarBanda(){
        for (Instrumento instrumento : instrumentos){
            System.out.println(instrumento.tocar());
        }
    }
    
    public Instrumento generarInstrumento(int opcion){
        switch (opcion) {
            case 1 -> {
                return new Guitarra();
            }
            case 2 -> {
                return new Triple();
            }
            case 3 -> {
                return new Tambor();
            }
            default -> throw new AssertionError();
    }
    }
}
