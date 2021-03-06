package com.sunilos.service;

import com.sunilos.common.BaseServiceInt;
import com.sunilos.common.UserContext;
import com.sunilos.dto.CollegeDTO;

/**
 * College Service interface.
 * 
 * @author SunilOS
 * @version 1.0
 * @Copyright (c) SunilOS
 */

public interface CollegeServiceInt extends BaseServiceInt<CollegeDTO> {

	/**
	 * Finds a Role by name.
	 * 
	 * @param roleName
	 * @return
	 */
	public CollegeDTO findByName(String name, UserContext context);

}