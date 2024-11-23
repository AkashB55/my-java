package collectionConceptsPart02;

public class QueueArrayImp {

	int capacity;
	int queueArr[];
	int front;
	int rear;
	int currentSize;

	public QueueArrayImp(int sizeOfQueue) {
		this.capacity = sizeOfQueue;
		front = 0;
		rear = -1;
		queueArr = new int[this.capacity];
	}

	public void enqueue(int data) {
		if (isFull()) {
			System.out.println("hey, queue is full, can not insert the data");
		} else {
			rear++;
			if (rear == capacity - 1) {
				rear = 0;
			}
			queueArr[rear] = data;
			currentSize++;
			System.out.println(data + " added to the queue");
		}
	}

	public void dequeue() {
		if (isEmpty()) {
			System.out.println("Hey, queue is empty, can not delete element");
		} else {
			front++;
			if (front == capacity - 1) {
				System.out.println(queueArr[front - 1] + " removed from the queue");
				front = 0;
			} else {
				System.out.println(queueArr[front - 1] + " removed from the queue");
			}
			currentSize--;
		}
	}

	public boolean isFull() {
		if (currentSize == capacity) {
			return true;
		}
		return false;
	}

	public boolean isEmpty() {
		if (currentSize == 0) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {

		QueueArrayImp obj = new QueueArrayImp(10);
		obj.enqueue(10);
		obj.enqueue(20);
		obj.enqueue(30);

		obj.dequeue();
		obj.enqueue(40);
		obj.dequeue();

		obj.enqueue(50);
		obj.enqueue(60);
		obj.dequeue();

		obj.enqueue(70);
		obj.enqueue(80);

		obj.dequeue();

		obj.enqueue(750);
		obj.enqueue(830);
		obj.dequeue();
		obj.dequeue();
	}
}