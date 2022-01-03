package com.tyranotyrano.creational.builder.v3;

import com.tyranotyrano.creational.builder.v3.product.Person;

public class BuilderV3Main {

    public static void main(String[] args) {
        Person person = Person.builder()
                              .name("홍길동")
                              .age(20)
                              .height(185)
                              .weight(75)
                              .phone("01012345678")
                              .isMale(true)
                              .build();
        System.out.println(person);
    }
}
