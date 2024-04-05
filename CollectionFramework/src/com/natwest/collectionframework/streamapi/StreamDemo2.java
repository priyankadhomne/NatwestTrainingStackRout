package com.natwest.collectionframework.streamapi;

import com.natwest.collectionframework.Employee;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemo2 {
    public static void main(String[] args) {
        ArrayList<Employee> employees1 = new ArrayList<>();
        employees1.add(new Employee(1,"Ram","C & I",21,70000));
        employees1.add(new Employee(3,"Meena","Tech",23,60000));
        employees1.add(new Employee(2,"Trisha","Finance",20,70000));

         // display only HR department only
        employees1.stream().filter(i->i.getDept().equals("Tech")).forEach(j-> System.out.println(j)); //or forEach(system.out::println);

        // count for Tech
        int c = (int)employees1.stream().filter(j->j.getDept().equals("Tech")).count();
        System.out.println(c);

        // Increase the salary 5%
        employees1.stream().filter(i->i.getDept().equals("Tech")).map(e->e+" "+ e.getSalary()+ (e.getSalary()*0.05)).forEach(System.out::println);

        // age greater than 20
        employees1.stream().filter(m->m.getAge()>20).forEach(System.out::println);
        List<Employee> s = employees1.stream().filter(m->m.getAge()>20).collect(Collectors.toList());
        s.stream().forEach(System.out::println);

        // It will give output of every input (Map);

        // uppercase
        employees1.stream().map(e->e.getName().toUpperCase()).forEach(System.out::println);
        System.out.println("----------------------------");

        // "Tech" give me name
        employees1.stream().filter(r->r.getDept().equals("Tech")).map(t->t.getName()).forEach(System.out::println);

        System.out.println("----------");
        //sorting the employee by age
        employees1.stream().sorted(Comparator.comparingInt(Employee::getAge)).forEach(System.out::println);
        System.out.println("----------------");
        // sorting employee salary
        employees1.stream().sorted(Comparator.comparingDouble(Employee::getSalary).thenComparing(Employee::getName)).forEach(System.out::println);
        System.out.println("----------------");

        // sorting salary (reverse)
        employees1.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).forEach(System.out::println);

        System.out.println("-------");
        // compare multiple value
        employees1.stream().sorted((a,b)->{
            if (a.getAge()>b.getAge())
                return 1;
            else if (a.getAge()<b.getAge())
                return -1;
            return 0;
        }).forEach(System.out::println);
    }
}
