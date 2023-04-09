/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package camisas;

import javax.swing.JOptionPane;

/**
 *
 * @author Ryzen
 */
public class Camisas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String prod1 = JOptionPane.showInputDialog("Ingrese el tipo de camisa que va a comprar");
        int vr1 = Integer.parseInt(JOptionPane.showInputDialog("Escriba el valor de la camisa "+ prod1));
        int cant1 = Integer.parseInt(JOptionPane.showInputDialog("La Cantidad de camisas "+ prod1));
        
        String prod2 = JOptionPane.showInputDialog("Ingrese el tipo de camisa que va a comprar");
        int vr2 = Integer.parseInt(JOptionPane.showInputDialog("Escriba el valor de la camisa "+ prod2));
        int cant2 = Integer.parseInt(JOptionPane.showInputDialog("La Cantidad de camisas "+ prod2));
        
        String prod3 = JOptionPane.showInputDialog("Ingrese el tipo de camisa que va a comprar");
        int vr3 = Integer.parseInt(JOptionPane.showInputDialog("Escriba el valor de la camisa "+ prod3));
        int cant3 = Integer.parseInt(JOptionPane.showInputDialog("La Cantidad de camisas "+ prod3));
        
        int subToP1 = vr1*cant1;
        int subToP2 = vr2*cant2;
        int subToP3 = vr3*cant3;
        
        int subTotalCompra = subToP1 + subToP2 + subToP3;
        
        double desc1 = subTotalCompra*.05;
        double totalxdesc1 = subTotalCompra - desc1;
        
        double desc2 = subTotalCompra*.08;
        double totalxdesc2 = subTotalCompra - desc2;
        
        JOptionPane.showMessageDialog(null, " Las camisas compradas fueron: \n "
        + "" + prod1+ "  Cantidad:  "+ cant1 + "  Valor Unidad: $ "+ vr1 + "= $" + subToP1+"\n"
        + "" + prod2+ "  Cantidad:  "+ cant2 + "  Valor Unidad: $ "+ vr2 + "= $" + subToP2+"\n"
        + "" + prod1+ "  Cantidad:  "+ cant3 + "  Valor Unidad: $ "+ vr3 + "= $" + subToP3+"\n"
        +"Compra sin descuento(si solo compro 1 o 2 camisas) $:"+ subTotalCompra+"\n"
        +"Total con Descuento si compro entre 3 y 5:   $"+ totalxdesc1+"\n"
        +"Total con Descuento si compro 5 o más camisas(ignorar si no lo hizo):   $"+ totalxdesc2+"\n");
        System.exit(0);
        
            
        }
}
    
