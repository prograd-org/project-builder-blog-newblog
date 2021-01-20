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
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/WEB-INF/views/blogView.jsp");
		rd.forward(request, response);
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String blogDetails = request.getParameter("selectedAnswers");
		String[] details = blogDetails.split(",");
		Blog blog = new Blog(details[0],details[1],LocalDate.now());
		User user = new User("Admin", "Admin", LocalDateTime.now());
		
		System.out.println("Blog Title: "+blog.getTitle());
		System.out.println("Blog Description: "+blog.getDescription());
		System.out.println("Posted On: "+blog.getPostedOn());
		
		String b=blog.getTitle() + blog.getDescription() + blog.getPostedOn();
		String u=user.getEmail()+user.getDate();
		

		
		if(b!=null) {
			request.setAttribute("blog", b);
			request.setAttribute("user",u);
			RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/WEB-INF/views/blogView.jsp");
			rd.forward(request, response);
		}
		
	}

}
