/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8progra2_equipo9;

import java.io.Serializable;

/**
 *
 * @author cd507
 */
public class SeresVivos implements Serializable {

    private String nombre, raza, universo;
    private int poder, id, annios;
    private static final long SerialVersionUID=780L;
    
    public SeresVivos() {
    }

    public SeresVivos(String nombre, String raza, String universo, int poder, int id, int annios) {
        this.nombre = nombre;
        this.raza = raza;
        this.universo = universo;
        this.poder = poder;
        this.id = id;
        this.annios = annios;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getUniverso() {
        return universo;
    }

    public void setUniverso(String universo) {
        this.universo = universo;
    }

    public int getPoder() {
        return poder;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAnnios() {
        return annios;
    }

    public void setAnnios(int annios) {
        this.annios = annios;
    }

}
