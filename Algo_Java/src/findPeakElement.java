
/**
 *
 * @author rupali.kahalekar
 * https://leetcode.com/problems/find-peak-element/
 */
public class findPeakElement {
    public static int search(int[] a, int l, int r) {
        if(l==r)
            return l;
        
        int mid = (l+r)/2;
        
        if(a[mid]>a[mid+1])
            return search(a,l,mid);
        return search(a,mid+1,r);
    }
    
    // approach with complexity 0(n)
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
        int[] a = {1,2,3,6,4,0};
        
        //int result = findPeakElement(a);
        int result = search(a,0,a.length-1);
        System.out.println("peak element " + result);
    }
}
