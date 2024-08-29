package org.company.main;

import org.company.target.Target;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
//    public static void main(String[] args) {
//        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("aop.xml");
//        Target target = ac.getBean(Target.class);
//        target.add();
//        target.add(5);
//    }

    public static void main(String[] args) {
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("aop.xml");
        Target bean = ac.getBean(Target.class);
        bean.add();
        bean.add(2);
        System.out.println(bean);
        System.out.println(bean.getClass());
    }
}
