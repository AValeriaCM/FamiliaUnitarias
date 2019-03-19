/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import com.mycompany.familiaunitarias.General;
import com.mycompany.familiaunitarias.Persona;
import java.util.HashMap;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Valeria Castañeda
 */
public class NewEmptyJUnitTest {
    /**
     * Declaracion de mapa y objeto
     */
    public static HashMap<Integer, Persona> mapaAbuelo;
    static General general; 
    /**
     * 
     */
    @BeforeClass
    public  static void setUpClass() {
       general = new General();
       llenarMapa();
    }
    /**
     * Metodo que quema informacion en el mapa
     */
    public static void llenarMapa(){        
        mapaAbuelo = new HashMap<>();
        
        mapaAbuelo.put(1, new Persona(1, "Juan"));
        mapaAbuelo.put(2, new Persona(2, "Jose"));
        
        mapaAbuelo.get(1).getMapaPersona().put(3, new Persona(3, "Andres"));
        mapaAbuelo.get(1).getMapaPersona().put(4, new Persona(4, "Maria"));
        mapaAbuelo.get(1).getMapaPersona().put(5, new Persona(5, "Carlos"));
        mapaAbuelo.get(2).getMapaPersona().put(6, new Persona(6, "Alberto"));
        mapaAbuelo.get(2).getMapaPersona().put(7, new Persona(7, "Jimmy"));
        mapaAbuelo.get(2).getMapaPersona().put(8, new Persona(8, "Jhon"));
        
        mapaAbuelo.get(1).getMapaPersona().get(3).getMapaPersona().put(9, new Persona(9, "Juana"));
        mapaAbuelo.get(1).getMapaPersona().get(3).getMapaPersona().put(10, new Persona(10, "Paola"));
        mapaAbuelo.get(1).getMapaPersona().get(4).getMapaPersona().put(11, new Persona(11, "Sofia"));
        mapaAbuelo.get(1).getMapaPersona().get(5).getMapaPersona().put(12, new Persona(12, "Jaime"));
        mapaAbuelo.get(2).getMapaPersona().get(6).getMapaPersona().put(13, new Persona(13, "Tatiana"));
        mapaAbuelo.get(2).getMapaPersona().get(6).getMapaPersona().put(14, new Persona(14, "Fernanda"));
        mapaAbuelo.get(2).getMapaPersona().get(7).getMapaPersona().put(15, new Persona(15, "Viviana"));
        mapaAbuelo.get(2).getMapaPersona().get(8).getMapaPersona().put(16, new Persona(16, "Diana"));
    }
    
    @AfterClass
    public  static void tearDownClass() {
    }
    
    /**
     * Metodo que realiza test a los nodos abuelo
     */
    @Test
    public void pruebaAbuelo(){
        
        String inicio = general.buscar(1);
        String respuesta= "Juan Andres Maria Carlos Juana Paola Sofia Jaime";
        assertEquals(respuesta, inicio);
    }
    
    /**
     *  Metodo que realiza test a los nodos padre
     */
    
    @Test
    public void pruebaPadre(){
        String respuesta2 = "Andres Juan Juana Paola";
        String inicio2 = general.buscar(3);
        assertEquals(respuesta2, inicio2);
    }
    
    /**
     *  Metodo que realiza test a los nodos hijo
     */
    
    @Test
    public void pruebaHijo(){
        String respuesta3 = "Juana Andres Juan";
        String inicio3 = general.buscar(9);
        assertEquals(respuesta3, inicio3);
    }
    
}