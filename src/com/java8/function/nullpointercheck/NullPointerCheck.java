package com.java8.function.nullpointercheck;

import java.util.Optional;

public class NullPointerCheck {
	
	private static class MemberCard{
		int fidelityPoint;

		public int getFidelityPoint() {
			return fidelityPoint;
		}

		public void setFidelityPoint(int fidelityPoint) {
			this.fidelityPoint = fidelityPoint;
		}
		
	}
	private static class Customer {
		
		Optional<MemberCard> getMemberCard(){
			MemberCard m = new MemberCard();
			m.setFidelityPoint(6);
			return Optional.ofNullable(m);
		}
		
	}
	
	public String getDisCountLine(Customer customer) {
//		Integer test = customer.getMemberCard().flatMap(m -> getDiscountPercentage(m)).orElse(1);
//		System.out.println(test);
		return customer.getMemberCard().flatMap(m -> getDiscountPercentage(m)).map(d -> "Discount % "+d).orElse("");
	}
	
	private Optional<Integer> getDiscountPercentage(MemberCard card) {
		if(card.getFidelityPoint() >= 100) {
			return Optional.of(5);
		}else if(card.getFidelityPoint() >= 50) {
			return Optional.of(3);
		}
		
		return Optional.empty();
	}
	
	public static void main(String[] args) {
		Customer customer = new Customer();
		
		System.out.println(new NullPointerCheck().getDisCountLine(customer));
		
	}
}
