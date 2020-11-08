package Hw3_18000949.Ex4;
import java.util.LinkedList;
public class SimpleLinkedList<T> { 
    class Node { 
        T data; 
        Node next; 
        public Node(T data) {
            this.data = data;
        }
    } 
    private Node top = null;  
    private Node bot = null;  
    private int n = 0;  
    public void add(T data) { 
       // Thêm phần tử vào đầu danh sách 
       Node node = new Node(data);
       node.next = null ;
       n++;
       if(top == null && bot == null) {
           top = node;
           bot = node;
       }
       else {
           node.next = top ;
           top = node;
       }
    } 
    public void addBot(T data) { 
       // Thêm phần tử vào cuối danh sách 
        n++;
		if(bot == null) {
			bot = new Node(data);
        } 
        else {
			bot.next = new Node(data);
			bot = new Node(data);
		}
    } 
    public T get(int i) { 
        // Lấy phần tử ở vị trí thứ i 
        if(i < 0 || i >= n)
			return null;
		Node node = top;
		for(int j = 0; j < i - 1; j++) {
			node = node.next;
		}
		return node.data;
        } 
    public void set(int i, T data){ 
        // Gán giá trị ở vị trí i bằng data 
        if(i < 0 || i>= n)
			System.out.println("Error!");
		Node node = top;
		for(int j = 0; j < i-1; j++) {
			node = node.next;
		}
		node.data = data;
    } 
    public boolean isContain(T data) { 
       // Kiểm tra trong danh sách có chứa phần tử data hay không? 
        Node node = top;
		while(node != null) {
			if(node.data.equals(data)) {
				return true;
			}
			node = node.next;
		}
		return false;
    } 
    public int size() { 
    // Trả lại thông tin số phần tử có trong danh sách 
        int size = 0;
        for(Node node = top ; node != null ; node = node.next) {
            size++;
        }
        return size;
    } 
    public boolean isEmpty() { 
       // Kiểm tra danh sách có rỗng hay không? 
        if(n != 0)
            return true;
        return false;
    } 
    public T removeTop() { 
        // Xóa phần tử ở đầu danh sách, trả lại giá trị data của phần tử đó  
        if(n == 0)
			return null;
		T data = null;
        if(top == null) 
            return data;
		data = top.data;
		top = top.next;
		n--;
		return data; 	
    } 
    public T removeBot() { 
         // Xóa phần tử ở cuối danh sách, trả lại giá trị data của phần tử đó   	
        Node node = top;
        if(n == 0) {
            return null;
        }
        if(n == 1) {
            top = null;
            bot = null;
            n = 0;
            return node.data;
        }
        for(int i = 0; i < n-1; i++) {
            node = node.next;
        }
        Node node1 = bot;
        node.next= null;
        bot = node;
        return node1.data;
    } 
    public void remove(T data) { 
    // Xóa tất cả các phần tử có giá trị bằng data 
        if(n == 0)
            System.out.println("Error!");
        Node node = top;
        for(int i = 1; i < n; i++) {
            if(node.data.equals(data)) {
                node = node.next;
                n--;
            }
        }
    } 
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(5);
        list.add(11);
        list.add(7);
        list.add(0);
        list.add(6);
        System.out.println("Các phần tử có trong linkedList: ");
        System.out.println(list);
        System.out.println("Thêm phần tử vào linkedList: ");
        list.add(12);
        System.out.println(list);
        System.out.println("Lấy ra phần tử ở vị trí số 1 trong linkedList: ");
		System.out.println(list.get(1));
		System.out.println("Size linkedList: ");
		System.out.println(list.size());

        
    }
} 
