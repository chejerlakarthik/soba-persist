/**
 * 
 */
package com.soba.dataaccess.dao.connectivity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author 539471
 *
 */
@Component
public class BankingDataAccess 
{
	private DataSource dataSource;
	private Connection connection;
	
	private static Logger logger = LoggerFactory.getLogger(BankingDataAccess.class);
	
	/**
	 * @return the dataSource
	 */
	public DataSource getDataSource() {
		return dataSource;
	}

	/**
	 * @param dataSource the dataSource to set
	 */
	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	/**
	 * Create a database connection using the configured dataSource
	 * @return
	 */
	public Connection createConnection() {

		try {
			connection = dataSource.getConnection();
		} catch (SQLException e) {
			logger.error("Could not create a database connection");
		}
		return connection;
	}
	
	public PreparedStatement createPreparedStatement(String sqlQuery)
	{
		//Create the Prepared Statement
		PreparedStatement preparedStatement =  null;
		try 
		{
			preparedStatement = connection.prepareStatement(sqlQuery);
		} catch (SQLException e) {
			logger.error("Could not create a prepared statement");
		}
		return preparedStatement;
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
