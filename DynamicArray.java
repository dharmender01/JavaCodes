
public class DynamicArray {
    private int data[];
     private int index;
    public DynamicArray(){
        data = new int[2];
        index = 0;
    }
    public int size(){
        return index;
    }
    public boolean isEmpty(){
        return index==0;
    }
    public int get(int i){
        if(i>=index) return -1;
        return data[i];
    }
    public void add(int element){
        if(index == data.length) doubleCapacity();
        data[index++] = element;
    }
    private void doubleCapacity(){
        int temp[] = data;
        data = new int [temp.length*2];
        for (int i = 0; i< temp.length; i++){
            data[i] = temp[i];
        }
    }
    public  int removeLast(){
        if (index == 0) return  -1;
        int temp = data[index-1];
        index--;
        return temp;
    }
    public void set(int i, int element){
        if (i>=index) return ;
        data[i] = element;
    }
}
