package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.l92;
import com.google.android.gms.internal.ads.ts1;

/* loaded from: classes.dex */
public final class ys1 extends l92<ys1, a> implements za2 {
    private static volatile kb2<ys1> zzel;
    private static final ys1 zzhnk;
    private int zzdw;
    private int zzhnh;
    private ts1 zzhnj;
    private String zzdx = "";
    private String zzhni = "";

    public static final class a extends l92.b<ys1, a> implements za2 {
        private a() {
            super(ys1.zzhnk);
        }

        /* synthetic */ a(zs1 zs1Var) {
            this();
        }

        public final a v(ts1.b bVar) {
            if (this.f) {
                s();
                this.f = false;
            }
            ((ys1) this.e).H((ts1) ((l92) bVar.P()));
            return this;
        }

        public final a w(b bVar) {
            if (this.f) {
                s();
                this.f = false;
            }
            ((ys1) this.e).I(bVar);
            return this;
        }

        public final a x(String str) {
            if (this.f) {
                s();
                this.f = false;
            }
            ((ys1) this.e).O(str);
            return this;
        }
    }

    public enum b implements r92 {
        EVENT_TYPE_UNKNOWN(0),
        BLOCKED_IMPRESSION(1);

        private static final q92<b> g = new at1();
        private final int d;

        b(int r3) {
            this.d = r3;
        }

        public static b e(int r1) {
            if (r1 == 0) {
                return EVENT_TYPE_UNKNOWN;
            }
            if (r1 != 1) {
                return null;
            }
            return BLOCKED_IMPRESSION;
        }

        public static t92 g() {
            return ct1.f3031a;
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
        ys1 ys1Var = new ys1();
        zzhnk = ys1Var;
        l92.w(ys1.class, ys1Var);
    }

    private ys1() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H(ts1 ts1Var) {
        ts1Var.getClass();
        this.zzhnj = ts1Var;
        this.zzdw |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I(b bVar) {
        this.zzhnh = bVar.h();
        this.zzdw |= 1;
    }

    public static a M() {
        return zzhnk.z();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O(String str) {
        str.getClass();
        this.zzdw |= 2;
        this.zzdx = str;
    }

    @Override // com.google.android.gms.internal.ads.l92
    protected final Object t(int r2, Object obj, Object obj2) {
        zs1 zs1Var = null;
        switch (zs1.f6310a[r2 - 1]) {
            case 1:
                return new ys1();
            case 2:
                return new a(zs1Var);
            case 3:
                return l92.u(zzhnk, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဉ\u0003", new Object[]{"zzdw", "zzhnh", b.g(), "zzdx", "zzhni", "zzhnj"});
            case 4:
                return zzhnk;
            case 5:
                kb2<ys1> aVar = zzel;
                if (aVar == null) {
                    synchronized (ys1.class) {
                        aVar = zzel;
                        if (aVar == null) {
                            aVar = new l92.a<>(zzhnk);
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
