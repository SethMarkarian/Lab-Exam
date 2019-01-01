import java.util.*;
public class RandomPointContainer
{
    private ArrayList<ComparablePoint> arr;
    public RandomPointContainer() { //contructor
        arr = new ArrayList<ComparablePoint>();
    }

    public ArrayList randomPointSet(int n) { //makes arraylist of random points in a given limit
        int count = 0;
        while(count < n) {
            Random random = new Random(System.currentTimeMillis());
            int x = (int) (random.nextDouble() * n);
            int y = (int) (random.nextDouble() * n);
            ComparablePoint cp = new ComparablePoint(x, y);
            boolean contains = false;
            for(int i = 0; i < arr.size(); i++) {
                if(arr.get(i).compareTo(cp) == 0) {
                    contains = true;
                    break;
                }
            }
            if(!contains) {
                arr.add(cp);
                count++;
            }
        }
        return arr;
    }

    public ArrayList randomPointSetSorted(int n) { //makes sorted arraylist of random points in a given limit
        Random random = new Random();
        int count = 0;
        while(count < n) {
            int x = (int) (random.nextDouble() * n);
            int y = (int) (random.nextDouble() * n);
            ComparablePoint cp = new ComparablePoint(x, y);
            boolean contains = false;
            for(int i = 0; i < arr.size(); i++) {
                if(arr.get(i).compareTo(cp) == 0) {
                    contains = true;
                    break;
                }
            }
            if(!contains) {
                if(arr.size() == 0) { 
                    arr.add(cp); 
                }
                else {
                    int i = 0; 
                    while(i < arr.size()  && arr.get(i).compareTo(cp) < 0) { 
                        i++; 
                    }
                    arr.add(i, cp); 
                }
                count++;
            }
        }
        return arr; 
    }

    public ArrayList intersection(ArrayList<ComparablePoint> arr2) { //adds points that intersect to an arraylist
        ArrayList<ComparablePoint> ans = new ArrayList<ComparablePoint>();
        for(int i = 0; i < arr.size(); i++) {
            for(int j = 0; j < arr2.size(); j++) {
                if(arr.get(i).x == arr2.get(j).x) {
                    ans.add(arr.get(i));
                }
            }
        }
        return ans;
    }

    public ArrayList intersectionSorted(ArrayList<ComparablePoint> arr2) { //adds sorted points that intersect to an arraylist
        ArrayList<ComparablePoint> ans = new ArrayList();
        for(int i = 0; i < arr.size(); i++) {
            int left = 0; 
            int right = arr.size() - 1; 
            while(left <= right) { //checks to see if crossed
                int middle = (left + right) / 2; //sets middle to middle index
                if(arr2.get(middle).compareTo(arr.get(i)) < 0) { //checks to see if its greater
                    left = middle + 1; //moves left
                }
                else if(arr2.get(middle).compareTo(arr.get(i)) > 0) { //checks to see if its smaller
                    right = middle - 1; //moves right
                }
                else { //if element is middle
                    ans.add(arr2.get(middle));
                }
            }
        }
        return ans;
    }
}
