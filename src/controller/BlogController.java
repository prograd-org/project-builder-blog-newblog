package controller;

import java.io.IOException;
import java.time.LocalDate;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.*;
import java.time.*;



@WebServlet(urlPatterns= {"/blog"})
public class BlogController extends HttpServlet {
	private static final long serialVersionUID = 1L;       

    public BlogController() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/WEB-INF/views/blogView.jsp");
		rd.forward(request, response);
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String[] blogDetails = request.getParameter("selectedAnswers").split(",");
		
		LocalDate date = LocalDate.now();
		Blog blog = new Blog(blogDetails[0], blogDetails[1], date);
		LocalDateTime date1 = LocalDateTime.now();

		User user = new User("admin","admin",date1);
		if(blog!=null) {
			request.setAttribute("blog", blog);
			//request.setAttribute("user",user);
			RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/WEB-INF/views/blogView.jsp");
			rd.forward(request, response);
			
			System.out.println("Blog Title: " + blogDetails[0] + "\n" +
					"Blog Description: " + blogDetails[1] +"\n" + 
					"Posted on: " + date);
		}
		
	}

}
