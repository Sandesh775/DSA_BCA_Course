Documentation: Circular Queue and Double-Ended Queue (Deque)

*Circular Queue*

Definition

A Circular Queue is a linear data structure that follows FIFO (First In First Out) principle but connects the last position back to the first, forming a circle. It efficiently utilizes memory by reusing empty slots created after dequeuing.



Key Characteristics

Aspect				Description

Principle			FIFO (First In First Out)

Operations			Enqueue (rear), Dequeue (front)

Pointer Movement		Both pointers move forward only, with wrap-around

Memory Usage			Reuses empty spaces at front



Core Operations

Operation			Description				Formula

Enqueue			Add element at rear				rear = (rear + 1) % capacity

Dequeue			Remove from front				front = (front + 1) % capacity

isEmpty			Check if no elements				size == 0 or front == rear (with wasted slot)

isFull			Check if queue is full				size == capacity or (rear + 1) % capacity == front





*Double-Ended Queue (Deque) — Circular Implementation*

Definition

A Deque (Double-Ended Queue) is a linear data structure that allows insertion and deletion of elements from both ends — front and rear. In circular implementation, it uses modulo arithmetic to wrap pointers around.



Key Characteristics

Aspect	Description

Principle	Can behave as FIFO or LIFO

Operations	Insert/Delete from both front and rear

Pointer Movement	Both pointers can move forward AND backward

Flexibility	Can function as stack or queue

Core Operations

Operation	Description			Formula

insertFront	Add element at front	front = (front - 1 + capacity) % capacity

insertRear	Add element at rear	rear = (rear + 1) % capacity

deleteFront	Remove from front	front = (front + 1) % capacity

deleteRear	Remove from rear	rear = (rear - 1 + capacity) % capacity

getFront	View front element	a\[front]

getRear		View rear element	a\[(rear - 1 + capacity) % capacity]



Special Cases

Case			Handling

First element		Both front and rear point to same index

Last element removal	Reset both pointers to clean state

Full condition		size == capacity (with size tracking)

Empty condition		size == 0





Comparison: Circular Queue vs Deque

Feature			Circular Queue			Deque

Insertion		Only at rear			Both ends

Deletion		Only from front			Both ends

Pointer Movement 	Forward only			Forward and backward

Complexity		Simpler				More complex

Flexibility		Limited				High

