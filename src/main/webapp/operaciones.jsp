<%-- 
    Document   : operaciones
    Created on : 14/02/2021, 03:11:48 AM
    Author     : fernando
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml"
    xmlns:p="http://primefaces.org/ui"
    xmlns:h="http://xmlns.jcp.org/jsf/html"
    >
   
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Operaciones</title>
    </head>
    <body>
        <h1>operaciones</h1>
        <form action="operaciones.jsp" method="GET">
            <h4> Ingrese Primer numero </h4>
            <input  id="num1"type="text" name="num1" value="0">
            <h4> Ingrese Segundo numero </h4>
            <input  id="num2"type="text" name="num2" value="0">
             <br>   
                  <br>
            <label for="lista">Elegir operacion</label>   
            <select id="operar" name="operaciones" id="operaciones"> 
                <<option value="1">suma</option>
                <<option value="2">resta</option>
                <<option value="3">multiplicacion</option>
                <<option value="4">division</option>
            </select>   
            
                <br>
                <br>
                    <input id="ejecutar" type="submit" value="Ejecutar">
            
        </form>
        
        <%
            if(request.getParameter("num1")!=null && request.getParameter("num2")!=null){
                int num1=0;
                int num2=0;
                int op=0;
                int resultado=0;
                
                num1=Integer.parseInt(request.getParameter("num1"));
                num2=Integer.parseInt(request.getParameter("num2"));
                op=Integer.parseInt(request.getParameter("operaciones"));
               // int resta=num1-num2;
               switch(op){
                   case 1:
                       resultado=num1+num2;
                       break;
                   case 2:
                       resultado=num1-num2;
                       break;
                   case 3: 
                       resultado=num1*num2;
                       break;
                   case 4: 
                       resultado=num1/num2;
                       break;
                   
               }
              
                
                out.println("Resultado: "+resultado);
            }else{
                out.println("Casillas vacias");
            }
         %>
        
    </body>
</html>
