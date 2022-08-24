
public class
DynamicArrayUse {
    public static void main(String[] args) {
        DynamicArray arr = new DynamicArray();
        for (int i = 0; i< 10; i++){
                arr.add(i+1);
        }
        System.out.println(arr.get(0));
        System.out.println(arr.removeLast());
        System.out.println(arr.size());
    }
}
