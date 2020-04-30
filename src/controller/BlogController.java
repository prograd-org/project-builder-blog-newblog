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
		
		String blogDetail[]=blogDetails.split(",");
		String blogTitle=blogDetail[0];
		String blogDescription=blogDetail[1];
		LocalDate date=LocalDate.now();
		
		
		Blog blog=new Blog(blogTitle, blogDescription, date);
	blog.setTitle(blogTitle);
	blog.setDescription(blogDescription);
	blog.setPostedOn(date);
		
		
		
		System.out.println("Blog Title: "+blogTitle);
		System.out.println("Blog Description: "+blogDescription);
		System.out.println("Posted on: "+date);
		
		
		if(blog!=null) {
			request.setAttribute("blog", blog);
			
//			request.setAttribute("user",user);
			RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/WEB-INF/views/blogView.jsp");
			rd.forward(request, response);
		}
	
	}

}
