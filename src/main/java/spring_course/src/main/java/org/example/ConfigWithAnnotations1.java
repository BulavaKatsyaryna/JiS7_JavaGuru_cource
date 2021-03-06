package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfigWithAnnotations1 {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx =
                new ClassPathXmlApplicationContext("applicationContext3.xml");

        Person person = ctx.getBean("personBean", Person.class);
        person.callYourPet();

        System.out.println(person.getSurname());
        System.out.println(person.getAge());

//        Cat myCat = ctx.getBean("cat", Cat.class);
//        myCat.say();

        ctx.close();
    }
}
