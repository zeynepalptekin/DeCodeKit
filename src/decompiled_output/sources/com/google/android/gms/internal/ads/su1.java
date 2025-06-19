package com.google.android.gms.internal.ads;

import java.util.Arrays;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes.dex */
public final class su1 {

    /* renamed from: a, reason: collision with root package name */
    private final String f5311a;

    /* renamed from: b, reason: collision with root package name */
    private final vu1 f5312b;

    /* renamed from: c, reason: collision with root package name */
    private vu1 f5313c;
    private boolean d;

    private su1(String str) {
        vu1 vu1Var = new vu1();
        this.f5312b = vu1Var;
        this.f5313c = vu1Var;
        this.d = false;
        this.f5311a = (String) bv1.b(str);
    }

    public final su1 a(@NullableDecl Object obj) {
        vu1 vu1Var = new vu1();
        this.f5313c.f5739b = vu1Var;
        this.f5313c = vu1Var;
        vu1Var.f5738a = obj;
        return this;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.f5311a);
        sb.append('{');
        vu1 vu1Var = this.f5312b.f5739b;
        String str = "";
        while (vu1Var != null) {
            Object obj = vu1Var.f5738a;
            sb.append(str);
            if (obj == null || !obj.getClass().isArray()) {
                sb.append(obj);
            } else {
                String strDeepToString = Arrays.deepToString(new Object[]{obj});
                sb.append((CharSequence) strDeepToString, 1, strDeepToString.length() - 1);
            }
            vu1Var = vu1Var.f5739b;
            str = ", ";
        }
        sb.append('}');
        return sb.toString();
    }
}
