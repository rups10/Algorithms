
/**
 *
 * @author rupali.kahalekar
 * https://leetcode.com/problems/find-peak-element/
 */
public class findPeakElement {
    
    public static int findPeakElement(int[] a) {
        int n = a.length;
        int i=0;
        int j=n-1;
        if(a[i]>a[i+1])
            return i;
        if(a[j]>a[j-1])
            return j;
        for(i=1;i<n;i++) {
            if(a[i-1]<a[i] && a[i]>a[i+1])
                return i;
        }
        
        return -1;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        int[] a = {1,2,3,6};
        
        int result = findPeakElement(a);
        
        System.out.println("peak element " + result);
    }
}
