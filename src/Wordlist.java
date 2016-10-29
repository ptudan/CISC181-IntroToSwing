import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Wordlist {
	private Wordpair[] list;
	
	public Wordlist(String t){
		File myFile = new File(t);
		Scanner in = null;
		try {
			in = new Scanner(myFile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int lCount = 0;
		while(in.hasNext()){
			lCount +=1;
			in.nextLine();
		}
		in.close();
		
		Scanner ln = null;
		try {
			ln = new Scanner(myFile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		list = new Wordpair[lCount];
		int index = 0;
		while(ln.hasNext()){
			list[index] = new Wordpair(ln.nextLine());
			index +=1;
		}
		ln.close();
	}
	
	public String wToN(String w){
		for(int i = 0; i<list.length; i++){
			if(w.equals(list[i].getWord())){
				return list[i].getNum();
			}
		}
		return "Word not found";
	}
	
	public String nToW(String n){
		String ret = "Num String not found";
		for(int i = 0; i<list.length; i++){
			if(n.equals(list[i].getNum())){
				System.out.println(list[i].getWord());
				ret = list[i].getWord();
			}
		}
		return ret;
	}
	
	public void matching(){
		for(int i = 0; i<list.length; i++){
			for(int j = 0; j<list.length; j++){
				if(i!=j){
					if(list[i].getNum().equals(list[j].getNum())){
						System.out.println(list[j].getWord()
								+ " matches " + list[i].getWord());
					}
				}	
			}
		}
	}
	
	
}
