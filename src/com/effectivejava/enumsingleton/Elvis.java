package com.effectivejava.enumsingleton;

public enum Elvis {
	INSTANCE;
	
	private String value="123";
    public void leaveTheBuilding() {
        System.out.println("Whoa baby, I'm outta here! "+value);
    }
    
    public static String getInstance() {
    	return "werwre";
    }

    // This code would normally appear outside the class!
    public static void main(String[] args) {
        Elvis elvis = Elvis.INSTANCE;
        elvis.leaveTheBuilding();
        System.out.println(Elvis.getInstance());
    }
}

