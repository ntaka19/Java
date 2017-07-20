//rule 1: visit the next unvisited vertex that's adjacent to the current vertex.
//mark it, and instert it into the queue
//rule 2: If you can't carry out rule 1 because there are no more unvisited vertices,
//remove a vertex from the queue and make it the current vertex
//rule 3: If you can't carry out rule 2 because the queue is empty, you are done.

class Queue
  {
    private final int SIZE = 20;
    private int[] queArray;
    private int front;
    private int rear;

    public Queue()
    {
      queArray = new int[SIZE];
      front = 0;
      rear = -1;
    }

    public void insert(int j) //put item at rear of queue
    {
      if(rear == SIZE-1)
        rear = -1;
      queArray[++rear] = j;
    }
    public int remove()
    {
      int temp = queArray[front++];
      if(front == SIZE)
        front = 0;
      return temp;
    }

    public boolean isEmpty()
    {
      return (rear+1 == front || (front+SIZE-1 ==rear));
    }
  }
  class Vertex
  {
    public char label; //label (e.g. 'A')
    public boolean wasVisited;

    public Vertex(char lab) //constructor
    {
      label = lab;
      wasVisited = false;
    }
  }

  class Graph{
    private final int MAX_VERTS = 20;
    private Vertex vertexList[]; //list of vertices
    private int adjMat[][]; // adjacency matrix 中に入るものを最初定義しているかんじか。
    private int nVerts; //current number of vertices
    private Queue theQueue;

    public Graph() //constructor
      {
        vertexList = new Vertex[MAX_VERTS];
        adjMat = new int[MAX_VERTS][MAX_VERTS];
        nVerts = 0;
        for(int j = 0; j<MAX_VERTS; j++)
          for(int k = 0; k<MAX_VERTS; k++)
            adjMat[j][k] = 0;
        theQueue = new Queue();
      } //end constructor

    public void addVertex(char lab)
    {
      vertexList[nVerts++] = new Vertex(lab);
    }

    public void addEdge(int start, int end)
    {
      adjMat[start][end] = 1;
      adjMat[end][start] = 1;
    }
    public void displayVertex(int v)
    {
      System.out.print(vertexList[v].label);
    }


  public void bfs()
   {
    vertexList[0].wasVisited = true;
    displayVertex(0);
    theQueue.insert(0); //insert at tail
    int v2;

    while ( !theQueue.isEmpty())
    {
      int v1 = theQueue.remove(); //remove vertex at head.

      while ( (v2 = getAdjUnvisitedVertex(v1)) != -1)
      {
        vertexList[v2].wasVisited = true;
        displayVertex(v2);
        theQueue.insert(v2);
        }
    } //end while(queue not empty)

    for(int j=0; j< nVerts; j++)
    vertexList[j].wasVisited = false;
  } //end bfs

  public int getAdjUnvisitedVertex(int v)
  {
    for(int j=0 ; j< nVerts; j++)
      if(adjMat[v][j] == 1 && vertexList[j].wasVisited == false) //となりかつ、unvisited
        return j;
      return -1;
    }
  } //end classs Graph

  class BFSApp
  {
    public static void main(String[] args)
    {
      Graph theGraph = new Graph();
      theGraph.addVertex('A'); //0 (start for dfs)
      theGraph.addVertex('B'); //1
      theGraph.addVertex('C'); //2
      theGraph.addVertex('D'); //3
      theGraph.addVertex('E'); //4

      theGraph.addEdge(0,1);
      theGraph.addEdge(1,2);
      theGraph.addEdge(0,3);
      theGraph.addEdge(3,4); //DE

      System.out.print("Visits: ");
      theGraph.bfs(); //bfs
      System.out.println();
    }//end main
  }
//end class BFSApp

//notice the difference between output of BFSAPP and DFSApp
