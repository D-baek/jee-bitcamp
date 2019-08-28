package com.bank.web.domains;

public class CustomerBean extends MemberBean{

	private static final long serialVersionUID = 1L;
	private String credit;

	public String getCredit() {
		return credit;
	}

	public void setCredit(String credit) {
		this.credit= credit;
	}

	@Override
	public String toString() {
		return "회원정보  [아이디=\" + getId() + \", 비번=\" \r\n" + 
				"					+ getPass() + \", 이름=\" \r\n" + 
				"					+ getName() + \", 주민번호=\" \r\n" + 
				"					+ getSsn() + \", 신용도=\" \r\n" + 
				"							+ credit+ \"]";
	}
}
