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
                while (j>0 && x<tab[j-1]) {     //if x (last element) is smaller than the element to it's left,
                    tab[j] = tab[j-1];          // it moves it's neighbour to the right and keeps looking..
                    j = j-1;
                    System.out.println(Arrays.toString(tab));
                    swap=true;
                }
                tab[j] = x;                     //once it finds a number that is smaller, it takes the spot of the last element it displaced.
            }
        } while (swap==true);
        
        System.out.println(Arrays.toString(tab));
    }
}
