package HIBERNATE.myCompany.BidirectionalMapping.Service;

import HIBERNATE.myCompany.BidirectionalMapping.Model.Album;

public interface Service {

	public Album createAlbum(Album album);
	public int findById(int id);
}
