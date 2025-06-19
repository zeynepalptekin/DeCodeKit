package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.l92;

/* loaded from: classes.dex */
public final class o22 extends l92<o22, a> implements za2 {
    private static volatile kb2<o22> zzel;
    private static final o22 zzhxf;
    private int zzhwq;
    private a82 zzhwr = a82.e;
    private s22 zzhxe;

    public static final class a extends l92.b<o22, a> implements za2 {
        private a() {
            super(o22.zzhxf);
        }

        /* synthetic */ a(p22 p22Var) {
            this();
        }

        public final a v(s22 s22Var) {
            if (this.f) {
                s();
                this.f = false;
            }
            ((o22) this.e).S(s22Var);
            return this;
        }

        public final a w(int r2) {
            if (this.f) {
                s();
                this.f = false;
            }
            ((o22) this.e).I(0);
            return this;
        }

        public final a x(a82 a82Var) {
            if (this.f) {
                s();
                this.f = false;
            }
            ((o22) this.e).U(a82Var);
            return this;
        }
    }

    static {
        o22 o22Var = new o22();
        zzhxf = o22Var;
        l92.w(o22.class, o22Var);
    }

    private o22() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I(int r1) {
        this.zzhwq = r1;
    }

    public static a O() {
        return zzhxf.z();
    }

    public static o22 Q() {
        return zzhxf;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void S(s22 s22Var) {
        s22Var.getClass();
        this.zzhxe = s22Var;
    }

    public static o22 T(a82 a82Var, y82 y82Var) throws w92 {
        return (o22) l92.m(zzhxf, a82Var, y82Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void U(a82 a82Var) {
        a82Var.getClass();
        this.zzhwr = a82Var;
    }

    public final int H() {
        return this.zzhwq;
    }

    public final a82 M() {
        return this.zzhwr;
    }

    public final s22 N() {
        s22 s22Var = this.zzhxe;
        return s22Var == null ? s22.I() : s22Var;
    }

    @Override // com.google.android.gms.internal.ads.l92
    protected final Object t(int r2, Object obj, Object obj2) {
        p22 p22Var = null;
        switch (p22.f4775a[r2 - 1]) {
            case 1:
                return new o22();
            case 2:
                return new a(p22Var);
            case 3:
                return l92.u(zzhxf, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zzhwq", "zzhxe", "zzhwr"});
            case 4:
                return zzhxf;
            case 5:
                kb2<o22> aVar = zzel;
                if (aVar == null) {
                    synchronized (o22.class) {
                        aVar = zzel;
                        if (aVar == null) {
                            aVar = new l92.a<>(zzhxf);
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
