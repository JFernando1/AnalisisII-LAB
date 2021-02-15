/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.enterprise.inject.New;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;

import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.inject.Named;

/**
 *
 * @author fernando
 */
@Named
@RequestScoped
@ManagedBean
@SessionScoped
public class operaciones {

private Double num1;
private Double num2;
private Double num3;
private Double num4;
private Double resp;

@PostConstruct
public void init(){
    num1=0.0;
    num2=0.0;
    num3=0.0;
    num4=0.0;
    resp=0.0;
  
}

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
    
     public Double getResp() {
        return num2;
    }

    public void setResp(Double num2) {
        this.num2 = num2;
    }

    public void cresp(){
        
        this.resp=this.resp;
    }
   public void ejecutar(){
       
       FacesContext c = FacesContext.getCurrentInstance();
       c.addMessage("Respuesta", new FacesMessage("Operacion hecha", "el resultado es: "));
       System.out.println(num1);
       resp=num1+num2;
   }



}
