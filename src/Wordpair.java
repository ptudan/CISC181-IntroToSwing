
public class Wordpair {
	private String word;
	private String num;
	
	public Wordpair(String w){
		word = w;
		num = wordToNum(w);
	}
	
	private String wordToNum(String w){
		String num = "";
		w = w.toLowerCase();
		for(int i = 0; i<w.length(); i++){
			char cur = w.charAt(i);
			if("abc".indexOf(cur)>=0){
				num+="2";
			}
			else if("def".indexOf(cur)>=0){
				num+="3";
			}
			else if("ghi".indexOf(cur)>=0){
				num+="4";
			}
			else if("jkl".indexOf(cur)>=0){
				num+="5";
			}
			else if("mno".indexOf(cur)>=0){
				num+="6";
			}
			else if("pqrs".indexOf(cur)>=0){
				num+="7";
			}
			else if("tuv".indexOf(cur)>=0){
				num+="8";
			}
			else if("wxyz".indexOf(cur)>=0){
				num+="9";
			}
		}
		return num;
	}
	
	public String getWord(){
		return word;
	}
	
	public String getNum(){
		return num;
	}
}
