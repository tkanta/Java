package com.java8.enumtest;

public enum Element implements Leveled{

	H("Hydrogen", 1, 1.008f),
    HE("Helium", 2, 4.0026f);
    
    public final String label;
    public final int atomicNumber;
    public final float atomicWeight;
    
    private Element(String label, int atomicNumber, float atomicWeight) {
        this.label = label;
        this.atomicNumber = atomicNumber;
        this.atomicWeight = atomicWeight;
    }
    
    public Element getElement() {
    	return null;
    }
}
