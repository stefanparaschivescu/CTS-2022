package com.stefan.cts.strategy.main;

import com.stefan.cts.strategy.clase.PlataCardSTB;
import com.stefan.cts.strategy.clase.Validator;

public class Main {
    public static void main(String[] args) {
        PlataCardSTB plataCardSTB = new PlataCardSTB();
        Validator validator = new Validator(plataCardSTB, 3);

        validator.platesteCalatorie();
    }
}
