package submit_class.submit2;

import java.util.ArrayList;
import java.util.Collections;

import lec09_class.nextit.Student;

public class submit2_Product {
	public static void main(String[] args) {
		ArrayList<Product> product = new ArrayList<Product>();
		
		product.add(new Product("냉장고", 2000000));
		product.add(new Product("TV", 1000000));
		product.add(new Product("에어컨", 800000));
		product.add(new Product("컴퓨터", 1300000));
		product.add(new Product("선풍기", 100000));
		
		System.out.println(product);
		
		for(int i = 0; i<product.size(); i++) {
			boolean swapped = false;
			for(int j = 0; j < product.size()-1-i; j++) {
				if(product.get(j).getPrice() > product.get(j+1).getPrice() ) {	// 캡슐화가 되어서 그냥 price를 붙이면 필드를 볼수없다고 에러가 뜸.
					Product temp = product.get(j);								// 그래서 클래스에서 public만든것 중에 getPrice()를 갖고옴.
					product.set(j, product.get(j+1));
					product.set(j+1, temp);
					swapped = true;
				}
			}
		}System.out.println(product); 		// 오름차순 정렬
		
		for(int i = 0; i<product.size();i++) {
			if(product.get(i).getName().equals("TV")) {
				System.out.println(i);		// 몇번째 인덱스인지 출력
			}
		}
		
		
	}
}
/*
 for(int i = 0; i < stuList.size(); i++) {
			boolean swapped = false;
			for(int j = 0; j < stuList.size() - 1 - i; j++) {
				// 아래 조건에서 부등호 방향만 바꿔주면
				// 오름차순과 내림차순이 바뀐다. 
				if(stuList.get(j).level < stuList.get(j+1).level) {
					Student temp = stuList.get(j);
					stuList.set(j, stuList.get(j+1));
					stuList.set(j+1, temp);
					swapped = true;
					
				}
			}
 *
 */
