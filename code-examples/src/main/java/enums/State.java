package enums;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

public enum State {
	// code is contrived number used for a example
	AL("Alabama", 1), AK("Alaska", 2), AZ("Arizona", 3), AR("Arkansas", 4), CA("California", 5), CO("Colorado", 6), CT(
			"Connecticut", 7), DE("Delaware", 8), FL("Florida", 9), GA("Georgia", 10), HI("Hawaii", 11), ID("Idaho", 12), IL(
			"Illinois", 13), IN("Indiana", 14), IA("Iowa", 15), KS("Kansas", 16), KY("Kentucky", 17), LA("Louisiana",
			18), ME("Maine", 19), MD("Maryland", 20), MA("Massachusetts", 21), MI("Michigan", 22), MN("Minnesota", 23), MS(
			"Mississippi", 24), MO("Missouri", 25), MT("Montana", 26), NE("Nebraska", 27), NV("Nevada", 28), NH(
			"New Hampshire", 29), NJ("New Jersey", 30), NM("New Mexico", 31), NY("New York", 32), NC("North Carolina",
			33), ND("North Dakota", 34), OH("Ohio", 35), OK("Oklahoma", 36), OR("Oregon", 37), PA("Pennsylvania", 38), RI(
			"Rhode Island", 39), SC("South Carolina", 40), SD("South Dakota", 41), TN("Tennessee", 42), TX("Texas", 43), UT(
			"Utah", 44), VT("Vermont", 45), VA("Virginia", 46), WA("Washington", 47), WV("West Virginia", 48), WI(
			"Wisconsin", 49), WY("Wyoming", 50);

	private final String label;
	private Integer code;

	public Integer getCode() {
		return code;
	}

	State(final String label, final Integer code) {
		this.label = label;
		this.code = code;
	}

	public String getLabel() {
		return this.label;
	}

	public String getAbbreviation() {
		// Getter so can use as a bean
		return this.name();
	}

	// reverse lookup example
	private static final Map<Integer, State> LOOKUP = new HashMap<Integer, State>();

	static {
		for (State s : EnumSet.allOf(State.class))
			LOOKUP.put(s.getCode(), s);
	}

	public static State find(final Integer i) {
		// TODO Auto-generated method stub
		return LOOKUP.get(i);
	}
}
