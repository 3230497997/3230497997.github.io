package net.myblog.repository;

import java.util.List;

import javax.persistence.QueryHint;

import net.myblog.entity.Advertisement;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.QueryHints;

public interface AdvertisementRepository extends JpaRepository<Advertisement, Integer>{

	@Query("from Advertisement")
	@QueryHints({@QueryHint(name=org.hibernate.ejb.QueryHints.HINT_CACHEABLE,value="true")})
	public List<Advertisement> findAll();
	
}
