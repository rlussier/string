public class Program
{
	public static void main(String[] args) {
		// instance variables
		
	   // the data to store in this node 
	   private Object myData;
	   
	   // the link to the next node (preumably in a list)
	   private Program myNext;
	   
	   /**
	    * default constructor
	    * pre: none<br>
	    * post: getData() = null, getNext() = null
	    */
	    
	    public Program(){
	        this(null, null);
	    }
	    /**
    	 * create a Program that holds the specified data and refers to the specified next element
    	 * pre: none<br>
    	 * post: getData() = item, getNext() = next
    	 * @param item the  data this Program should hold
    	 * @param next the next node in the list
    	 */
    	 public Program(Object data, Program next){
    	     myData = data;
    	     myNext = next;
    	 }
    	 /**
    	  * return the data in this node
	      * pre: none<br>
	      * @return the data this ListNode holds
	      */
      public Object getData(){
          return myData;
      }
      /**
	 * return the Program this Program refers to
	 * pre: none<br>
	 * @return the Program this Program refers to (normally the next one in a list)
	 */
        public Program getNext(){
            return myNext;
        }
        /**
	     * set the data in this node
    	 * The old data is over written.<br>
	     * pre: none<br>
	     * @param data the new data for this Program to hold
	     */
	}
	public void setData(Object data){
	    myData = data;
	}
	/**
	 * set the next node this Program refers to
	 * pre: none<br>
	 * @param next the next node this Program should refer to
	 */
	 public void setNext(Program next){
	     myNext = next;
	 }
}
