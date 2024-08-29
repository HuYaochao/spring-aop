package org.company.target;

import org.springframework.stereotype.Component;

@Component
public class Target {
    public void add(){
        System.out.println("add,success无参");
    }

    public int add(int a){
        System.out.println("add,success有参");
        return a;
    }

}
