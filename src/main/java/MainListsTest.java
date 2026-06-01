import java.util.ArrayList;

public class MainListsTest {
    public static void main(String[] args) {
        ArrayList<Double> list= new ArrayList<>();
        list.add(5.4);
        list.add(1.5);
        list.add(3.7);
        list.add(40.2);
        list.add(47.7);
        System.out.println(list.toString());
        Double sum = list.stream().mapToDouble(Double::doubleValue).sum();
        System.out.println(sum);
       list.remove(3.7);
       System.out.println(list.toString());
       Double num=list.get(3);
       System.out.println(num);
       boolean res= list.contains(5.4);
       System.out.println(res);
       list.set(0,20.5);
       System.out.println(list.toString());
       list.sort(null);
       System.out.println(list.toString());

        ComparatorStringReverse com=new ComparatorStringReverse();
        list.sort(com);
        System.out.println(list);

        for(Double d:list){
            System.out.print(d);
        }
        System.out.println();


        ArrayList<Integer> list1=new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        System.out.println(list1.toString());
        list1.set(0,7);
        System.out.println(list1.toString());

        for (int i=0;i<list1.size();i++){
            System.out.print(list1.get(i)+" ");
        }
        System.out.println();
        ComparatorIntegerRevers com1=new ComparatorIntegerRevers();
        list1.sort(com1);
        System.out.println(list1.toString());

    }
}
/*
 HomeWork #11
1 in main
ArrayList<Double> listD
LinkedList<Integer> listInt

2 Advanced:применить для листо в 1 задаемя
ComparatorDoubleReverse  Double.compare(d1.d2);
ComparatorIntegerRevers

 */
