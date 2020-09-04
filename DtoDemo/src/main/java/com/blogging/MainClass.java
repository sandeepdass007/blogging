package com.blogging;

import com.blogging.query.SearchFacade;
import com.blogging.query.dto.SearchDto;

public class MainClass {

	public static void main(String[] args) {
		SearchFacade searchFacade = new SearchFacade();
		searchFacade.searchFromServer("12345", "author", false);
		
		SearchDto searchDto = new SearchDto("67890", "reviewer", true);
		searchFacade.searchFromServer(searchDto);
	}

}
