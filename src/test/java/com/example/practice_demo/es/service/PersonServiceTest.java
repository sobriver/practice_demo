package com.example.practice_demo.es.service;

import com.example.practice_demo.es.entity.PersonEntity;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

@SpringBootTest
@RunWith(SpringRunner.class)
public class PersonServiceTest {

    @Resource
    private PersonService personService;

    @Test
    public void insert() {
        PersonEntity entity = new PersonEntity();
        entity.setName("huang");
        personService.insert(entity);
    }

}