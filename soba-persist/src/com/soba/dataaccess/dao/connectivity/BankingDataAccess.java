/**
 * 
 */
package com.soba.dataaccess.dao.connectivity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.sql.DataSource;

/**
 * @author 539471
 *
 */
public class BankingDataAccess 
{
	private DataSource dataSource;
	private Connection connection;
	
	/**
	 * @return the dataSource
	 */
	public DataSource getDataSource() {
		return dataSource;
	}

	/**
	 * @param dataSource the dataSource to set
	 */
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	public Connection createConnection()
	{
		//Get the connection instance and return it
		return connection;
	}
	
	public PreparedStatement createPreparedStatement()
	{
		//Create the Prepared Statement
		return null;
	}
	
	public void closePreparedStatement(PreparedStatement preparedStatement)
	{
		
	}
	
	public void closeResultSet(PreparedStatement preparedStatement)
	{
		
	}
	
	public void closeConnection(Connection connection)
	{
		
	}
	
	public void closeAll(Connection connection, PreparedStatement preparedStatement, ResultSet resultSet)
	{
		
	}
}
