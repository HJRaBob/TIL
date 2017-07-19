package sick_dan;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Scanner;

public class FileIO {
	FileIO(){}
	
	int _min_val,_max_val,_type; // GUI로 입력 받을 값들
	Restorant r;
	Get_val g = new Get_val();//테스트
	LinkedList<Restorant> list = new LinkedList<Restorant>();
	
	void input() throws FileNotFoundException{// 링크드 리스트생성
		File file = new File("c:/Users/student/Desktop/data.txt");
		Scanner scan = new Scanner(file);
		
		while(scan.hasNext()){        // 파일 읽어서 추가
		String name = scan.next();     
		int min_val =  Integer.parseInt(scan.next());
		int max_val =  Integer.parseInt(scan.next());
		int type =  Integer.parseInt(scan.next());
		int m_count =  Integer.parseInt(scan.next());
		int w_count =  Integer.parseInt(scan.next());
		boolean yesterday =  Boolean.parseBoolean(scan.next());
		Restorant r = new Restorant(name,min_val,max_val,type,m_count,w_count,yesterday);
		list.add(r);
		}
	
	}
	
	void erase(){//조건에 맞지 않는 식당 지우기
		for(int i = 0; i < list.size();){
			 Restorant rr = list.get(i);
			 if((rr.min_val<g.min_val)||(rr.max_val>g.max_val)||(rr.type != g.type)||(rr.yesterday == true)){
				 list.remove(i);
			 }else{
				 i++;
			 }		
		}
	}
	
	void sort(){//내림차순 정렬
		for(int i = 0; i < list.size();){
			Restorant rr = list.get(i);
			Restorant max = rr;
			int i_max = i;
			for(int j = i+1;j<list.size();j++){
				Restorant ff = list.get(j);
				if(max.cal_score()<ff.cal_score()){
					max = ff;
					i_max = j;
				}
			}
			list.add(i,max);
			list.remove(i+1);
			list.add(i_max,rr);
			list.remove(i_max+1);
			i++;
		}
	}
	
	String disp(int rad){//출력
			Restorant rr = list.get(rad);
			return rr.name;
	}
	
	void delet(){
		for(int i=0;i<list.size();)
			list.remove(0);
	}
	
}