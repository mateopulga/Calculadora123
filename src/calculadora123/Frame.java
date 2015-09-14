/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora123;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author Mateo
 */
public class Frame extends JFrame{
    String[] operaciones;
    String variable;
    private JTextField jTextField;
    private JButton cero, uno, dos, tres, cuatro, cinco, seix, siete, ocho, nueve, por, menos, mas, div, igual, borrar, punto;
    static String texto = "";
    double var;

    public Frame() {
        super("Calculadora");
        setIconImage(new ImageIcon(getClass().getResource("/Img/cal.png")).getImage());
        
        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        setLayout(new GridLayout(5, 4, 8, 8));
        setLayout(new FlowLayout());

        jTextField = new JTextField(20);
        add(jTextField);
        

        uno = new JButton("1");
        add(uno);
        uno.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                texto = texto + "1";
                jTextField.setText(texto);
            }
        });

        dos = new JButton("2");
        add(dos);
        dos.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                texto = texto + "2";
                jTextField.setText(texto);
            }
        });

        tres = new JButton("3");
        add(tres);
        tres.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                texto = texto + "3";
                jTextField.setText(texto);
            }
        });

        cero = new JButton("0");
        add(cero);
        cero.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                texto = texto + "0";
                jTextField.setText(texto);
            }
        });

        por = new JButton("*");
        add(por);
        por.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                texto = texto + "*";
                jTextField.setText(texto);
            }
        });

        cuatro = new JButton("4");
        add(cuatro);
        cuatro.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                texto = texto + "4";
                jTextField.setText(texto);
            }
        });

        cinco = new JButton("5");
        add(cinco);
        cinco.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                texto = texto + "5";
                jTextField.setText(texto);
            }
        });

        seix = new JButton("6");
        add(seix);
        seix.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                texto = texto + "6";
                jTextField.setText(texto);
            }
        });

        mas = new JButton("+");
        add(mas);
        mas.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                var=var+Double.parseDouble(jTextField.getText());
                texto ="";
                jTextField.setText("");
            }
        });

        div = new JButton("/");
        add(div);
        div.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                texto = texto + "/";
                jTextField.setText(texto);
            }
        });

        siete = new JButton("7");
        add(siete);
        siete.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                texto = texto + "7";
                jTextField.setText(texto);

            }
        });

        ocho = new JButton("8");
        add(ocho);
        ocho.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                texto = texto + "8";
                jTextField.setText(texto);
            }
        });

        nueve = new JButton("9");
        add(nueve);
        nueve.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                texto = texto + "9";
                jTextField.setText(texto);
            }
        });

        menos = new JButton("-");
        add(menos);
        menos.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                texto = texto + "-";
                jTextField.setText(texto);
            }
        });

        borrar = new JButton("c");
        add(borrar);
        borrar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                texto = "";
                var=0;
                jTextField.setText(texto);
            }
        });

        igual = new JButton("=");
        add(igual);
        igual.addActionListener(new ActionListener() {
           
            @Override
            public void actionPerformed(ActionEvent e) {
                variable=jTextField.getText();
                for (int i = 0; i < variable.length(); i++) {
                    String c=variable.substring(0, i+1);
                    System.out.println(c);
                }
                
               
               
            }
        });
        punto = new JButton(".");
        add(punto);
        punto.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                texto = texto + ".";
                jTextField.setText(texto);
            }
        });

    }
}
