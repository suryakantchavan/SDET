package LL;

import java.util.Scanner;

public class LLUse {

	public static Node<Integer> createLL() {
		Scanner sc = new Scanner(System.in);
		int data = sc.nextInt();

		Node<Integer> head = null;
		Node<Integer> tail = null;

		while (data != -1) {
			Node<Integer> currentNode = new Node<Integer>(data);
			if (head == null) {
				head = currentNode;
				tail = currentNode;

			} else {
				tail.next = currentNode;
				tail = tail.next;
			}

			data = sc.nextInt();

		}

		return head;

	}

	public static void main(String[] args) {
		Node<Integer> head = createLL();

		Node<Integer> temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		
	}

}
