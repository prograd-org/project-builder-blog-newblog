package controller;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;

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
		
        String[] blogDetail=blogDetails.split(",");
		
		LocalDateTime date1 = LocalDateTime.of(2021, 1, 1, 1, 01, 1);
		User user = new User ( "rhea@gmail.com","Cse@123",date1);
		
		LocalDate date2=LocalDate.of(2021,01,07);
		
		Blog blog=new Blog(blogDetail[0], blogDetail[1], date2);
		System.out.println("Blog Title: "+blogDetail[0]+". "+"\nBlog Description"+blogDetail[1]+"\nPosted On: "+date2);
		
		

		
		if(blog!=null) {
			request.setAttribute("blog", blog);
			request.setAttribute("user",user);
			RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/WEB-INF/views/blogView.jsp");
			rd.forward(request, response);
		}
		
	}

}
