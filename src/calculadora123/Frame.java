/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora123;

import pilas.ArrayStack;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author Mateo
 */
public class Frame extends JFrame {
    
    
    private JTextField jTextField;
    private JButton cero, uno, dos, tres, cuatro, cinco, seix, siete, ocho, nueve, por, menos, mas, div, igual, borrar, punto;
    static String texto = "";
    double var;
    ArrayList<String> lista = new ArrayList<>();
    ArrayList<String> lista2=new ArrayList<>();
    ArrayStack<String> pilaCadena = new ArrayStack<>();

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
                pilaCadena.push("1");
                jTextField.setText(texto);
            }
        });

        dos = new JButton("2");
        add(dos);
        dos.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                texto = texto + "2";
                pilaCadena.push("2");
                jTextField.setText(texto);
            }
        });

        tres = new JButton("3");
        add(tres);
        tres.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                texto = texto + "3";
                pilaCadena.push("3");
                jTextField.setText(texto);
            }
        });

        cero = new JButton("0");
        add(cero);
        cero.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                texto = texto + "0";
                pilaCadena.push("0");
                jTextField.setText(texto);
            }
        });

        por = new JButton("*");
        add(por);
        por.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                texto = texto + "*";
                pilaCadena.push("*");
                jTextField.setText(texto);
            }
        });

        cuatro = new JButton("4");
        add(cuatro);
        cuatro.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                texto = texto + "4";
                pilaCadena.push("4");
                jTextField.setText(texto);
            }
        });

        cinco = new JButton("5");
        add(cinco);
        cinco.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                texto = texto + "5";
                pilaCadena.push("5");
                jTextField.setText(texto);
            }
        });

        seix = new JButton("6");
        add(seix);
        seix.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                texto = texto + "6";
                pilaCadena.push("6");
                jTextField.setText(texto);
            }
        });

        mas = new JButton("+");
        add(mas);
        mas.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                var = var + Double.parseDouble(jTextField.getText());
                texto =texto + "+";
                pilaCadena.push("+");
                jTextField.setText(texto);
            }
        });

        div = new JButton("/");
        add(div);
        div.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                texto = texto + "/";
                pilaCadena.push("/");
                jTextField.setText(texto);
            }
        });

        siete = new JButton("7");
        add(siete);
        siete.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                texto = texto + "7";
                pilaCadena.push("7");
                jTextField.setText(texto);

            }
        });

        ocho = new JButton("8");
        add(ocho);
        ocho.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                texto = texto + "8";
                pilaCadena.push("8");
                jTextField.setText(texto);
            }
        });

        nueve = new JButton("9");
        add(nueve);
        nueve.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                texto = texto + "9";
                pilaCadena.push("9");
                jTextField.setText(texto);
            }
        });

        menos = new JButton("-");
        add(menos);
        menos.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                texto = texto + "-";
                pilaCadena.push("-");
                jTextField.setText(texto);
            }
        });

        borrar = new JButton("c");
        add(borrar);
        borrar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                texto = "";
                pilaCadena = null;
                jTextField.setText(texto);
            }
        });
       
        
        igual = new JButton("=");
        add(igual);
        igual.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                String aux = "";
                while (!pilaCadena.isEmpty()) {
                    if (!(pilaCadena.peak().equals("*") || pilaCadena.peak().equals("/") || pilaCadena.peak().equals("+") || pilaCadena.peak().equals("-"))) {
                        aux += pilaCadena.pop();
                        if (pilaCadena.isEmpty()) {
                            lista.add(aux);
                            aux = "";
                        }

                    } else {
                        lista.add(aux);
                        lista.add(pilaCadena.pop());
                        aux = "";
                    }
                    int j = 0;
                    String[] voltear = null;
                    
                   /* for (int i = lista.size(); i >= 0; i--) {
                        voltear[j] = lista.get(i);
                        lista2.add(voltear[j]);
                        j++;
                    }*/
                    Collections.reverse(lista);

                }
                while (!(lista.size()== 1)) {                    
                    while (lista.contains("*")) {                        
                        for (int i = 0; i < lista.size(); i++) {
                            if ("*".equals(lista.get(i))){
                              double factor1 =Double.parseDouble(lista.get(i-1));
                              double factor2 = Double.parseDouble(lista.get(i+1));
                              lista.set(i, (factor1*factor2+""));
                              lista.set(i-1, "");
                              lista.set(i+1, "");
                              lista.removeAll(Collections.singleton(""));
                            }
                        }
                    }
                    while (lista.contains("/")) {                        
                        for (int i = 0; i < lista2.size(); i++) {
                            if ("*".equals(lista2.get(i))){
                              double factor1 =Double.parseDouble(lista2.get(i-1));
                              double factor2=Double.parseDouble(lista2.get(i+1));
                              lista2.set(i, (factor1/factor2+""));
                              lista2.set(i-1, "");
                              lista2.set(i+1, "");
                              lista2.removeAll(Collections.singleton(""));
                            }
                        }
                    }
                    while (lista.contains("+")) {                        
                        for (int i = 0; i < lista2.size(); i++) {
                            if ("*".equals(lista2.get(i))){
                              double factor1 =Double.parseDouble(lista2.get(i-1));
                              double factor2=Double.parseDouble(lista2.get(i+1));
                              lista2.set(i, (factor1+factor2+""));
                              lista2.set(i-1, "");
                              lista2.set(i+1, "");
                              lista2.removeAll(Collections.singleton(""));
                            }
                        }
                    }
                    while (lista.contains("-")) {                        
                        for (int i = 0; i < lista2.size(); i++) {
                            if ("*".equals(lista2.get(i))){
                              double factor1 =Double.parseDouble(lista2.get(i-1));
                              double factor2=Double.parseDouble(lista2.get(i+1));
                              lista2.set(i, (factor1-factor2+""));
                              lista2.set(i-1, "");
                              lista2.set(i+1, "");
                              lista2.removeAll(Collections.singleton(""));
                            }
                        }
                    }
                }
                jTextField.setText(lista2.get(0));

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
