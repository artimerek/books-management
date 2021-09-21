package pl.artimerek.connections;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.sql.*;

@WebServlet("/DbConnectionServlet")
public class DbConnectionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	//	method for connection
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String user = "reader";
		String password = "reader";
		
		String dbUrl = "jdbc:mysql://localhost:3306/library?allowPublicKeyRetrieval=true&useSSL=" +
					"false&serverTimezone=UTC";
		String driver = "com.mysql.cj.jdbc.Driver";
		
		
		//	Usage of try with resources, all connections will be closed
		try (Connection connection = DriverManager.getConnection(
				dbUrl, user, password)){
			
			PrintWriter out = response.getWriter(); // For testing
			Class.forName(driver);			
			
			System.out.println("Connected to: " + dbUrl + "\nAs: " + user);
			out.print("Connected!");
		}catch(Exception e) {
			System.out.println(e.getMessage());
			throw new ServletException(e);
		}
	}

}
