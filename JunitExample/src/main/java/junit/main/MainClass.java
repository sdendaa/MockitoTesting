package junit.main;

import junit.entity.StringHelper;

public class MainClass {

	public static void main(String[] args) {
		StringHelper help =new StringHelper();
		String result = help.truncateAInFirst2Positions("BABAA");
		System.out.println(result);

	}

}
