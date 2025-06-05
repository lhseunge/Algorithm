import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.EmptyStackException;
import java.util.Stack;

public class Main {

    public static void main(String[] args) throws IOException {

        /*
            명령은 총 다섯 가지이다.
            push X: 정수 X를 스택에 넣는 연산이다.
            pop: 스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
            size: 스택에 들어있는 정수의 개수를 출력한다.
            empty: 스택이 비어있으면 1, 아니면 0을 출력한다.
            top: 스택의 가장 위에 있는 정수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
         */

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(reader.readLine());
        String[] input = new String[count];

        for (int i = 0; i < count; i++) {
            input[i] = reader.readLine();
        }

        Stack<Integer> stack = new Stack<>();

        for (String string : input) {

            if (string.split(" ")[0].equals("push")) {
                stack.push(Integer.parseInt(string.split(" ")[1]));
                continue;
            }

            try {
                switch (string) {
                    case "pop":
                        System.out.println(stack.pop());
                        break;

                    case "size":
                        System.out.println(stack.size());
                        break;

                    case "empty":
                        System.out.println(stack.isEmpty() ? 1 : 0);
                        break;

                    case "top":
                        System.out.println(stack.peek());
                        break;

                }
            } catch (EmptyStackException e) {
                System.out.println(-1);
            }


        }

    }

}