package com.datastructure.stack.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueImpl {
	public static void main(String[] args) {
		Queue<String> q = new LinkedList<>();
		q.add("Hell ");
		q.add("Student ");
		q.add("Exam ");
		q.add("is knocking at the door");
		
		System.out.println("Element in queue" + q);
		System.out.println("Remove Element " + q.remove());
		System.out.println("Head : " + q.element());
		System.out.println("Poll " + q.poll());
		System.out.println("Peek " + q.peek());
		System.out.println("Elements in Queue:" + q);
	}
}
