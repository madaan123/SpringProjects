package org.studyeasy.spring.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;
import javax.validation.Valid;

import org.studyeasy.spring.model.User_DB;

public class AppDAOImpl implements AppDAO {

	private DataSource dataSource;

	public AppDAOImpl(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	@Override
	public List<User_DB> listUsers() {
		// TODO Auto-generated method stub
		String SQL = "select * from users";

		List<User_DB> users = new ArrayList<User_DB>();
		Connection conn = null;
		try {
			conn = dataSource.getConnection();
			PreparedStatement stmt = conn.prepareStatement(SQL);
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				User_DB temp = new User_DB(rs.getInt("user_id"), rs.getString("username"), rs.getString("password"),
						rs.getString("first_name"), rs.getString("last_name"));

				users.add(temp);
			}

			rs.close();
			stmt.close();
			return users;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

	public void addUser(@Valid User_DB user) {
		// TODO Auto-generated method stub
		String SQL = "insert into users(username,password,first_name,last_name)"
				+ "values(?,?,?,?)";

		Connection conn = null;
		try {
			conn = dataSource.getConnection();
			PreparedStatement stmt = conn.prepareStatement(SQL);
			stmt.setString(1, user.getUsername());
			stmt.setString(2, user.getPassword());
			stmt.setString(3, user.getFirst_name());
			stmt.setString(4, user.getLast_name());
			stmt.execute();

			stmt.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

}
