package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.g92;
import java.io.IOException;
import java.util.Map;

/* loaded from: classes.dex */
abstract class a92<T extends g92<T>> {
    a92() {
    }

    abstract int a(Map.Entry<?, ?> entry);

    abstract Object b(y82 y82Var, xa2 xa2Var, int r3);

    abstract <UT, UB> UB c(nb2 nb2Var, Object obj, y82 y82Var, e92<T> e92Var, UB ub, mc2<UT, UB> mc2Var) throws IOException;

    abstract void d(a82 a82Var, Object obj, y82 y82Var, e92<T> e92Var) throws IOException;

    abstract void e(nb2 nb2Var, Object obj, y82 y82Var, e92<T> e92Var) throws IOException;

    abstract void f(kd2 kd2Var, Map.Entry<?, ?> entry) throws IOException;

    abstract e92<T> g(Object obj);

    abstract e92<T> h(Object obj);

    abstract void i(Object obj);

    abstract boolean j(xa2 xa2Var);
}
