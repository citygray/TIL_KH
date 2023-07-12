package subject_management;

import java.util.ArrayList;

import academic_management.MenuViewer;

public class SubjectManagement {
	private SubjectDAO dao = SubjectDAO.getInstance();
	
	public void read(){
        ArrayList<SubjectVO> svo = dao.getSubjectTotal();
        System.out.println("\n**** subject 테이블 데이터 출력 ****");
        System.out.println("번호\t학과번호\t학과명");
        if(svo.size() > 0) {
            //for(int i = 0; i < svo.size(); i++){
            // SubjectVO sub = svo.get(i);
            for(SubjectVO sub : svo) {
                System.out.print(sub.getNo()+"\t");
                System.out.print(sub.getS_num()+"\t");
                System.out.println(sub.getS_name()+"\t");
            }
        } else {
            System.out.println("학과 정보가 존재하지 않습니다.");
        }
    }
	
	private SubjectVO inputData(String mode) {
		String s_num = null, s_name = null;
		int no;
		
		/* SubjectDAO클래스에서getSubjectNum()메서드가 정의 되면 아래의 입력 부분을 주석처리한다. */
		//System.out.println("학과코드 입력: ");
		//s_num = MenuViewer.keyboard.nextLine();
		
        SubjectVO sub = null;
        
		if(mode.equals("update")) {
			System.out.print("일련번호 입력 : ");
			no =  MenuViewer.keyboard.nextInt() ;
			MenuViewer.keyboard.nextLine();
			
			System.out.print("학과명 입력 : ");
	        s_name = MenuViewer.keyboard.nextLine();
	        
			sub = new SubjectVO(no,s_num,s_name);
		}else if(mode.equals("input")) {
			s_num = dao.getSubjectNum();
			System.out.print("학과명 입력 : ");
	        s_name = MenuViewer.keyboard.nextLine();
			sub = new SubjectVO(0,s_num,s_name);
		}else if(mode.equals("delete")) {
			System.out.print("일련번호 입력 : ");
			no =  Integer.parseInt(MenuViewer.keyboard.nextLine()) ;
			sub = new SubjectVO(no,s_num,s_name);
		}else if( mode.equals("search")) {
			System.out.print("학과명 입력 : ");
	        s_name = MenuViewer.keyboard.nextLine();
			sub = new SubjectVO(0,s_num,s_name);
		}

		
		return sub;
		
	}
	
	public void create() {
		SubjectVO svo = inputData("input");
		boolean result = dao.subjectInsert(svo);
		
		if(result) {
			System.out.println("학과 데이터 입력 성공");
		}else {
			System.out.println("학과 데이터 입력 실패");
		}
	}
	
	public void update() {
		SubjectVO svo = inputData("update");
		boolean result = dao.subjectUpdate(svo);
		
		if(result) {
			System.out.println("학과 데이터 업데이트 성공");
		}else {
			System.out.println("학과 데이터 업데이트 실패");
		}
	}

	public void delete() {
		SubjectVO svo = inputData("delete");
		if(dao.getDeletable(svo.getNo())>0) {
			System.out.println("해당학과에 학생이 존재하여 삭제 불가합니다.확인 바람");
		}else {
			boolean result = dao.subjectDelete(svo);
			if(result) {
				System.out.println("학과 데이터 삭제 성공");
			}else {
				System.out.println("학과 데이터 삭제 실패");
			}
		}
	}

	/*
	public void search() {
		SubjectVO svo = inputData("search");
		SubjectVO resultSvo = dao.subjectSearchNo(svo);
		
		if(resultSvo.getNo()>0) {
			System.out.println("학과 데이터 검색 성공");
			System.out.println("번호\t학과번호\t학과명");
			System.out.print(resultSvo.getNo()+"\t");
            System.out.print(resultSvo.getS_num()+"\t");
            System.out.println(resultSvo.getS_name()+"\t");
		}else {
			System.out.println("학과 데이터 검색 실패");
		}
	}
	*/
	
	
	public void search(){
		SubjectVO svo = inputData("search");
        ArrayList<SubjectVO> svoList = dao.subjectSearch(svo);
        System.out.println("\n**** subject 테이블 데이터 출력 ****");
        System.out.println("번호\t학과번호\t학과명");
        if(svoList.size() > 0) {
            //for(int i = 0; i < svo.size(); i++){
            // SubjectVO sub = svo.get(i);
            for(SubjectVO sub : svoList) {
                System.out.print(sub.getNo()+"\t");
                System.out.print(sub.getS_num()+"\t");
                System.out.println(sub.getS_name()+"\t");
            }
        } else {
            System.out.println("해당 학과명에 학과 정보가 존재하지 않습니다.");
        }
    }
}
