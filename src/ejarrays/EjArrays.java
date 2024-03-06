/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejarrays;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author coromoro
 */
public class EjArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Aprendiz> listaAprendiz = new ArrayList<Aprendiz>();
        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < 1; i++) {
            Aprendiz miAprendiz = new Aprendiz();
            miAprendiz.setId(i);
            System.out.println("ingrese el nombre del aprendiz");
            miAprendiz.setNombre(teclado.next());
            System.out.println("ingrese la nota uno");
            miAprendiz.setN1(teclado.nextInt());
            System.out.println("ingrese la segunda nota");
            miAprendiz.setN2(teclado.nextInt());
            System.out.println("ingrese la tercera nota");
            miAprendiz.setN3(teclado.nextInt());

            listaAprendiz.add(miAprendiz);
        }
        System.out.println("Imprimiendo los aprendices de la lista");
        for (Aprendiz var : listaAprendiz) {
            System.out.println(var.getNombre()+" sus notas son : "+ var.getN1()+ var.getN2()+var.getN3()+" el promedio es :"+( var.getN1()+ var.getN2()+var.getN3())/3);
        }
        
        
    }
}
