package edu.escuelaing.arem.ASE.app;

/**
 * Hello world!
 *
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class App 
{
    public static Mean mean = new Mean();
    public static standardDeviation standard = new standardDeviation();
    
    public static void main( String[] args ) throws FileNotFoundException
    {
        File file = new File("numbers.txt");   
        Scanner scanner = new Scanner(file);
        LinkedList lista = new LinkedList();
        while (scanner.hasNext()) {
            if (scanner.hasNextDouble()) {
                lista.add(scanner.nextDouble());
            } 
            else {
                scanner.next();
            }
        }
        double average = mean.mean(lista);
        double standardD = standard.standardD(lista);
        System.out.println("Mean: " + average);
        System.out.println("Standard deviation: " + standardD);
    }
}
