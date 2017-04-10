package Databases;



/**
 * Created by Павел on 18.10.2016.
 */
public class Product  {
    private int id;
    private String answers;



   public Product(){}


   public Product(String answers){
       this.answers = answers;
   }
    public String toString(){
        return answers;
    }
}
