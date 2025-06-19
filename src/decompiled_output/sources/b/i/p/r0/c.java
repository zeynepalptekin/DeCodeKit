package b.i.p.r0;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.view.inputmethod.InputContentInfo;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.annotation.m0;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC0076c f1283a;

    @m0(25)
    private static final class a implements InterfaceC0076c {

        /* renamed from: a, reason: collision with root package name */
        @h0
        final InputContentInfo f1284a;

        a(@h0 Uri uri, @h0 ClipDescription clipDescription, @i0 Uri uri2) {
            this.f1284a = new InputContentInfo(uri, clipDescription, uri2);
        }

        a(@h0 Object obj) {
            this.f1284a = (InputContentInfo) obj;
        }

        @Override // b.i.p.r0.c.InterfaceC0076c
        @h0
        public ClipDescription C() {
            return this.f1284a.getDescription();
        }

        @Override // b.i.p.r0.c.InterfaceC0076c
        @i0
        public Object D() {
            return this.f1284a;
        }

        @Override // b.i.p.r0.c.InterfaceC0076c
        @h0
        public Uri E() {
            return this.f1284a.getContentUri();
        }

        @Override // b.i.p.r0.c.InterfaceC0076c
        public void F() {
            this.f1284a.requestPermission();
        }

        @Override // b.i.p.r0.c.InterfaceC0076c
        public void G() {
            this.f1284a.releasePermission();
        }

        @Override // b.i.p.r0.c.InterfaceC0076c
        @i0
        public Uri H() {
            return this.f1284a.getLinkUri();
        }
    }

    private static final class b implements InterfaceC0076c {

        /* renamed from: a, reason: collision with root package name */
        @h0
        private final Uri f1285a;

        /* renamed from: b, reason: collision with root package name */
        @h0
        private final ClipDescription f1286b;

        /* renamed from: c, reason: collision with root package name */
        @i0
        private final Uri f1287c;

        b(@h0 Uri uri, @h0 ClipDescription clipDescription, @i0 Uri uri2) {
            this.f1285a = uri;
            this.f1286b = clipDescription;
            this.f1287c = uri2;
        }

        @Override // b.i.p.r0.c.InterfaceC0076c
        @h0
        public ClipDescription C() {
            return this.f1286b;
        }

        @Override // b.i.p.r0.c.InterfaceC0076c
        @i0
        public Object D() {
            return null;
        }

        @Override // b.i.p.r0.c.InterfaceC0076c
        @h0
        public Uri E() {
            return this.f1285a;
        }

        @Override // b.i.p.r0.c.InterfaceC0076c
        public void F() {
        }

        @Override // b.i.p.r0.c.InterfaceC0076c
        public void G() {
        }

        @Override // b.i.p.r0.c.InterfaceC0076c
        @i0
        public Uri H() {
            return this.f1287c;
        }
    }

    /* renamed from: b.i.p.r0.c$c, reason: collision with other inner class name */
    private interface InterfaceC0076c {
        @h0
        ClipDescription C();

        @i0
        Object D();

        @h0
        Uri E();

        void F();

        void G();

        @i0
        Uri H();
    }

    public c(@h0 Uri uri, @h0 ClipDescription clipDescription, @i0 Uri uri2) {
        this.f1283a = Build.VERSION.SDK_INT >= 25 ? new a(uri, clipDescription, uri2) : new b(uri, clipDescription, uri2);
    }

    private c(@h0 InterfaceC0076c interfaceC0076c) {
        this.f1283a = interfaceC0076c;
    }

    @i0
    public static c g(@i0 Object obj) {
        if (obj != null && Build.VERSION.SDK_INT >= 25) {
            return new c(new a(obj));
        }
        return null;
    }

    @h0
    public Uri a() {
        return this.f1283a.E();
    }

    @h0
    public ClipDescription b() {
        return this.f1283a.C();
    }

    @i0
    public Uri c() {
        return this.f1283a.H();
    }

    public void d() {
        this.f1283a.G();
    }

    public void e() {
        this.f1283a.F();
    }

    @i0
    public Object f() {
        return this.f1283a.D();
    }
}
