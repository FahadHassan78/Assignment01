//DSA LAB 01

//Task 01
/*public class TASK01 {
    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);
        int num[]=new int[6];
        
        for(int i=0; i<num.length; i++){
            System.out.println("Enter Elements "+" : ");
            num[i]=input.nextInt();
        }
        for(int i=0; i<num.length; i++){
        System.out.print(num[i]+" ");
         
        }
         System.out.println(" ");
      for(int i=0; i<num.length; i++){
        System.out.println("Element at Index " + i + "=" + num[i]);
        }
        
    }
    
}
*/

//task 02
// public class Task2 {
   
//     public static void main(String[] args) {
//         int[] arr=new int[10];
//         Scanner scanner= new Scanner(System.in);
//         for(int i=0; i<10; i++){
//             System.out.println("Enter element "+(i+1 )+": ");
//             arr[i]=scanner.nextInt();
//         }
//         int sum=0;
//         for(int i=0; i<10; i++) {
//             if(arr[i]%4==0) {
//                 sum+=arr[i];
//             }
//         } 
//         System.out.println("Sum of multiples of 4: " + sum);
        
// }
// }
//task 03
// public class TASK03 {
    
//     public static void main(String[] args) {
        
//        int num[]=new int[6];
//         num[0]=100;
//         num[1]=200;
//         num[2]=300;
//         num[3]=400;
//         num[4]=500;
       
//         for(int i=0; i<num.length; i++){
//             System.out.println("Elements before Insertion at Index :" +i+ " :"+num[i]); 
//         }
       
//         int element=250;
//         int position=2;
     
        
//         for(int i=num.length-1; i>position; i--){
//         num[i]=num[i-1];
        
//         }
//      num[position]=element;
//         System.out.println("After the insertion Results:");
//        for(int i=0; i<num.length; i++){
//        System.out.println("Elements After Insertion at Index:" +i+ " :"+num[i]); 
//        }
        
        
        
        
        
//     }
    
// }
//TASk 04
// public class TASK04 {
//     public static void main(String[] args) {
//         int num[]=new int[6];
//         num[0]=3;
//         num[1]=6;
//         num[2]=9;
//         num[3]=12;
//         num[4]=15;
        
//         for(int i=0; i<num.length; i++){
//             System.out.println("Elements before Insertion at Index :" +i+ " :"+num[i]); 
//         }
//        int ending_element=18;
//        num[num.length-1]=ending_element;
//         System.out.println("RESULTS AFTER INSERTION AT END");
//         for(int i=0; i<num.length; i++){
//             System.out.println("Elements After Insertion at Index :" +i+ " :"+num[i]); 
//         }
//     }
// }


//task 05
// public class TASK05 {
//     public static void main(String[] args) {
        
//        int array[]={8,16,24,32,40};
//         for(int i=0; i<array.length; i++){
//             System.out.println("Elements before Deletion" +i+ " :"+array[i]); 
//         }
//         int index;
//         Scanner input=new Scanner(System.in);
//         index=input.nextInt();
//             boolean found=false;
//        for(int i=array.length-1; i>0; i--){
//             //System.out.println("Elements before Deletion" +i+ " :"+array[i]); 
//             if(array[i]==index){
//             found=true;
//                 System.out.println("Element found ");
//             }
//         }
// System.out.println("Element found ");
//      array[array.length-index-1]=0*0;
       
//        for(int i=0; i<array.length; i++){
//             System.out.println("Elements After Deletion" +i+ " :"+array[i]); 
//         } 
       
        
//     }
// }

//task 06
// public class Palindrome {
 
//     public static void main(String[] args) {
//         System.out.println(isPalindrome("radar")); // Expected output: Palindrome
//         System.out.println(isPalindrome("apple")); // Expected output: Not Palindrome
//     }

//     public static String isPalindrome(String str) {
//         char[] arr = str.toCharArray();
//         int left = 0;
//         int right = arr.length - 1;

//         while(left< right) {
//             if(arr[left]!=arr[right]) {
//                 return "Not Palindrome";
//             }
//             left++;
//             right--;
//         }
//         return "Palindrome";
//     }
// }

// task 07
public class lab1 {
    public static void main(String[] args) {
             System.out.println(isAnagram("listen", "silent")); // Expected output: Anagram
         System.out.println(isAnagram("hello", "world")); // Expected output: Not Anagram
     }
 
     public static String isAnagram(String str1, String str2) {
         if (str1.length() != str2.length()) {
             return "Not Anagram";
         }
 
         char[] arr1 = str1.toCharArray();
         char[] arr2 = str2.toCharArray();
 
         java.util.Arrays.sort(arr1);
         java.util.Arrays.sort(arr2);
 
         return java.util.Arrays.equals(arr1, arr2) ? "Anagram" : "Not Anagram";
     }
 }
 