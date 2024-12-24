package org.artemyakkonen.spring.rest;

import org.artemyakkonen.spring.rest.configuration.MyConfig;
import org.artemyakkonen.spring.rest.entity.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        Communication communication = context.getBean("communication", Communication.class);
//        List<Employee> allEmployees = communication.getAllEmployees();
//        System.out.println(allEmployees);
//        Employee empById = communication.getEmployee(8);
//        System.out.println(empById);

//        Employee employee = new Employee("Sveta", "Sokolova", "NoDepartment", 111);
//        employee.setId(9);
//        communication.saveEmployee(employee);

        communication.deleteEmployee(9);
    }
}
