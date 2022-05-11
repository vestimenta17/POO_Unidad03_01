/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_unidad03_01;

import java.awt.Color;
import java.util.List;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author HP
 */
public class Ventana030102 extends JFrame{
    private JPanel jPanel1;
    private List<JLabel> jLabelList;
    

    public Ventana030102(String title){
        super(title);
        this.setSize(800,600);
        this.setLocation(50, 100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.iniciarComponentes();
        this.setContentPane(this.jPanel1);
      
    }
    public void iniciarComponentes(){
        this.iniciarPanel();
        this.iniciarEtiquetas();
    }
    public void iniciarPanel(){
        this.jPanel1= new JPanel();
        this.jPanel1.setBackground(Color.PINK);
        this.jPanel1.setBorder(BorderFactory.createTitledBorder("Panel Principal"));
    }
    public void iniciarEtiquetas(){
        this.jLabelList= new ArrayList<>();
        this.jLabelList.add(new JLabel());
        this.jLabelList.add(new JLabel());
        this.jLabelList.add(new JLabel());
        this.jLabelList.get(0).setBackground(Color.ORANGE);
        this.jLabelList.get(0).setBorder(BorderFactory.createEmptyBorder());
        this.jLabelList.get(0).setText("Telecomunicaciones");
        this.jPanel1.add(this.jLabelList.get(0));
    } 
    
    
}
