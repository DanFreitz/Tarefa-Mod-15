package br.com.danfreitz;

/**
 * @author Danfreitz
 */

public class SemContratosFactory extends Factory{

    @Override
    Car retriveCar(String requestedGrade) {
        if (requestedGrade.equals("A")) {
            return new Bmw( 100 , "cheio",  "preto");
        } else {
            return null;
        }
    }
}