/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clone;

/**
 *
 * @author ahmed
 */
public class Ahmed implements Cloneable{
    
    int id;
    String f_name;
    String last_name;
    
    public Ahmed(int id ,String f_name, String last_name){
        super();
        this.id=id;
        this.f_name=f_name;
        this.last_name=last_name;   
    }
    
    ///colne
    
    public Object clone() throws CloneNotSupportedException {
     
        return super.clone();
    }
    
}
