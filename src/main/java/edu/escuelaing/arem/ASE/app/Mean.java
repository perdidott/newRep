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
public class Mean {
    double suma = 0;
    public double mean(LinkedList lista){
        for (int i = 0; i < lista.size(); i++){
            Double valor = (Double)lista.get(i);
            suma += valor;
        }
        return suma/lista.size();
    }
}
