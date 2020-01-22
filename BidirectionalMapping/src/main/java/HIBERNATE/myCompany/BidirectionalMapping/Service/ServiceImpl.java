package HIBERNATE.myCompany.BidirectionalMapping.Service;

import HIBERNATE.myCompany.BidirectionalMapping.Dao.Dao;
import HIBERNATE.myCompany.BidirectionalMapping.Model.Album;

public class ServiceImpl implements Service {
	Dao dao;

	@Override
	public Album createAlbum(Album album) {
		
		return dao.createAlbum(album);
	}

	@Override
	public int findById(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

}
