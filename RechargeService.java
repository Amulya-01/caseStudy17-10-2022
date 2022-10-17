package com.gl.caseStudy4.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.gl.caseStudy4.bean.Offer;

import com.gl.caseStudy4.dao.OfferRepository;


@Service
public class RechargeService  {
	

	@Autowired
	private OfferRepository repository;

	
	public Long generateId() {
		Long val=repository.findMaxofferId();
		if(val==null)
			val=1L;
		else 
			val=val+1;
		return val;
		
		
	}

	public void saveOffer(Offer offer) {
		repository.save(offer);

	}


	public List<Offer> showAllOffers() {
		return repository.findAll();
	}


	public Offer showOfferById(Long id) {
		return repository.getById(id);
	}

	
	
	

}
