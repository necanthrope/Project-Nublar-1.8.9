package com.projectnublar.mod.util;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

import net.minecraft.nbt.NBTTagCompound;

public class DNAHelper {
	
	//helper variable
	private int totalParts;
	
	
	//private Random rand = new Random();
	
	public String create(EnumSpecies species) {
		float f1 = species.test1;
		float f2 = species.test2;
		float f3 = species.test3;
		boolean isMale = species.isMale;
		boolean bool2 = species.b2;
		
		//TODO: modify values randomly
		
		String hex1 = Float.toHexString(f1);
		String hex2 = Float.toHexString(f2);
		String hex3 = Float.toHexString(f3);
		String b1 = "0";
		String b2 = "0";
		if(isMale) b1 = "1";
		if(bool2) b2 = "1";
		
		//put all together
		LinkedList<String> strings = new LinkedList<String>();
		strings.add(0, hex1);
		strings.add(1, hex2);
		strings.add(2, hex3);
		strings.add(3, b1);
		strings.add(4, b2);
		String dna = String.join("-", strings);
		totalParts = strings.size();
		return dna;
	}
	
	/**
	 * Deserializes the DNA String of fossils.
	 * 
	 * @param dnaString the encrypted DNA String
	 */	
	public static NBTTagCompound deserialize(String dnaString)
	{
		String[] values = dnaString.split("-");
		NBTTagCompound nbt = new NBTTagCompound();
		nbt.setFloat("test1", Float.parseFloat(values[0]));
		nbt.setFloat("test2", Float.parseFloat(values[1]));
		nbt.setFloat("test3", Float.parseFloat(values[2]));
		
		//manual check for booleans
		if(values[4] == "1") nbt.setBoolean("isMale", true); else nbt.setBoolean("isMale", false);
		if(values[5] == "1") nbt.setBoolean("bool2", true); else nbt.setBoolean("bool2", false);
		
		return nbt;
	}
	
	
	/**
	 *
	 * @param values An Array of all dna values.
	 * @return encrypted DNA string if Array was correct size, {@code null} otherwise.
	 */
	public String serialize(NBTTagCompound nbt)
	{
		LinkedList<String> dna = new LinkedList<String>();
		Set<String> keys = nbt.getKeySet();
		Iterator<String> i = keys.iterator();
		while(i.hasNext())
		{
			dna.addLast(i.next());
		}
		return String.join("-", dna);
		
	}
	
	public boolean validate(String dnaString)
	{
		return dnaString.split("-").length == totalParts;
	}
	
	public boolean validate(NBTTagCompound nbt)
	{
		return nbt.getKeySet().size() == totalParts;
	}
	
}
