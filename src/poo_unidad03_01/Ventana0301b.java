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
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ventana0301b extends JFrame {

    private final JPanel panelPrincipal = new JPanel();
    private final List<JLabel> jLabelList = new ArrayList<>();
    
    public Ventana0301b(String title) {
        this.setTitle(title);
        this.setSize(new Dimension(800,600));
        this.setLocation(new Point(100,100));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.iniciarComponentes();
        this.setLayout(new FlowLayout());
        this.setContentPane(this.panelPrincipal);
    }
    
    private void iniciarComponentes(){
        this.panelPrincipal.setBackground(Color.PINK);
        this.panelPrincipal.setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createEtchedBorder(), "Panel Principal"));

        
        this.jLabelList.add(0,new JLabel());
        this.jLabelList.get(0).setText("Universidad Politécnica Salesiana");
        this.jLabelList.get(0).setBackground(Color.GREEN);
        this.jLabelList.get(0).setOpaque(true);
        
        this.jLabelList.add(1,new JLabel());
        this.jLabelList.add(1,new JLabel("ELECTRONICA Y AUTOMATIZACION"));
        this.jLabelList.get(1).setBackground(Color.ORANGE);
        this.jLabelList.get(1).setOpaque(true);
        var imagen = new ImageIcon("C:\\Users\\HP\\OneDrive\\Documentos"
                + "\\NetBeansProjects\\POO_Unidad03_01\\src\\poo_unidad03_01\\electronica.jpg");
        this.jLabelList.get(1).setIcon(imagen);
        this.jLabelList.get(1).setBackground(Color.YELLOW);
        this.jLabelList.get(1).setOpaque(true);    
        
        this.jLabelList.add(2,new JLabel("TELECOMUNICACIONES"));
        this.jLabelList.get(2).setBackground(Color.ORANGE);
        this.jLabelList.get(2).setOpaque(true);
        this.jLabelList.add(2,new JLabel());
        var imagen1 = new ImageIcon("C:\\Users\\HP\\OneDrive\\Documentos"
                + "\\NetBeansProjects\\POO_Unidad03_01\\src\\poo_unidad03_01\\telecom.jpg");
        this.jLabelList.get(2).setIcon(imagen1);
        this.jLabelList.get(2).setBackground(Color.YELLOW);
        this.jLabelList.get(2).setOpaque(true);
        
        this.jLabelList.add(3,new JLabel("COMPUTACION"));
        this.jLabelList.get(3).setBackground(Color.ORANGE);
        this.jLabelList.get(3).setOpaque(true);
        this.jLabelList.add(3,new JLabel());
        var imagen2 = new ImageIcon("C:\\Users\\HP\\OneDrive\\Documentos"
                + "\\NetBeansProjects\\POO_Unidad03_01\\src\\poo_unidad03_01\\sistemas.jpg");
        this.jLabelList.get(3).setIcon(imagen2);
        this.jLabelList.get(3).setBackground(Color.YELLOW);
        this.jLabelList.get(3).setOpaque(true);

        
        this.panelPrincipal.add(this.jLabelList.get(0));        
        this.panelPrincipal.add(this.jLabelList.get(1));
        this.panelPrincipal.add(this.jLabelList.get(2));
        this.panelPrincipal.add(this.jLabelList.get(3));
    
    }
}
