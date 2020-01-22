package HIBERNATE.myCompany.BidirectionalMapping.Model;

import java.time.LocalDate;

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
public class Album {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="album_id")
	private int albumId;
	private String albumName;
	@Column(name="Created_on")
	private LocalDate date;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="imageId")
	private Image image;
	public Album(String albumName) {
		super();
		this.albumName = albumName;
		date=LocalDate.now();
	
	}
	
	
}
