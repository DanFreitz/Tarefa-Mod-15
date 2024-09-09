package br.com.danfreitz;

import java.io.UncheckedIOException;

/**
 * @author Danfreitz
 */

public class ContratosFactory extends Factory {

    @Override
    Car retriveCar(String requestedGrade) {
        if ("A".equals(requestedGrade)) {
            return new Bmw( 100 , "cheio",  "preto");
        } else {
            return null;
        }
    }
}
