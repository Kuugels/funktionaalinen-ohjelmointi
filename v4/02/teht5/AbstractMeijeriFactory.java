/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viikko4.teht5;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

/**
 *
 * @author Asse
 */
public class AbstractMeijeriFactory {

    Map<String, Supplier<Tuote>> map;

    public AbstractMeijeriFactory() {
        map = new HashMap<>();
    }

    public Tuote getTuote(String tuoteTyyppi) {
        Supplier<Tuote> shape = map.get(tuoteTyyppi.toUpperCase());
        if (shape != null) {
            return shape.get();
        }
        throw new IllegalArgumentException("No such TUATE KJEH RÖH RÄH " + tuoteTyyppi.toUpperCase());
    }
}
