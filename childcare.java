/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fitfun;

/**
 *
 * @author ACER
 */
import javafx.scene.control.DatePicker;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="childcare")
public class childcare {

   
    
    @Id
     @Column(name="childcare_id")
     private int id;
     @Column(name="date")
     private DatePicker date;
     @Column(name="cost")
     private int cost;

     
    public childcare() {
    }

    public childcare(int id, DatePicker date, int cost) {
        this.id = id;
        this.date = date;
        this.cost = cost;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public DatePicker getDate() {
        return date;
    }

    public void setDate(DatePicker date) {
        this.date = date;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    
    
}
