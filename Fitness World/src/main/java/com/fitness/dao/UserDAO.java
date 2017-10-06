package com.fitness.dao;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;

import com.fitness.dto.UserDTO;
import com.fitness.model.UserDetails;
import com.fitness.util.HibernateUtil;

public class UserDAO {
	
	public UserDetails getUserDetails(String user_id) throws SQLException{
		
		UserDetails userDetails = null;
		Session session = HibernateUtil.getSessionFactory().openSession();
		SQLQuery query = session.createSQLQuery("SELECT * FROM USER_INFO WHERE user_id = :user_id");
		query.setString("username", user_id);
		List<UserDetails> userList = query.list();
		userDetails = userList.get(0);
		
		return userDetails;
	}
	public void saveUserDetails(UserDTO userDto) throws SQLException{
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		UserDetails userDetails = dtoToModelConversion(userDto);
		session.save(userDetails);
		
		return;
	}
	private UserDetails dtoToModelConversion(UserDTO userDto) {
		
		UserDetails userDetails = new UserDetails();
		userDetails.setUserId(userDto.getUserId());
		userDetails.setFirstName(userDto.getFirstName());
		userDetails.setLastName(userDto.getLastName());
		
		return userDetails;
	}

}
