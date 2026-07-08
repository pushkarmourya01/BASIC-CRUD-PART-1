package in.strikes.crudSpringBootDemo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity // yeh annotation batata hai ki yeh class database ki table ke saath map hogi
public class Student {

    @Id // yeh field unique primary key ko represent karti hai
    @GeneratedValue(strategy = GenerationType.IDENTITY) // id database khud 1, 2, 3... generate karega
    private Long id;

    private String name;
    private int roll;
    private int age;
    private String subject;

    // id ka getter
    public Long getId() {
        return id;
    }

    // id ka setter
    public void setId(Long id) {
        this.id = id;
    }

    // roll ka getter
    public int getRoll() {
        return roll;
    }

    // roll ka setter
    public void setRoll(int roll) {
        this.roll = roll;
    }

    // name ka getter
    public String getName() {
        return name;
    }

    // name ka setter
    public void setName(String name) {
        this.name = name;
    }

    // age ka getter
    public int getAge() {
        return age;
    }

    // age ka setter
    public void setAge(int age) {
        this.age = age;
    }

    // subject ka getter
    public String getSubject() {
        return subject;
    }

    // subject ka setter
    public void setSubject(String subject) {
        this.subject = subject;
    }
}