package models;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;


@Entity
public class Customer extends Model{

    @Id
    private Long id;

    @Constraints.Required
    private String name;

    @Constraints.Required
    private String address;

    @Constraints.Required
    private String phone;

    public Customer(){

    }

    public Customer(Long id, String name, String address, String phone){
          this.id = id;
          this.name = name;
          this.address = address;
          this.phone = phone;        
    }

    public static final Finder<Long, Customer> find = new Finder<>(Customer.class);

    public static final List<Customer> finalAll(){
        return Customer.find.all();
    }

    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getAddress(){
        return address;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public String getPhone(){
        return phone;
    }

    public void setPhone(String phone){
        this.phone = phone;
    }


}