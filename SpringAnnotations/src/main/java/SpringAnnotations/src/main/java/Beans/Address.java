package SpringAnnotations.src.main.java.Beans;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

@Component
public class Address {
	private String addressLine1;
	private String addressLine2;
	private String phoneNumber;
	private String pincode;
	
	@Override
	public String toString() {
		return "Address [addressLine1=" + addressLine1 + ", addressLine2=" + addressLine2 + ", phoneNumber="
				+ phoneNumber + ", pincode=" + pincode + "]";
	}
	
	
	

	
}
