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
public class Vahalaktoosinen extends AbstractMeijeriFactory{

    public Vahalaktoosinen() {
        map.put("MAITO", VLMaito::new);
        map.put("JUUSTO", VLJuusto::new);
        map.put("JUGURTTI", VLJugurtti::new);
    }
    
}
