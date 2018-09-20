//https://icpcarchive.ecs.baylor.edu/index.php?option=com_onlinejudge&Itemid=8&page=show_problem&problem=4971

import java.util.*;

class Judging{

	public void Judging(){
		Scanner scan = new Scanner(System.in);
		while (scan.hasNext()){
		Map<String, Integer> myMap = new HashMap<String, Integer>();

		int n = scan.nextInt();
		scan.nextLine();
		int counter = 0;

		for(int i = 0; i < n; i++){
			String output = scan.nextLine();
			int freq = 0;
			if(myMap.putIfAbsent(output, 0) != null){
				int newNum = myMap.get(output) + 1;
				myMap.replace(output, newNum);
			}
		}

		for(int j = 0; j < n; j++){
			String outputTwo = scan.nextLine();
			if(myMap.containsKey(outputTwo) && myMap.get(outputTwo) >= 0){
				counter++;
				int newNum2 = myMap.get(outputTwo) -1;
				myMap.replace(outputTwo, newNum2);
		}
		}
		//Set<String> keys = myMap.keySet();
		//for(String)

		System.out.println(counter);
	}
}

	public static void main(String[] args){
		new Main().Test();
	}
}
