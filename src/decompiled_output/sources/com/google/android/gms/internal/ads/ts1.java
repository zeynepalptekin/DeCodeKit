package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.l92;

/* loaded from: classes.dex */
public final class ts1 extends l92<ts1, b> implements za2 {
    private static volatile kb2<ts1> zzel;
    private static final v92<Integer, a> zzhmz = new ss1();
    private static final ts1 zzhnd;
    private int zzdw;
    private s92 zzhmy = l92.C();
    private String zzhna = "";
    private String zzhnb = "";
    private String zzhnc = "";

    public enum a implements r92 {
        BLOCKED_REASON_UNKNOWN(1),
        BLOCKED_REASON_BACKGROUND(2);

        private static final q92<a> g = new xs1();
        private final int d;

        a(int r3) {
            this.d = r3;
        }

        public static a e(int r1) {
            if (r1 == 1) {
                return BLOCKED_REASON_UNKNOWN;
            }
            if (r1 != 2) {
                return null;
            }
            return BLOCKED_REASON_BACKGROUND;
        }

        public static t92 g() {
            return ws1.f5884a;
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

    public static final class b extends l92.b<ts1, b> implements za2 {
        private b() {
            super(ts1.zzhnd);
        }

        /* synthetic */ b(ss1 ss1Var) {
            this();
        }

        public final b v(a aVar) {
            if (this.f) {
                s();
                this.f = false;
            }
            ((ts1) this.e).H(aVar);
            return this;
        }

        public final b w(String str) {
            if (this.f) {
                s();
                this.f = false;
            }
            ((ts1) this.e).M(str);
            return this;
        }
    }

    static {
        ts1 ts1Var = new ts1();
        zzhnd = ts1Var;
        l92.w(ts1.class, ts1Var);
    }

    private ts1() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H(a aVar) {
        aVar.getClass();
        s92 s92Var = this.zzhmy;
        if (!s92Var.m()) {
            this.zzhmy = l92.r(s92Var);
        }
        this.zzhmy.U(aVar.h());
    }

    public static b K() {
        return zzhnd.z();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void M(String str) {
        str.getClass();
        this.zzdw |= 1;
        this.zzhna = str;
    }

    @Override // com.google.android.gms.internal.ads.l92
    protected final Object t(int r2, Object obj, Object obj2) {
        ss1 ss1Var = null;
        switch (us1.f5592a[r2 - 1]) {
            case 1:
                return new ts1();
            case 2:
                return new b(ss1Var);
            case 3:
                return l92.u(zzhnd, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001e\u0002ဈ\u0000\u0003ဈ\u0001\u0004ဈ\u0002", new Object[]{"zzdw", "zzhmy", a.g(), "zzhna", "zzhnb", "zzhnc"});
            case 4:
                return zzhnd;
            case 5:
                kb2<ts1> aVar = zzel;
                if (aVar == null) {
                    synchronized (ts1.class) {
                        aVar = zzel;
                        if (aVar == null) {
                            aVar = new l92.a<>(zzhnd);
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
