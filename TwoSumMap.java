import java.util.Arrays;
import java.util.HashMap;

public class TwoSumMap {
    public static void main(String[] args){
        int[] nums = {3, 5, 7, 9};   
        System.out.println(Arrays.toString(twoSumII(nums, 8)));
    }

    public static int[] twoSumII(int[] nums, int target1){
        int[] output = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i<nums.length; i++){
           
            if(map.containsKey(nums[i])) {
                output[0] = map.get(nums[i]);
                output[1] = i;
                return output;
                
            }
            map.put(target1 - nums[i], i);
               
            }
            return output;
            
        }
        
    }

/*Dacoda's Notes:
  Solving Two Sums. The sum of two numbers
  from an array of numbers, shall equal a given
  target number. This is one way of solving with 
  a HashMap.
  
  The int array method will require two 
  perameters. The int array with numbers and 
  a target number. 
  What makes the method work. 
  Make an int array to hold the two 
  numbers that will be the answer.
  Make a HashMap. The HashMap will be the 
  collection of data collected through 
  traversing through the array.
  We are looking for two numbers in the array 
  that will add up to the target number.

  While traversing through the array, we subtract 
  target minus the current index. that is the 
  number we look for in the  HashMap to 
  equal target. The number is not there and the HashMap 
  is empty. Therefore the first key and value in the
  HashMap will be=> key will be the number needed to be 
  added to the number at index 0 to equal target number.
  :The value is the index of the number that was looking for
  that number.

  When both the index and key add to the target
  the will be stored in the variable made to contain
  the answer.
 */