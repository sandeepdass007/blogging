package com.blogging.designpattern.composite;

import java.util.List;

public interface Eatable {
	
	public Boolean isEggless();
	
	public Float price();
	
	public String name();
	
	public List<Eatable> items();

}
