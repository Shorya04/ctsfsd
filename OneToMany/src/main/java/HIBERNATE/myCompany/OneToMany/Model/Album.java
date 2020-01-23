package HIBERNATE.myCompany.OneToMany.Model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="album")
public class Album {


	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="album_id")
	private int albumId;
	private String albumName;
	@Column(name="Created_on")
	private LocalDate date;
	@OneToMany(mappedBy="album",cascade= {CascadeType.PERSIST,CascadeType.MERGE,CascadeType.DETACH,CascadeType.REFRESH})
	
	private List<Image> images;
	public Album(String albumName) {
		super();
		this.albumName = albumName;
		date=LocalDate.now();
	
	}
	
	public void add(Image tempImage) {
		if(images==null) {
			images=new ArrayList<>();
		}
		images.add(tempImage);
		tempImage.setAlbum(this);
	}
	
}


