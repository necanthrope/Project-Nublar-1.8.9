package com.projectnublar.mod.util;

public enum EnumSpecies {
	
	
	RANDOM(0, 0, 0, false, false),
	Dino1(0, 0, 0, true, false);
	//Dino2, Dino3;
	//TODO: add all dinos to list
	/*
	Gender: (Male/Female) 0-1,
	Speed: 0-4,
	AITree: 
	0-2,
	Maximum Int (Intelligence),
	Maximum Fero (Aggressiveness),
	Maximum Soc (Group forming tendency)
	Species: (Of Dinosaur) 0-# Of Dinosaurs,
	Colour: (Of Pallete) 0-15,
	Intensity: (Of Colour) 0-7,
	Alt: (Melanistic-Albino) 0-10,
	Met: (Metabolism) 0-9,
	Immunity (Proneness to illness) 0-3

Notes: Altruism will be a function of Fero/Int
	*/
	//public int gender;
	public int aiInt;
	public int aiFero;
	public int aiSoc;
	public int color;
	public int cFactor;
	public int amFactor;
	public int met;
	public int immune;
	public float speedVar;
	public float test3;
	public boolean isMale;
	public boolean naturallySpawned;
	
	
	
	EnumSpecies(int aiInt, int aiFero, int aiSoc, int color, int cFactor, int amFactor, int met, int immune, float speedVar, float test3, boolean isMale, boolean naturallySpawned) {
		this.aiInt = aiInt;
		this.aiFero = aiFero;
		this.aiSoc = aiSoc;
		this.color = color;
		this.cFactor = cFactor;
		this.amFactor = amFactor;
		this.met = met;
		this.immune = immune;
		this.speedVar = speedVar;
		this.test3 = test3;
		this.isMale = isMale;
		this.naturallySpawned = naturallySpawned;
	}
	
	EnumSpecies(int test1, int test2, int test3, boolean b2) {
		this(test1, test2, test3, false, false);
	}

}
