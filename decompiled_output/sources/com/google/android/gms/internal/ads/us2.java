package com.google.android.gms.internal.ads;

import java.io.UnsupportedEncodingException;
import java.util.PriorityQueue;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class us2 {
    @com.google.android.gms.common.util.d0
    private static long a(long j, int r7) {
        if (r7 == 0) {
            return 1L;
        }
        if (r7 == 1) {
            return j;
        }
        return (r7 % 2 == 0 ? a((j * j) % 1073807359, r7 / 2) : j * (a((j * j) % 1073807359, r7 / 2) % 1073807359)) % 1073807359;
    }

    @com.google.android.gms.common.util.d0
    private static String b(String[] strArr, int r3, int r4) {
        int r42 = r4 + r3;
        if (strArr.length < r42) {
            tr.g("Unable to construct shingle");
            return "";
        }
        StringBuilder sb = new StringBuilder();
        while (true) {
            int r1 = r42 - 1;
            if (r3 >= r1) {
                sb.append(strArr[r1]);
                return sb.toString();
            }
            sb.append(strArr[r3]);
            sb.append(' ');
            r3++;
        }
    }

    @com.google.android.gms.common.util.d0
    private static void c(int r2, long j, String str, int r6, PriorityQueue<xs2> priorityQueue) {
        xs2 xs2Var = new xs2(j, str, r6);
        if ((priorityQueue.size() != r2 || (priorityQueue.peek().f6036c <= xs2Var.f6036c && priorityQueue.peek().f6034a <= xs2Var.f6034a)) && !priorityQueue.contains(xs2Var)) {
            priorityQueue.add(xs2Var);
            if (priorityQueue.size() > r2) {
                priorityQueue.poll();
            }
        }
    }

    public static void d(String[] strArr, int r19, int r20, PriorityQueue<xs2> priorityQueue) throws UnsupportedEncodingException {
        if (strArr.length < r20) {
            c(r19, e(strArr, 0, strArr.length), b(strArr, 0, strArr.length), strArr.length, priorityQueue);
            return;
        }
        long jE = e(strArr, 0, r20);
        c(r19, jE, b(strArr, 0, r20), r20, priorityQueue);
        long jA = a(16785407L, r20 - 1);
        for (int r6 = 1; r6 < (strArr.length - r20) + 1; r6++) {
            jE = ((((((jE + 1073807359) - ((((ts2.a(strArr[r6 - 1]) + 2147483647L) % 1073807359) * jA) % 1073807359)) % 1073807359) * 16785407) % 1073807359) + ((ts2.a(strArr[(r6 + r20) - 1]) + 2147483647L) % 1073807359)) % 1073807359;
            c(r19, jE, b(strArr, r6, r20), strArr.length, priorityQueue);
        }
    }

    private static long e(String[] strArr, int r9, int r10) {
        long jA = (ts2.a(strArr[0]) + 2147483647L) % 1073807359;
        for (int r92 = 1; r92 < r10; r92++) {
            jA = (((jA * 16785407) % 1073807359) + ((ts2.a(strArr[r92]) + 2147483647L) % 1073807359)) % 1073807359;
        }
        return jA;
    }
}
