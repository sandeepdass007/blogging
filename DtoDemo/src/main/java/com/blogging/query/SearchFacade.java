package com.blogging.query;

import com.blogging.query.dto.SearchDto;

public class SearchFacade {

	public String searchFromServer(String uid, String role, boolean superUser) {
		System.out.println(String.format("uid: %s, role: %s, super user: %s", uid, role, superUser));
		// searching the server based upon the arguments and returning some result
		return "SEARCH RESULTS";
	}
	
	public String searchFromServer(SearchDto searchDto) {
		return searchFromServer(searchDto.getUid(), searchDto.getRole(), searchDto.isSuperUser());
	}
}
