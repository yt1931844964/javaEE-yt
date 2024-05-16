package java进阶.string;


public class compareto{
    public static void main(String[] args) {
        System.out.println("哈哈哈");
    }
}
    /*
public int compareTo(String anotherString) {
    int len1 = value.length;
    int len2 = anotherString.value.length;
    int lim = Math.min(len1, len2);
    char v1[] = value;
    char v2[] = anotherString.value;

    int k = 0;
    // 逐个比较两个字符串中相应位置上的字符
    while (k < lim) {
        char c1 = v1[k];
        char c2 = v2[k];
        // 如果相应位置上的字符不同，则返回它们之间的差值(ASCLL)
        if (c1 != c2) {
            return c1 - c2;
        }
        k++;
    }
    // 如果一直比较到较小长度的末尾，两个字符串仍然是相等的，则返回它们的长度之差
    return len1 - len2;
}

该方法首先获取两个字符串的长度，并将它们中较小的值存储在变量 lim 中。然后，它比较两个字符串中相应位置上的字符，如果不同，则返回它们之间的差值。如果一直比较到较小长度的末尾，两个字符串仍然是相等的，方法就返回它们的长度之差（即 len1 - len2）。
 */
