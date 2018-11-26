/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viikko4.teht6;

import java.util.function.Function;
import java.util.function.UnaryOperator;

/**
 *
 * @author Asse
 */
public class KasittelijaChain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        UnaryOperator<Merkkijono> valilyonti = 
                (Merkkijono m) ->
                {
                    if (!m.isKasitelty() && m.getMerkkijono().contains(" ")) {
                        System.out.println("Välilyönnit korjattu");
                        m.setMerkkijono(m.getMerkkijono().replace(" ", ""));
                        m.setKasitelty(true);
                    }
                    return m;
                };
        
        UnaryOperator<Merkkijono> skandit = 
                (Merkkijono m) ->
                {
                    if (!m.isKasitelty() && m.getMerkkijono().contains("ä")) {
                        System.out.println("Skandit korjattu");
                        m.setMerkkijono(m.getMerkkijono().replace("ä", "a"));
                        m.setKasitelty(true);
                    }
                    if (!m.isKasitelty() && m.getMerkkijono().contains("Ä")) {
                        System.out.println("Skandit korjattu");
                        m.setMerkkijono(m.getMerkkijono().replace("Ä", "A"));
                        m.setKasitelty(true);
                    }
                    if (!m.isKasitelty() && m.getMerkkijono().contains("ö")) {
                        System.out.println("Skandit korjattu");
                        m.setMerkkijono(m.getMerkkijono().replace("ö", "o"));
                        m.setKasitelty(true);
                    }
                    if (!m.isKasitelty() && m.getMerkkijono().contains("Ö")) {
                        System.out.println("Skandit korjattu");
                        m.setMerkkijono(m.getMerkkijono().replace("Ö", "O"));
                        m.setKasitelty(true);
                    }
                    return m;
                };
                
        UnaryOperator<Merkkijono> typo = 
                (Merkkijono m) ->
                {
                    if (m.getMerkkijono().contains("sturct")) {
                        System.out.println("Typot korjattu");
                        m.setMerkkijono(m.getMerkkijono().replace("sturct", "struct"));
                        m.setKasitelty(true);
                    }
                    return m;
                };

        
        Function<Merkkijono, Merkkijono> ketju = valilyonti.andThen(skandit).andThen(typo);
        String juttu = "Heipä hei MöröKÖllit   hirveitä ja sturct on hassu SANA";
        Merkkijono m = new Merkkijono(juttu);
        
        m = ketju.apply(m);
        System.out.println(m.getMerkkijono());
        
    }
    
}
