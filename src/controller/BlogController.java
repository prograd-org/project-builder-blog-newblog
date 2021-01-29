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
//import utility.CheckBlogPost;




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
		String[] userBlog=blogDetails.split(",");
		String titl = userBlog[0];
		String descriptio = userBlog[1];
		LocalDate postedO = LocalDate.now();
		
		User user = null;
		Blog blog=new Blog(titl,descriptio,postedO);
		System.out.println(titl);
		System.out.println(descriptio);
		
		blog.setTitle(titl);
		blog.setDescription(descriptio);
		blog.setPostedOn(postedO);
	
		System.out.println("Blog title:"+blog.getTitle());
		System.out.println("Blog Description: "+(blog.getDescription()));
		System.out.println("Posted on"+blog.getPostedOn());


		
		if(blog!=null) {
			request.setAttribute("blog", blog);
			request.setAttribute("user",user);
			RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/WEB-INF/views/blogView.jsp");
			rd.forward(request, response);
		}
		
	}

}
