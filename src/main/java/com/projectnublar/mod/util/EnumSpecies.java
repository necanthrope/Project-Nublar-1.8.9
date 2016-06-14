package com.projectnublar.mod.util;

public enum EnumSpecies {
	
	
	RANDOM(0, 0, 0, false, false),
	Dino1(0, 0, 0, true, false);
	//Dino2, Dino3;
	//TODO: add all dinos to list
	public float baseSpeed;
	public float intelligence;
	public float test3;
	public boolean isMale;
	public boolean naturallySpawned;
	
	
	
	EnumSpecies(float baseSpeed, float intelligence, float test3, boolean isMale, boolean naturallySpawned) {
		this.baseSpeed = baseSpeed;
		this.intelligence = intelligence;
		this.test3 = test3;
		this.isMale = isMale;
		this.naturallySpawned = naturallySpawned;
	}
	
	EnumSpecies(int test1, int test2, int test3, boolean b2) {
		this(test1, test2, test3, false, false);
	}

}
