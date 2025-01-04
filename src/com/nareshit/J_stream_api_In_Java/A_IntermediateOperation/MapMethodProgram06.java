package com.nareshit.J_stream_api_In_Java.A_IntermediateOperation;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

//Get the name of the Player from Player Object
record Player(Integer playerId, String playerName)
{
	
}

public class MapMethodProgram06 {

	public static void main(String[] args) 
	{
		Set<String> playersName = createPlayerList().stream().map(player -> player.playerName()).collect(Collectors.toSet());
		System.out.println(playersName);
		


	}
	
	public static List<Player> createPlayerList()
	{
		List<Player> al = new ArrayList<>();
		al.add(new Player(18, "Virat"));
		al.add(new Player(45, "Rohit"));
		al.add(new Player(7, "Dhoni"));
		al.add(new Player(18, "Virat"));
		al.add(new Player(90, "Bumrah"));
		al.add(new Player(67, "Hardik"));
		
		return al;
	}


}
