package com.gl.caseStudy4.dao;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;

import com.gl.caseStudy4.bean.Bill;

public class BillImpl  {
	
	@Autowired 
	private BillRepository repository;

	
	public Long generateId() {
		Long val=repository.findMaxtransactionId();
		if(val==null)
			val=100001L;
		else 
			val=val+1;
		return val;
		
		
	}

}
