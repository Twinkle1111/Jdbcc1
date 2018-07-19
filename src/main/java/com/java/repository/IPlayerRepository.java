package com.java.repository;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import com.java.model.Player;

public interface IPlayerRepository  {
	public void save(Player pla,Connection con) throws SQLException;
	public void updateNameAndSalary(String name, String country, int id,Connection con);
	public void updateCity(String country, int id,Connection con);
	public List<Player> findAll(Connection con) throws SQLException;
	public Player findById(int id,Connection con)throws SQLException;
	public void deleteById(int id,Connection con);
	public void deleteAll(Connection con);
}

	


