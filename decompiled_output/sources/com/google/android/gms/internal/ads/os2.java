package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.PriorityQueue;

/* loaded from: classes.dex */
public final class os2 {

    /* renamed from: b, reason: collision with root package name */
    private final int f4737b;
    private final ps2 d = new ss2();

    /* renamed from: a, reason: collision with root package name */
    private final int f4736a = 6;

    /* renamed from: c, reason: collision with root package name */
    private final int f4738c = 0;

    public os2(int r2) {
        this.f4737b = r2;
    }

    @com.google.android.gms.common.util.d0
    private final String b(String str) throws UnsupportedEncodingException {
        String[] strArrSplit = str.split("\n");
        if (strArrSplit.length == 0) {
            return "";
        }
        qs2 qs2Var = new qs2();
        PriorityQueue priorityQueue = new PriorityQueue(this.f4737b, new rs2(this));
        for (String str2 : strArrSplit) {
            String[] strArrB = ts2.b(str2, false);
            if (strArrB.length != 0) {
                us2.d(strArrB, this.f4737b, this.f4736a, priorityQueue);
            }
        }
        Iterator it = priorityQueue.iterator();
        while (it.hasNext()) {
            try {
                qs2Var.a(this.d.a(((xs2) it.next()).f6035b));
            } catch (IOException e) {
                tr.c("Error while writing hash to byteStream", e);
            }
        }
        return qs2Var.toString();
    }

    public final String a(ArrayList<String> arrayList) {
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        int r2 = 0;
        while (r2 < size) {
            String str = arrayList.get(r2);
            r2++;
            sb.append(str.toLowerCase(Locale.US));
            sb.append('\n');
        }
        return b(sb.toString());
    }
}
