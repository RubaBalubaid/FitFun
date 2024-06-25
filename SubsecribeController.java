/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fitfun;

import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * FXML Controller class
 *
 * @author ACER
 */
public class SubsecribeController implements Initializable {

    @FXML
    private DatePicker date;
    @FXML
    private Button display;
    @FXML
    private Button back;
    @FXML
    private TextField FName;
    @FXML
    private TextField LName;
    @FXML
    private TextField age;
    @FXML
    private TextField healthStatus;

    /**
     * Initializes the controller class.
     */
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void dateAction(ActionEvent event) {
        
    }

    @FXML
    private void displayInfo(ActionEvent event) {
        
    
        int count =1;
         if(FName.getText().isEmpty() || LName.getText().isEmpty() || age.getText().isEmpty() || healthStatus.getText().isEmpty()){
                System.out.println("Make sure to fill out all fields");           
            }else{
                children ch1 = new children();
                Session ss = HibernateUtil.getSessionFactory().openSession();
                Transaction tt = ss.beginTransaction();
               
                
                ch1.setFirstName(FName.getText());
                ch1.setLastName(LName.getText());
                ch1.setAge(age.getText());
                ch1.setHealthStatue(healthStatus.getText());
                ch1.setId(count);
                
                count++;
                 
                 
                int chId1 = (Integer)ss.save(ch1);        
                
                tt.commit();
                ss.close();  
                
                
}
         
    }

    @FXML
    private void backAction(ActionEvent event) {
    }
    
}
