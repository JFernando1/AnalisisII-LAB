/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import java.io.Serializable;
import javax.inject.Named;

import javax.enterprise.context.SessionScoped;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;





/**
 *
 * @author fernando
 */
@Named(value = "bean")
//@Dependent
@SessionScoped
//@RequestScoped
public class Bean implements Serializable{

    /**
     * Creates a new instance of Bean
     */
 
 
    
    private Double num1;
    private Double num2;
    private Double resultado;
    private String operacion;
    
    @Test
    public String getOperacion() {
        return operacion;
    }
    
    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }
    
    
    public Bean() {
        num1=0.0;
        num2=0.0;
        resultado=0.0;
    }
    @AfterTest
    public Double getNum1() {
        return num1;
    }

    public void setNum1(Double num1) {
        this.num1 = num1;
    }

    public Double getNum2() {
        return num2;
    }

    public void setNum2(Double num2) {
        this.num2 = num2;
    }

    public Double getResultado() {
        return resultado;
    }
    @Test
    public void setResultado(Double resultado) {
        this.resultado = resultado;
    }

   
    
    
   @Test
    public void ejecutar(){
        
        if(operacion!=null && !operacion.equals("")){
            switch(operacion){
                case "Multiplicar": this.resultado=num1*num2;
                                    break;
                case "Dividir": this.resultado=num1/num2;
                                    break;
                case "Sumar": this.resultado=num1+num2;
                                    break;
                case "Restar": this.resultado=num1-num2;
                                    break;
            }
        }
        

        System.out.println(resultado);
    }
   
    
    
    
}
