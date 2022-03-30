package lec14_jdbc_jsp;

import java.util.ArrayList;

import lec14_jdbc_jsp.model.Student;
import lec14_jdbc_jsp.service.StudentService;

public class StudentMain {

	public static void main(String[] args) {
		StudentService service = StudentService.getInstance();	//싱글톤 방식 꺼내는 건 getInstance. 싱글톤 패턴은 기본 생성자 자체를 
																//private으로 생성하여 new 연산자를 통해 생성하지 못하도록 제약을 둔다
																// 생성자를 통해 객체를 만들수 없어서 getInstance메소드를 통해 객체를 불러옴


		// 학생 목록 조회
		ArrayList<Student> stuList = service.stuList();
		
		for(Student st : stuList) {
			System.out.println(st.toString());
		}
		
		// 학생 추가
		Student wontae = new Student();
		wontae.setStuName("원태");
		wontae.setStuScore(700);
		
		int result = service.insertStu(wontae);
		
		if(result>0) {
			System.out.println("등록 성공");
			stuList = service.stuList();
			for(Student st : stuList) {
				System.out.println(st.toString());
			}
		}
		
		
	}

}
