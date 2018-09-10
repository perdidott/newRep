/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.arem.ASE.app;
import java.util.*;
/**
 *
 * @author 2114816
 */
public class standardDeviation {
    Mean mean = new Mean();
    
    public double standardD(LinkedList lista){
        long suma = 0;
        double avg = mean.mean(lista);
        for (int i = 0; i < lista.size(); i++){
            Double valor = (Double)lista.get(i);
            suma += Math.pow(valor-avg,2);
        }
        return Math.sqrt(suma/(lista.size()-1));
    }
}
