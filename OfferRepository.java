package com.gl.caseStudy4.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.gl.caseStudy4.bean.Offer;

public interface OfferRepository extends JpaRepository<Offer, Long> {
	@Query("select max(id) from Offer")
	//public Long generateId();
	public Long findMaxofferId();
	//public void offerSave(Offer offer );
	//public List<Offer> showAllOffers();
	//public Offer showOfferById(Long id);
	

}
