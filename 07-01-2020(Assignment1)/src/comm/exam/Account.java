package comm.exam;

public class Account {
 
	Integer accountId;
	String name;
	String Address;
	public Account(Integer accountId, String name, String address) {
		super();
		this.accountId = accountId;
		this.name = name;
		Address = address;
	}
	
	@Override
	public String toString() {
		return "Account [accountId=" + accountId + ", name=" + name + ", Address=" + Address + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Address == null) ? 0 : Address.hashCode());
		result = prime * result + ((accountId == null) ? 0 : accountId.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object object) {
		Account account=null;
		boolean isEqual=false;
		
		if(object instanceof Account) {
			account=(Account) object;
		}
	}

	public Integer getAccountId() {
		return accountId;
	}

	public void setAccountId(Integer accountId) {
		this.accountId = accountId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}
	 
	
}
