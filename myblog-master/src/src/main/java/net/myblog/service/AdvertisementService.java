package net.myblog.service;

import java.util.List;

import net.myblog.entity.Advertisement;
import net.myblog.repository.AdvertisementRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AdvertisementService {

	@Autowired AdvertisementRepository webAdRepository;
	
	/**
	 * 查询所有的广告信息
	 * @return
	 */
	@Transactional(readOnly=true)
	public List<Advertisement> findAll(){
		return webAdRepository.findAll();
	}
	
}
