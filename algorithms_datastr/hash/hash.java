//hash.java program
//linear probing
//
import java.io.*;

class DataItem{
  private int iData; //could have more data. data item (key)

  public DataItem(int ii) //constructor
    {iData = ii;}

  public int getKey() //これはなんなのか。メソッドだろうか。DataItem(4) = iData = 4. DataItem(4).getkey = 4
    {return iData;}
} //end class DataItem

class HashTable
  {
    private DataItem[] hashArray; //array holds hash table
    private int arraySize;
    private DataItem nonItem; //for deleted items

    public HashTable(int size) //constructor
    {
      arraySize = size;
      hashArray = new DataItem[arraySize];
      nonItem = new DataItem(-1); // deleted item key is -1
    }

    public void displayTable()
    {
      System.out.print("table: ");
      for (int j=0; j< arraySize; j++)
        {
          if(hashArray[j] != null)
            System.out.print(hashArray[j].getKey() + " ");
          else
            System.out.print("** ");
        }
      System.out.println("");
    }

    public int hashFunc(int key)
      {
        return key % arraySize; //hash function
      }

    public void insert(DataItem item) // insert a DataItem
      //assumes table not full
      //locate where a data item should go.
      //looks for an empty cell or a deleted item(key -1)
        {
          int key = item.getKey(); //extract key
          int hashVal = hashFunc(key); //hash the key
          while(hashArray[hashVal] != null && hashArray[hashVal].iData != -1)
            {
              ++hashVal; //go to next cell
              hashVal %= arraySize;
            }
          hashArray[hashVal] = item; //insert item
        }

    public DataItem delete(int key) //delete DataItem
        {
          int hashVal = hashFunc(key);

          while(hashArray[hashVal] != null)
          {
            if(hashArray[hashVal].getKey() == key)
            {
              DataItem temp = hashArray[hashVal]; //save item
              hashArray[hashVal] = nonItem; //delete item
              return temp;
            }
            ++hashVal;
            hashVal %= arraySize;
          }
        return null;
      } //end delete()

  public DataItem find(int key) //if the item does contain the key, find() returns the item
//assumes table not full
    {
      int hashVal = hashFunc(key);

      while(hashArray[hashVal]!= null)
        {
          if(hashArray[hashVal].getKey() == key)
            return hashArray[hashVal];
          ++hashVal; //go to the next cell
          hashVal %= arraySize; //wrap around if necessary
        }
      return null;
    }
  } //end class hashtable
