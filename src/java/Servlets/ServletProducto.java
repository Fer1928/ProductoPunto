/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author unaPuta
 */
@WebServlet(name = "ServletProducto", urlPatterns = {"/ServletProducto"})
public class ServletProducto extends HttpServlet {

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
      int num1;
   int num2;
   int num3;
   int num4;

   num1 = Integer.parseInt(request.getParameter("i1"));
     num2 = Integer.parseInt(request.getParameter("j1"));
     num3 = Integer.parseInt(request.getParameter("i2"));
     num4 = Integer.parseInt(request.getParameter("j2"));
     
      float valorT = calcula(num1, num2, num3, num4);
         
        
        response.setContentType("text/html");
 
        out.println("<html>");
        out.println("<head><title>Producto Punto</title></head>");
        out.println("<body>");
        out.println("<h1><center>("+num1+")*("+num3+")+ ("+num2+")*("+num4+")</center></h1>");
        out.println("<h1><center>Resultado = "+valorT +"</center></h1>");
        out.println("</body></html>");
        out.close();
     
    }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
   
    
        }
   
    public float calcula(int uno, int unoo, int dos, int doos){
        float resultado=0;
        
        float primero = uno * dos;
        float segundo = unoo * doos;
        
        resultado = primero + segundo;
        
        
        return resultado;
    }
    

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
