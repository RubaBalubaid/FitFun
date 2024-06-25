/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fitfun;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 *
 * @author ACER
 */
@Entity
@Table(name="children")
public class children implements java.io.Serializable{
    
     @Id
     @Column(name="children_id")
     private int id;
     @Column(name="FName")
     private String firstName;
     @Column(name="LName")
     private String lastName;
     @Column(name="age")
     private String age;
     @Column(name="health_statue")
     private String healthStatue;

    public children() {
    }

    public children(int id, String firstName, String lastName, String age, String healthStatue) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.healthStatue = healthStatue;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

   

    public String getHealthStatue() {
        return healthStatue;
    }

    public void setHealthStatue(String healthStatue) {
        this.healthStatue = healthStatue;
    }    
    
}
