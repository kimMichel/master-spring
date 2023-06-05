package com.example.main;

import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example1 {

    public static void main(String[] args) {
        /*
        The var keyword was introduced in Java 10. Type inference is used in
        var keyword in which it detects automatically the datatype of a variable
        based on the surrounding context.
        * */
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Vehicle veh1 = context.getBean("vehicle1",Vehicle.class);
        System.out.println("Vehicle name from Spring Context is: " + veh1.getName());

        Vehicle veh2 = context.getBean("vehicle2",Vehicle.class);
        System.out.println("Vehicle name from Spring Context is: " + veh2.getName());

        Vehicle veh3 = context.getBean("vehicle3",Vehicle.class);
        System.out.println("Vehicle name from Springa Context is: " + veh3.getName());
    }
}