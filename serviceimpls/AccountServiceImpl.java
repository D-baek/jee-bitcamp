package com.bank.web.serviceimpls;
import java.util.ArrayList;
import java.util.List;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import com.bank.web.domains.AccountBean;
import com.bank.web.service.AccountService;


public class AccountServiceImpl implements AccountService{
	
	private List<AccountBean> accounts;
	
	
	public AccountServiceImpl() {
		accounts = new ArrayList<>();
	
	}

	@Override
	public void createAccount(int money) {
		AccountBean acc = new AccountBean();
		acc.setAccountNum(createAccountNum());
		acc.setMoney(money+ "");
		acc.setRegDate(findDate());
		
	}

	@Override
	public String createAccountNum() {
		String accountNum = "";
		Random ran = new Random();
		for(int i=0;i<9;i++) {
			accountNum += (i==4)?"-":ran.nextInt(10);
		}
		return accountNum;
	}

	@Override
	public List<AccountBean> findAll() {
		return accounts;
	}

	@Override
	public List<AccountBean> findByAccountNum(String accountNum) {
		List<AccountBean> acc = new ArrayList<>();
		int count;
		return null;
	}

	@Override
	public int countAccounts() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean existAccountNum(String accountNum) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String findDate() {
		return new SimpleDateFormat("yyyy-MM-dd hh:mm")
				.format(new Date());
	}

	@Override
	public void depositMoney(AccountBean param) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void withdrawMoney(AccountBean param) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAccountNum(String accountNum) {
		// TODO Auto-generated method stub
		
	}
	
}