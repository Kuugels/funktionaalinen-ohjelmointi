/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viikko4.teht6;

/**
 *
 * @author Asse
 */
public class Merkkijono {
    
    private String merkkijono;
    private boolean kasitelty;
    
    public Merkkijono(String merkkijono) {
        this.merkkijono = merkkijono;
        this.kasitelty = false;
    }

    public String getMerkkijono() {
        return merkkijono;
    }

    public void setMerkkijono(String merkkijono) {
        this.merkkijono = merkkijono;
    }
    
    public void setKasitelty(boolean k) {
        this.kasitelty = k;
    }
    
    public boolean isKasitelty() {
        return this.kasitelty;
    }
    
    
}
