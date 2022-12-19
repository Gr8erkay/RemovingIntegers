import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println(findSubsequence(new int[]{4,3,1,1,3,3,2}));
    }

    public static List<Integer> findSubsequence(int[] arr)    {
        HashSet set = new HashSet<Integer>();
        LinkedList list = new LinkedList<Integer>();
        LinkedList emptyLinkedList = new LinkedList<Integer>();
        emptyLinkedList.add(-1);
        Integer maxInteger = 0;

        for(Integer i : arr){
            if(set.contains(i)){
                if(maxInteger <= i){
                    maxInteger = i;
                    list.add(i);
                } else {
                    return emptyLinkedList;
                }
            } else {
                set.add(i);
            }
        }
        return list;
    }
}
