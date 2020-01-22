package HIBERNATE.myCompany.BidirectionalMapping.Dao;

import HIBERNATE.myCompany.BidirectionalMapping.Model.Album;

public interface Dao {
	
	public Album createAlbum(Album album);
	public int findById(int id);

}
