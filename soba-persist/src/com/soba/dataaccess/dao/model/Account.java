/**
 * 
 */
package com.soba.dataaccess.dao.model;

/**
 * @author 539471
 *
 */
public class Account {
	
	private Long accountNumber;
	private String accountType;
	private String branchName;
	private Long branchCode;
	private boolean isZeroBalanceAllowed;
	
	/**
	 * @return the accountNumber
	 */
	public Long getAccountNumber() {
		return accountNumber;
	}
	/**
	 * @param accountNumber the accountNumber to set
	 */
	public void setAccountNumber(Long accountNumber) {
		this.accountNumber = accountNumber;
	}
	/**
	 * @return the accountType
	 */
	public String getAccountType() {
		return accountType;
	}
	/**
	 * @param accountType the accountType to set
	 */
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	/**
	 * @return the branchName
	 */
	public String getBranchName() {
		return branchName;
	}
	/**
	 * @param branchName the branchName to set
	 */
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	/**
	 * @return the branchCode
	 */
	public Long getBranchCode() {
		return branchCode;
	}
	/**
	 * @param branchCode the branchCode to set
	 */
	public void setBranchCode(Long branchCode) {
		this.branchCode = branchCode;
	}
	/**
	 * @return the isZeroBalanceAllowed
	 */
	public boolean isZeroBalanceAllowed() {
		return isZeroBalanceAllowed;
	}
	/**
	 * @param isZeroBalanceAllowed the isZeroBalanceAllowed to set
	 */
	public void setZeroBalanceAllowed(boolean isZeroBalanceAllowed) {
		this.isZeroBalanceAllowed = isZeroBalanceAllowed;
	}
}
