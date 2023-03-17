package Q1;

public class QueueX {
	
	private int maxSize;
	private int queueArr[];
	private int front;
	private int rear;
	private int noItems;
	
	public QueueX(int s)
	{
		maxSize =s;
		queueArr = new int[maxSize];
		front = 0;
		rear = -1;
		noItems = 0;	
	}
	
	public void Insert(int j) {
		//increment rear
		if(rear==maxSize-1)
		{
			System.out.println("Queue is full");
		}
		else 
		{
			queueArr[++rear] =j;
			noItems++;//insert items
		}

	}
	
	public int remove()
	{
		if(noItems == 0)
		{
			System.out.println("Queue is empty");
			return -99;
		}
		else
		{
			noItems--;
			return queueArr[front++];
		}
	}
	
	public boolean isEmpty() {
		return(noItems==0);
	}
	
	public boolean isFull() {
		return(rear==maxSize-1);
	}

}
