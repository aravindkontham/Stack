package Priority;

import java.util.PriorityQueue;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int arr[]={2,4,5,6,78,1};
        PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
        for(int i=0;i<arr.length;i++){
            pq.add(i);
        }
        System.out.println(pq);

    }
}
