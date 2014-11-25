package csc150;

/**
 *
 * @author Joseph
 */
public class ArraySorting {

    /**
     *
     * @param args
     */
    public static void main(String[] args){
        
        int a[] = {3,4,1,5,7};
        for (int x =0; x<a.length -1; x++){
            for (int y = x+1; y<a.length; y++){
                if (a[x] < a[y]){
                int temp = a[y];
                a[y] = a[y+1];
                a[y+1] = temp;
                System.out.println(temp);
                }
                
            }
        }
    }
}
