/*This program contains a method that creates a copy of an array
*Can be used when you want to manipulate an array and reuse the original array
* in some other part of the code
* @author Makai AKA MicroEvan
* M1cro314ck
 */
import java.util.Arrays;

class Scratch {

    public int []copyArray(int []original,int []duplicate){
        for(int i=0;i< original.length;i++){
            duplicate[i]=original[i];
        }
        return duplicate;
    }

    public static void main(String[] args) {
        int []array1 = {1,4,6,8,3};
        int []array2 = new int[array1.length];

        Scratch object = new Scratch();
        object.copyArray(array1,array2);

        System.out.printf("%n%s", Arrays.toString(object.copyArray(array1,array2)));
        
    }
}