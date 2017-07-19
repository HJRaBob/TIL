package sick_dan;

public class Get_val {//비교할 클래스

	Get_val(){}
	
	int min_val;
	int max_val;
	int type;
	void get_val(int min_val,int max_val,int type){//gui를 통해 바꿈
		this.min_val = min_val;
		this.max_val = max_val;
		this.type = type;
	}
}
