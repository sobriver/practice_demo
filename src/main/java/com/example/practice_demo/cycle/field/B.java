package com.example.practice_demo.cycle.field;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

//@Service
//@Scope("prototype")
public class B {
    @Autowired
    private C c;
}
