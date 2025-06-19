package b.q.b;

import android.os.Bundle;
import androidx.annotation.e0;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.lifecycle.j;
import androidx.lifecycle.x;
import b.q.c.c;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: b.q.b.a$a, reason: collision with other inner class name */
    public interface InterfaceC0089a<D> {
        @e0
        void a(@h0 c<D> cVar, D d);

        @e0
        @h0
        c<D> b(int r1, @i0 Bundle bundle);

        @e0
        void c(@h0 c<D> cVar);
    }

    public static void c(boolean z) {
        b.d = z;
    }

    @h0
    public static <T extends j & x> a d(@h0 T t) {
        return new b(t, t.j());
    }

    @e0
    public abstract void a(int r1);

    @Deprecated
    public abstract void b(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    @i0
    public abstract <D> c<D> e(int r1);

    public boolean f() {
        return false;
    }

    @e0
    @h0
    public abstract <D> c<D> g(int r1, @i0 Bundle bundle, @h0 InterfaceC0089a<D> interfaceC0089a);

    public abstract void h();

    @e0
    @h0
    public abstract <D> c<D> i(int r1, @i0 Bundle bundle, @h0 InterfaceC0089a<D> interfaceC0089a);
}
