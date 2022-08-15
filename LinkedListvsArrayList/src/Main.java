
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
  *Program that compares performance of ArrayList and LinkedList.
  * 
  *Muhammed Serhan Genis
  *15.08.2022
  *
*/
public class Main {
    
    
    
    public static void main(String args[]){
        
        List<Integer> linkedList=new LinkedList<Integer>();
        List<Integer> arrayList=new ArrayList<Integer>();
    
        compareTime("ArrayList", arrayList, "LinkedList", linkedList);
        
    }
    
    
    public static void compareTime(String listType1,List<Integer> list1,String listType2,List<Integer> list2){
        
        int numberOfElements=100000;
        long startTime1;
        long startTime2;
        long endTime1;
        long endTime2;
        
        startTime1=System.currentTimeMillis();
        for(int i=0;i<numberOfElements;i++){
            
            list1.add(0, i);
            
        }
        endTime1=System.currentTimeMillis();
        
        startTime2=System.currentTimeMillis();
        for(int i=0;i<numberOfElements;i++){
            
            list2.add(0, i);
            
        }
        endTime2=System.currentTimeMillis();
        
        System.out.println("Performance comparison after adding "+numberOfElements+" elements to the both lists");
        System.out.println();
        
        System.out.println(listType1+"  ------> "+(endTime1-startTime1)+" ms");
        System.out.println();
        
        System.out.println(listType2+" ------> "+(endTime2-startTime2)+" ms");
        
        
    }
}
