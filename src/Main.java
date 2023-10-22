
import java.util.*;


public class Main {

    public static void main(String[] args){
        System.out.println(gcdOfStrings("ABCABC", "ABC"));
    }


    public static String gcdOfStrings(String str1, String str2) {
        String res = "";
        
    }

//    public static void main(String[] args){
//
//        boolean run = true;
//
//        while(run == true){
//            Scanner input = new Scanner(System.in);
//            String action[] = input.nextLine().split(" ");
//            String command = action[0];
//            int num = 0;
//            if(action.length == 2){
//                num = Integer.parseInt(action[1]);
//            }
//
//            if(command.equals("size")){
//                System.out.println(size());
//            }else if(command.equals("push")){
//                System.out.println(push(num));
//            }else if(command.equals("pop")){
//                pop();
//            }else if(command.equals("back")){
//                System.out.println(back());
//            }else if(command.equals("clear")){
//                System.out.println(clear());
//            }else if(command.equals("exit")){
//                run = false;
//                System.out.println("bye");
//            }
//        }
//
//    }
//
//
//    private static int[] array = new int[10000];
//    private static int pointer = -1;
//
//    public static String push(int n) {
//        pointer++;
//        array[pointer] = n;
//        return "ok";
//    }
//
//    public static String clear() {
//        pointer = -1;
//        return "ok";
//    }
//
//    public static int size() {
//        return pointer + 1;
//    }
//
//    public static int back() {
//        if (pointer > -1) {
//            return array[pointer];
//        } else {
//            System.out.println("Stack is empty");
//            return -1;
//        }
//    }
//
//    public static void pop() {
//        System.out.println(array[pointer]);
//        if (pointer >-1) {
//            pointer--;
//        } else {
//            System.out.println("Stack is empty");
//        }
//    }



}

