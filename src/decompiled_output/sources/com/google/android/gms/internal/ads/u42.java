package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.l92;

/* loaded from: classes.dex */
public final class u42 extends l92<u42, b> implements za2 {
    private static volatile kb2<u42> zzel;
    private static final u42 zzian;
    private int zziaf;
    private x92<a> zziam = l92.F();

    public static final class a extends l92<a, C0185a> implements za2 {
        private static volatile kb2<a> zzel;
        private static final a zziao;
        private String zzhzh = "";
        private int zzhzy;
        private int zziaj;
        private int zziak;

        /* renamed from: com.google.android.gms.internal.ads.u42$a$a, reason: collision with other inner class name */
        public static final class C0185a extends l92.b<a, C0185a> implements za2 {
            private C0185a() {
                super(a.zziao);
            }

            /* synthetic */ C0185a(t42 t42Var) {
                this();
            }

            public final C0185a v(k42 k42Var) {
                if (this.f) {
                    s();
                    this.f = false;
                }
                ((a) this.e).H(k42Var);
                return this;
            }

            public final C0185a w(d52 d52Var) {
                if (this.f) {
                    s();
                    this.f = false;
                }
                ((a) this.e).M(d52Var);
                return this;
            }

            public final C0185a x(int r2) {
                if (this.f) {
                    s();
                    this.f = false;
                }
                ((a) this.e).Q(r2);
                return this;
            }

            public final C0185a z(String str) {
                if (this.f) {
                    s();
                    this.f = false;
                }
                ((a) this.e).R(str);
                return this;
            }
        }

        static {
            a aVar = new a();
            zziao = aVar;
            l92.w(a.class, aVar);
        }

        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void H(k42 k42Var) {
            this.zziaj = k42Var.h();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void M(d52 d52Var) {
            this.zzhzy = d52Var.h();
        }

        public static C0185a N() {
            return zziao.z();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void Q(int r1) {
            this.zziak = r1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void R(String str) {
            str.getClass();
            this.zzhzh = str;
        }

        @Override // com.google.android.gms.internal.ads.l92
        protected final Object t(int r2, Object obj, Object obj2) {
            t42 t42Var = null;
            switch (t42.f5342a[r2 - 1]) {
                case 1:
                    return new a();
                case 2:
                    return new C0185a(t42Var);
                case 3:
                    return l92.u(zziao, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"zzhzh", "zziaj", "zziak", "zzhzy"});
                case 4:
                    return zziao;
                case 5:
                    kb2<a> aVar = zzel;
                    if (aVar == null) {
                        synchronized (a.class) {
                            aVar = zzel;
                            if (aVar == null) {
                                aVar = new l92.a<>(zziao);
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

    public static final class b extends l92.b<u42, b> implements za2 {
        private b() {
            super(u42.zzian);
        }

        /* synthetic */ b(t42 t42Var) {
            this();
        }

        public final b v(a aVar) {
            if (this.f) {
                s();
                this.f = false;
            }
            ((u42) this.e).H(aVar);
            return this;
        }

        public final b w(int r2) {
            if (this.f) {
                s();
                this.f = false;
            }
            ((u42) this.e).M(r2);
            return this;
        }
    }

    static {
        u42 u42Var = new u42();
        zzian = u42Var;
        l92.w(u42.class, u42Var);
    }

    private u42() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H(a aVar) {
        aVar.getClass();
        x92<a> x92Var = this.zziam;
        if (!x92Var.m()) {
            this.zziam = l92.s(x92Var);
        }
        this.zziam.add(aVar);
    }

    public static b K() {
        return zzian.z();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void M(int r1) {
        this.zziaf = r1;
    }

    @Override // com.google.android.gms.internal.ads.l92
    protected final Object t(int r2, Object obj, Object obj2) {
        t42 t42Var = null;
        switch (t42.f5342a[r2 - 1]) {
            case 1:
                return new u42();
            case 2:
                return new b(t42Var);
            case 3:
                return l92.u(zzian, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zziaf", "zziam", a.class});
            case 4:
                return zzian;
            case 5:
                kb2<u42> aVar = zzel;
                if (aVar == null) {
                    synchronized (u42.class) {
                        aVar = zzel;
                        if (aVar == null) {
                            aVar = new l92.a<>(zzian);
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
