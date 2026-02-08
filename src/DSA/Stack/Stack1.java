package DSA.Stack;

import java.util.Stack;

public class Stack1 {
    public static void main(String[] args) {
        int[] arr = {4, 8, 5, 2, 25};
        Stack<Integer> stack=new Stack<>();
        int n=arr.length;
        int ans[]=new int[n];
        for(int i=n-1;i>=0;i--){
            int currElem=arr[i];
            while(!stack.isEmpty()&&stack.peek()>=currElem){
                stack.pop();
            }
            if(stack.isEmpty()){
                ans[i]=-1;
            }
            else{
                ans[i]=stack.peek();
            }
            stack.push(currElem);
        }
        for(int num:ans){
            System.out.print(num+" ");
        }
    }
}
