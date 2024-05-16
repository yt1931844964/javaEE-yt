package java进阶.string;


public class equals {
    public static void main(String[] args) {
        double a = 0;
        System.out.println(a);
    }
}


/*
  public boolean equals(Object anObject) {
    // 判断两个对象是否为同一个对象
    if (this == anObject) {
        return true;
    }
    // 判断传入的对象是否是String类型
    if (anObject instanceof String) {
        String anotherString = (String)anObject;
        int n = value.length;
        // 判断两个字符串的长度是否相等
        if (n == anotherString.value.length) {
            char v1[] = value;
            char v2[] = anotherString.value;
            int i = 0;
            // 逐个比较两个字符串中的字符是否一致
            while (n-- != 0) {
                if (v1[i] != v2[i])
                    return false;
                i++;
            }
            return true;
        }
    }
    return false;
}

该方法首先检查两个对象是否为同一对象，如果是，则直接返回 true。否则，它检查传入的对象是否是字符串类型，并将其转换为字符串类型。然后，它比较两个字符串的长度是否相等，如果不相等，则返回 false。如果长度相等，它逐个比较两个字符串中的字符，如果有任何一个字符不匹配，则返回 false，否则返回 true。

 */
