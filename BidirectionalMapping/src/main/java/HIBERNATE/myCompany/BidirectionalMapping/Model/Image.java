package HIBERNATE.myCompany.BidirectionalMapping.Model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.Data;
@Data
@Entity
public class Image {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int imageId;
	@Column(name="URL")
	private String imageURL;
	@OneToOne(mappedBy = "image",cascade=CascadeType.ALL)
	@JoinColumn(name="albumId")
	private Album album;
	public Image(String imageURL) {
		super();
		this.imageURL = imageURL;
	}
	
	
	
	
	

}
