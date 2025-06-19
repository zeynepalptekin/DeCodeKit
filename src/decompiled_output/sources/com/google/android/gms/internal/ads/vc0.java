package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.l92;

/* loaded from: classes.dex */
public final class vc0 {

    public static final class a extends l92<a, C0186a> implements za2 {
        private static final a zzek;
        private static volatile kb2<a> zzel;
        private int zzdw;
        private long zzdy;
        private long zzec;
        private long zzed;
        private long zzef;
        private int zzej;
        private String zzdx = "";
        private String zzdz = "";
        private String zzea = "";
        private String zzeb = "";
        private String zzee = "";
        private String zzeg = "";
        private String zzeh = "";
        private x92<b> zzei = l92.F();

        /* renamed from: com.google.android.gms.internal.ads.vc0$a$a, reason: collision with other inner class name */
        public static final class C0186a extends l92.b<a, C0186a> implements za2 {
            private C0186a() {
                super(a.zzek);
            }

            /* synthetic */ C0186a(ub0 ub0Var) {
                this();
            }

            public final C0186a A(String str) {
                if (this.f) {
                    s();
                    this.f = false;
                }
                ((a) this.e).T(str);
                return this;
            }

            public final C0186a C(String str) {
                if (this.f) {
                    s();
                    this.f = false;
                }
                ((a) this.e).W(str);
                return this;
            }

            public final C0186a D(String str) {
                if (this.f) {
                    s();
                    this.f = false;
                }
                ((a) this.e).Y(str);
                return this;
            }

            public final C0186a v(c cVar) {
                if (this.f) {
                    s();
                    this.f = false;
                }
                ((a) this.e).K(cVar);
                return this;
            }

            public final C0186a w(long j) {
                if (this.f) {
                    s();
                    this.f = false;
                }
                ((a) this.e).N(j);
                return this;
            }

            public final C0186a x(String str) {
                if (this.f) {
                    s();
                    this.f = false;
                }
                ((a) this.e).R(str);
                return this;
            }

            public final C0186a z(String str) {
                if (this.f) {
                    s();
                    this.f = false;
                }
                ((a) this.e).S(str);
                return this;
            }
        }

        public static final class b extends l92<b, C0187a> implements za2 {
            private static volatile kb2<b> zzel;
            private static final b zzeo;
            private int zzdw;
            private String zzem = "";
            private String zzen = "";

            /* renamed from: com.google.android.gms.internal.ads.vc0$a$b$a, reason: collision with other inner class name */
            public static final class C0187a extends l92.b<b, C0187a> implements za2 {
                private C0187a() {
                    super(b.zzeo);
                }

                /* synthetic */ C0187a(ub0 ub0Var) {
                    this();
                }
            }

            static {
                b bVar = new b();
                zzeo = bVar;
                l92.w(b.class, bVar);
            }

            private b() {
            }

            @Override // com.google.android.gms.internal.ads.l92
            protected final Object t(int r2, Object obj, Object obj2) {
                ub0 ub0Var = null;
                switch (ub0.f5498a[r2 - 1]) {
                    case 1:
                        return new b();
                    case 2:
                        return new C0187a(ub0Var);
                    case 3:
                        return l92.u(zzeo, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzdw", "zzem", "zzen"});
                    case 4:
                        return zzeo;
                    case 5:
                        kb2<b> aVar = zzel;
                        if (aVar == null) {
                            synchronized (b.class) {
                                aVar = zzel;
                                if (aVar == null) {
                                    aVar = new l92.a<>(zzeo);
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

        public enum c implements r92 {
            UNKNOWN(0),
            ENABLED(1),
            DISABLED(2);

            private static final q92<c> h = new wd0();
            private final int d;

            c(int r3) {
                this.d = r3;
            }

            public static c e(int r1) {
                if (r1 == 0) {
                    return UNKNOWN;
                }
                if (r1 == 1) {
                    return ENABLED;
                }
                if (r1 != 2) {
                    return null;
                }
                return DISABLED;
            }

            public static t92 g() {
                return yf0.f6127a;
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
            a aVar = new a();
            zzek = aVar;
            l92.w(a.class, aVar);
        }

        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void K(c cVar) {
            this.zzej = cVar.h();
            this.zzdw |= 2048;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void N(long j) {
            this.zzdw |= 2;
            this.zzdy = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void R(String str) {
            str.getClass();
            this.zzdw |= 1;
            this.zzdx = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void S(String str) {
            str.getClass();
            this.zzdw |= 4;
            this.zzdz = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void T(String str) {
            str.getClass();
            this.zzdw |= 8;
            this.zzea = str;
        }

        public static C0186a U() {
            return zzek.z();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void W(String str) {
            str.getClass();
            this.zzdw |= 16;
            this.zzeb = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void Y(String str) {
            str.getClass();
            this.zzdw |= 1024;
            this.zzeh = str;
        }

        @Override // com.google.android.gms.internal.ads.l92
        protected final Object t(int r2, Object obj, Object obj2) {
            ub0 ub0Var = null;
            switch (ub0.f5498a[r2 - 1]) {
                case 1:
                    return new a();
                case 2:
                    return new C0186a(ub0Var);
                case 3:
                    return l92.u(zzek, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဈ\u0007\tဂ\b\nဈ\t\u000bဈ\n\f\u001b\rဌ\u000b", new Object[]{"zzdw", "zzdx", "zzdy", "zzdz", "zzea", "zzeb", "zzec", "zzed", "zzee", "zzef", "zzeg", "zzeh", "zzei", b.class, "zzej", c.g()});
                case 4:
                    return zzek;
                case 5:
                    kb2<a> aVar = zzel;
                    if (aVar == null) {
                        synchronized (a.class) {
                            aVar = zzel;
                            if (aVar == null) {
                                aVar = new l92.a<>(zzek);
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
