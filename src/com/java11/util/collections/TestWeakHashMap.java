package com.java11.util.collections;

import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;

class UniqueImageName{
	private String imageName;

	public UniqueImageName(String imageName) {
		super();
		this.imageName = imageName;
	}
	
}

class BigImage {
	private String imageName;

	public BigImage(String imageName) {
		super();
		this.imageName = imageName;
	}
	
}

public class TestWeakHashMap {

	public static void main(String[] args) {
		WeakHashMap<UniqueImageName, BigImage> map = new WeakHashMap<>();
		BigImage bigImageFirst = new BigImage("foo");
		UniqueImageName imageNameFirst = new UniqueImageName("name_of_big_image");
		 
		BigImage bigImageSecond = new BigImage("foo_2");
		UniqueImageName imageNameSecond = new UniqueImageName("name_of_big_image_2");
		 
		map.put(imageNameFirst, bigImageFirst);
		map.put(imageNameSecond, bigImageSecond);
		 
		 
		imageNameFirst = null;
		System.gc();
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(map.size());
		 
	}
}
