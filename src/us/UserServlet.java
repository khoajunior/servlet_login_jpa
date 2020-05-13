package us;

import java.io.IOException;
import java.util.List;
import java.util.Random;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//import Dao.SinhVienDao;
//import dao.UserDao;
//import model.User;


@WebServlet("/")
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
//	private UserDao userDao;
	
	public void init() {
        
    }
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String action = request.getServletPath();
		
		
            switch (action) {
                case "/profile":
                    showProfile(request, response);
                    break;
                case "/register":
                	showEditForm(request, response);
                    break;
                case "/login":
                	Login(request, response);
                    break;
                default:
                    ShowLogin(request, response);
                    break;
            }
        
	}
	
	private void Login(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
		response.sendRedirect("profile");
		
	}

	private void showProfile(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher dispatcher = request.getRequestDispatcher("Profile.jsp");
		dispatcher.forward(request, response);
	}

	private void showEditForm(HttpServletRequest request, HttpServletResponse response)
			throws  ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("RegisterForm.jsp");
		dispatcher.forward(request, response);

	}
	

	
	
	



	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	
	private void showNewForm(HttpServletRequest request, HttpServletResponse response)
		    throws ServletException, IOException {
//		        RequestDispatcher dispatcher = request.getRequestDispatcher("user-form.jsp");
//		        dispatcher.forward(request, response);
	}
	
	private void register(HttpServletRequest request, HttpServletResponse response)
		    throws  IOException {
//		        String name = request.getParameter("name");
//		        String email = request.getParameter("email");
//		        String country = request.getParameter("country");
//		        Random rd = new Random();
//		        int number = rd.nextInt();  // tráº£ vá»� 1 sá»‘ nguyÃªn báº¥t ká»³
//		        User newUser = new User(number,name, email, country);
//		        userDao.addUser(newUser);
//		        response.sendRedirect("list");
		    }
	
	private void ShowLogin(HttpServletRequest request, HttpServletResponse response)
		    throws IOException, ServletException {
		        RequestDispatcher dispatcher = request.getRequestDispatcher("Login.jsp");
		        dispatcher.forward(request, response);
		    }

}
