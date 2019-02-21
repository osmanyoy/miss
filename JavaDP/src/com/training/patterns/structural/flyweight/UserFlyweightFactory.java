package com.training.patterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class UserFlyweightFactory {
	private static Map<EUserType, UserFlyweight> cache = new HashMap<>();

	public static UserFlyweight createFlyweight(final EUserType eUserType) {
		UserFlyweight userFlyweight = UserFlyweightFactory.cache.get(eUserType);
		if (eUserType == null) {
			// Cache e koy ve ver
			switch (eUserType) {
			case USER1:
				userFlyweight = new UserFlyweight();
				// Obje yi doldur
				break;
			case USER2:
				userFlyweight = new UserFlyweight();
				// Obje yi doldur
				break;
			case USER3:
				userFlyweight = new UserFlyweight();
				// Obje yi doldur
				break;
			default:
				userFlyweight = new UserFlyweight();
				// Obje yi doldur
				break;
			}
			UserFlyweightFactory.cache.put(eUserType,
			                               userFlyweight);
		}
		return userFlyweight;
	}
}
