package Lab_5;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.*;
public class TextApp {
	private String[] words;
	private String[] labels;
	private HashMap<String,Integer> hash;
	
	public TextApp(){
		words = Split();
		labels = UniqueLabels(words);
		hash = Count(words,labels);
	}
	
	//Methods
	String[] Split() {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		StringTokenizer st = new StringTokenizer(s,"# ");
		int size = st.countTokens();
		String[] res = new String[size];
		int j=0;
		while(st.hasMoreTokens()) {
			res[j] = st.nextToken();
			j++;
		}
		return res;

	}
	String[] UniqueLabels(String words[]) {
		Set<String> Strset = new HashSet<>();

		Collections.addAll(Strset, words);
		String fin[] = Strset.toArray(new String[Strset.size()]);
		System.out.println(fin);
		return fin;
	}
	
	HashMap<String,Integer> Count(String words[],String labels[]) {
		HashMap<String,Integer> mp = new HashMap<String, Integer>();
		for(String s:labels) {
			mp.put(s, 0);
		}
		for(String x:words) {
			int a = mp.get(x);
			a ++;
			mp.replace(x, a);
		}
		return mp;
	}
	
	void display(int n) {
		HashMap<String,Integer> hmap = this.hash;
		Set set = hmap.entrySet();
        Iterator iterator = set.iterator();
        Map<String, Integer> map = new TreeMap<String, Integer>(hmap); 
        Set set2 = map.entrySet();
        Iterator iterator2 = set2.iterator();
        while(n>0) {
             Map.Entry me2 = (Map.Entry)iterator2.next();
             System.out.print(me2.getKey() + ": ");
             System.out.println(me2.getValue());
        }
		
	}
	public static void main(String[] args) {
		TextApp t = new TextApp();
		for(String x:t.words) System.out.println(x);
		for(String x:t.labels) System.out.println(x);
		t.display(2);
	}
}
