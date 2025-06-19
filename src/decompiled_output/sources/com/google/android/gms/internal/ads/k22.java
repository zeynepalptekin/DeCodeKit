package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.l92;

/* loaded from: classes.dex */
public final class k22 extends l92<k22, a> implements za2 {
    private static volatile kb2<k22> zzel;
    private static final k22 zzhxa;
    private int zzhwq;
    private o22 zzhwy;
    private a42 zzhwz;

    public static final class a extends l92.b<k22, a> implements za2 {
        private a() {
            super(k22.zzhxa);
        }

        /* synthetic */ a(l22 l22Var) {
            this();
        }

        public final a v(o22 o22Var) {
            if (this.f) {
                s();
                this.f = false;
            }
            ((k22) this.e).M(o22Var);
            return this;
        }

        public final a w(a42 a42Var) {
            if (this.f) {
                s();
                this.f = false;
            }
            ((k22) this.e).N(a42Var);
            return this;
        }

        public final a x(int r2) {
            if (this.f) {
                s();
                this.f = false;
            }
            ((k22) this.e).I(r2);
            return this;
        }
    }

    static {
        k22 k22Var = new k22();
        zzhxa = k22Var;
        l92.w(k22.class, k22Var);
    }

    private k22() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I(int r1) {
        this.zzhwq = r1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void M(o22 o22Var) {
        o22Var.getClass();
        this.zzhwy = o22Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void N(a42 a42Var) {
        a42Var.getClass();
        this.zzhwz = a42Var;
    }

    public static a R() {
        return zzhxa.z();
    }

    public static k22 T(a82 a82Var, y82 y82Var) throws w92 {
        return (k22) l92.m(zzhxa, a82Var, y82Var);
    }

    public final int H() {
        return this.zzhwq;
    }

    public final o22 O() {
        o22 o22Var = this.zzhwy;
        return o22Var == null ? o22.Q() : o22Var;
    }

    public final a42 Q() {
        a42 a42Var = this.zzhwz;
        return a42Var == null ? a42.Q() : a42Var;
    }

    @Override // com.google.android.gms.internal.ads.l92
    protected final Object t(int r2, Object obj, Object obj2) {
        l22 l22Var = null;
        switch (l22.f4187a[r2 - 1]) {
            case 1:
                return new k22();
            case 2:
                return new a(l22Var);
            case 3:
                return l92.u(zzhxa, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\t", new Object[]{"zzhwq", "zzhwy", "zzhwz"});
            case 4:
                return zzhxa;
            case 5:
                kb2<k22> aVar = zzel;
                if (aVar == null) {
                    synchronized (k22.class) {
                        aVar = zzel;
                        if (aVar == null) {
                            aVar = new l92.a<>(zzhxa);
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
