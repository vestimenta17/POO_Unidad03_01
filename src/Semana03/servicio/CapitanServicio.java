/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Semana03.servicio;
import java.util.ArrayList;
import java.util.List;
import Semana03.modelo.Capitan;

/**
 *
 * @author morti
 */
public class CapitanServicio implements ICapitanServicio{

    private final List<Capitan> capitanList = new ArrayList<>();
    
    @Override
    public Capitan crear(Capitan capitan) {
        this.capitanList.add(capitan);
        return capitan;
    }

    @Override
    public List<Capitan> listar() {
        return this.capitanList;
    }
    
}