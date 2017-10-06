package com.fitness.rest;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;
@Path("/leaderboard")
public class LeaderBoard {
	@GET
	@Path("/getLeaderBoardDetails")
	public Response getLeaderBoardDetails() {
		System.out.println("start getLeaderBoardDetails");
		String output = "excuting getLeaderBoardDetails service :";
		//TODO: Have to add the getLeaderBoardDetails business logic
		return Response.status(200).entity(output).build();
 
	}
	@POST
	@Path("/saveLeaderBoardDetails")
	public Response saveLeaderBoardDetails() {
		System.out.println("start getLeaderBoardDetails");
		String output = "excuting saveLeaderBoardDetails service :";
		//TODO: Have to add the getLeaderBoardDetails business logic
		return Response.status(200).entity(output).build();
 
	}

}
