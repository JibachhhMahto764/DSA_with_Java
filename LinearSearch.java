public class Main{
  public static void main(Strings[] args){
    int[] nums = {23,4,5,48,82,72,92,3}
      int target = 72;
    int ans = linearsearch(nums,target);
    system.out.println(ans);
// search in the array: return the index if the item found 
// otherwise if the item is not found return -1 

  static int linearsearch(int[] arr,int target){
    if (arr.length == 0){
      return -1;//intergers Max_VALUE
    }
    //run a for loop 

    for (int index = 0; index<arr.length;index++){

    //check for the element at every index if it is = target
    int element = arr[index];
      if(element == target){
        return index;//put element here
      }
    }

    //This line will execute if none at the return statement above have executed
    //hence the target was not found
