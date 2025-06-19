package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.l92;

/* loaded from: classes.dex */
public final class xe0 {

    public static final class a extends l92<a, C0189a> implements za2 {
        private static volatile kb2<a> zzel;
        private static final a zzex;
        private int zzdw;
        private b zzev;
        private c zzew;

        /* renamed from: com.google.android.gms.internal.ads.xe0$a$a, reason: collision with other inner class name */
        public static final class C0189a extends l92.b<a, C0189a> implements za2 {
            private C0189a() {
                super(a.zzex);
            }

            /* synthetic */ C0189a(ah0 ah0Var) {
                this();
            }
        }

        static {
            a aVar = new a();
            zzex = aVar;
            l92.w(a.class, aVar);
        }

        private a() {
        }

        public final c H() {
            c cVar = this.zzew;
            return cVar == null ? c.I() : cVar;
        }

        public final boolean J() {
            return (this.zzdw & 1) != 0;
        }

        public final b K() {
            b bVar = this.zzev;
            return bVar == null ? b.I() : bVar;
        }

        public final boolean L() {
            return (this.zzdw & 2) != 0;
        }

        @Override // com.google.android.gms.internal.ads.l92
        protected final Object t(int r2, Object obj, Object obj2) {
            ah0 ah0Var = null;
            switch (ah0.f2687a[r2 - 1]) {
                case 1:
                    return new a();
                case 2:
                    return new C0189a(ah0Var);
                case 3:
                    return l92.u(zzex, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zzdw", "zzev", "zzew"});
                case 4:
                    return zzex;
                case 5:
                    kb2<a> aVar = zzel;
                    if (aVar == null) {
                        synchronized (a.class) {
                            aVar = zzel;
                            if (aVar == null) {
                                aVar = new l92.a<>(zzex);
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
        private static volatile kb2<b> zzel;
        private static final b zzez;
        private int zzdw;
        private int zzey = 2;

        public static final class a extends l92.b<b, a> implements za2 {
            private a() {
                super(b.zzez);
            }

            /* synthetic */ a(ah0 ah0Var) {
                this();
            }
        }

        static {
            b bVar = new b();
            zzez = bVar;
            l92.w(b.class, bVar);
        }

        private b() {
        }

        public static b I() {
            return zzez;
        }

        public final bi0 H() {
            bi0 bi0VarE = bi0.e(this.zzey);
            return bi0VarE == null ? bi0.ENUM_SIGNAL_SOURCE_ADSHIELD : bi0VarE;
        }

        @Override // com.google.android.gms.internal.ads.l92
        protected final Object t(int r2, Object obj, Object obj2) {
            ah0 ah0Var = null;
            switch (ah0.f2687a[r2 - 1]) {
                case 1:
                    return new b();
                case 2:
                    return new a(ah0Var);
                case 3:
                    return l92.u(zzez, "\u0001\u0001\u0000\u0001\u001b\u001b\u0001\u0000\u0000\u0000\u001bဌ\u0000", new Object[]{"zzdw", "zzey", bi0.g()});
                case 4:
                    return zzez;
                case 5:
                    kb2<b> aVar = zzel;
                    if (aVar == null) {
                        synchronized (b.class) {
                            aVar = zzel;
                            if (aVar == null) {
                                aVar = new l92.a<>(zzez);
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
        private static volatile kb2<c> zzel;
        private static final c zzfm;
        private int zzdw;
        private String zzfg = "";
        private String zzfh = "";
        private String zzfi = "";
        private String zzfj = "";
        private String zzfk = "";
        private String zzfl = "";

        public static final class a extends l92.b<c, a> implements za2 {
            private a() {
                super(c.zzfm);
            }

            /* synthetic */ a(ah0 ah0Var) {
                this();
            }
        }

        static {
            c cVar = new c();
            zzfm = cVar;
            l92.w(c.class, cVar);
        }

        private c() {
        }

        public static c I() {
            return zzfm;
        }

        public final String H() {
            return this.zzfg;
        }

        @Override // com.google.android.gms.internal.ads.l92
        protected final Object t(int r2, Object obj, Object obj2) {
            ah0 ah0Var = null;
            switch (ah0.f2687a[r2 - 1]) {
                case 1:
                    return new c();
                case 2:
                    return new a(ah0Var);
                case 3:
                    return l92.u(zzfm, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005", new Object[]{"zzdw", "zzfg", "zzfh", "zzfi", "zzfj", "zzfk", "zzfl"});
                case 4:
                    return zzfm;
                case 5:
                    kb2<c> aVar = zzel;
                    if (aVar == null) {
                        synchronized (c.class) {
                            aVar = zzel;
                            if (aVar == null) {
                                aVar = new l92.a<>(zzfm);
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
