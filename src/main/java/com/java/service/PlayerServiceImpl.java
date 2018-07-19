package com.java.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.java.connection.Connection1;
import com.java.model.Player;
import com.java.repository.EmployeeRepositoryImpl;
import com.java.repository.IPlayerRepository;

public class PlayerServiceImpl implements IPlayerService {
	private IPlayerRepository repository;
	public PlayerServiceImpl( EmployeeRepositoryImpl repository) {
		this.repository=repository;
	}
	

	public void save(Player pla) {
		// TODO Auto-generated method stub
		Connection con=null;
		try {
			con=(Connection) Connection1.getConnection(); // create connection
			repository.save(pla, con); // save
			con.commit();// commit
			System.out.println("**** saved employee: "+pla.id);
		} catch (Exception e) {
			// TODO: handle exception
			try {
				con.rollback(); // rollback
				System.out.println("**** failed to save employee: "+pla.id);
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		finally {
			try {
				Connection1.closeConnection(con);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void updateNameAndSalary(String name, String country, int id) {
		// TODO Auto-generated method stub

	}

	public void updateCity(String country, int id) {
		// TODO Auto-generated method stub

	}

	public List<Player> findAll() {
					// TODO Auto-generated method stub
		
					List<Player> pla1=null;
					
					Connection con=null;
					try {
						con = Connection1.getConnection();
						pla1=repository.findAll(con); 
						// select operation so commit not required
					} catch (SQLException e) {
						// select operation so rollback not required
						e.printStackTrace();
					}
					finally {
						try {
							Connection1.closeConnection(con);
						} catch (SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					return pla1;
			 	}
	

	public Player findById(int id) {
		// TODO Auto-generated method stub
		Player pla=null;
		Connection con=null;
		try {
			con=Connection1.getConnection();
			pla=repository.findById(id, con);
			// SELECT operation so commit not required
		} catch (SQLException e) {
			// SELECT operation so rollback not required
			e.printStackTrace();
		}
		finally {
			try {
				Connection1.closeConnection(con);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return pla;
	}
	public void deleteById(int id) {
		// TODO Auto-generated method stub

	}

	public void deleteAll() {
		// TODO Auto-generated method stub

	}
    }


