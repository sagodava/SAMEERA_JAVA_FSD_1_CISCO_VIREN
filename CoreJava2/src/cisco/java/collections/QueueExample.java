package cisco.java.collections;

import java.util.PriorityQueue;

public class QueueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<String> queue=new PriorityQueue<String>();
		queue.add("INDIA");
		queue.add("CHINA");
		queue.add("SRILANKA");
		queue.add("AMERICA");
		queue.add("EUROPE");
		queue.add("AUSTRAILA");
		queue.add("JAPAN");
		System.out.println("Priority Queue elements :"+queue);
		queue.remove("INDIA");
		queue.remove("JAPAN");
		
		System.out.println("After removing elements :"+queue);
		queue.add("PAKISTAN");
		queue.add("SINGAPORE");
		System.out.println("After adding elements :"+queue);
		System.out.println("head using peek :"+queue.peek());
		System.out.println("After adding elements :"+queue);


		
	}

}
