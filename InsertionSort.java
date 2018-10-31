/**
 * 插入排序（升序）
 * 算法思想（根据算法导论第三版）：
 * （1）初始化：循环的第一次迭代之前，它为真；
 * （2）保持：如果循环的某次迭代之前它为真，那么下次迭代之前它仍未真；
 * （3）终止：在循环终止时，不变式为我们提供一个有用的性质，该性质有助于证明算法是正确的。
 */

public class InsertionSort {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        int [] list={5,2,4,6,1,3};
        getList(list);
        int[]list1= getInsertionSort(list);
        getList(list1);
    }

    public static int[] getInsertionSort(int[] list){
        for(int j=1;j<list.length;j++)
        {
            int key=list[j];
            int i=j-1;
            while(i>=0 && list[i]>key){
                list[i+1]=list[i];
                i=i-1;
                list[i+1]=key;
            }
        }
        return list;
    }

    public static void getList(int[] list){

      for(int i=0;i<list.length;i++)
      {
          System.out.print(list[i]+"----");
      }
        System.out.print("\n");
    }
}
