package com.example.practice_demo.multi;

import com.example.practice_demo.test.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ManServiceImplTest {

    @Resource(name = "womanService")
    private PersonService personService;

    @Test
    public void test() {
        personService.print();
    }
}