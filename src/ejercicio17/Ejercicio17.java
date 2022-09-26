/*
 Una empresa que se dedica a la venta de desinfectantes necesita un programa para gestionar las facturas.
En cada factura figura: el código del artículo, la cantidad vendida en litros y el precio por litro. Se 
pide de 5 facturas introducidas: facturación total, cantidad en litros vendidos de artículo 1 y cuántas 
facturas se emitieron de más de $600.
 */
package ejercicio17;

import javax.swing.JOptionPane;

/**
 *
 * @author Carolina EM
 */
public class Ejercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int codigo,litros,litrosArticulo1=0,conteoMas600=0;
        float precioLitro,importeFactura,facturacionTotal=0;
        
        for (int i=1;i<=5;i++){
            codigo=Integer.parseInt(JOptionPane.showInputDialog("Articulo N°"+i+"\nDigite el código:"));
            litros=Integer.parseInt(JOptionPane.showInputDialog("Articulo N°"+i+"\nDigite la cantidad en litros:"));
            precioLitro= Float.parseFloat(JOptionPane.showInputDialog("Articulo N°"+i+"\nDigite el precio por litro:"));
            
            
            importeFactura= (float) litros*precioLitro; //importe por factura
            facturacionTotal += importeFactura; //suma iterativa de la factura
            
            
            if (codigo ==1){
                litrosArticulo1 += litros;
            }
            if (importeFactura > 600){
                conteoMas600++;
            }   
        }
        
        System.out.println("Resumen de ventas");
        System.out.println("Facturación Total:" +facturacionTotal);
        System.out.println("Cantidad de litros vendidos del artículo 1:" +litrosArticulo1);
        System.out.println("Cantidad de facturas mayores a $600: "+conteoMas600);
    }
    
}
