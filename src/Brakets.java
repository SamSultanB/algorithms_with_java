public class Brakets {

    //    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        String brakets = input.nextLine();
//        String res = "yes";
//        Stack<Character> stack = new Stack<>();
//        for (char c : brakets.toCharArray()) {
//            if (c == '(' || c == '{' || c == '[') {
//                stack.push(c);
//            } else if (c == ')' || c == '}' || c == ']') {
//                if (stack.isEmpty()) {
//                    res = "no";
//                    break;
//                }
//                char openBracket = stack.pop();
//                if ((c == ')' && openBracket != '(') ||
//                        (c == '}' && openBracket != '{') ||
//                        (c == ']' && openBracket != '[')) {
//                    res = "no";
//                    break;
//                }
//            }
//        }
//        System.out.println(res);
//    }


//        Stack<String> stack = new Stack<>();
//
//        for (String token : tokens) {
//            if (token.matches("[+\\-*/]")) {
//                int operand2 = Integer.parseInt(stack.pop());
//                int operand1 = Integer.parseInt(stack.pop());
//                String result = performOperation(token, operand1, operand2);
//                stack.push(result);
//            } else {
//                stack.push(token);
//            }
//        }
//
//        System.out.println(Integer.parseInt(stack.pop()));
//    }
//
//
//
//    public static String performOperation(String operator, int intOperand1, int intOperand2) {
//
//        switch (operator) {
//            case "+":
//                return String.valueOf(intOperand1 + intOperand2);
//            case "-":
//                return String.valueOf(intOperand1 - intOperand2);
//            case "*":
//                return String.valueOf(intOperand1 * intOperand2);
//            case "/":
//                return String.valueOf(intOperand1 / intOperand2);
//            default:
//                throw new IllegalArgumentException("Unsupported operator: " + operator);
//        }
//    }


}
