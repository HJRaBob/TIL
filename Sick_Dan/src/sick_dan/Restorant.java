package sick_dan;
class Restorant{//파일을 통해 입력받을 값
	Restorant(String name,int min_val,int max_val,int type,int m_count,int w_count,boolean yesterday){
		this.min_val = min_val;
		this.max_val = max_val;
		this.yesterday = yesterday;
		this.m_count = m_count;
		this.w_count = w_count;
		this.type = type;
		this.name = name;
	}
	String name;
	
	int min_val;
	int max_val;
	int type;
	boolean yesterday;
	
	int m_count;
	int w_count;
	
	int fin_score;
	
	int w_score(){
		int score = 100;
		score -= w_count*33;
		return score;
	}
	int m_score(){
		int score = 100;
		score -= m_count*12;
		return score;
	}
	int cal_score(){
		fin_score = w_score()+m_score();
		return fin_score;
	}
}
