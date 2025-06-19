package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.l92;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class cv2 {

    public static final class a extends l92<a, b> implements za2 {
        private static final a zzbyp;
        private static volatile kb2<a> zzel;
        private int zzbye;
        private i zzbyg;
        private j zzbyh;
        private k zzbyj;
        private u zzbyk;
        private s zzbyl;
        private p zzbym;
        private q zzbyn;
        private int zzdw;
        private int zzbyf = 1000;
        private x92<h> zzbyi = l92.F();
        private x92<a0> zzbyo = l92.F();

        /* renamed from: com.google.android.gms.internal.ads.cv2$a$a, reason: collision with other inner class name */
        public enum EnumC0172a implements r92 {
            AD_INITIATER_UNSPECIFIED(0),
            BANNER(1),
            DFP_BANNER(2),
            INTERSTITIAL(3),
            DFP_INTERSTITIAL(4),
            NATIVE_EXPRESS(5),
            AD_LOADER(6),
            REWARD_BASED_VIDEO_AD(7),
            BANNER_SEARCH_ADS(8),
            GOOGLE_MOBILE_ADS_SDK_ADAPTER(9),
            APP_OPEN(10);

            private static final q92<EnumC0172a> p = new fv2();
            private final int d;

            EnumC0172a(int r3) {
                this.d = r3;
            }

            public static EnumC0172a e(int r0) {
                switch (r0) {
                    case 0:
                        return AD_INITIATER_UNSPECIFIED;
                    case 1:
                        return BANNER;
                    case 2:
                        return DFP_BANNER;
                    case 3:
                        return INTERSTITIAL;
                    case 4:
                        return DFP_INTERSTITIAL;
                    case 5:
                        return NATIVE_EXPRESS;
                    case 6:
                        return AD_LOADER;
                    case 7:
                        return REWARD_BASED_VIDEO_AD;
                    case 8:
                        return BANNER_SEARCH_ADS;
                    case 9:
                        return GOOGLE_MOBILE_ADS_SDK_ADAPTER;
                    case 10:
                        return APP_OPEN;
                    default:
                        return null;
                }
            }

            public static t92 g() {
                return gv2.f3585a;
            }

            @Override // com.google.android.gms.internal.ads.r92
            public final int h() {
                return this.d;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "<" + EnumC0172a.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.d + " name=" + name() + '>';
            }
        }

        public static final class b extends l92.b<a, b> implements za2 {
            private b() {
                super(a.zzbyp);
            }

            /* synthetic */ b(ev2 ev2Var) {
                this();
            }

            public final b v(j.a aVar) {
                if (this.f) {
                    s();
                    this.f = false;
                }
                ((a) this.e).K((j) ((l92) aVar.P()));
                return this;
            }

            public final b w(EnumC0172a enumC0172a) {
                if (this.f) {
                    s();
                    this.f = false;
                }
                ((a) this.e).H(enumC0172a);
                return this;
            }
        }

        static {
            a aVar = new a();
            zzbyp = aVar;
            l92.w(a.class, aVar);
        }

        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void H(EnumC0172a enumC0172a) {
            this.zzbye = enumC0172a.h();
            this.zzdw |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void K(j jVar) {
            jVar.getClass();
            this.zzbyh = jVar;
            this.zzdw |= 8;
        }

        public static a M() {
            return zzbyp;
        }

        public final j L() {
            j jVar = this.zzbyh;
            return jVar == null ? j.J() : jVar;
        }

        @Override // com.google.android.gms.internal.ads.l92
        protected final Object t(int r2, Object obj, Object obj2) {
            ev2 ev2Var = null;
            switch (ev2.f3333a[r2 - 1]) {
                case 1:
                    return new a();
                case 2:
                    return new b(ev2Var);
                case 3:
                    return l92.u(zzbyp, "\u0001\u000b\u0000\u0001\u0007\u0011\u000b\u0000\u0002\u0000\u0007ဌ\u0000\bဌ\u0001\tဉ\u0002\nဉ\u0003\u000b\u001b\fဉ\u0004\rဉ\u0005\u000eဉ\u0006\u000fဉ\u0007\u0010ဉ\b\u0011\u001b", new Object[]{"zzdw", "zzbye", EnumC0172a.g(), "zzbyf", mv2.g(), "zzbyg", "zzbyh", "zzbyi", h.class, "zzbyj", "zzbyk", "zzbyl", "zzbym", "zzbyn", "zzbyo", a0.class});
                case 4:
                    return zzbyp;
                case 5:
                    kb2<a> aVar = zzel;
                    if (aVar == null) {
                        synchronized (a.class) {
                            aVar = zzel;
                            if (aVar == null) {
                                aVar = new l92.a<>(zzbyp);
                                zzel = aVar;
                            }
                        }
                    }
                    return aVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    public static final class a0 extends l92<a0, a> implements za2 {
        private static final a0 zzcfw;
        private static volatile kb2<a0> zzel;
        private e0 zzcfg;
        private c zzcfh;
        private d zzcfi;
        private e zzcfj;
        private b0 zzcfk;
        private b zzcfl;
        private d0 zzcfm;
        private int zzcfn;
        private int zzcfo;
        private y zzcfp;
        private int zzcfq;
        private int zzcfr;
        private int zzcfs;
        private int zzcft;
        private int zzcfu;
        private long zzcfv;
        private int zzdw;

        public static final class a extends l92.b<a0, a> implements za2 {
            private a() {
                super(a0.zzcfw);
            }

            /* synthetic */ a(ev2 ev2Var) {
                this();
            }
        }

        static {
            a0 a0Var = new a0();
            zzcfw = a0Var;
            l92.w(a0.class, a0Var);
        }

        private a0() {
        }

        @Override // com.google.android.gms.internal.ads.l92
        protected final Object t(int r2, Object obj, Object obj2) {
            ev2 ev2Var = null;
            switch (ev2.f3333a[r2 - 1]) {
                case 1:
                    return new a0();
                case 2:
                    return new a(ev2Var);
                case 3:
                    return l92.u(zzcfw, "\u0001\u0010\u0000\u0001\u0005\u0014\u0010\u0000\u0000\u0000\u0005ဉ\u0000\u0006ဉ\u0001\u0007ဉ\u0002\bဉ\u0003\tဉ\u0004\nဉ\u0005\u000bဉ\u0006\fင\u0007\rင\b\u000eဉ\t\u000fင\n\u0010င\u000b\u0011င\f\u0012င\r\u0013င\u000e\u0014ဃ\u000f", new Object[]{"zzdw", "zzcfg", "zzcfh", "zzcfi", "zzcfj", "zzcfk", "zzcfl", "zzcfm", "zzcfn", "zzcfo", "zzcfp", "zzcfq", "zzcfr", "zzcfs", "zzcft", "zzcfu", "zzcfv"});
                case 4:
                    return zzcfw;
                case 5:
                    kb2<a0> aVar = zzel;
                    if (aVar == null) {
                        synchronized (a0.class) {
                            aVar = zzel;
                            if (aVar == null) {
                                aVar = new l92.a<>(zzcfw);
                                zzel = aVar;
                            }
                        }
                    }
                    return aVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    public static final class b extends l92<b, a> implements za2 {
        private static final b zzcgl;
        private static volatile kb2<b> zzel;
        private int zzccm = 1000;
        private c0 zzcfx;
        private y zzcfy;
        private int zzdw;

        public static final class a extends l92.b<b, a> implements za2 {
            private a() {
                super(b.zzcgl);
            }

            /* synthetic */ a(ev2 ev2Var) {
                this();
            }
        }

        static {
            b bVar = new b();
            zzcgl = bVar;
            l92.w(b.class, bVar);
        }

        private b() {
        }

        @Override // com.google.android.gms.internal.ads.l92
        protected final Object t(int r2, Object obj, Object obj2) {
            ev2 ev2Var = null;
            switch (ev2.f3333a[r2 - 1]) {
                case 1:
                    return new b();
                case 2:
                    return new a(ev2Var);
                case 3:
                    return l92.u(zzcgl, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzdw", "zzccm", mv2.g(), "zzcfx", "zzcfy"});
                case 4:
                    return zzcgl;
                case 5:
                    kb2<b> aVar = zzel;
                    if (aVar == null) {
                        synchronized (b.class) {
                            aVar = zzel;
                            if (aVar == null) {
                                aVar = new l92.a<>(zzcgl);
                                zzel = aVar;
                            }
                        }
                    }
                    return aVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    public static final class b0 extends l92<b0, a> implements za2 {
        private static final b0 zzcfz;
        private static volatile kb2<b0> zzel;
        private int zzccm = 1000;
        private c0 zzcfx;
        private y zzcfy;
        private int zzdw;

        public static final class a extends l92.b<b0, a> implements za2 {
            private a() {
                super(b0.zzcfz);
            }

            /* synthetic */ a(ev2 ev2Var) {
                this();
            }
        }

        static {
            b0 b0Var = new b0();
            zzcfz = b0Var;
            l92.w(b0.class, b0Var);
        }

        private b0() {
        }

        @Override // com.google.android.gms.internal.ads.l92
        protected final Object t(int r2, Object obj, Object obj2) {
            ev2 ev2Var = null;
            switch (ev2.f3333a[r2 - 1]) {
                case 1:
                    return new b0();
                case 2:
                    return new a(ev2Var);
                case 3:
                    return l92.u(zzcfz, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzdw", "zzccm", mv2.g(), "zzcfx", "zzcfy"});
                case 4:
                    return zzcfz;
                case 5:
                    kb2<b0> aVar = zzel;
                    if (aVar == null) {
                        synchronized (b0.class) {
                            aVar = zzel;
                            if (aVar == null) {
                                aVar = new l92.a<>(zzcfz);
                                zzel = aVar;
                            }
                        }
                    }
                    return aVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    public static final class c extends l92<c, a> implements za2 {
        private static final c zzcgn;
        private static volatile kb2<c> zzel;
        private int zzccm = 1000;
        private int zzcfn;
        private int zzcfo;
        private c0 zzcfx;
        private int zzcgj;
        private long zzcgm;
        private int zzdw;

        public static final class a extends l92.b<c, a> implements za2 {
            private a() {
                super(c.zzcgn);
            }

            /* synthetic */ a(ev2 ev2Var) {
                this();
            }
        }

        static {
            c cVar = new c();
            zzcgn = cVar;
            l92.w(c.class, cVar);
        }

        private c() {
        }

        @Override // com.google.android.gms.internal.ads.l92
        protected final Object t(int r2, Object obj, Object obj2) {
            ev2 ev2Var = null;
            switch (ev2.f3333a[r2 - 1]) {
                case 1:
                    return new c();
                case 2:
                    return new a(ev2Var);
                case 3:
                    return l92.u(zzcgn, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006ဃ\u0005", new Object[]{"zzdw", "zzccm", mv2.g(), "zzcfx", "zzcfn", "zzcfo", "zzcgj", "zzcgm"});
                case 4:
                    return zzcgn;
                case 5:
                    kb2<c> aVar = zzel;
                    if (aVar == null) {
                        synchronized (c.class) {
                            aVar = zzel;
                            if (aVar == null) {
                                aVar = new l92.a<>(zzcgn);
                                zzel = aVar;
                            }
                        }
                    }
                    return aVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    public static final class c0 extends l92<c0, a> implements za2 {
        private static final c0 zzcgb;
        private static volatile kb2<c0> zzel;
        private int zzcga;
        private int zzdw;

        public static final class a extends l92.b<c0, a> implements za2 {
            private a() {
                super(c0.zzcgb);
            }

            /* synthetic */ a(ev2 ev2Var) {
                this();
            }
        }

        public enum b implements r92 {
            VIDEO_ERROR_CODE_UNSPECIFIED(0),
            OPENGL_RENDERING_FAILED(1),
            CACHE_LOAD_FAILED(2),
            ANDROID_TARGET_API_TOO_LOW(3);

            private static final q92<b> i = new xv2();
            private final int d;

            b(int r3) {
                this.d = r3;
            }

            public static b e(int r1) {
                if (r1 == 0) {
                    return VIDEO_ERROR_CODE_UNSPECIFIED;
                }
                if (r1 == 1) {
                    return OPENGL_RENDERING_FAILED;
                }
                if (r1 == 2) {
                    return CACHE_LOAD_FAILED;
                }
                if (r1 != 3) {
                    return null;
                }
                return ANDROID_TARGET_API_TOO_LOW;
            }

            public static t92 g() {
                return yv2.f6187a;
            }

            @Override // com.google.android.gms.internal.ads.r92
            public final int h() {
                return this.d;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "<" + b.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.d + " name=" + name() + '>';
            }
        }

        static {
            c0 c0Var = new c0();
            zzcgb = c0Var;
            l92.w(c0.class, c0Var);
        }

        private c0() {
        }

        @Override // com.google.android.gms.internal.ads.l92
        protected final Object t(int r2, Object obj, Object obj2) {
            ev2 ev2Var = null;
            switch (ev2.f3333a[r2 - 1]) {
                case 1:
                    return new c0();
                case 2:
                    return new a(ev2Var);
                case 3:
                    return l92.u(zzcgb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"zzdw", "zzcga", b.g()});
                case 4:
                    return zzcgb;
                case 5:
                    kb2<c0> aVar = zzel;
                    if (aVar == null) {
                        synchronized (c0.class) {
                            aVar = zzel;
                            if (aVar == null) {
                                aVar = new l92.a<>(zzcgb);
                                zzel = aVar;
                            }
                        }
                    }
                    return aVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    public static final class d extends l92<d, a> implements za2 {
        private static final d zzcgo;
        private static volatile kb2<d> zzel;
        private int zzccm = 1000;
        private c0 zzcfx;
        private y zzcfy;
        private int zzdw;

        public static final class a extends l92.b<d, a> implements za2 {
            private a() {
                super(d.zzcgo);
            }

            /* synthetic */ a(ev2 ev2Var) {
                this();
            }
        }

        static {
            d dVar = new d();
            zzcgo = dVar;
            l92.w(d.class, dVar);
        }

        private d() {
        }

        @Override // com.google.android.gms.internal.ads.l92
        protected final Object t(int r2, Object obj, Object obj2) {
            ev2 ev2Var = null;
            switch (ev2.f3333a[r2 - 1]) {
                case 1:
                    return new d();
                case 2:
                    return new a(ev2Var);
                case 3:
                    return l92.u(zzcgo, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzdw", "zzccm", mv2.g(), "zzcfx", "zzcfy"});
                case 4:
                    return zzcgo;
                case 5:
                    kb2<d> aVar = zzel;
                    if (aVar == null) {
                        synchronized (d.class) {
                            aVar = zzel;
                            if (aVar == null) {
                                aVar = new l92.a<>(zzcgo);
                                zzel = aVar;
                            }
                        }
                    }
                    return aVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    public static final class d0 extends l92<d0, a> implements za2 {
        private static final d0 zzcgi;
        private static volatile kb2<d0> zzel;
        private int zzccm = 1000;
        private c0 zzcfx;
        private y zzcfy;
        private z zzcgh;
        private int zzdw;

        public static final class a extends l92.b<d0, a> implements za2 {
            private a() {
                super(d0.zzcgi);
            }

            /* synthetic */ a(ev2 ev2Var) {
                this();
            }
        }

        static {
            d0 d0Var = new d0();
            zzcgi = d0Var;
            l92.w(d0.class, d0Var);
        }

        private d0() {
        }

        @Override // com.google.android.gms.internal.ads.l92
        protected final Object t(int r2, Object obj, Object obj2) {
            ev2 ev2Var = null;
            switch (ev2.f3333a[r2 - 1]) {
                case 1:
                    return new d0();
                case 2:
                    return new a(ev2Var);
                case 3:
                    return l92.u(zzcgi, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဌ\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"zzdw", "zzcgh", "zzccm", mv2.g(), "zzcfx", "zzcfy"});
                case 4:
                    return zzcgi;
                case 5:
                    kb2<d0> aVar = zzel;
                    if (aVar == null) {
                        synchronized (d0.class) {
                            aVar = zzel;
                            if (aVar == null) {
                                aVar = new l92.a<>(zzcgi);
                                zzel = aVar;
                            }
                        }
                    }
                    return aVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    public static final class e extends l92<e, a> implements za2 {
        private static final e zzcgp;
        private static volatile kb2<e> zzel;
        private int zzccm = 1000;
        private c0 zzcfx;
        private int zzdw;

        public static final class a extends l92.b<e, a> implements za2 {
            private a() {
                super(e.zzcgp);
            }

            /* synthetic */ a(ev2 ev2Var) {
                this();
            }
        }

        static {
            e eVar = new e();
            zzcgp = eVar;
            l92.w(e.class, eVar);
        }

        private e() {
        }

        @Override // com.google.android.gms.internal.ads.l92
        protected final Object t(int r2, Object obj, Object obj2) {
            ev2 ev2Var = null;
            switch (ev2.f3333a[r2 - 1]) {
                case 1:
                    return new e();
                case 2:
                    return new a(ev2Var);
                case 3:
                    return l92.u(zzcgp, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001", new Object[]{"zzdw", "zzccm", mv2.g(), "zzcfx"});
                case 4:
                    return zzcgp;
                case 5:
                    kb2<e> aVar = zzel;
                    if (aVar == null) {
                        synchronized (e.class) {
                            aVar = zzel;
                            if (aVar == null) {
                                aVar = new l92.a<>(zzcgp);
                                zzel = aVar;
                            }
                        }
                    }
                    return aVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    public static final class e0 extends l92<e0, a> implements za2 {
        private static final e0 zzcgk;
        private static volatile kb2<e0> zzel;
        private int zzccm = 1000;
        private int zzcfn;
        private int zzcfo;
        private c0 zzcfx;
        private int zzcgj;
        private int zzdw;

        public static final class a extends l92.b<e0, a> implements za2 {
            private a() {
                super(e0.zzcgk);
            }

            /* synthetic */ a(ev2 ev2Var) {
                this();
            }
        }

        static {
            e0 e0Var = new e0();
            zzcgk = e0Var;
            l92.w(e0.class, e0Var);
        }

        private e0() {
        }

        @Override // com.google.android.gms.internal.ads.l92
        protected final Object t(int r2, Object obj, Object obj2) {
            ev2 ev2Var = null;
            switch (ev2.f3333a[r2 - 1]) {
                case 1:
                    return new e0();
                case 2:
                    return new a(ev2Var);
                case 3:
                    return l92.u(zzcgk, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004", new Object[]{"zzdw", "zzccm", mv2.g(), "zzcfx", "zzcfn", "zzcfo", "zzcgj"});
                case 4:
                    return zzcgk;
                case 5:
                    kb2<e0> aVar = zzel;
                    if (aVar == null) {
                        synchronized (e0.class) {
                            aVar = zzel;
                            if (aVar == null) {
                                aVar = new l92.a<>(zzcgk);
                                zzel = aVar;
                            }
                        }
                    }
                    return aVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    public static final class f extends l92<f, a> implements za2 {
        private static final f zzcgs;
        private static volatile kb2<f> zzel;
        private boolean zzcgq;
        private int zzcgr;
        private int zzdw;

        public static final class a extends l92.b<f, a> implements za2 {
            private a() {
                super(f.zzcgs);
            }

            /* synthetic */ a(ev2 ev2Var) {
                this();
            }

            public final a v(int r2) {
                if (this.f) {
                    s();
                    this.f = false;
                }
                ((f) this.e).J(r2);
                return this;
            }

            public final boolean w() {
                return ((f) this.e).K();
            }

            public final a x(boolean z) {
                if (this.f) {
                    s();
                    this.f = false;
                }
                ((f) this.e).N(z);
                return this;
            }
        }

        static {
            f fVar = new f();
            zzcgs = fVar;
            l92.w(f.class, fVar);
        }

        private f() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void J(int r2) {
            this.zzdw |= 2;
            this.zzcgr = r2;
        }

        public static a L() {
            return zzcgs.z();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void N(boolean z) {
            this.zzdw |= 1;
            this.zzcgq = z;
        }

        public final boolean K() {
            return this.zzcgq;
        }

        @Override // com.google.android.gms.internal.ads.l92
        protected final Object t(int r2, Object obj, Object obj2) {
            ev2 ev2Var = null;
            switch (ev2.f3333a[r2 - 1]) {
                case 1:
                    return new f();
                case 2:
                    return new a(ev2Var);
                case 3:
                    return l92.u(zzcgs, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002င\u0001", new Object[]{"zzdw", "zzcgq", "zzcgr"});
                case 4:
                    return zzcgs;
                case 5:
                    kb2<f> aVar = zzel;
                    if (aVar == null) {
                        synchronized (f.class) {
                            aVar = zzel;
                            if (aVar == null) {
                                aVar = new l92.a<>(zzcgs);
                                zzel = aVar;
                            }
                        }
                    }
                    return aVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    public static final class g extends l92<g, b> implements za2 {
        private static final g zzbzh;
        private static volatile kb2<g> zzel;
        private x92<a> zzbzg = l92.F();

        public static final class a extends l92<a, C0173a> implements za2 {
            private static final a zzbzf;
            private static volatile kb2<a> zzel;
            private int zzbzc;
            private d zzbzd;
            private e zzbze;
            private int zzdw;

            /* renamed from: com.google.android.gms.internal.ads.cv2$g$a$a, reason: collision with other inner class name */
            public static final class C0173a extends l92.b<a, C0173a> implements za2 {
                private C0173a() {
                    super(a.zzbzf);
                }

                /* synthetic */ C0173a(ev2 ev2Var) {
                    this();
                }

                public final C0173a v(d.a aVar) {
                    if (this.f) {
                        s();
                        this.f = false;
                    }
                    ((a) this.e).L((d) ((l92) aVar.P()));
                    return this;
                }

                public final C0173a w(e.a aVar) {
                    if (this.f) {
                        s();
                        this.f = false;
                    }
                    ((a) this.e).M((e) ((l92) aVar.P()));
                    return this;
                }

                public final C0173a x(c cVar) {
                    if (this.f) {
                        s();
                        this.f = false;
                    }
                    ((a) this.e).K(cVar);
                    return this;
                }
            }

            static {
                a aVar = new a();
                zzbzf = aVar;
                l92.w(a.class, aVar);
            }

            private a() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void K(c cVar) {
                this.zzbzc = cVar.h();
                this.zzdw |= 1;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void L(d dVar) {
                dVar.getClass();
                this.zzbzd = dVar;
                this.zzdw |= 2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void M(e eVar) {
                eVar.getClass();
                this.zzbze = eVar;
                this.zzdw |= 4;
            }

            public static C0173a N() {
                return zzbzf.z();
            }

            @Override // com.google.android.gms.internal.ads.l92
            protected final Object t(int r2, Object obj, Object obj2) {
                ev2 ev2Var = null;
                switch (ev2.f3333a[r2 - 1]) {
                    case 1:
                        return new a();
                    case 2:
                        return new C0173a(ev2Var);
                    case 3:
                        return l92.u(zzbzf, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzdw", "zzbzc", c.g(), "zzbzd", "zzbze"});
                    case 4:
                        return zzbzf;
                    case 5:
                        kb2<a> aVar = zzel;
                        if (aVar == null) {
                            synchronized (a.class) {
                                aVar = zzel;
                                if (aVar == null) {
                                    aVar = new l92.a<>(zzbzf);
                                    zzel = aVar;
                                }
                            }
                        }
                        return aVar;
                    case 6:
                        return (byte) 1;
                    case 7:
                        return null;
                    default:
                        throw new UnsupportedOperationException();
                }
            }
        }

        public static final class b extends l92.b<g, b> implements za2 {
            private b() {
                super(g.zzbzh);
            }

            /* synthetic */ b(ev2 ev2Var) {
                this();
            }

            public final b v(a.C0173a c0173a) {
                if (this.f) {
                    s();
                    this.f = false;
                }
                ((g) this.e).H((a) ((l92) c0173a.P()));
                return this;
            }
        }

        public enum c implements r92 {
            UNSPECIFIED(0),
            IN_MEMORY(1);

            private static final q92<c> g = new hv2();
            private final int d;

            c(int r3) {
                this.d = r3;
            }

            public static c e(int r1) {
                if (r1 == 0) {
                    return UNSPECIFIED;
                }
                if (r1 != 1) {
                    return null;
                }
                return IN_MEMORY;
            }

            public static t92 g() {
                return iv2.f3877a;
            }

            @Override // com.google.android.gms.internal.ads.r92
            public final int h() {
                return this.d;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "<" + c.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.d + " name=" + name() + '>';
            }
        }

        public static final class d extends l92<d, a> implements za2 {
            private static final d zzbzn;
            private static volatile kb2<d> zzel;
            private boolean zzbzl;
            private int zzbzm;
            private int zzdw;

            public static final class a extends l92.b<d, a> implements za2 {
                private a() {
                    super(d.zzbzn);
                }

                /* synthetic */ a(ev2 ev2Var) {
                    this();
                }

                public final a v(int r2) {
                    if (this.f) {
                        s();
                        this.f = false;
                    }
                    ((d) this.e).J(r2);
                    return this;
                }

                public final a w(boolean z) {
                    if (this.f) {
                        s();
                        this.f = false;
                    }
                    ((d) this.e).M(z);
                    return this;
                }
            }

            static {
                d dVar = new d();
                zzbzn = dVar;
                l92.w(d.class, dVar);
            }

            private d() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void J(int r2) {
                this.zzdw |= 2;
                this.zzbzm = r2;
            }

            public static a K() {
                return zzbzn.z();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void M(boolean z) {
                this.zzdw |= 1;
                this.zzbzl = z;
            }

            @Override // com.google.android.gms.internal.ads.l92
            protected final Object t(int r2, Object obj, Object obj2) {
                ev2 ev2Var = null;
                switch (ev2.f3333a[r2 - 1]) {
                    case 1:
                        return new d();
                    case 2:
                        return new a(ev2Var);
                    case 3:
                        return l92.u(zzbzn, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဋ\u0001", new Object[]{"zzdw", "zzbzl", "zzbzm"});
                    case 4:
                        return zzbzn;
                    case 5:
                        kb2<d> aVar = zzel;
                        if (aVar == null) {
                            synchronized (d.class) {
                                aVar = zzel;
                                if (aVar == null) {
                                    aVar = new l92.a<>(zzbzn);
                                    zzel = aVar;
                                }
                            }
                        }
                        return aVar;
                    case 6:
                        return (byte) 1;
                    case 7:
                        return null;
                    default:
                        throw new UnsupportedOperationException();
                }
            }
        }

        public static final class e extends l92<e, a> implements za2 {
            private static final e zzbzq;
            private static volatile kb2<e> zzel;
            private int zzbzm;
            private boolean zzbzo;
            private boolean zzbzp;
            private int zzdw;

            public static final class a extends l92.b<e, a> implements za2 {
                private a() {
                    super(e.zzbzq);
                }

                /* synthetic */ a(ev2 ev2Var) {
                    this();
                }

                public final a v(int r2) {
                    if (this.f) {
                        s();
                        this.f = false;
                    }
                    ((e) this.e).K(r2);
                    return this;
                }

                public final a w(boolean z) {
                    if (this.f) {
                        s();
                        this.f = false;
                    }
                    ((e) this.e).N(z);
                    return this;
                }

                public final a x(boolean z) {
                    if (this.f) {
                        s();
                        this.f = false;
                    }
                    ((e) this.e).O(z);
                    return this;
                }
            }

            static {
                e eVar = new e();
                zzbzq = eVar;
                l92.w(e.class, eVar);
            }

            private e() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void K(int r2) {
                this.zzdw |= 4;
                this.zzbzm = r2;
            }

            public static a L() {
                return zzbzq.z();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void N(boolean z) {
                this.zzdw |= 1;
                this.zzbzo = z;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void O(boolean z) {
                this.zzdw |= 2;
                this.zzbzp = z;
            }

            @Override // com.google.android.gms.internal.ads.l92
            protected final Object t(int r2, Object obj, Object obj2) {
                ev2 ev2Var = null;
                switch (ev2.f3333a[r2 - 1]) {
                    case 1:
                        return new e();
                    case 2:
                        return new a(ev2Var);
                    case 3:
                        return l92.u(zzbzq, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဋ\u0002", new Object[]{"zzdw", "zzbzo", "zzbzp", "zzbzm"});
                    case 4:
                        return zzbzq;
                    case 5:
                        kb2<e> aVar = zzel;
                        if (aVar == null) {
                            synchronized (e.class) {
                                aVar = zzel;
                                if (aVar == null) {
                                    aVar = new l92.a<>(zzbzq);
                                    zzel = aVar;
                                }
                            }
                        }
                        return aVar;
                    case 6:
                        return (byte) 1;
                    case 7:
                        return null;
                    default:
                        throw new UnsupportedOperationException();
                }
            }
        }

        static {
            g gVar = new g();
            zzbzh = gVar;
            l92.w(g.class, gVar);
        }

        private g() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void H(a aVar) {
            aVar.getClass();
            x92<a> x92Var = this.zzbzg;
            if (!x92Var.m()) {
                this.zzbzg = l92.s(x92Var);
            }
            this.zzbzg.add(aVar);
        }

        public static b J() {
            return zzbzh.z();
        }

        @Override // com.google.android.gms.internal.ads.l92
        protected final Object t(int r2, Object obj, Object obj2) {
            ev2 ev2Var = null;
            switch (ev2.f3333a[r2 - 1]) {
                case 1:
                    return new g();
                case 2:
                    return new b(ev2Var);
                case 3:
                    return l92.u(zzbzh, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzbzg", a.class});
                case 4:
                    return zzbzh;
                case 5:
                    kb2<g> aVar = zzel;
                    if (aVar == null) {
                        synchronized (g.class) {
                            aVar = zzel;
                            if (aVar == null) {
                                aVar = new l92.a<>(zzbzh);
                                zzel = aVar;
                            }
                        }
                    }
                    return aVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    public static final class h extends l92<h, b> implements za2 {
        private static final h zzbzt;
        private static volatile kb2<h> zzel;
        private int zzbzr;
        private w zzbzs;
        private int zzdw;

        public enum a implements r92 {
            AD_FORMAT_TYPE_UNSPECIFIED(0),
            BANNER(1),
            INTERSTITIAL(2),
            NATIVE_EXPRESS(3),
            NATIVE_CONTENT(4),
            NATIVE_APP_INSTALL(5),
            NATIVE_CUSTOM_TEMPLATE(6),
            DFP_BANNER(7),
            DFP_INTERSTITIAL(8),
            REWARD_BASED_VIDEO_AD(9),
            BANNER_SEARCH_ADS(10);

            private static final q92<a> p = new jv2();
            private final int d;

            a(int r3) {
                this.d = r3;
            }

            public static a e(int r0) {
                switch (r0) {
                    case 0:
                        return AD_FORMAT_TYPE_UNSPECIFIED;
                    case 1:
                        return BANNER;
                    case 2:
                        return INTERSTITIAL;
                    case 3:
                        return NATIVE_EXPRESS;
                    case 4:
                        return NATIVE_CONTENT;
                    case 5:
                        return NATIVE_APP_INSTALL;
                    case 6:
                        return NATIVE_CUSTOM_TEMPLATE;
                    case 7:
                        return DFP_BANNER;
                    case 8:
                        return DFP_INTERSTITIAL;
                    case 9:
                        return REWARD_BASED_VIDEO_AD;
                    case 10:
                        return BANNER_SEARCH_ADS;
                    default:
                        return null;
                }
            }

            public static t92 g() {
                return kv2.f4153a;
            }

            @Override // com.google.android.gms.internal.ads.r92
            public final int h() {
                return this.d;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "<" + a.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.d + " name=" + name() + '>';
            }
        }

        public static final class b extends l92.b<h, b> implements za2 {
            private b() {
                super(h.zzbzt);
            }

            /* synthetic */ b(ev2 ev2Var) {
                this();
            }
        }

        static {
            h hVar = new h();
            zzbzt = hVar;
            l92.w(h.class, hVar);
        }

        private h() {
        }

        @Override // com.google.android.gms.internal.ads.l92
        protected final Object t(int r2, Object obj, Object obj2) {
            ev2 ev2Var = null;
            switch (ev2.f3333a[r2 - 1]) {
                case 1:
                    return new h();
                case 2:
                    return new b(ev2Var);
                case 3:
                    return l92.u(zzbzt, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001", new Object[]{"zzdw", "zzbzr", a.g(), "zzbzs"});
                case 4:
                    return zzbzt;
                case 5:
                    kb2<h> aVar = zzel;
                    if (aVar == null) {
                        synchronized (h.class) {
                            aVar = zzel;
                            if (aVar == null) {
                                aVar = new l92.a<>(zzbzt);
                                zzel = aVar;
                            }
                        }
                    }
                    return aVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    public static final class i extends l92<i, a> implements za2 {
        private static final i zzcaj;
        private static volatile kb2<i> zzel;
        private String zzcag = "";
        private x92<h> zzcah = l92.F();
        private int zzcai;
        private int zzdw;

        public static final class a extends l92.b<i, a> implements za2 {
            private a() {
                super(i.zzcaj);
            }

            /* synthetic */ a(ev2 ev2Var) {
                this();
            }
        }

        static {
            i iVar = new i();
            zzcaj = iVar;
            l92.w(i.class, iVar);
        }

        private i() {
        }

        @Override // com.google.android.gms.internal.ads.l92
        protected final Object t(int r2, Object obj, Object obj2) {
            ev2 ev2Var = null;
            switch (ev2.f3333a[r2 - 1]) {
                case 1:
                    return new i();
                case 2:
                    return new a(ev2Var);
                case 3:
                    return l92.u(zzcaj, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဌ\u0001", new Object[]{"zzdw", "zzcag", "zzcah", h.class, "zzcai", mv2.g()});
                case 4:
                    return zzcaj;
                case 5:
                    kb2<i> aVar = zzel;
                    if (aVar == null) {
                        synchronized (i.class) {
                            aVar = zzel;
                            if (aVar == null) {
                                aVar = new l92.a<>(zzcaj);
                                zzel = aVar;
                            }
                        }
                    }
                    return aVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    public static final class j extends l92<j, a> implements za2 {
        private static final j zzcap;
        private static volatile kb2<j> zzel;
        private String zzcak = "";
        private x92<h> zzcal = l92.F();
        private int zzcam = 1000;
        private int zzcan = 1000;
        private int zzcao = 1000;
        private int zzdw;

        public static final class a extends l92.b<j, a> implements za2 {
            private a() {
                super(j.zzcap);
            }

            /* synthetic */ a(ev2 ev2Var) {
                this();
            }

            public final a v(String str) {
                if (this.f) {
                    s();
                    this.f = false;
                }
                ((j) this.e).I(str);
                return this;
            }
        }

        static {
            j jVar = new j();
            zzcap = jVar;
            l92.w(j.class, jVar);
        }

        private j() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void I(String str) {
            str.getClass();
            this.zzdw |= 1;
            this.zzcak = str;
        }

        public static j J() {
            return zzcap;
        }

        @Override // com.google.android.gms.internal.ads.l92
        protected final Object t(int r2, Object obj, Object obj2) {
            ev2 ev2Var = null;
            switch (ev2.f3333a[r2 - 1]) {
                case 1:
                    return new j();
                case 2:
                    return new a(ev2Var);
                case 3:
                    return l92.u(zzcap, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဌ\u0001\u0004ဌ\u0002\u0005ဌ\u0003", new Object[]{"zzdw", "zzcak", "zzcal", h.class, "zzcam", mv2.g(), "zzcan", mv2.g(), "zzcao", mv2.g()});
                case 4:
                    return zzcap;
                case 5:
                    kb2<j> aVar = zzel;
                    if (aVar == null) {
                        synchronized (j.class) {
                            aVar = zzel;
                            if (aVar == null) {
                                aVar = new l92.a<>(zzcap);
                                zzel = aVar;
                            }
                        }
                    }
                    return aVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    public static final class k extends l92<k, a> implements za2 {
        private static final k zzcaw;
        private static volatile kb2<k> zzel;
        private int zzcaq;
        private y zzcar;
        private y zzcas;
        private y zzcat;
        private x92<y> zzcau = l92.F();
        private int zzcav;
        private int zzdw;

        public static final class a extends l92.b<k, a> implements za2 {
            private a() {
                super(k.zzcaw);
            }

            /* synthetic */ a(ev2 ev2Var) {
                this();
            }
        }

        static {
            k kVar = new k();
            zzcaw = kVar;
            l92.w(k.class, kVar);
        }

        private k() {
        }

        @Override // com.google.android.gms.internal.ads.l92
        protected final Object t(int r2, Object obj, Object obj2) {
            ev2 ev2Var = null;
            switch (ev2.f3333a[r2 - 1]) {
                case 1:
                    return new k();
                case 2:
                    return new a(ev2Var);
                case 3:
                    return l92.u(zzcaw, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005\u001b\u0006င\u0004", new Object[]{"zzdw", "zzcaq", "zzcar", "zzcas", "zzcat", "zzcau", y.class, "zzcav"});
                case 4:
                    return zzcaw;
                case 5:
                    kb2<k> aVar = zzel;
                    if (aVar == null) {
                        synchronized (k.class) {
                            aVar = zzel;
                            if (aVar == null) {
                                aVar = new l92.a<>(zzcaw);
                                zzel = aVar;
                            }
                        }
                    }
                    return aVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    public static final class l extends l92<l, a> implements za2 {
        private static final l zzcbf;
        private static volatile kb2<l> zzel;
        private y zzcay;
        private int zzcaz;
        private z zzcba;
        private int zzcbb;
        private int zzdw;
        private String zzcax = "";
        private int zzcbc = 1000;
        private int zzcbd = 1000;
        private int zzcbe = 1000;

        public static final class a extends l92.b<l, a> implements za2 {
            private a() {
                super(l.zzcbf);
            }

            /* synthetic */ a(ev2 ev2Var) {
                this();
            }

            public final a v(z zVar) {
                if (this.f) {
                    s();
                    this.f = false;
                }
                ((l) this.e).J(zVar);
                return this;
            }

            public final a w(String str) {
                if (this.f) {
                    s();
                    this.f = false;
                }
                ((l) this.e).K(str);
                return this;
            }
        }

        static {
            l lVar = new l();
            zzcbf = lVar;
            l92.w(l.class, lVar);
        }

        private l() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void J(z zVar) {
            zVar.getClass();
            this.zzcba = zVar;
            this.zzdw |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void K(String str) {
            str.getClass();
            this.zzdw |= 1;
            this.zzcax = str;
        }

        public static l L() {
            return zzcbf;
        }

        @Override // com.google.android.gms.internal.ads.l92
        protected final Object t(int r2, Object obj, Object obj2) {
            ev2 ev2Var = null;
            switch (ev2.f3333a[r2 - 1]) {
                case 1:
                    return new l();
                case 2:
                    return new a(ev2Var);
                case 3:
                    return l92.u(zzcbf, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003င\u0002\u0004ဉ\u0003\u0005င\u0004\u0006ဌ\u0005\u0007ဌ\u0006\bဌ\u0007", new Object[]{"zzdw", "zzcax", "zzcay", "zzcaz", "zzcba", "zzcbb", "zzcbc", mv2.g(), "zzcbd", mv2.g(), "zzcbe", mv2.g()});
                case 4:
                    return zzcbf;
                case 5:
                    kb2<l> aVar = zzel;
                    if (aVar == null) {
                        synchronized (l.class) {
                            aVar = zzel;
                            if (aVar == null) {
                                aVar = new l92.a<>(zzcbf);
                                zzel = aVar;
                            }
                        }
                    }
                    return aVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    public static final class m extends l92<m, a> implements za2 {
        private static final m zzcbk;
        private static volatile kb2<m> zzel;
        private int zzcbg;
        private z zzcbh;
        private String zzcbi = "";
        private String zzcbj = "";
        private int zzdw;

        public static final class a extends l92.b<m, a> implements za2 {
            private a() {
                super(m.zzcbk);
            }

            /* synthetic */ a(ev2 ev2Var) {
                this();
            }
        }

        public enum b implements r92 {
            PLATFORM_UNSPECIFIED(0),
            IOS(1),
            ANDROID(2);

            private static final q92<b> h = new lv2();
            private final int d;

            b(int r3) {
                this.d = r3;
            }

            public static b e(int r1) {
                if (r1 == 0) {
                    return PLATFORM_UNSPECIFIED;
                }
                if (r1 == 1) {
                    return IOS;
                }
                if (r1 != 2) {
                    return null;
                }
                return ANDROID;
            }

            public static t92 g() {
                return nv2.f4611a;
            }

            @Override // com.google.android.gms.internal.ads.r92
            public final int h() {
                return this.d;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "<" + b.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.d + " name=" + name() + '>';
            }
        }

        static {
            m mVar = new m();
            zzcbk = mVar;
            l92.w(m.class, mVar);
        }

        private m() {
        }

        @Override // com.google.android.gms.internal.ads.l92
        protected final Object t(int r2, Object obj, Object obj2) {
            ev2 ev2Var = null;
            switch (ev2.f3333a[r2 - 1]) {
                case 1:
                    return new m();
                case 2:
                    return new a(ev2Var);
                case 3:
                    return l92.u(zzcbk, "\u0001\u0004\u0000\u0001\u0005\b\u0004\u0000\u0000\u0000\u0005ဌ\u0000\u0006ဉ\u0001\u0007ဈ\u0002\bဈ\u0003", new Object[]{"zzdw", "zzcbg", b.g(), "zzcbh", "zzcbi", "zzcbj"});
                case 4:
                    return zzcbk;
                case 5:
                    kb2<m> aVar = zzel;
                    if (aVar == null) {
                        synchronized (m.class) {
                            aVar = zzel;
                            if (aVar == null) {
                                aVar = new l92.a<>(zzcbk);
                                zzel = aVar;
                            }
                        }
                    }
                    return aVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    public static final class n extends l92<n, a> implements za2 {
        private static final n zzccg;
        private static volatile kb2<n> zzel;
        private int zzcbt;
        private int zzcbv;
        private z zzcbx;
        private l zzcbz;
        private m zzcca;
        private r zzccb;
        private a zzccc;
        private t zzccd;
        private f zzcce;
        private g zzccf;
        private int zzdw;
        private String zzcbu = "";
        private int zzcbw = 1000;
        private u92 zzcby = l92.D();

        public static final class a extends l92.b<n, a> implements za2 {
            private a() {
                super(n.zzccg);
            }

            /* synthetic */ a(ev2 ev2Var) {
                this();
            }

            public final a A(t tVar) {
                if (this.f) {
                    s();
                    this.f = false;
                }
                ((n) this.e).U(tVar);
                return this;
            }

            public final a C(Iterable<? extends Long> iterable) {
                if (this.f) {
                    s();
                    this.f = false;
                }
                ((n) this.e).W(iterable);
                return this;
            }

            public final a D(String str) {
                if (this.f) {
                    s();
                    this.f = false;
                }
                ((n) this.e).X(str);
                return this;
            }

            public final String F() {
                return ((n) this.e).Y();
            }

            public final a G() {
                if (this.f) {
                    s();
                    this.f = false;
                }
                ((n) this.e).b0();
                return this;
            }

            public final l J() {
                return ((n) this.e).Z();
            }

            public final a K() {
                return ((n) this.e).a0();
            }

            public final a v(a.b bVar) {
                if (this.f) {
                    s();
                    this.f = false;
                }
                ((n) this.e).H((a) ((l92) bVar.P()));
                return this;
            }

            public final a w(f fVar) {
                if (this.f) {
                    s();
                    this.f = false;
                }
                ((n) this.e).S(fVar);
                return this;
            }

            public final a x(g gVar) {
                if (this.f) {
                    s();
                    this.f = false;
                }
                ((n) this.e).T(gVar);
                return this;
            }

            public final a z(l.a aVar) {
                if (this.f) {
                    s();
                    this.f = false;
                }
                ((n) this.e).I((l) ((l92) aVar.P()));
                return this;
            }
        }

        static {
            n nVar = new n();
            zzccg = nVar;
            l92.w(n.class, nVar);
        }

        private n() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void H(a aVar) {
            aVar.getClass();
            this.zzccc = aVar;
            this.zzdw |= 256;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void I(l lVar) {
            lVar.getClass();
            this.zzcbz = lVar;
            this.zzdw |= 32;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void S(f fVar) {
            fVar.getClass();
            this.zzcce = fVar;
            this.zzdw |= 1024;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void T(g gVar) {
            gVar.getClass();
            this.zzccf = gVar;
            this.zzdw |= 2048;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void U(t tVar) {
            tVar.getClass();
            this.zzccd = tVar;
            this.zzdw |= 512;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void W(Iterable<? extends Long> iterable) {
            u92 u92Var = this.zzcby;
            if (!u92Var.m()) {
                int size = u92Var.size();
                this.zzcby = u92Var.k(size == 0 ? 10 : size << 1);
            }
            q72.a(iterable, this.zzcby);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void X(String str) {
            str.getClass();
            this.zzdw |= 2;
            this.zzcbu = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void b0() {
            this.zzcby = l92.D();
        }

        public static a c0() {
            return zzccg.z();
        }

        public final String Y() {
            return this.zzcbu;
        }

        public final l Z() {
            l lVar = this.zzcbz;
            return lVar == null ? l.L() : lVar;
        }

        public final a a0() {
            a aVar = this.zzccc;
            return aVar == null ? a.M() : aVar;
        }

        @Override // com.google.android.gms.internal.ads.l92
        protected final Object t(int r2, Object obj, Object obj2) {
            ev2 ev2Var = null;
            switch (ev2.f3333a[r2 - 1]) {
                case 1:
                    return new n();
                case 2:
                    return new a(ev2Var);
                case 3:
                    return l92.u(zzccg, "\u0001\r\u0000\u0001\t\u0015\r\u0000\u0001\u0000\tင\u0000\nဈ\u0001\u000bဋ\u0002\fဌ\u0003\rဉ\u0004\u000e\u0015\u000fဉ\u0005\u0010ဉ\u0006\u0011ဉ\u0007\u0012ဉ\b\u0013ဉ\t\u0014ဉ\n\u0015ဉ\u000b", new Object[]{"zzdw", "zzcbt", "zzcbu", "zzcbv", "zzcbw", mv2.g(), "zzcbx", "zzcby", "zzcbz", "zzcca", "zzccb", "zzccc", "zzccd", "zzcce", "zzccf"});
                case 4:
                    return zzccg;
                case 5:
                    kb2<n> aVar = zzel;
                    if (aVar == null) {
                        synchronized (n.class) {
                            aVar = zzel;
                            if (aVar == null) {
                                aVar = new l92.a<>(zzccg);
                                zzel = aVar;
                            }
                        }
                    }
                    return aVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    public static final class o extends l92<o, a> implements za2 {
        private static final o zzccl;
        private static volatile kb2<o> zzel;
        private int zzcci;
        private y zzcck;
        private int zzdw;
        private String zzcch = "";
        private s92 zzccj = l92.C();

        public static final class a extends l92.b<o, a> implements za2 {
            private a() {
                super(o.zzccl);
            }

            /* synthetic */ a(ev2 ev2Var) {
                this();
            }
        }

        static {
            o oVar = new o();
            zzccl = oVar;
            l92.w(o.class, oVar);
        }

        private o() {
        }

        @Override // com.google.android.gms.internal.ads.l92
        protected final Object t(int r2, Object obj, Object obj2) {
            ev2 ev2Var = null;
            switch (ev2.f3333a[r2 - 1]) {
                case 1:
                    return new o();
                case 2:
                    return new a(ev2Var);
                case 3:
                    return l92.u(zzccl, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003\u0016\u0004ဉ\u0002", new Object[]{"zzdw", "zzcch", "zzcci", mv2.g(), "zzccj", "zzcck"});
                case 4:
                    return zzccl;
                case 5:
                    kb2<o> aVar = zzel;
                    if (aVar == null) {
                        synchronized (o.class) {
                            aVar = zzel;
                            if (aVar == null) {
                                aVar = new l92.a<>(zzccl);
                                zzel = aVar;
                            }
                        }
                    }
                    return aVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    public static final class p extends l92<p, a> implements za2 {
        private static final p zzccn;
        private static volatile kb2<p> zzel;
        private s92 zzccj = l92.C();
        private int zzccm;
        private int zzdw;

        public static final class a extends l92.b<p, a> implements za2 {
            private a() {
                super(p.zzccn);
            }

            /* synthetic */ a(ev2 ev2Var) {
                this();
            }
        }

        static {
            p pVar = new p();
            zzccn = pVar;
            l92.w(p.class, pVar);
        }

        private p() {
        }

        @Override // com.google.android.gms.internal.ads.l92
        protected final Object t(int r2, Object obj, Object obj2) {
            ev2 ev2Var = null;
            switch (ev2.f3333a[r2 - 1]) {
                case 1:
                    return new p();
                case 2:
                    return new a(ev2Var);
                case 3:
                    return l92.u(zzccn, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u0016", new Object[]{"zzdw", "zzccm", mv2.g(), "zzccj"});
                case 4:
                    return zzccn;
                case 5:
                    kb2<p> aVar = zzel;
                    if (aVar == null) {
                        synchronized (p.class) {
                            aVar = zzel;
                            if (aVar == null) {
                                aVar = new l92.a<>(zzccn);
                                zzel = aVar;
                            }
                        }
                    }
                    return aVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    public static final class q extends l92<q, a> implements za2 {
        private static final q zzccq;
        private static volatile kb2<q> zzel;
        private y zzcck;
        private int zzccm;
        private o zzcco;
        private x92<x> zzccp = l92.F();
        private int zzdw;

        public static final class a extends l92.b<q, a> implements za2 {
            private a() {
                super(q.zzccq);
            }

            /* synthetic */ a(ev2 ev2Var) {
                this();
            }
        }

        static {
            q qVar = new q();
            zzccq = qVar;
            l92.w(q.class, qVar);
        }

        private q() {
        }

        @Override // com.google.android.gms.internal.ads.l92
        protected final Object t(int r2, Object obj, Object obj2) {
            ev2 ev2Var = null;
            switch (ev2.f3333a[r2 - 1]) {
                case 1:
                    return new q();
                case 2:
                    return new a(ev2Var);
                case 3:
                    return l92.u(zzccq, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b\u0003ဌ\u0001\u0004ဉ\u0002", new Object[]{"zzdw", "zzcco", "zzccp", x.class, "zzccm", mv2.g(), "zzcck"});
                case 4:
                    return zzccq;
                case 5:
                    kb2<q> aVar = zzel;
                    if (aVar == null) {
                        synchronized (q.class) {
                            aVar = zzel;
                            if (aVar == null) {
                                aVar = new l92.a<>(zzccq);
                                zzel = aVar;
                            }
                        }
                    }
                    return aVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    public static final class r extends l92<r, a> implements za2 {
        private static final r zzccs;
        private static volatile kb2<r> zzel;
        private int zzbzr;
        private int zzccr;
        private int zzdw;

        public static final class a extends l92.b<r, a> implements za2 {
            private a() {
                super(r.zzccs);
            }

            /* synthetic */ a(ev2 ev2Var) {
                this();
            }

            public final a v(b bVar) {
                if (this.f) {
                    s();
                    this.f = false;
                }
                ((r) this.e).J(bVar);
                return this;
            }

            public final a w(c cVar) {
                if (this.f) {
                    s();
                    this.f = false;
                }
                ((r) this.e).K(cVar);
                return this;
            }
        }

        public enum b implements r92 {
            CELLULAR_NETWORK_TYPE_UNSPECIFIED(0),
            TWO_G(1),
            THREE_G(2),
            LTE(4);

            private static final q92<b> i = new qv2();
            private final int d;

            b(int r3) {
                this.d = r3;
            }

            public static b e(int r1) {
                if (r1 == 0) {
                    return CELLULAR_NETWORK_TYPE_UNSPECIFIED;
                }
                if (r1 == 1) {
                    return TWO_G;
                }
                if (r1 == 2) {
                    return THREE_G;
                }
                if (r1 != 4) {
                    return null;
                }
                return LTE;
            }

            public static t92 g() {
                return rv2.f5190a;
            }

            @Override // com.google.android.gms.internal.ads.r92
            public final int h() {
                return this.d;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "<" + b.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.d + " name=" + name() + '>';
            }
        }

        public enum c implements r92 {
            NETWORKTYPE_UNSPECIFIED(0),
            CELL(1),
            WIFI(2);

            private static final q92<c> h = new tv2();
            private final int d;

            c(int r3) {
                this.d = r3;
            }

            public static c e(int r1) {
                if (r1 == 0) {
                    return NETWORKTYPE_UNSPECIFIED;
                }
                if (r1 == 1) {
                    return CELL;
                }
                if (r1 != 2) {
                    return null;
                }
                return WIFI;
            }

            public static t92 g() {
                return sv2.f5314a;
            }

            @Override // com.google.android.gms.internal.ads.r92
            public final int h() {
                return this.d;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "<" + c.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.d + " name=" + name() + '>';
            }
        }

        static {
            r rVar = new r();
            zzccs = rVar;
            l92.w(r.class, rVar);
        }

        private r() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void J(b bVar) {
            this.zzccr = bVar.h();
            this.zzdw |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void K(c cVar) {
            this.zzbzr = cVar.h();
            this.zzdw |= 1;
        }

        public static a L() {
            return zzccs.z();
        }

        @Override // com.google.android.gms.internal.ads.l92
        protected final Object t(int r2, Object obj, Object obj2) {
            ev2 ev2Var = null;
            switch (ev2.f3333a[r2 - 1]) {
                case 1:
                    return new r();
                case 2:
                    return new a(ev2Var);
                case 3:
                    return l92.u(zzccs, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"zzdw", "zzbzr", c.g(), "zzccr", b.g()});
                case 4:
                    return zzccs;
                case 5:
                    kb2<r> aVar = zzel;
                    if (aVar == null) {
                        synchronized (r.class) {
                            aVar = zzel;
                            if (aVar == null) {
                                aVar = new l92.a<>(zzccs);
                                zzel = aVar;
                            }
                        }
                    }
                    return aVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    public static final class s extends l92<s, a> implements za2 {
        private static final s zzcde;
        private static volatile kb2<s> zzel;
        private int zzcdc;
        private y zzcdd;
        private int zzdw;

        public static final class a extends l92.b<s, a> implements za2 {
            private a() {
                super(s.zzcde);
            }

            /* synthetic */ a(ev2 ev2Var) {
                this();
            }
        }

        static {
            s sVar = new s();
            zzcde = sVar;
            l92.w(s.class, sVar);
        }

        private s() {
        }

        @Override // com.google.android.gms.internal.ads.l92
        protected final Object t(int r2, Object obj, Object obj2) {
            ev2 ev2Var = null;
            switch (ev2.f3333a[r2 - 1]) {
                case 1:
                    return new s();
                case 2:
                    return new a(ev2Var);
                case 3:
                    return l92.u(zzcde, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001", new Object[]{"zzdw", "zzcdc", mv2.g(), "zzcdd"});
                case 4:
                    return zzcde;
                case 5:
                    kb2<s> aVar = zzel;
                    if (aVar == null) {
                        synchronized (s.class) {
                            aVar = zzel;
                            if (aVar == null) {
                                aVar = new l92.a<>(zzcde);
                                zzel = aVar;
                            }
                        }
                    }
                    return aVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    public static final class t extends l92<t, c> implements za2 {
        private static final t zzcdy;
        private static volatile kb2<t> zzel;
        private int zzcdt;
        private int zzcdu;
        private long zzcdv;
        private long zzcdx;
        private int zzdw;
        private x92<a> zzbzg = l92.F();
        private String zzdx = "";
        private String zzcdw = "";

        public static final class a extends l92<a, C0174a> implements za2 {
            private static final v92<Integer, h.a> zzcdk = new uv2();
            private static final a zzcds;
            private static volatile kb2<a> zzel;
            private long zzcdf;
            private int zzcdg;
            private long zzcdh;
            private long zzcdi;
            private s92 zzcdj = l92.C();
            private r zzcdl;
            private int zzcdm;
            private int zzcdn;
            private int zzcdo;
            private int zzcdp;
            private int zzcdq;
            private int zzcdr;
            private int zzdw;

            /* renamed from: com.google.android.gms.internal.ads.cv2$t$a$a, reason: collision with other inner class name */
            public static final class C0174a extends l92.b<a, C0174a> implements za2 {
                private C0174a() {
                    super(a.zzcds);
                }

                /* synthetic */ C0174a(ev2 ev2Var) {
                    this();
                }

                public final C0174a A(long j) {
                    if (this.f) {
                        s();
                        this.f = false;
                    }
                    ((a) this.e).I(j);
                    return this;
                }

                public final C0174a C(long j) {
                    if (this.f) {
                        s();
                        this.f = false;
                    }
                    ((a) this.e).g0(j);
                    return this;
                }

                public final C0174a D(long j) {
                    if (this.f) {
                        s();
                        this.f = false;
                    }
                    ((a) this.e).h0(j);
                    return this;
                }

                public final C0174a F(mv2 mv2Var) {
                    if (this.f) {
                        s();
                        this.f = false;
                    }
                    ((a) this.e).S(mv2Var);
                    return this;
                }

                public final C0174a G(mv2 mv2Var) {
                    if (this.f) {
                        s();
                        this.f = false;
                    }
                    ((a) this.e).W(mv2Var);
                    return this;
                }

                public final C0174a J(mv2 mv2Var) {
                    if (this.f) {
                        s();
                        this.f = false;
                    }
                    ((a) this.e).Z(mv2Var);
                    return this;
                }

                public final C0174a K(mv2 mv2Var) {
                    if (this.f) {
                        s();
                        this.f = false;
                    }
                    ((a) this.e).d0(mv2Var);
                    return this;
                }

                public final C0174a L(mv2 mv2Var) {
                    if (this.f) {
                        s();
                        this.f = false;
                    }
                    ((a) this.e).f0(mv2Var);
                    return this;
                }

                public final C0174a v(r rVar) {
                    if (this.f) {
                        s();
                        this.f = false;
                    }
                    ((a) this.e).J(rVar);
                    return this;
                }

                public final C0174a w(b bVar) {
                    if (this.f) {
                        s();
                        this.f = false;
                    }
                    ((a) this.e).R(bVar);
                    return this;
                }

                public final C0174a x(int r2) {
                    if (this.f) {
                        s();
                        this.f = false;
                    }
                    ((a) this.e).b0(r2);
                    return this;
                }

                public final C0174a z(Iterable<? extends h.a> iterable) {
                    if (this.f) {
                        s();
                        this.f = false;
                    }
                    ((a) this.e).a0(iterable);
                    return this;
                }
            }

            static {
                a aVar = new a();
                zzcds = aVar;
                l92.w(a.class, aVar);
            }

            private a() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void I(long j) {
                this.zzdw |= 1;
                this.zzcdf = j;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void J(r rVar) {
                rVar.getClass();
                this.zzcdl = rVar;
                this.zzdw |= 16;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void R(b bVar) {
                this.zzcdr = bVar.h();
                this.zzdw |= 1024;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void S(mv2 mv2Var) {
                this.zzcdg = mv2Var.h();
                this.zzdw |= 2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void W(mv2 mv2Var) {
                this.zzcdm = mv2Var.h();
                this.zzdw |= 32;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void Z(mv2 mv2Var) {
                this.zzcdn = mv2Var.h();
                this.zzdw |= 64;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void a0(Iterable<? extends h.a> iterable) {
                s92 s92Var = this.zzcdj;
                if (!s92Var.m()) {
                    this.zzcdj = l92.r(s92Var);
                }
                Iterator<? extends h.a> it = iterable.iterator();
                while (it.hasNext()) {
                    this.zzcdj.U(it.next().h());
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void b0(int r2) {
                this.zzdw |= 256;
                this.zzcdp = r2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void d0(mv2 mv2Var) {
                this.zzcdo = mv2Var.h();
                this.zzdw |= 128;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void f0(mv2 mv2Var) {
                this.zzcdq = mv2Var.h();
                this.zzdw |= 512;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void g0(long j) {
                this.zzdw |= 4;
                this.zzcdh = j;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final void h0(long j) {
                this.zzdw |= 8;
                this.zzcdi = j;
            }

            public static a i0(byte[] bArr) throws w92 {
                return (a) l92.o(zzcds, bArr);
            }

            public static C0174a k0() {
                return zzcds.z();
            }

            public final long H() {
                return this.zzcdf;
            }

            public final mv2 j0() {
                mv2 mv2VarE = mv2.e(this.zzcdg);
                return mv2VarE == null ? mv2.ENUM_FALSE : mv2VarE;
            }

            @Override // com.google.android.gms.internal.ads.l92
            protected final Object t(int r2, Object obj, Object obj2) {
                ev2 ev2Var = null;
                switch (ev2.f3333a[r2 - 1]) {
                    case 1:
                        return new a();
                    case 2:
                        return new C0174a(ev2Var);
                    case 3:
                        return l92.u(zzcds, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0001\u0000\u0001ဂ\u0000\u0002ဌ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005\u001e\u0006ဉ\u0004\u0007ဌ\u0005\bဌ\u0006\tဌ\u0007\nင\b\u000bဌ\t\fဌ\n", new Object[]{"zzdw", "zzcdf", "zzcdg", mv2.g(), "zzcdh", "zzcdi", "zzcdj", h.a.g(), "zzcdl", "zzcdm", mv2.g(), "zzcdn", mv2.g(), "zzcdo", mv2.g(), "zzcdp", "zzcdq", mv2.g(), "zzcdr", b.g()});
                    case 4:
                        return zzcds;
                    case 5:
                        kb2<a> aVar = zzel;
                        if (aVar == null) {
                            synchronized (a.class) {
                                aVar = zzel;
                                if (aVar == null) {
                                    aVar = new l92.a<>(zzcds);
                                    zzel = aVar;
                                }
                            }
                        }
                        return aVar;
                    case 6:
                        return (byte) 1;
                    case 7:
                        return null;
                    default:
                        throw new UnsupportedOperationException();
                }
            }
        }

        public enum b implements r92 {
            UNSPECIFIED(0),
            CONNECTING(1),
            CONNECTED(2),
            DISCONNECTING(3),
            DISCONNECTED(4),
            SUSPENDED(5);

            private static final q92<b> k = new wv2();
            private final int d;

            b(int r3) {
                this.d = r3;
            }

            public static b e(int r1) {
                if (r1 == 0) {
                    return UNSPECIFIED;
                }
                if (r1 == 1) {
                    return CONNECTING;
                }
                if (r1 == 2) {
                    return CONNECTED;
                }
                if (r1 == 3) {
                    return DISCONNECTING;
                }
                if (r1 == 4) {
                    return DISCONNECTED;
                }
                if (r1 != 5) {
                    return null;
                }
                return SUSPENDED;
            }

            public static t92 g() {
                return vv2.f5743a;
            }

            @Override // com.google.android.gms.internal.ads.r92
            public final int h() {
                return this.d;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "<" + b.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.d + " name=" + name() + '>';
            }
        }

        public static final class c extends l92.b<t, c> implements za2 {
            private c() {
                super(t.zzcdy);
            }

            /* synthetic */ c(ev2 ev2Var) {
                this();
            }

            public final c A(long j) {
                if (this.f) {
                    s();
                    this.f = false;
                }
                ((t) this.e).T(j);
                return this;
            }

            public final c C(long j) {
                if (this.f) {
                    s();
                    this.f = false;
                }
                ((t) this.e).U(j);
                return this;
            }

            public final c D(Iterable<? extends a> iterable) {
                if (this.f) {
                    s();
                    this.f = false;
                }
                ((t) this.e).S(iterable);
                return this;
            }

            public final c v(String str) {
                if (this.f) {
                    s();
                    this.f = false;
                }
                ((t) this.e).Y(str);
                return this;
            }

            public final c w(String str) {
                if (this.f) {
                    s();
                    this.f = false;
                }
                ((t) this.e).O(str);
                return this;
            }

            public final c x(int r2) {
                if (this.f) {
                    s();
                    this.f = false;
                }
                ((t) this.e).Q(r2);
                return this;
            }

            public final c z(int r2) {
                if (this.f) {
                    s();
                    this.f = false;
                }
                ((t) this.e).R(r2);
                return this;
            }
        }

        static {
            t tVar = new t();
            zzcdy = tVar;
            l92.w(t.class, tVar);
        }

        private t() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void O(String str) {
            str.getClass();
            this.zzdw |= 16;
            this.zzcdw = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void Q(int r2) {
            this.zzdw |= 1;
            this.zzcdt = r2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void R(int r2) {
            this.zzdw |= 2;
            this.zzcdu = r2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void S(Iterable<? extends a> iterable) {
            x92<a> x92Var = this.zzbzg;
            if (!x92Var.m()) {
                this.zzbzg = l92.s(x92Var);
            }
            q72.a(iterable, this.zzbzg);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void T(long j) {
            this.zzdw |= 4;
            this.zzcdv = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void U(long j) {
            this.zzdw |= 32;
            this.zzcdx = j;
        }

        public static c W() {
            return zzcdy.z();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void Y(String str) {
            str.getClass();
            this.zzdw |= 8;
            this.zzdx = str;
        }

        @Override // com.google.android.gms.internal.ads.l92
        protected final Object t(int r2, Object obj, Object obj2) {
            ev2 ev2Var = null;
            switch (ev2.f3333a[r2 - 1]) {
                case 1:
                    return new t();
                case 2:
                    return new c(ev2Var);
                case 3:
                    return l92.u(zzcdy, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001\u001b\u0002င\u0000\u0003င\u0001\u0004ဂ\u0002\u0005ဈ\u0003\u0006ဈ\u0004\u0007ဂ\u0005", new Object[]{"zzdw", "zzbzg", a.class, "zzcdt", "zzcdu", "zzcdv", "zzdx", "zzcdw", "zzcdx"});
                case 4:
                    return zzcdy;
                case 5:
                    kb2<t> aVar = zzel;
                    if (aVar == null) {
                        synchronized (t.class) {
                            aVar = zzel;
                            if (aVar == null) {
                                aVar = new l92.a<>(zzcdy);
                                zzel = aVar;
                            }
                        }
                    }
                    return aVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    public static final class u extends l92<u, a> implements za2 {
        private static final u zzcer;
        private static volatile kb2<u> zzel;
        private int zzceg = 1000;
        private int zzceh = 1000;
        private int zzcei;
        private int zzcej;
        private int zzcek;
        private int zzcel;
        private int zzcem;
        private int zzcen;
        private int zzceo;
        private int zzcep;
        private v zzceq;
        private int zzdw;

        public static final class a extends l92.b<u, a> implements za2 {
            private a() {
                super(u.zzcer);
            }

            /* synthetic */ a(ev2 ev2Var) {
                this();
            }
        }

        static {
            u uVar = new u();
            zzcer = uVar;
            l92.w(u.class, uVar);
        }

        private u() {
        }

        @Override // com.google.android.gms.internal.ads.l92
        protected final Object t(int r2, Object obj, Object obj2) {
            ev2 ev2Var = null;
            switch (ev2.f3333a[r2 - 1]) {
                case 1:
                    return new u();
                case 2:
                    return new a(ev2Var);
                case 3:
                    return l92.u(zzcer, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005\u0007င\u0006\bင\u0007\tင\b\nင\t\u000bဉ\n", new Object[]{"zzdw", "zzceg", mv2.g(), "zzceh", mv2.g(), "zzcei", "zzcej", "zzcek", "zzcel", "zzcem", "zzcen", "zzceo", "zzcep", "zzceq"});
                case 4:
                    return zzcer;
                case 5:
                    kb2<u> aVar = zzel;
                    if (aVar == null) {
                        synchronized (u.class) {
                            aVar = zzel;
                            if (aVar == null) {
                                aVar = new l92.a<>(zzcer);
                                zzel = aVar;
                            }
                        }
                    }
                    return aVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    public static final class v extends l92<v, a> implements za2 {
        private static final v zzceu;
        private static volatile kb2<v> zzel;
        private int zzces;
        private int zzcet;
        private int zzdw;

        public static final class a extends l92.b<v, a> implements za2 {
            private a() {
                super(v.zzceu);
            }

            /* synthetic */ a(ev2 ev2Var) {
                this();
            }
        }

        static {
            v vVar = new v();
            zzceu = vVar;
            l92.w(v.class, vVar);
        }

        private v() {
        }

        @Override // com.google.android.gms.internal.ads.l92
        protected final Object t(int r2, Object obj, Object obj2) {
            ev2 ev2Var = null;
            switch (ev2.f3333a[r2 - 1]) {
                case 1:
                    return new v();
                case 2:
                    return new a(ev2Var);
                case 3:
                    return l92.u(zzceu, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"zzdw", "zzces", "zzcet"});
                case 4:
                    return zzceu;
                case 5:
                    kb2<v> aVar = zzel;
                    if (aVar == null) {
                        synchronized (v.class) {
                            aVar = zzel;
                            if (aVar == null) {
                                aVar = new l92.a<>(zzceu);
                                zzel = aVar;
                            }
                        }
                    }
                    return aVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    public static final class w extends l92<w, a> implements za2 {
        private static final w zzcex;
        private static volatile kb2<w> zzel;
        private int zzcev;
        private int zzcew;
        private int zzdw;

        public static final class a extends l92.b<w, a> implements za2 {
            private a() {
                super(w.zzcex);
            }

            /* synthetic */ a(ev2 ev2Var) {
                this();
            }
        }

        static {
            w wVar = new w();
            zzcex = wVar;
            l92.w(w.class, wVar);
        }

        private w() {
        }

        @Override // com.google.android.gms.internal.ads.l92
        protected final Object t(int r2, Object obj, Object obj2) {
            ev2 ev2Var = null;
            switch (ev2.f3333a[r2 - 1]) {
                case 1:
                    return new w();
                case 2:
                    return new a(ev2Var);
                case 3:
                    return l92.u(zzcex, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"zzdw", "zzcev", "zzcew"});
                case 4:
                    return zzcex;
                case 5:
                    kb2<w> aVar = zzel;
                    if (aVar == null) {
                        synchronized (w.class) {
                            aVar = zzel;
                            if (aVar == null) {
                                aVar = new l92.a<>(zzcex);
                                zzel = aVar;
                            }
                        }
                    }
                    return aVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    public static final class x extends l92<x, a> implements za2 {
        private static final x zzcey;
        private static volatile kb2<x> zzel;
        private String zzcch = "";
        private int zzcci;
        private y zzcck;
        private int zzdw;

        public static final class a extends l92.b<x, a> implements za2 {
            private a() {
                super(x.zzcey);
            }

            /* synthetic */ a(ev2 ev2Var) {
                this();
            }
        }

        static {
            x xVar = new x();
            zzcey = xVar;
            l92.w(x.class, xVar);
        }

        private x() {
        }

        @Override // com.google.android.gms.internal.ads.l92
        protected final Object t(int r2, Object obj, Object obj2) {
            ev2 ev2Var = null;
            switch (ev2.f3333a[r2 - 1]) {
                case 1:
                    return new x();
                case 2:
                    return new a(ev2Var);
                case 3:
                    return l92.u(zzcey, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003ဉ\u0002", new Object[]{"zzdw", "zzcch", "zzcci", mv2.g(), "zzcck"});
                case 4:
                    return zzcey;
                case 5:
                    kb2<x> aVar = zzel;
                    if (aVar == null) {
                        synchronized (x.class) {
                            aVar = zzel;
                            if (aVar == null) {
                                aVar = new l92.a<>(zzcey);
                                zzel = aVar;
                            }
                        }
                    }
                    return aVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    public static final class y extends l92<y, a> implements za2 {
        private static final y zzcfb;
        private static volatile kb2<y> zzel;
        private int zzcez;
        private int zzcfa;
        private int zzdw;

        public static final class a extends l92.b<y, a> implements za2 {
            private a() {
                super(y.zzcfb);
            }

            /* synthetic */ a(ev2 ev2Var) {
                this();
            }
        }

        static {
            y yVar = new y();
            zzcfb = yVar;
            l92.w(y.class, yVar);
        }

        private y() {
        }

        @Override // com.google.android.gms.internal.ads.l92
        protected final Object t(int r2, Object obj, Object obj2) {
            ev2 ev2Var = null;
            switch (ev2.f3333a[r2 - 1]) {
                case 1:
                    return new y();
                case 2:
                    return new a(ev2Var);
                case 3:
                    return l92.u(zzcfb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"zzdw", "zzcez", "zzcfa"});
                case 4:
                    return zzcfb;
                case 5:
                    kb2<y> aVar = zzel;
                    if (aVar == null) {
                        synchronized (y.class) {
                            aVar = zzel;
                            if (aVar == null) {
                                aVar = new l92.a<>(zzcfb);
                                zzel = aVar;
                            }
                        }
                    }
                    return aVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    public static final class z extends l92<z, a> implements za2 {
        private static final z zzcff;
        private static volatile kb2<z> zzel;
        private int zzcfc;
        private int zzcfd;
        private int zzcfe;
        private int zzdw;

        public static final class a extends l92.b<z, a> implements za2 {
            private a() {
                super(z.zzcff);
            }

            /* synthetic */ a(ev2 ev2Var) {
                this();
            }

            public final a v(int r2) {
                if (this.f) {
                    s();
                    this.f = false;
                }
                ((z) this.e).K(r2);
                return this;
            }

            public final a w(int r2) {
                if (this.f) {
                    s();
                    this.f = false;
                }
                ((z) this.e).L(r2);
                return this;
            }

            public final a x(int r2) {
                if (this.f) {
                    s();
                    this.f = false;
                }
                ((z) this.e).M(r2);
                return this;
            }
        }

        static {
            z zVar = new z();
            zzcff = zVar;
            l92.w(z.class, zVar);
        }

        private z() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void K(int r2) {
            this.zzdw |= 1;
            this.zzcfc = r2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void L(int r2) {
            this.zzdw |= 2;
            this.zzcfd = r2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void M(int r2) {
            this.zzdw |= 4;
            this.zzcfe = r2;
        }

        public static a N() {
            return zzcff.z();
        }

        @Override // com.google.android.gms.internal.ads.l92
        protected final Object t(int r2, Object obj, Object obj2) {
            ev2 ev2Var = null;
            switch (ev2.f3333a[r2 - 1]) {
                case 1:
                    return new z();
                case 2:
                    return new a(ev2Var);
                case 3:
                    return l92.u(zzcff, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"zzdw", "zzcfc", "zzcfd", "zzcfe"});
                case 4:
                    return zzcff;
                case 5:
                    kb2<z> aVar = zzel;
                    if (aVar == null) {
                        synchronized (z.class) {
                            aVar = zzel;
                            if (aVar == null) {
                                aVar = new l92.a<>(zzcff);
                                zzel = aVar;
                            }
                        }
                    }
                    return aVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }
}
