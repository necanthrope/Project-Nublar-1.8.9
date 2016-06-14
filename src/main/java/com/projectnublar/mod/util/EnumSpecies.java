package com.projectnublar.mod.util;

public enum EnumSpecies {
	
	
	RANDOM(0, 0, 0, false, false),
	Dino1(0, 0, 0, true, false);
	//Dino2, Dino3;
	//TODO: add all dinos to list
	public int test1;
	public int test2;
	public int test3;
	public boolean isMale;
	public boolean b2;
	
	
	
	EnumSpecies(int test1, int test2, int test3, boolean isMale, boolean b2) {
		this.test1 = test1;
		this.test2 = test2;
		this.test3 = test3;
		this.isMale = isMale;
		this.b2 = b2;
	}
	
	EnumSpecies(int test1, int test2, int test3, boolean b2) {
		this(test1, test2, test3, false, b2);
	}

}
