package com.example.codingtest.custom;

import java.util.Stack;

public class Queue {

	private static Stack<Integer> elementStack;
	private static Stack<Integer> storedStack;

	// 스택 2개로 Queue
	public void operate(){

		// 스택 하나는 그대로
		// 스택 하나는 임시 저장용

		elementStack = new Stack<>();
		storedStack = new Stack<>();

		// 배열에 있는 요소를 스택 저장하겠습니다.
		elementStack.add(1);
		elementStack.add(2);
		elementStack.add(3);
		elementStack.add(4);


		offer(5);
		System.out.println("d");
		System.out.println(elementStack);

		System.out.println(poll());
		System.out.println(elementStack);


		System.out.println(peek());
		System.out.println(elementStack);



	}

	public void offer(int addElemnet){
		elementStack.add(addElemnet);
	}


	public int poll(){

		// 1. 맨 앞에 있는 요소를 제외 하고 모든 요소를 꺼낸다음
		// 2. stordStack에 저장할 생각입니다.
		int elementSize = elementStack.size();
		for (int index = 0 ; index < elementSize -1 ; index++ ){
			int element = elementStack.pop();
			storedStack.add(element);
		}



		int pollElement = 0;
		// 3. 그리고 맨 앞에 있는 요소를 꺼내서 반환하고
		if (!elementStack.isEmpty() && elementStack.size() == 1){
			pollElement = elementStack.pop();
		}


		int storedStackSize = storedStack.size();
		// 4. storedStack에 저장되어 있는 값들을 선입후출로 다시 꺼내서  elementStack에 저장하려고 합니다.
		for (int index = 0 ; index < storedStackSize; index++ ){
			elementStack.add(storedStack.pop());
		}

		// 5. 값을 반환
		return pollElement;

	}


	public int peek(){
		int elementSize = elementStack.size();
		for (int index = 0 ; index < elementSize -1 ; index++ ){
			int element = elementStack.pop();
			storedStack.add(element);
		}



		int peakElement = 0;
		// 3. 그리고 맨 앞에 있는 요소를 꺼내서 반환하고
		if (!elementStack.isEmpty()){
			peakElement = elementStack.peek();
		}


		int storedStackSize = storedStack.size();
		// 4. storedStack에 저장되어 있는 값들을 선입후출로 다시 꺼내서  elementStack에 저장하려고 합니다.
		for (int index = 0 ; index < storedStackSize; index++ ){
			elementStack.add(storedStack.pop());
		}

		// 5. 값을 반환
		return peakElement;
	}




}
