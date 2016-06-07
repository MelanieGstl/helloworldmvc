package org.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Statement;


public class DAOHelloWorld {
	private static DAOHelloWorld INSTANCE;
	private static String LOGIN = "root";
	private static String PASSWORD = "";
	private static String URL = "jdbc:mysql://localhost/workshopprosit40";
	private Connection connection;
	private Statement statement;
	
	public DAOHelloWorld () {
		this.connection = null;
		this.statement = null;
	}
	
	public DAOHelloWorld getInstance() {
		if (DAOHelloWorld.INSTANCE == null) {
			DAOHelloWorld.INSTANCE = new DAOHelloWorld();
		}
		return DAOHelloWorld.INSTANCE;
	}
	
	public String getQuerySelectFirstHelloWorld() {
		return null;
		
	}
	
	protected void close() {
		System.out.println("Fin de la conexion");
	}
	
	protected ResultSet executeQuery (String execute) {
		return null;
		
	}
	
	protected boolean open () {
		System.out.println("Debut de la connexion");
		try {
			Class.forName("com.mysql.jdbc.Driver");
			this.connection = DriverManager.getConnection(DAOHelloWorld.URL,
			DAOHelloWorld.LOGIN, DAOHelloWorld.PASSWORD);
			this.statement = (Statement) this.connection.createStatement();
			} catch (final ClassNotFoundException e) {
				e.printStackTrace();
				return false;
			} catch (final SQLException e) {
				e.printStackTrace();
				return false;
			}
			return true;
	}
	
}
