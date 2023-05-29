package com.test.testing.problems;

import java.io.Serializable;

public class DateUtil implements Serializable, Cloneable {

	private static final long serialVersionUID = 1L;
	private static volatile DateUtil dateUtil;

	private DateUtil() {

	}

	public static DateUtil getDateUtil() {
		if (dateUtil == null) {

			synchronized (DateUtil.class) {

				if (dateUtil == null) {

					dateUtil = new DateUtil();
				}
			}
		}
		return dateUtil;
	}

	protected Object readResolve() {
		return dateUtil;

	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}

}
