package Hw3_18000949.Ex3;

import java.util.Iterator;


public class SimpleArrayList<T> implements ListInterface<T> {
    private T[] array;
    private int n = 0;
    private int defaultSize = 100;

    public SimpleArrayList(){
        array = (T[]) new Object[defaultSize];
    }
    public SimpleArrayList(int capacity) {
        //Hàm dựng với kích thước mảng là capacity
        array = (T[]) new Object[capacity];
    }
    public void add(T data) {
        array[n++] = data;
    }
    public T get(int i) {
        if(i >= 0 && i <= n)
            return array[i];
        else
            return null;
    }
    public void set(int i, T data) {
        if(i >= 0 && i <= n)
            array[i] = data;
        else
            System.out.println("Error!");
    }
    public void remove(T data){
        for (int i = 0; i < n; i++) {
            if(array[i].equals(data))
                for (int j = i+1; j < n; j++) {
                    array[j-1] = array[j];
                    n--;
                }
        }
    }
    public boolean isContain(T data) {
        for (int i = 0; i < n; i++) {
            if(array[i].equals(data)) 
                return true;
        }
        return false;
    }
    public int size() {
        int count = 0 ;
        for (int i = 0; i < n; i++) {
            if(array[i] != null)
                count++;
        }
        return count;
    }
    public boolean isEmpty() {
        if(n != 0) 
            return false;
        return true; 
    }
    public Iterator<T> iterator() {
        //Trả về toàn bộ danh sách
        return new Iterator<T>() {
			private int index = 0;
			@Override
			public boolean hasNext() {
				if(index < n && array[index] != null)
					return true;
				return false;
			}

			@Override
			public T next() {
                // TODO Auto-generated method stub
                if(hasNext())
                    return array[index++];
                return null;
			}
        };
    }
    public static void print(SimpleArrayList<String> array) {
		for(String str: array ) {
			System.out.print(str.toString() + " ");
		}
	}
    public static void main(String[] args) {
        //Type: String
        SimpleArrayList<String> array = new SimpleArrayList<>();
        array.add("Cấu");
        array.add("Trúc");
        array.add("Dữ");
        array.add("Liệu");
        array.add("Và");
        array.add("Giải");
        array.add("Thuật");
        System.out.println("List: ");
        print(array);
        System.out.println();
		System.out.println("Element in index 2: "+ array.get(2));
		System.out.println("Size: "+ array.size() );
		System.out.println("IsEmpty: "+ array.isEmpty());
        System.out.println();
        System.out.println("Iterator: ");
        Iterator<String> output = array.iterator();
        while(output.hasNext())
            System.out.println(output.next());
        //add
		System.out.println();
		System.out.println("Add string K63A2: ");
		array.add("K63A2");
        print(array);
        System.out.println();
		
		//set data
		System.out.println();
		System.out.println("Set data in index 3: ");
		array.set(3,"liệu");
        print(array);
        System.out.println();
		
		//delete
		System.out.println();
		System.out.println("Remove data in index 4: ");
        array.remove("Và");
        print(array);
        System.out.println();

        //contain
		System.out.println();
		System.out.println("Contain string Và: ");
        System.out.println(array.isContain("Và"));
        System.out.println("Contain string Thuật: ");
        System.out.println(array.isContain("Thuật"));
    }
}
