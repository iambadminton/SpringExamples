package com.mkyong.common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    /* variant1

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Spring-Module.xml");
        HelloWorld obj = (HelloWorld)applicationContext.getBean("helloBean");
        obj.printHello();
    }
    */

    /* variant 2
    public static void main(String[] args) {
        IOutputGenerator output = new CsvOutputGenerator();
        output.generateOutput();

    }
    */
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Module.xml");
        OutputHelper output = (OutputHelper)context.getBean("OutputHelper");
        output.generateOutput();
    }
}
