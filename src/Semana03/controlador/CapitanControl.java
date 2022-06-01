/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana03.controlador;

import java.util.List;
import Semana03.modelo.Capitan;
import Semana03.servicio.CapitanServicio;

public class CapitanControl {
    private final CapitanServicio capitanServicio = new CapitanServicio();
    
    public Capitan crear(String [] params){
        var capitan = new Capitan(Integer.valueOf(params[0]),params[1]);
        this.capitanServicio.crear(capitan);
        return capitan;
    }
    
    public List<Capitan> listar()
    {
        return this.capitanServicio.listar();
    }
}