public class Main{

    public static boolean isVowel(char ch){
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            return true;
        }
        if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
            return true;
        }
        return false;
    }

    public static void printVowels(String str){
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(isVowel(ch) == true){
                System.out.println(ch);
            }
        }


    }
    
public static void countVowels(String str){
        int count =0;
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(isVowel(ch) == true){
              
                count++;
            }
        }
        System.out.println(count);


    }

    public static void removeVowels(String str){
        String ans = "";
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(isVowel(ch) == false){
                ans += ch;
            }
        }
        System.out.println(ans);
    }


    public static void removeConns(String str){
        String ans = "";
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(isVowel(ch) == true){
                ans += ch;
            }
        }
        System.out.println(ans);
    }


    public static void swap(int i, int j, int [] arr){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void reverseArray(int [] arr){
        int i = 0;
        int j = arr.length-1;
        while(i < j){
            swap(i, j, arr);
            i++;
            j--;
        }
        printArr(arr);

    }


    public static void reverseArrayInRange(int [] arr, int start, int end){
        int i = start;
        int j = end;
        while(i < j){
             swap(i, j, arr);
            i++;
            j--;
        }
        printArr(arr);

    }


    public static void printArr (int [] arr){
        for(int e : arr)
            System.out.print(e + " ");
        System.out.println();
    }


    public static void main (String [] args){
        // String s = "asdfadjuioeasa";
        // printVowels(s);

        int [] arr = {10,20,30,40,50,60, 70, 80};
        reverseArrayInRange(arr,2,5);
    }
}