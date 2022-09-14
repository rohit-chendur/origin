package com.sonata.Registration.Controller;





import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;



import jakarta.servlet.RequestDispatcher;

import com.sonata.Registration.DAO.CustomerDAO;
import com.sonata.Registration.Model.CustomerBean;



/**
* Servlet implementation class CustomerServlet
*/
@WebServlet("/register")
public class CustomerServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    
    private CustomerDAO customerDao = new CustomerDAO();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CustomerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }



   /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        response.getWriter().append("Served at: ").append(request.getContextPath());
        
        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/customerRegister.jsp");
        dispatcher.forward(request, response);
    }



   /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        String Name = request.getParameter("Name");
        String Email = request.getParameter("Email");
        String Phno = request.getParameter("Phno");
        String pass= request.getParameter("Pass");

        
        CustomerBean customer = new CustomerBean();
        customer.setCustName(Name);
        customer.setCustEmail(Email);
        customer.setCustPhno(Phno);
        customer.setCustPass(pass);

        
        try {
        
        customerDao.registerEmployee(customer);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        
        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/customerDetails.jsp");
        dispatcher.forward(request, response);
    }



}