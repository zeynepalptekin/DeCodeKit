package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.io.IOException;

/* loaded from: classes.dex */
public class m30 extends zd2 implements Closeable {
    private static he2 m = he2.b(m30.class);

    public m30(be2 be2Var, n40 n40Var) throws IOException {
        f(be2Var, be2Var.size(), n40Var);
    }

    @Override // com.google.android.gms.internal.ads.zd2, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.e.close();
    }

    @Override // com.google.android.gms.internal.ads.zd2
    public String toString() {
        String string = this.e.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 7);
        sb.append("model(");
        sb.append(string);
        sb.append(")");
        return sb.toString();
    }
}
