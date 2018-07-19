package com.java.service;

import java.util.List;

import com.java.model.Player;

public interface IPlayerService  {
	public void save(Player pla);
	public void updateNameAndSalary(String name, String country, int id);
	public void updateCity(String country,int id);
	public List<Player> findAll();
	public Player findById(int id);
	public void deleteById(int id);
	public  void deleteAll();
    }


