package controllers;

import play.mvc.*;

import play.api.Environment;
import play.data.*;
import play.db.ebean.Transactional;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;

import com.sun.corba.se.spi.activation._ActivatorImplBase;

import models.*;
import views.html.*;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    private FormFactory formFactory;

    @Inject
    public HomeController(FormFactory f){
        this.formFactory = f;
    }

    public Result index() {

        List<Product> productList = Product.finalAll();

        return ok(index.render(productList));
    }

    public Result customer() {
        
       List<Customer> customerList = Customer.finalAll();
        
       return ok(customer.render(customerList));
    }

    public Result addProduct(){

        Form<Product> productForm = formFactory.form(Product.class);

        return ok(addProduct.render(productForm));
    }

    
    public Result addProductSubmit() {

       Form<Product> newProductForm = formFactory.form(Product.class).bindFromRequest(); 

       if(newProductForm.hasErrors()){
           return badRequest(addProduct.render(newProductForm));    
       }
       else
       {
           Product newProduct = newProductForm.get();

           if(newProduct.getId() == null){
               newProduct.save();
               flash("success", "Product" + newProduct.getName() + "was added");
           }
           else if (newProduct.getId() != null)
           {
               newProduct.update();
               flash("success", "Product" + newProduct.getName() + "was updated");
           }

           

           return redirect(controllers.routes.HomeController.index());
       }
    }

    public Result addCustomer(){
        
                Form<Customer> customerForm = formFactory.form(Customer.class);
        
                return ok(addCustomer.render(customerForm));
            }
    
    public Result addCustomerSubmit() {

       Form<Customer> newCustomerForm = formFactory.form(Customer.class).bindFromRequest(); 


       if(newCustomerForm.hasErrors()){

        return badRequest(addCustomer.render(newCustomerForm));    
             }
              else
            {
            Customer newCustomer = newCustomerForm.get();

        if(newCustomer.getId() == null){
            newCustomer.save();
            flash("success", "Customer" + newCustomer.getName() + "was added");
        }
        else if (newCustomer.getId() != null)
        {
            newCustomer.update();
            flash("success", "Customer" + newCustomer.getName() + "was updated");
        }

           return redirect(controllers.routes.HomeController.customer());
       }
    }
    
    public Result deleteProduct(Long id){

        Product.find.ref(id).delete();

        flash("success", "Product has been deleted");

        return redirect(routes.HomeController.index());
    }

    public Result deleteCustomer(Long id){
        
            Customer.find.ref(id).delete();
        
            flash("success", "Customer has been deleted");
    
            return redirect(routes.HomeController.customer());
    }

    @Transactional
    public Result updateProduct(Long id){
     
        Product p;
        Form<Product> productForm;

        try{
            p = Product.find.byId(id);
            productForm = formFactory.form(Product.class).fill(p);
        } catch(Exception ex){
            return badRequest("error");
        }

        return ok(addProduct.render(productForm));

    }

    @Transactional
    public Result updateCustomer(Long id){
     
        Customer c;
        Form<Customer> customerForm;

        try{
            c = Customer.find.byId(id);
            customerForm = formFactory.form(Customer.class).fill(c);
        } catch(Exception ex){
            return badRequest("error");
        }

        return ok(addCustomer.render(customerForm));

    }
}
