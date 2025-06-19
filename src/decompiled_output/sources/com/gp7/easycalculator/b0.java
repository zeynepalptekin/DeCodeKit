package com.gp7.easycalculator;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
class b0 {
    b0() {
    }

    /* JADX WARN: Removed duplicated region for block: B:83:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    java.lang.Double a(java.lang.String r25) {
        /*
            Method dump skipped, instructions count: 1080
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.gp7.easycalculator.b0.a(java.lang.String):java.lang.Double");
    }

    String b(String str) {
        String str2;
        BigDecimal bigDecimalPow;
        Matcher matcher;
        ArrayList arrayList;
        String str3;
        String str4;
        String strReplaceAll = str.replaceAll("[%]", "×0.01").replaceAll("[,]", "").replaceAll("[-][(]", "-1×(");
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(0, "-");
        arrayList2.add(1, "+");
        String str5 = "×";
        arrayList2.add(2, "×");
        arrayList2.add(3, "÷");
        arrayList2.add(4, "^");
        Stack stack = new Stack();
        Matcher matcher2 = Pattern.compile("^[-]\\d+[.]\\d+[E][+]\\d+|^[-]\\d+[.]\\d+[E][-]\\d+|^[-]\\d+[.]\\d+|^[-]\\d+|[(][-]\\d+[)]|[(][-]\\d+[.]\\d+[)]|[(][-]\\d+|[(][-]\\d+[.]\\d+|\\d+[.]\\d+[E][+]\\d+|\\d+[.]\\d+[E][-]\\d+|[(]|[)]|[+]|[-]|[÷]|[×]|[\\\\^]|\\d+[.]\\d+|\\b\\d+\\b").matcher(strReplaceAll);
        String strConcat = "";
        while (matcher2.find()) {
            String strGroup = matcher2.group();
            int r14 = arrayList2.indexOf(strGroup);
            if (r14 != -1 || strGroup.equals("(") || strGroup.equals(")")) {
                if (strGroup.equals("(")) {
                    stack.push(strGroup);
                } else if (strGroup.equals(")")) {
                    while (!((String) stack.peek()).equals("(")) {
                        strConcat = strConcat.concat(((String) stack.pop()) + " ");
                    }
                    stack.pop();
                } else {
                    while (true) {
                        if (stack.isEmpty()) {
                            matcher = matcher2;
                            arrayList = arrayList2;
                            str3 = str5;
                            break;
                        }
                        str3 = str5;
                        matcher = matcher2;
                        arrayList = arrayList2;
                        if (Math.floor(arrayList2.indexOf(stack.peek()) / 2) < Math.floor(r14 / 2) || r14 == -1 || ((String) stack.peek()).equals("(")) {
                            break;
                        }
                        strConcat = strConcat.concat(((String) stack.pop()) + " ");
                        str5 = str3;
                        arrayList2 = arrayList;
                        matcher2 = matcher;
                    }
                    stack.push(strGroup);
                    str5 = str3;
                    arrayList2 = arrayList;
                    matcher2 = matcher;
                }
                matcher = matcher2;
                arrayList = arrayList2;
                str3 = str5;
            } else {
                if (strGroup.matches("[(][-]\\d+[)]") || strGroup.matches("[(][-]\\d+[.]\\d+[)]")) {
                    str4 = strGroup.substring(1, strGroup.length() - 1) + " ";
                } else if (strGroup.matches("[(][-]\\d+") || strGroup.matches("[(][-]\\d+[.]\\d+")) {
                    strConcat = strConcat.concat(strGroup.substring(1) + " ");
                    stack.push("(");
                    matcher = matcher2;
                    arrayList = arrayList2;
                    str3 = str5;
                } else {
                    str4 = strGroup + " ";
                }
                strConcat = strConcat.concat(str4);
                matcher = matcher2;
                arrayList = arrayList2;
                str3 = str5;
            }
            str5 = str3;
            arrayList2 = arrayList;
            matcher2 = matcher;
        }
        String str6 = str5;
        while (!stack.isEmpty()) {
            strConcat = strConcat.concat(((String) stack.pop()) + " ");
        }
        String[] strArrSplit = strConcat.replaceAll("[(]", "").split("\\s+");
        LinkedList linkedList = new LinkedList();
        linkedList.addAll(Arrays.asList(strArrSplit));
        Stack stack2 = new Stack();
        while (!linkedList.isEmpty()) {
            String str7 = (String) linkedList.poll();
            if (str7.equals("+") || str7.equals("-")) {
                str2 = str6;
            } else {
                str2 = str6;
                if (!str7.equals(str2) && !str7.equals("÷") && !str7.equals("^")) {
                    bigDecimalPow = new BigDecimal(str7);
                }
                stack2.push(bigDecimalPow);
                str6 = str2;
            }
            bigDecimalPow = (BigDecimal) stack2.pop();
            if (str7.equals("+")) {
                bigDecimalPow = ((BigDecimal) stack2.pop()).add(bigDecimalPow);
            } else if (str7.equals("-")) {
                bigDecimalPow = ((BigDecimal) stack2.pop()).subtract(bigDecimalPow);
            } else if (str7.equals(str2)) {
                bigDecimalPow = ((BigDecimal) stack2.pop()).multiply(bigDecimalPow);
            } else if (str7.equals("÷")) {
                bigDecimalPow = ((BigDecimal) stack2.pop()).divide(bigDecimalPow, 15, 6);
            } else if (str7.equals("^")) {
                bigDecimalPow = ((BigDecimal) stack2.pop()).pow(bigDecimalPow.intValueExact());
            }
            stack2.push(bigDecimalPow);
            str6 = str2;
        }
        return String.valueOf((BigDecimal) stack2.pop());
    }

    /* JADX WARN: Removed duplicated region for block: B:72:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0230  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    java.lang.Double c(java.lang.String r21) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 659
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.gp7.easycalculator.b0.c(java.lang.String):java.lang.Double");
    }

    /* JADX WARN: Removed duplicated region for block: B:200:0x0521 A[PHI: r4 r9 r22
  0x0521: PHI (r4v19 java.lang.String) = (r4v16 java.lang.String), (r4v20 java.lang.String) binds: [B:214:0x0575, B:199:0x051f] A[DONT_GENERATE, DONT_INLINE]
  0x0521: PHI (r9v43 double) = (r9v39 double), (r9v48 double) binds: [B:214:0x0575, B:199:0x051f] A[DONT_GENERATE, DONT_INLINE]
  0x0521: PHI (r22v5 java.lang.String) = (r22v1 java.lang.String), (r22v6 java.lang.String) binds: [B:214:0x0575, B:199:0x051f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0210 A[PHI: r23 r24 r25 r26
  0x0210: PHI (r23v20 java.lang.String) = 
  (r23v18 java.lang.String)
  (r23v18 java.lang.String)
  (r23v18 java.lang.String)
  (r23v18 java.lang.String)
  (r23v18 java.lang.String)
  (r23v18 java.lang.String)
  (r23v21 java.lang.String)
 binds: [B:110:0x02df, B:102:0x02be, B:94:0x029d, B:86:0x027c, B:78:0x025b, B:70:0x023a, B:59:0x020d] A[DONT_GENERATE, DONT_INLINE]
  0x0210: PHI (r24v15 java.util.ArrayList) = 
  (r24v13 java.util.ArrayList)
  (r24v13 java.util.ArrayList)
  (r24v13 java.util.ArrayList)
  (r24v13 java.util.ArrayList)
  (r24v13 java.util.ArrayList)
  (r24v13 java.util.ArrayList)
  (r24v16 java.util.ArrayList)
 binds: [B:110:0x02df, B:102:0x02be, B:94:0x029d, B:86:0x027c, B:78:0x025b, B:70:0x023a, B:59:0x020d] A[DONT_GENERATE, DONT_INLINE]
  0x0210: PHI (r25v3 java.lang.String) = 
  (r25v1 java.lang.String)
  (r25v1 java.lang.String)
  (r25v1 java.lang.String)
  (r25v1 java.lang.String)
  (r25v1 java.lang.String)
  (r25v1 java.lang.String)
  (r25v4 java.lang.String)
 binds: [B:110:0x02df, B:102:0x02be, B:94:0x029d, B:86:0x027c, B:78:0x025b, B:70:0x023a, B:59:0x020d] A[DONT_GENERATE, DONT_INLINE]
  0x0210: PHI (r26v3 java.lang.String) = 
  (r26v1 java.lang.String)
  (r26v1 java.lang.String)
  (r26v1 java.lang.String)
  (r26v1 java.lang.String)
  (r26v1 java.lang.String)
  (r26v1 java.lang.String)
  (r26v4 java.lang.String)
 binds: [B:110:0x02df, B:102:0x02be, B:94:0x029d, B:86:0x027c, B:78:0x025b, B:70:0x023a, B:59:0x020d] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    java.lang.Double d(java.lang.String r29, java.lang.String r30) {
        /*
            Method dump skipped, instructions count: 1910
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.gp7.easycalculator.b0.d(java.lang.String, java.lang.String):java.lang.Double");
    }
}
