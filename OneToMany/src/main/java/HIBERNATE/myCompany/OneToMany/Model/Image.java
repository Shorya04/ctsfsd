package HIBERNATE.myCompany.OneToMany.Model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.Data;

@Data
@Entity
public class Image {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int imageId;
	@Column(name="URL")
	private String imageURL;
	@ManyToOne(cascade= {CascadeType.MERGE,CascadeType.MERGE,CascadeType.DETACH,CascadeType.REFRESH})
	@JoinColumn(name="albumId")
	private Album album;
	
	private List<Album> albums;
	public Image(String imageURL) {
		super();
		this.imageURL = imageURL;
	}
	
	
	
	
	

}



