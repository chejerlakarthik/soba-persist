/**
 * 
 */
package com.soba.dataaccess.dao.member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.soba.dataaccess.dao.ACreateDataDao;
import com.soba.dataaccess.dao.connectivity.BankingDataAccess;
import com.soba.dataaccess.dao.model.AccountCriteria;

/**
 * @author 539471
 *
 */
public class CreateNewBankingAccountDAO extends
		ACreateDataDao<Boolean, AccountCriteria> {

	@Autowired
	private BankingDataAccess bankingDataAccess;
	
	private static Logger logger = LoggerFactory.getLogger(CreateNewBankingAccountDAO.class);

	@Override
	protected Boolean create(AccountCriteria criteria) {
		// connect to the database by using a datasource; prepare a prepared
		// statement, set the necessary parameters and then execute the query.
		// Return a true value if the query returned a non-zero integer
		// indicating that the query executed successfully.
		final String sql = "INSERT INTO \"SOBA\".\"MEMBER_ACCOUNTS\" (MEMBER_CUST_ID,MEMBER_SAVINGS_ACCOUNT_NUMBER, MEMBER_CHECKING_ACCT_NUMBER, "
				+ "BRANCH_NAME, BRANCH_CITY) VALUES(?,?,?,?,?)";
		int result = 0;
		
		Connection connection = bankingDataAccess.createConnection();
		PreparedStatement preparedStatement = bankingDataAccess.createPreparedStatement(sql);
		
		try 
		{
			preparedStatement.setString(1, criteria.getCustomerId());
			preparedStatement.setString(1, criteria.getAccountNumber());
			preparedStatement.setString(1, criteria.getAccountType());
			preparedStatement.setString(1, criteria.getBranchName());
			preparedStatement.setString(1, criteria.getBranchCity());
			
			result = preparedStatement.executeUpdate();
			
			if (result > 0)
			{
				logger.info(result + " records inserted");
			}
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		finally
		{
		}
		return (result > 0 ? true : false);
	}

	@Override
	protected void validate(AccountCriteria param) {
		// Validate the passed Account object and throw exceptions if any of the
		// validation criteria fails
	}

}
