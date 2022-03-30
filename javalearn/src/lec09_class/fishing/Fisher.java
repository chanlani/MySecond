package lec09_class.fishing;

import java.util.ArrayList;

public class Fisher {
	String name;
	ArrayList<Fish> bag; // = new ArrayList<Fish>(); 아래 어레이리스트 지우고 여기다 넣어도 됨.
	public Fisher(String name) {
		this.name = name;
		this.bag = new ArrayList<Fish>();
	}
}
