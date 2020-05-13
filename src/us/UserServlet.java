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

import Dao.SinhVienDao;
import model.SinhVien;



//import Dao.SinhVienDao;
//import dao.UserDao;
//import model.User;


@WebServlet("/")
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
//	private UserDao userDao;
	SinhVienDao sinhVienDao ;
	public void init() {
		sinhVienDao = new SinhVienDao();
      
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
                case "/showregister":
                	showEditForm(request, response);
                    break;
                default:
                    ShowLogin(request, response);
                    break;
            }
        
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String action = request.getServletPath();
		switch (action) {
        case "/register":
        	register(request, response);
            break;
        case "/login":
        	Login(request, response);
            break;
        default:
            ShowLogin(request, response);
            break;
    }
	}
	
	private void Login(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		// TODO Auto-generated method stub
		String email = request.getParameter("email");
		String pass = request.getParameter("pwd");
		SinhVien sinhVien = sinhVienDao.findByEmail(email);
		System.out.println(pass);
		System.out.println(sinhVien.getPassword());
		if(sinhVien !=null && sinhVien.getPassword().equals(pass) ) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("Profile.jsp");
			request.setAttribute("user", sinhVien);
			dispatcher.forward(request, response);
		}else {
			response.sendRedirect("loginForm");
		}
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
	

	private void register(HttpServletRequest request, HttpServletResponse response) throws IOException {
			String pass = request.getParameter("psw");
			String name = request.getParameter("username");
	        String email = request.getParameter("email");
	        String country = request.getParameter("country");
	        Random rd = new Random();
	        int number = rd.nextInt();
	        SinhVien sinhVien = new SinhVien(number, email, name, pass, country);
	        sinhVienDao.addSinhVien(sinhVien);
		response.sendRedirect("showlogin");
	}
	
	
	private void ShowLogin(HttpServletRequest request, HttpServletResponse response)
		    throws IOException, ServletException {
		        RequestDispatcher dispatcher = request.getRequestDispatcher("Login.jsp");
		        dispatcher.forward(request, response);
		    }

}
