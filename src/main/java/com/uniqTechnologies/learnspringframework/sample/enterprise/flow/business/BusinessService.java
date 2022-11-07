//Business Logic
package com.uniqTechnologies.learnspringframework.sample.enterprise.flow.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.uniqTechnologies.learnspringframework.sample.enterprise.flow.data.DataService;

@Service
public class BusinessService {

	@Autowired
	private DataService dataService;

	static long integer = 0;

	public long calculateSum() {
		List<Integer> data = dataService.retrieveData();

		for (Integer in : data) {
			integer += in;
		}

		return integer;
	}

}
