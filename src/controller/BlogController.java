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
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/WEB-INF/views/blogView.jsp");
		rd.forward(request, response);
		
	}
		/*
		 * Progression - 2
		Go to src/controller/BlogController. Blog detail is a String array separated by a comma.
		Use the split method to separate the Strings.
		The first value corresponds to the blog title and the second value corresponds to the blog description.
		 */

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String[] blogDetails = request.getParameter("selectedAnswers").split(",");
	
			String blogTitle = blogDetails[0];
			String blogDescription = blogDetails[1];
		
		/*
		 * Progression - 3
		Create an object for Blog Class in the BlogController class located inside JAVA Resources - src/controller
		Pass the value of Blog to the setAttribute method.
		Print all the details in console in the given format
		 */
		Blog blog = new Blog(blogTitle, blogDescription, null);	
		System.out.println("Blog Title: "+blog.getTitle());
		System.out.println("Blog Description: "+blog.getDescription());
		System.out.println("Posted on: "+blog.getPostedOn());

		
		if(blog!=null) {
			request.setAttribute("blog", blog.getTitle());
			request.setAttribute("user",blog.getDescription());
			RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/WEB-INF/views/blogView.jsp");
			rd.forward(request, response);
		}
	
	}

}
