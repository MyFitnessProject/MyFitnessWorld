package com.fitness.rest;

import java.sql.SQLException;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

import com.fitness.dao.UserDAO;
import com.fitness.dto.UserDTO;
import com.fitness.model.UserDetails;
@Path("/UserDetails")
public class UserResource {
	
	@GET
	@Path("/getUser/UserId")
	public Response getUserDetails(@PathParam("UserId") String UserId) {
		System.out.println("start getUserDetails");
		String output = "excuting getLeaderBoardDetails service :";
		//TODO: Have to add the getLeaderBoardDetails business logic
		try {
			UserDetails userDetails = new UserDAO().getUserDetails(UserId);
			UserDTO userDto = DaotoDTOCOnversion(userDetails);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return Response.status(200).entity(UserDTO.class).build();
 
	}
	private UserDTO DaotoDTOCOnversion(UserDetails userDetails) {
		
		UserDTO userDto = new UserDTO();
		userDto.setUserId(userDetails.getUserId());
		userDto.setFirstName(userDetails.getFirstName());
		userDto.setLastName(userDetails.getLastName());
		userDto.setPhoneNO(userDetails.getPhoneNO());
		userDto.setEmailId(userDetails.getEmailId());
		return userDto;
		
	}
	@POST
	@Path("/saveUser")
	 @Consumes("application/xml")
	public Response saveUserDetails(UserDTO userDto) {
		System.out.println("start saveUserDetails");
		//String output = "excuting saveLeaderBoardDetails service :";
		UserDAO userDao = new UserDAO();
		try {
			userDao.saveUserDetails(userDto);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		String output = "success";
		return Response.status(200).entity(output).build();
 
	}

}
