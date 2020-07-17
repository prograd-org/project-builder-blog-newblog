package controller;

import java.io.IOException;
import java.time.LocalDate;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Blog;
import model.User;




@WebServlet(urlPatterns= {"/blog"})
public class BlogController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public BlogController() {
        super();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/WEB-INF/views/blogView.jsp");
		rd.forward(request, response);
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String blogDetails = request.getParameter("selectedAnswers");
	   
		String string[]=blogDetails.split(",");
		String blogtitle=string[0];
	    String blogdescription=string[1];
	    LocalDate date= LocalDate.now();
	    
		Blog blog=new Blog(blogtitle, blogdescription,date);
		
		
		 blog.setTitle(blogtitle);
			blog.setDescription(blogdescription);;
			blog.setPostedOn(date);
	       System.out.println("Blog Title: "+blogtitle);
         System.out.println(" Blog Description: "+blogdescription);
			
		
		if(blog!=null) {
			request.setAttribute("blog", blog);
			User user = null;
			request.setAttribute("user",user);
			RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/WEB-INF/views/blogView.jsp");
			rd.forward(request, response);
		}
		
	}

}