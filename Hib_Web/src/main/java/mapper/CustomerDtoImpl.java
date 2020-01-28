package mapper;

import comm.model.Customer;
import comm.model.CustomerDto;

public interface CustomerDtoImpl {
	public Customer customerDtotoCustomer(CustomerDto dto);
	public CustomerDto custertoCustomerDtoCustomer(Customer customer);

}
