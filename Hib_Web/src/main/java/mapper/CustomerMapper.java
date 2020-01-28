package mapper;

import comm.model.Customer;
import comm.model.CustomerDto;

public class CustomerMapper implements CustomerDtoImpl {


	
	@Override
	public CustomerDto custertoCustomerDtoCustomer(Customer customer) {
		if(customer==null) 
		{
		return null;
		}
		else
		{
			CustomerDto customer1=new CustomerDto();
			customer1.setUId(customer.getUId());
			customer1.setFirstname(customer.getFirstname());
			customer1.setLastname(customer.getLastname());
			customer1.setEmail(customer.getEmail());
			return customer1;
			

}
	}

	@Override
	public Customer customerDtotoCustomer(CustomerDto dto) {
		if(dto==null) 
		{
		return null;
		}
		else {
			Customer customer=new Customer();
			customer.setUId(dto.getUId());
			customer.setFirstname(dto.getFirstname());
			customer.setLastname(dto.getLastname());
			customer.setEmail(dto.getEmail());
			return customer;
	}
}
}
