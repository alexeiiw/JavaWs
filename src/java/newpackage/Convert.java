/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.util.ArrayList;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Alex
 */
@WebService(serviceName = "Convert")
public class Convert {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
    
    @WebMethod(operationName = "FahrenheitToCelsius")
    public double FahrenheitToCelsius(double Fahrenheit){
        return ((Fahrenheit -32) * 5) / 9;
    }
    
    @WebMethod(operationName = "CelsiusToFAhrenheit")
    public double CelsiusToFahrenheit(double Celsius){
        return ((Celsius * 9 ) / 5) +32;
    }
    
    @WebMethod(operationName = "Cliente")
    public ArrayList<String> Cliente(int Codigo) {
        // Declaramos el arreglo
        ArrayList<String> obj = new ArrayList<String>();
        obj.add("Alex");
        obj.add("Garcia");
        obj.add("20202020");
        obj.add("Ciudad de Guatemala");
        
        return obj;
    }
}
