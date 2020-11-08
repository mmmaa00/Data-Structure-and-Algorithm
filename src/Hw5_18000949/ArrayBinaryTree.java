package Hw5_18000949;
import java.util.Scanner;
//Ex 1.1
public class ArrayBinaryTree<E,T> implements BinaryTreeInterface<T> {
    private E [] array;
    private int n = 0;
    private int defaultsize = 100;

    public ArrayBinaryTree() {
        array = (E[]) new Object[defaultsize];
    }
    
    @Override
    public T root() {
        if(isEmpty())
            return (T) Integer.valueOf(-1);
        return (T) Integer.valueOf(1);
    }
    public int size() {
        //number of node in tree
        return n;
    }
    public boolean isEmpty() {
        return n == 0;
    }
    public int numChildren(T p) {
        //number of children of element p
        if(p instanceof Integer) {
            if(isEmpty())
                return 0;
            int index = (int) p;
            int count = 0;
            if(array[2 * index] != null) count++;
            if(array[2 * index + 1] != null) count++;
            return count;
        }
        return 0;
    } 

    @Override
    public T parent(T p) {
        //return parent of p
        int temp = (int) p ;
        if(temp < 2 || temp > defaultsize)
            return null;
        return (T) Integer.valueOf(temp/2);
    }

    @Override
    public T left(T p){
        //return left child of p
        int temp = (int) p ;
        if(temp <= 0 || temp > defaultsize/2)
            return null;
        return (T) Integer.valueOf(temp*2);
    } 

    @Override
    public T right(T p) {
        //return right child of p
        int temp = (int) p ;
        if(temp < 0 || temp >= defaultsize/2 - 1)
            return null;
        return (T) Integer.valueOf(temp*2 + 1)  ;
    } 

    @Override
    public T sibling(T p) {
        //return sibling of p
        if(p instanceof Integer) {
            int temp = (int) p;
            return (T) Integer.valueOf(temp % 2 == 2? temp + 1: temp - 1);
        }
        return null;
    } 

    public E get(T p) {
        if(p instanceof Integer) {
            int temp = (int) p;
            return array[temp];
        }
        return null;
    }

    public void setRoot(E element) {
        // Set element to root of an empty tree (at index 1)
        if(!isEmpty())
            System.out.println("Root đã tồn tại!");
        else {
            array[1] = element;
            n++;
        }
    }

    public void setLeft(int p, E element) {
        // Set left child of p (at index 2p)
        if(p * 2 >= defaultsize) {
            System.out.println("Tràn mảng");
        }
        else {
            array[p * 2] = element;
            n++;
        }
    }

    public void setRight(int p, E element) {
        // Set right child of p (at index 2p+1)
        if(p * 2 + 1 >= defaultsize) {
            System.out.println("Tràn mảng");
        }
        else {
            array[p * 2 + 1] = element;
            n++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		ArrayBinaryTree array = new ArrayBinaryTree();
		array.setRoot("A");
		array.setLeft(1, "B");
		array.setRight(1, "C");
		array.setLeft(2, "D");
		array.setRight(2, "E");
		array.setLeft(3, "F");
        array.setRight(3, "G");
        array.setLeft(4, "H");
		
		System.out.println("Element of Tree:");
		for(int i = 1; i <= array.size(); i++) {
			System.out.print(array.array[i] + " ");
		}
		System.out.println();
		System.out.println("***************");
		
		System.out.println("Size: " + array.size());
		System.out.println("isEmpty: " + array.isEmpty());
        System.out.print("Input position:");
        int p = Integer.parseInt(sc.nextLine());
		System.out.println("Childrent: ");
        System.out.println(array.numChildren(p));
        System.out.println("Parent: ");
        System.out.println(array.parent(p));
    }
}
