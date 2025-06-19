package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.l92;

/* loaded from: classes.dex */
public final class a42 extends l92<a42, a> implements za2 {
    private static volatile kb2<a42> zzel;
    private static final a42 zzhzd;
    private int zzhwq;
    private a82 zzhwr = a82.e;
    private f42 zzhzc;

    public static final class a extends l92.b<a42, a> implements za2 {
        private a() {
            super(a42.zzhzd);
        }

        /* synthetic */ a(c42 c42Var) {
            this();
        }

        public final a v(a82 a82Var) {
            if (this.f) {
                s();
                this.f = false;
            }
            ((a42) this.e).U(a82Var);
            return this;
        }

        public final a w(f42 f42Var) {
            if (this.f) {
                s();
                this.f = false;
            }
            ((a42) this.e).S(f42Var);
            return this;
        }

        public final a x(int r2) {
            if (this.f) {
                s();
                this.f = false;
            }
            ((a42) this.e).I(0);
            return this;
        }
    }

    static {
        a42 a42Var = new a42();
        zzhzd = a42Var;
        l92.w(a42.class, a42Var);
    }

    private a42() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I(int r1) {
        this.zzhwq = r1;
    }

    public static a O() {
        return zzhzd.z();
    }

    public static a42 Q() {
        return zzhzd;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void S(f42 f42Var) {
        f42Var.getClass();
        this.zzhzc = f42Var;
    }

    public static a42 T(a82 a82Var, y82 y82Var) throws w92 {
        return (a42) l92.m(zzhzd, a82Var, y82Var);
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

    public final f42 N() {
        f42 f42Var = this.zzhzc;
        return f42Var == null ? f42.J() : f42Var;
    }

    @Override // com.google.android.gms.internal.ads.l92
    protected final Object t(int r2, Object obj, Object obj2) {
        c42 c42Var = null;
        switch (c42.f2923a[r2 - 1]) {
            case 1:
                return new a42();
            case 2:
                return new a(c42Var);
            case 3:
                return l92.u(zzhzd, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zzhwq", "zzhzc", "zzhwr"});
            case 4:
                return zzhzd;
            case 5:
                kb2<a42> aVar = zzel;
                if (aVar == null) {
                    synchronized (a42.class) {
                        aVar = zzel;
                        if (aVar == null) {
                            aVar = new l92.a<>(zzhzd);
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
