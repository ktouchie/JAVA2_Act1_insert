import java.util.*;
class insertion {

	public static void main(String[] args) {
        
        int[] tab = {5,9,4,1,2,7,3,8,6,0};
        
        boolean swap = false;
        
        do {
            swap = false;
            for (int i=tab.length-1; i>0; i--) {
                int x = tab[i];
                int j = i;
                while (j>0 && x<tab[j-1]) {
                    tab[j] = tab[j-1];
                    j = j-1;
                    System.out.println(Arrays.toString(tab));
                    swap=true;
                }
                tab[j] = x;
            }
        } while (swap==true);
        
        System.out.println(Arrays.toString(tab));
    }
}
