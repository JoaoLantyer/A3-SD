/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.laboratorio;

import java.util.*;
import java.text.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Vendedor extends Tipo {
    public Vendedor(String porta, String nome) {
        super(porta, nome);
    }

    public void run() {
        try {
            DateFormat df = new SimpleDateFormat ("dd/MM/yyyy");
            ArrayList<Date> datas = new ArrayList<>();
            Date dt1 = df.parse ("01/01/2023");
            Date dt2 = df.parse ("31/12/2023");
            Calendar cal1 = Calendar.getInstance();
            cal1.setTime (dt1);
            Calendar cal2 = Calendar.getInstance();
            cal2.setTime (dt2);
            for (Calendar cal = cal1; cal.compareTo (cal2) <= 0; cal.add (Calendar.DATE, 1)) {
                System.out.println (df.format (cal.getTime()));
                Date data = (cal.getTime());
                int quantidade = (int) (Math.random() * 100) + 1;
                System.out.println(quantidade);
            }
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

        while (true) {
            try{
                System.out.println("Acordei!");
                Thread.sleep(1000 * 60);
            } catch (InterruptedException ex) {
                Logger.getLogger(MultiPrograma.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
