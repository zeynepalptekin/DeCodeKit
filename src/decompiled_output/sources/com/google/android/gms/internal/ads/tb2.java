package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Arrays;

/* loaded from: classes.dex */
final class tb2 {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayDeque<a82> f5381a;

    private tb2() {
        this.f5381a = new ArrayDeque<>();
    }

    /* synthetic */ tb2(qb2 qb2Var) {
        this();
    }

    private final void b(a82 a82Var) {
        qb2 qb2Var;
        while (!a82Var.A()) {
            if (!(a82Var instanceof rb2)) {
                String strValueOf = String.valueOf(a82Var.getClass());
                StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 49);
                sb.append("Has a new type of ByteString been created? Found ");
                sb.append(strValueOf);
                throw new IllegalArgumentException(sb.toString());
            }
            rb2 rb2Var = (rb2) a82Var;
            b(rb2Var.i);
            a82Var = rb2Var.j;
        }
        int r0 = d(a82Var.size());
        int r1 = rb2.a0(r0 + 1);
        if (this.f5381a.isEmpty() || this.f5381a.peek().size() >= r1) {
            this.f5381a.push(a82Var);
            return;
        }
        int r02 = rb2.a0(r0);
        a82 a82VarPop = this.f5381a.pop();
        while (true) {
            qb2Var = null;
            if (this.f5381a.isEmpty() || this.f5381a.peek().size() >= r02) {
                break;
            } else {
                a82VarPop = new rb2(this.f5381a.pop(), a82VarPop, qb2Var);
            }
        }
        rb2 rb2Var2 = new rb2(a82VarPop, a82Var, qb2Var);
        while (!this.f5381a.isEmpty()) {
            if (this.f5381a.peek().size() >= rb2.a0(d(rb2Var2.size()) + 1)) {
                break;
            } else {
                rb2Var2 = new rb2(this.f5381a.pop(), rb2Var2, qb2Var);
            }
        }
        this.f5381a.push(rb2Var2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final a82 c(a82 a82Var, a82 a82Var2) {
        b(a82Var);
        b(a82Var2);
        a82 a82VarPop = this.f5381a.pop();
        while (!this.f5381a.isEmpty()) {
            a82VarPop = new rb2(this.f5381a.pop(), a82VarPop, null);
        }
        return a82VarPop;
    }

    private static int d(int r1) {
        int r12 = Arrays.binarySearch(rb2.m, r1);
        return r12 < 0 ? (-(r12 + 1)) - 1 : r12;
    }
}
