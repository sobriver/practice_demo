//package com.example.practice_demo.es.service;
//import com.example.practice_demo.es.entity.PersonEntity;
//import org.apache.commons.lang3.RandomStringUtils;
//import org.apache.commons.lang3.RandomUtils;
//import org.elasticsearch.common.unit.Fuzziness;
//import org.elasticsearch.index.query.QueryBuilder;
//import org.elasticsearch.index.query.QueryBuilders;
//import org.elasticsearch.search.builder.SearchSourceBuilder;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import javax.annotation.Resource;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import static org.junit.Assert.*;
//
//@SpringBootTest
//@RunWith(SpringRunner.class)
//public class PersonServiceTest {
//
//    @Resource
//    private PersonService personService;
//
//    @Test
//    public void testInsert(){
//        PersonEntity entity = new PersonEntity();
//        entity.setId(1000L);
//        entity.setName("huangyu");
//        entity.setAddress("New York");
//        entity.setAge(23);
//        entity.setEmail("jishsu@gmail.com");
//        entity.setPhone("16798985430");
//        entity.setExt("ext for other");
//
//        personService.insert(entity);
//    }
//
//    @Test
//    public void testBatchInsert(){
//        List<PersonEntity> list = new ArrayList<>();
//        for (long i = 600000; i < 1000000; i++){
//            PersonEntity entity = new PersonEntity();
//            int s = RandomUtils.nextInt(2, 10);
//            entity.setId(i);
//            entity.setName(RandomStringUtils.randomAscii(s));
//            entity.setAddress("HuangShi");
//            entity.setAge(s);
//            list.add(entity);
//        }
//        System.out.println("------------开始插入-------------");
//        personService.batchInsert(list);
//    }
//
//    @Test
//    public void testQuery() {
//        QueryBuilder queryBuilder = QueryBuilders
//                .matchQuery("name", "Rob")
//                .fuzziness(Fuzziness.AUTO);
//
//        SearchSourceBuilder searchBuilder = new SearchSourceBuilder();
//        searchBuilder.query(queryBuilder);
//
//        long start = System.currentTimeMillis();
//        List<PersonEntity> list = personService.search(searchBuilder);
//        long s = (System.currentTimeMillis() - start) / 1000;
//        System.out.println("time===============" + s);
//        System.out.println("list.size==========" + list.size());
//        list.forEach(System.out::println);
//    }
//
//}