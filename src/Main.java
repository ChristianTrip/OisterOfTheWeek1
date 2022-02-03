import java.util.ArrayList;

public class Main {

    static ArrayList<Integer> integerArrayList;


    static void setIntegerArrayList(int size){

        integerArrayList = new ArrayList<>();

        for (int i = 1; i <= size; i++) {
            integerArrayList.add(i);
        }
    }

    static ArrayList<Integer> rotateList(ArrayList<Integer> list, int k){

        // this method returns a list that is rotated 'k' indecies
        // the method takes into account if 'k' is bigger then the size of the list

        if(list == null){ // incase the list is not initilized
            System.out.println("The list is not initilized");
            return null;
        }
        else if (list.size() == 0){ // incase the list argument is empty
            System.out.println("there are no elements in the list to rotate");
        }
        else{
            /*
            By this way of doing it, I need at minimum two operations to complet a single rotation with an arraylist.
                1. Operation : is to add the 0 index.
                    0 index also becomes the last element in the list.
                2. Opreation : is to remove that 0 index.
                    This is done so all indicies get shifted one index down
                    so now the element at index 1 now is located at index 0, and so on.
             */
            if (k >= 0){ // incase the k argument is a positive number
                for (int i = 0; i < k; i++) {
                    list.add(list.get(0));
                    list.remove(0);
                }
            }
            else{ // incase the k argument is a negative number
                for (int i = 0; i > k; i--) {
                    list.add(list.get(0));
                    list.remove(0);
                }
            }
        }
        return list;
    }


    public static void main(String[] args) {

        setIntegerArrayList(6);

        System.out.println("Original list = " + integerArrayList);
        System.out.println("Rotated list = " + rotateList(integerArrayList, 2));
        

    }
}
