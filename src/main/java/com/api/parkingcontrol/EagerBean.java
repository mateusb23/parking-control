package com.api.parkingcontrol;

import org.springframework.data.repository.cdi.Eager;
import org.springframework.stereotype.Component;

@Component
@Eager
public class EagerBean {

    public EagerBean() {
        System.out.println("EagerBean started!!!");
    }

}
