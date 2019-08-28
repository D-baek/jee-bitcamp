package com.bank.web.service;
import com.bank.web.domains.*;
public interface MemberService {
	public void join(CustomerBean param);
	public void register(EmployeeBean param);
	public CustomerBean[] findAllCustomers();
	public EmployeeBean[] findAllEmployees();
	public MemberBean[] findByName(String name); 
	public MemberBean findById(String id); 
	public boolean login(MemberBean param); 
	public int countCustomers(); 
	public int countEmployees(); 
	public boolean existId(String id);
	public void updatePass(MemberBean param);
	public void deleteMember(MemberBean param);
}