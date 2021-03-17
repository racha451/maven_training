package fr.lernejo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SampleTest {


    @Test
    void add() {

        int nbr1 =5 ;
        int nbr2 =5 ;

        Sample sample =new Sample();
        int somme = sample.op(Sample.Operation.ADD,nbr1,nbr2);

        Assertions.assertEquals(somme,10);

    }

    @Test
    void mult() {

        int nbr1 =5 ;
        int nbr2 =5 ;

        Sample sample =new Sample();
        int somme = sample.op(Sample.Operation.MULT,nbr1,nbr2);

        Assertions.assertEquals(somme,25);

    }
}
