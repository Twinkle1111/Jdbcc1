package com.java.connection;
public class PlayerQueries  {
	public static final String INSERT="INSERT INTO tbl_player(ID,NAME,COUNTRY,RANK) VALUES(?,?,?,?)";
	public static final String SELECT_BY_ID="SELECT * FROM tbl_player WHERE ID=?";
	public static final String SELECT_ALL="SELECT * FROM tbl_player";

}
