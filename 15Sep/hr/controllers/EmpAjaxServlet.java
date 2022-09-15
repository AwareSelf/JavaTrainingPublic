package hr.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import hr.model.Employee;

/**
 * Servlet implementation class EmpServlet
 */
@WebServlet("/EmpAjaxServlet")
public class EmpAjaxServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmpAjaxServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		double empsal = -1;
		int empid = -1;
		
		String empidstr = request.getParameter("empid");
		
		if(empidstr!=null)
		{
		   empid = Integer.parseInt(empidstr);
		}
		
		String ename = request.getParameter("empname");
		String empsalstr = request.getParameter("empsalary");
		
		if(empsalstr!=null)
		{
			 empsal = Double.parseDouble(empsalstr);
		}
		
		//call a business method
		boolean res = eligibleForVariablePay(empid,ename,empsal);
		String empjson = null;
		 empjson = "{\"empid\":"+ empid+",\"name\":"+ename+",\"salary\":"+empsal+"}";
		
		 
		 PrintWriter pw = response.getWriter();
		 
		 response.setContentType("text/html");
		 
		
		
		if(res)
		{
		    pw.println(empjson);
		   pw.println(" emp is eligible for variable pay..");
		     
		  
			
		}
		else
		{  
			   pw.println(empjson);
			    pw.println(" emp is not eligible for variable pay..");
		}
		
		
		pw.close();
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	//business method
	String greetUser(String name,String welcomemsg)
	{
		//ideally it should create instance of model and call some method on it to get data
		//then process it and return it from this business logic method
	    return welcomemsg +" "+name;	
	}
	
	//business method
	boolean eligibleForVariablePay(int empid,String ename,double salary)
	{
		//access a model class and create object and call methods on it to get the data
		Employee e = new Employee(empid,ename,salary);
		
		double annsal = e.calcAnnSalary();
		
		if(annsal > 500000)
		{
		   	return true;
		}
		else
		{
			return false;
		}
		
		
	}

}
