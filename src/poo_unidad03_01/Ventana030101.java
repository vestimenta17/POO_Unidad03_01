/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_unidad03_01;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Point;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author HP
 */
public class Ventana030101 extends JFrame {
    private ArrayList<JPanel> jPanellList = new ArrayList<>();

    public Ventana030101(String title, int w, int h){
        super(title);
        this.setSize(w,h);
        var p= new Point(300,200);
        this.setLocation(p);
        this.iniciarComponentes();
        this.setContentPane(this.jPanellList.get(0));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public Ventana030101(int w, int h){
        var dimension= new Dimension(w,h);
        this.setSize(dimension);
    }
    public void iniciarComponentes(){
        this.iniciarPaneles();;
    }
    public void iniciarPaneles(){
        this.jPanellList.add(new JPanel());
        this.jPanellList.add(new JPanel());
        this.jPanellList.add(new JPanel());
        this.jPanellList.add(new JPanel());
        this.jPanellList.add(new JPanel());
        this.jPanellList.add(new JPanel());
        this.jPanellList.add(new JPanel());
        this.jPanellList.add(new JPanel());
        this.jPanellList.add(new JPanel());
        this.jPanellList.add(new JPanel());
        this.jPanellList.add(new JPanel());
        
        this.jPanellList.get(0).setBackground(Color.WHITE);
        this.jPanellList.get(0).setBorder(border);
        this.jPanellList.get(1).setBackground(Color.BLACK);
        this.jPanellList.get(2).setBackground(Color.GREEN);
        this.jPanellList.get(3).setBackground(Color.RED);
        this.jPanellList.get(4).setBackground(Color.PINK);
        this.jPanellList.get(5).setBackground(Color.BLUE);
        this.jPanellList.get(6).setBackground(Color.ORANGE);
        this.jPanellList.get(7).setBackground(Color.YELLOW);
        this.jPanellList.get(8).setBackground(Color.CYAN);
        this.jPanellList.get(9).setBackground(Color.GRAY);
        this.jPanellList.get(10).setBackground(Color.MAGENTA);


        this.jPanellList.get(0).setLayout(new FlowLayout());
        this.jPanellList.get(0).add(this.jPanellList.get(1));
        this.jPanellList.get(0).add(this.jPanellList.get(2));
        this.jPanellList.get(0).add(this.jPanellList.get(3));
        this.jPanellList.get(0).add(this.jPanellList.get(4));
        this.jPanellList.get(0).add(this.jPanellList.get(5));
        this.jPanellList.get(0).add(this.jPanellList.get(6));
        this.jPanellList.get(0).add(this.jPanellList.get(7));
        this.jPanellList.get(0).add(this.jPanellList.get(8));
        this.jPanellList.get(0).add(this.jPanellList.get(9));
        this.jPanellList.get(0).add(this.jPanellList.get(10));


        

        
        
    }
  
}
