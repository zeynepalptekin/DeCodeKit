package b.i.p.p0;

import android.os.Bundle;
import android.view.View;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.annotation.p0;

/* loaded from: classes.dex */
public interface g {

    public static abstract class a {

        /* renamed from: a, reason: collision with root package name */
        Bundle f1268a;

        @p0({p0.a.LIBRARY_GROUP_PREFIX})
        public void a(Bundle bundle) {
            this.f1268a = bundle;
        }
    }

    public static final class b extends a {
        public boolean b() {
            return this.f1268a.getBoolean(b.i.p.p0.d.P);
        }

        public int c() {
            return this.f1268a.getInt(b.i.p.p0.d.N);
        }
    }

    public static final class c extends a {
        public String b() {
            return this.f1268a.getString(b.i.p.p0.d.O);
        }
    }

    public static final class d extends a {
        public int b() {
            return this.f1268a.getInt(b.i.p.p0.d.W);
        }

        public int c() {
            return this.f1268a.getInt(b.i.p.p0.d.X);
        }
    }

    public static final class e extends a {
        public int b() {
            return this.f1268a.getInt(b.i.p.p0.d.U);
        }

        public int c() {
            return this.f1268a.getInt(b.i.p.p0.d.T);
        }
    }

    public static final class f extends a {
        public float b() {
            return this.f1268a.getFloat(b.i.p.p0.d.V);
        }
    }

    /* renamed from: b.i.p.p0.g$g, reason: collision with other inner class name */
    public static final class C0074g extends a {
        public int b() {
            return this.f1268a.getInt(b.i.p.p0.d.R);
        }

        public int c() {
            return this.f1268a.getInt(b.i.p.p0.d.Q);
        }
    }

    public static final class h extends a {
        public CharSequence b() {
            return this.f1268a.getCharSequence(b.i.p.p0.d.S);
        }
    }

    boolean a(@h0 View view, @i0 a aVar);
}
