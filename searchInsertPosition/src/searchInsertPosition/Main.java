package searchInsertPosition;
import java.util.ArrayList;
public class Main {
	public static void main(String[] args) {
		ArrayList<Integer> arrayList=new ArrayList<>();
		arrayList.add(1);
		arrayList.add(3);
		arrayList.add(5);
		arrayList.add(7);
		insertPosition(arrayList,0);
		System.out.println(arrayList);
	}
	public static void insertPosition(ArrayList arrayList,int target) {
		int lastValue=(int) arrayList.get(arrayList.size()-1);
		if(target>lastValue) {
			arrayList.add(target);
		}
		else {
			int n=arrayList.size();
			for(int i=0;i<arrayList.size();i++) {
				int value=(int) arrayList.get(i);
				if(value>target) {
					arrayList.add(i,target);
					return;
				}
			}
		}
	}
}
