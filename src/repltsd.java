import java.util.ArrayList;
import java.util.Arrays;

public class repltsd
{
    
    public static void main(String[] args)
    {
        
        ArrayList<Integer> list = new ArrayList<Integer>(10);
        
        list.add(1);
        list.add(3);
        list.add(4);
        list.add(52);
        list.add(5);
        list.add(27);
        list.add(9);
        list.add(12);
        list.add(134);
        list.add(10);
    
        System.out.println(sortingArraysAsc(list));
    
        System.out.println(sortarr(list));
        
    }
    
    public static ArrayList sortingArraysAsc(ArrayList<Integer> list)
    {
        
        
        for(int i = 0; i < list.size(); i++)
        {
            
            for(int j = 0; j < list.size(); j++)
            {
                
                if(list.get(i) < list.get(j))
                { // 1<1 , 1<3
                    
                    Integer temp = list.get(i); // temp = 1 ,
                    
                    list.set(i, list.get(j)); //
                    
                    list.set(j, temp);
                    
                }
                
            }
            
        }
        return list;
    }
    
    public static ArrayList sortarr(ArrayList<Integer> list)
    {
    
        Integer[] arr = list.toArray(new Integer[0]);
        
        Arrays.sort(arr);
    
        ArrayList<Integer> temp = new ArrayList<>(Arrays.asList(arr));
        
        return temp;
        
    }
    
    
}
