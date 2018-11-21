/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viikko4.teht5;

/**
 *
 * @author Asse
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        AbstractMeijeriFactory factory = new Vahalaktoosinen();
        
        Tuote maito = factory.getTuote("MAITO");
        Tuote juusto = factory.getTuote("Juusto");
        Tuote jugurtti = factory.getTuote("Jugurtti");
        
        maito.moi();
        jugurtti.moi();
        juusto.moi();
        
        System.out.println("-------------------------------------------------------------------------");
        
        factory = new Laktoositon();
        
        maito = factory.getTuote("MAITO");
        juusto = factory.getTuote("Juusto");
        jugurtti = factory.getTuote("Jugurtti");
        
        maito.moi();
        jugurtti.moi();
        juusto.moi();
    }
    
}
