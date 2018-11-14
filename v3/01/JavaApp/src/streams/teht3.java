/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streams;

import java.util.*;
import java.util.stream.Stream;

/**
 *
 * @author Asse
 */
public class teht3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Stream<Integer> stream = Stream.generate(() -> (int)(Math.random() * ((6 - 1) + 1)) + 1).limit(20);
        
        int[] arr = stream.mapToInt(x -> x).toArray();
        
        System.out.println("Generated numbers" + Arrays.toString(arr));
        
        
        // ää en tiiä apuva
        long num = Stream.of(arr).filter(val -> val == 6).count();
        
        System.out.println("of which " + num + " were number 6");
    }
    
}
