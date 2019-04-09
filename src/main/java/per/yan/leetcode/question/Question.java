package per.yan.leetcode.question;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author gaoyan
 * @date 2019/2/15 10:10
 */
public class Question {


    /**
     * 19. 删除链表的倒数第N个节点
     */
//    public class ListNode {
//        int val;
//        ListNode next;
//
//        ListNode(int x) {
//            val = x;
//        }
//    }
//
//    class Solution {
//        public ListNode removeNthFromEnd(ListNode head, int n) {
//            ListNode fast = head, slow = head;
//            while (n > 0) {
//                fast = fast.next;
//                n--;
//            }
//            if (fast == null) {
//                return slow.next;
//            }
//            while (fast.next != null) {
//                fast = fast.next;
//                slow = slow.next;
//            }
//            slow.next = slow.next.next;
//            return head;
//        }
//    }
    //********************************************************************************

    /**
     * 20. 有效的括号
     */
//    class Solution {
//        public boolean isValid(String s) {
//            Set<Character> before = new HashSet<>();
//            before.add('(');
//            before.add('[');
//            before.add('{');
//            Stack<Character> stack = new Stack<>();
//            int i = -1;
//            while (++i < s.length()) {
//                if (before.contains(s.charAt(i))) {
//                    stack.push(s.charAt(i));
//                } else {
//                    if (stack.size() < 1) {
//                        return false;
//                    }
//                    Character pop = stack.pop();
//                    if (!match(pop, s.charAt(i))) {
//                        return false;
//                    }
//                }
//            }
//            return stack.size() == 0;
//        }
//
//        private boolean match(Character cha1, Character cha2) {
//            return cha1.equals('(') && cha2.equals(')')
//                    || cha1.equals('[') && cha2.equals(']')
//                    || cha1.equals('{') && cha2.equals('}');
//        }
//    }
    //************************************************************************************

    /**
     * 21. 合并两个有序链表
     */
//    public class ListNode {
//        int val;
//        ListNode next;
//
//        ListNode(int x) {
//            val = x;
//        }
//    }
//
//    class Solution {
//        public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
//            ListNode result = new ListNode(0);
//            ListNode cur = result;
//            while (l1 != null && l2 != null) {
//                if (l1.val < l2.val) {
//                    cur.next = l1;
//                    l1 = l1.next;
//                    cur = cur.next;
//                } else {
//                    cur.next = l2;
//                    l2 = l2.next;
//                    cur = cur.next;
//                }
//            }
//            if (l1 == null) {
//                cur.next = l2;
//            } else {
//                cur.next = l1;
//            }
//            return result.next;
//        }
//    }

    static class Solution {
        static String[] s = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

        public int uniqueMorseRepresentations(String[] words) {
            Set<String> set = new HashSet<>();
            for (int i = 0; i < words.length; i++) {
                String word = words[i];
                StringBuilder sb = new StringBuilder();
                for (int j = 0; j < word.length(); j++) {
                    char c = word.charAt(j);
                    if (65 <= c && c <= 90) {
                        sb.append(s[c - 65]);
                    } else if (97 <= c && c <= 122) {
                        sb.append(s[c - 97]);
                    }
                }
                set.add(sb.toString());
            }
            return set.size();
        }


    }

    //************************************************************************************

    /**
     * 862. 和至少为 K 的最短子数组
     */
//    static class Solution {
//        public static void main(String[] args) {
//            generateParenthesis(3).forEach(System.out::println);
//        }
//
//        public static List<String> generateParenthesis(int n) {
//            List<String> result = new LinkedList<>();
//            if (n <= 0) {
//                result.add("");
//            } else {
//                for (int i = 0; i < n; ++i) {
//                    for (String left : generateParenthesis(i)) {
//                        for (String right : generateParenthesis(n - i - 1)) {
//                            result.add("(" + left + ")" + right);
//                        }
//                    }
//                }
//            }
//            return result;
//        }
//    }

    /**
     * 876. 链表的中间结点
     */
//    public class ListNode {
//        int val;
//        ListNode next;
//
//        ListNode(int x) {
//            val = x;
//        }
//    }
//
//    static class Solution {
//
//        public static ListNode middleNode(ListNode head) {
//            ListNode slow = head;
//            ListNode fast = head;
//
//            while (fast != null && fast.next != null) {
//                slow = slow.next;
//                fast = fast.next.next;
//            }
//            return slow;
//        }
//    }

    /**
     * 989. 数组形式的整数加法
     */
//    class Solution {
//        public List<Integer> addToArrayForm(int[] A, int K) {
//            List<Integer> result = new LinkedList<>();
//            int length = A.length;
//            int cur = K;
//            while (--length >= 0 || cur > 0) {
//                if (length >= 0) {
//                    cur += A[length];
//                }
//                result.add(cur % 10);
//                cur /= 10;
//            }
//            Collections.reverse(result);
//            return result;
//        }
//    }

    /**
     * 单链表反转
     */
//
//
//    static class Node {
//        private int value;
//        private Node next;
//
//        public Node(int value) {
//            this.value = value;
//        }
//    }
//
//    public static void main(String[] args) {
//
//        Node head1 = new Node(1);
//        Node head2 = new Node(2);
//        Node head3 = new Node(3);
//        Node head4 = new Node(4);
//        Node head5 = new Node(5);
//
//        head1.next = head2;
//        head2.next = head3;
//        head3.next = head4;
//        head4.next = head5;
//        Node reverse = reverse(head1);
//        while (reverse != null) {
//            System.out.println(reverse.value);
//            reverse = reverse.next;
//        }
//    }
//
//    private static Node reverse(Node node) {
//        Node head = null;
//        Node current = node;
//        Node pre = null;
//        Node next;
//        while (current != null) {
//            next = current.next;
//            if (next == null) {
//                head = current;
//            }
//            current.next = pre;
//            pre = current;
//            current = next;
//        }
//        return head;
//    }


    /**
     * 快速排序
     */
//    private static void sort(int[] a, int low, int high) {
//        int start = low;
//        int end = high;
//        int key = a[low];
//
//        while (end > start) {
//            //从后往前比较
//            //如果没有比关键值小的，比较下一个，直到有比关键值小的交换位置，然后又从前往后比较
//            while (end > start && a[end] >= key) {
//                end--;
//            }
//            if (a[end] <= key) {
//                int temp = a[end];
//                a[end] = a[start];
//                a[start] = temp;
//            }
//            //从前往后比较
//            //如果没有比关键值大的，比较下一个，直到有比关键值大的交换位置
//            while (end > start && a[start] <= key) {
//                start++;
//            }
//            if (a[start] >= key) {
//                int temp = a[start];
//                a[start] = a[end];
//                a[end] = temp;
//            }
//            //此时第一次循环比较结束，关键值的位置已经确定了。左边的值都比关键值小，右边的值都比关键值大，但是两边的顺序还有可能是不一样的，进行下面的递归调用
//        }
//        //递归
//        if (start > low) {
//            //左边序列。第一个索引位置到关键值索引-1
//            sort(a, low, start - 1);
//        }
//        if (end < high) {
//            //右边序列。从关键值索引+1到最后一个
//            sort(a, end + 1, high);
//        }
//    }
//
//    public static void main(String[] args) {
//        System.out.println("Hello World");
//        int[] a = {12, 20, 5, 16, 15, 1, 30, 45, 23, 9};
//        int start = 0;
//        int end = a.length - 1;
//        sort(a, start, end);
//        Arrays.stream(a).forEach(System.out::println);
//
//    }
}
