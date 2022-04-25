// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html

class PeekingIterator implements Iterator<Integer> {
    List<Integer> arr;
    int curr=0;
    int size=0;
   // Iterator<Integer> arr;
	public PeekingIterator(Iterator<Integer> iterator) {
	    // initialize any member here.
        //int size=iterator.size();
        arr = new ArrayList<>();
        while(iterator.hasNext())
        {
            arr.add(iterator.next());
        }
        size = arr.size();
	    
	}
	
    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
        if(curr<size) return arr.get(curr);
        return null;
	}
	
	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
	    if(curr<size)
        {return arr.get(curr++);
        }
        return null;
	}
	
	@Override
	public boolean hasNext() {
	    if(curr<=size-1) return true;
        return false;
	}
}