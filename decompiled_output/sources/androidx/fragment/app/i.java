package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.annotation.p0;
import androidx.annotation.s0;
import androidx.fragment.app.Fragment;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.List;

/* loaded from: classes.dex */
public abstract class i {
    static final g e = new g();
    public static final int f = 1;
    private g d = null;

    public interface a {
        int J();

        @i0
        CharSequence a();

        @i0
        String b();

        @s0
        int d();

        @s0
        int e();

        @i0
        CharSequence f();
    }

    public static abstract class b {
        public void a(@h0 i iVar, @h0 Fragment fragment, @i0 Bundle bundle) {
        }

        public void b(@h0 i iVar, @h0 Fragment fragment, @h0 Context context) {
        }

        public void c(@h0 i iVar, @h0 Fragment fragment, @i0 Bundle bundle) {
        }

        public void d(@h0 i iVar, @h0 Fragment fragment) {
        }

        public void e(@h0 i iVar, @h0 Fragment fragment) {
        }

        public void f(@h0 i iVar, @h0 Fragment fragment) {
        }

        public void g(@h0 i iVar, @h0 Fragment fragment, @h0 Context context) {
        }

        public void h(@h0 i iVar, @h0 Fragment fragment, @i0 Bundle bundle) {
        }

        public void i(@h0 i iVar, @h0 Fragment fragment) {
        }

        public void j(@h0 i iVar, @h0 Fragment fragment, @h0 Bundle bundle) {
        }

        public void k(@h0 i iVar, @h0 Fragment fragment) {
        }

        public void l(@h0 i iVar, @h0 Fragment fragment) {
        }

        public void m(@h0 i iVar, @h0 Fragment fragment, @h0 View view, @i0 Bundle bundle) {
        }

        public void n(@h0 i iVar, @h0 Fragment fragment) {
        }
    }

    public interface c {
        void a();
    }

    public static void d(boolean z) {
        j.L = z;
    }

    public void A(@h0 g gVar) {
        this.d = gVar;
    }

    public abstract void B(@h0 b bVar);

    public abstract void a(@h0 c cVar);

    @h0
    public abstract r b();

    public abstract void c(@h0 String str, @i0 FileDescriptor fileDescriptor, @h0 PrintWriter printWriter, @i0 String[] strArr);

    public abstract boolean e();

    @i0
    public abstract Fragment f(@androidx.annotation.w int r1);

    @i0
    public abstract Fragment g(@i0 String str);

    @h0
    public abstract a h(int r1);

    public abstract int i();

    @i0
    public abstract Fragment j(@h0 Bundle bundle, @h0 String str);

    @h0
    public g k() {
        if (this.d == null) {
            this.d = e;
        }
        return this.d;
    }

    @h0
    public abstract List<Fragment> l();

    @i0
    public abstract Fragment m();

    public abstract boolean n();

    public abstract boolean o();

    @h0
    @p0({p0.a.LIBRARY_GROUP_PREFIX})
    @Deprecated
    public r p() {
        return b();
    }

    public abstract void q();

    public abstract void r(int r1, int r2);

    public abstract void s(@i0 String str, int r2);

    public abstract boolean t();

    public abstract boolean u(int r1, int r2);

    public abstract boolean v(@i0 String str, int r2);

    public abstract void w(@h0 Bundle bundle, @h0 String str, @h0 Fragment fragment);

    public abstract void x(@h0 b bVar, boolean z);

    public abstract void y(@h0 c cVar);

    @i0
    public abstract Fragment.g z(@h0 Fragment fragment);
}
