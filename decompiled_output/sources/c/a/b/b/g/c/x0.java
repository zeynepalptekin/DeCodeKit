package c.a.b.b.g.c;

import c.a.b.b.g.c.h7;
import java.util.List;

/* loaded from: classes.dex */
public final class x0 {

    public static final class a extends h7<a, C0130a> implements t8 {
        private static final a zzi;
        private static volatile e9<a> zzj;
        private int zzc;
        private int zzd;
        private r7<e> zze = h7.B();
        private r7<b> zzf = h7.B();
        private boolean zzg;
        private boolean zzh;

        /* renamed from: c.a.b.b.g.c.x0$a$a, reason: collision with other inner class name */
        public static final class C0130a extends h7.a<a, C0130a> implements t8 {
            private C0130a() {
                super(a.zzi);
            }

            /* synthetic */ C0130a(y0 y0Var) {
                this();
            }

            public final C0130a A(int r2, e.a aVar) {
                if (this.f) {
                    u();
                    this.f = false;
                }
                ((a) this.e).E(r2, (e) ((h7) aVar.j()));
                return this;
            }

            public final e C(int r2) {
                return ((a) this.e).C(r2);
            }

            public final int D() {
                return ((a) this.e).P();
            }

            public final b F(int r2) {
                return ((a) this.e).L(r2);
            }

            public final int x() {
                return ((a) this.e).N();
            }

            public final C0130a z(int r2, b.a aVar) {
                if (this.f) {
                    u();
                    this.f = false;
                }
                ((a) this.e).D(r2, (b) ((h7) aVar.j()));
                return this;
            }
        }

        static {
            a aVar = new a();
            zzi = aVar;
            h7.u(a.class, aVar);
        }

        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void D(int r3, b bVar) {
            bVar.getClass();
            r7<b> r7Var = this.zzf;
            if (!r7Var.a()) {
                this.zzf = h7.q(r7Var);
            }
            this.zzf.set(r3, bVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void E(int r3, e eVar) {
            eVar.getClass();
            r7<e> r7Var = this.zze;
            if (!r7Var.a()) {
                this.zze = h7.q(r7Var);
            }
            this.zze.set(r3, eVar);
        }

        public final e C(int r2) {
            return this.zze.get(r2);
        }

        public final boolean J() {
            return (this.zzc & 1) != 0;
        }

        public final int K() {
            return this.zzd;
        }

        public final b L(int r2) {
            return this.zzf.get(r2);
        }

        public final List<e> M() {
            return this.zze;
        }

        public final int N() {
            return this.zze.size();
        }

        public final List<b> O() {
            return this.zzf;
        }

        public final int P() {
            return this.zzf.size();
        }

        @Override // c.a.b.b.g.c.h7
        protected final Object r(int r2, Object obj, Object obj2) {
            y0 y0Var = null;
            switch (y0.f1867a[r2 - 1]) {
                case 1:
                    return new a();
                case 2:
                    return new C0130a(y0Var);
                case 3:
                    return h7.s(zzi, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001\u0005ဇ\u0002", new Object[]{"zzc", "zzd", "zze", e.class, "zzf", b.class, "zzg", "zzh"});
                case 4:
                    return zzi;
                case 5:
                    e9<a> cVar = zzj;
                    if (cVar == null) {
                        synchronized (a.class) {
                            cVar = zzj;
                            if (cVar == null) {
                                cVar = new h7.c<>(zzi);
                                zzj = cVar;
                            }
                        }
                    }
                    return cVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    public static final class b extends h7<b, a> implements t8 {
        private static final b zzl;
        private static volatile e9<b> zzm;
        private int zzc;
        private int zzd;
        private String zze = "";
        private r7<c> zzf = h7.B();
        private boolean zzg;
        private d zzh;
        private boolean zzi;
        private boolean zzj;
        private boolean zzk;

        public static final class a extends h7.a<b, a> implements t8 {
            private a() {
                super(b.zzl);
            }

            /* synthetic */ a(y0 y0Var) {
                this();
            }

            public final c A(int r2) {
                return ((b) this.e).C(r2);
            }

            public final String C() {
                return ((b) this.e).L();
            }

            public final int D() {
                return ((b) this.e).N();
            }

            public final a x(int r2, c cVar) {
                if (this.f) {
                    u();
                    this.f = false;
                }
                ((b) this.e).D(r2, cVar);
                return this;
            }

            public final a z(String str) {
                if (this.f) {
                    u();
                    this.f = false;
                }
                ((b) this.e).G(str);
                return this;
            }
        }

        static {
            b bVar = new b();
            zzl = bVar;
            h7.u(b.class, bVar);
        }

        private b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void D(int r3, c cVar) {
            cVar.getClass();
            r7<c> r7Var = this.zzf;
            if (!r7Var.a()) {
                this.zzf = h7.q(r7Var);
            }
            this.zzf.set(r3, cVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void G(String str) {
            str.getClass();
            this.zzc |= 2;
            this.zze = str;
        }

        public static a U() {
            return zzl.w();
        }

        public final c C(int r2) {
            return this.zzf.get(r2);
        }

        public final boolean J() {
            return (this.zzc & 1) != 0;
        }

        public final int K() {
            return this.zzd;
        }

        public final String L() {
            return this.zze;
        }

        public final List<c> M() {
            return this.zzf;
        }

        public final int N() {
            return this.zzf.size();
        }

        public final boolean O() {
            return (this.zzc & 8) != 0;
        }

        public final d P() {
            d dVar = this.zzh;
            return dVar == null ? d.O() : dVar;
        }

        public final boolean Q() {
            return this.zzi;
        }

        public final boolean R() {
            return this.zzj;
        }

        public final boolean S() {
            return (this.zzc & 64) != 0;
        }

        public final boolean T() {
            return this.zzk;
        }

        @Override // c.a.b.b.g.c.h7
        protected final Object r(int r2, Object obj, Object obj2) {
            y0 y0Var = null;
            switch (y0.f1867a[r2 - 1]) {
                case 1:
                    return new b();
                case 2:
                    return new a(y0Var);
                case 3:
                    return h7.s(zzl, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u001b\u0004ဇ\u0002\u0005ဉ\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006", new Object[]{"zzc", "zzd", "zze", "zzf", c.class, "zzg", "zzh", "zzi", "zzj", "zzk"});
                case 4:
                    return zzl;
                case 5:
                    e9<b> cVar = zzm;
                    if (cVar == null) {
                        synchronized (b.class) {
                            cVar = zzm;
                            if (cVar == null) {
                                cVar = new h7.c<>(zzl);
                                zzm = cVar;
                            }
                        }
                    }
                    return cVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    public static final class c extends h7<c, a> implements t8 {
        private static final c zzh;
        private static volatile e9<c> zzi;
        private int zzc;
        private f zzd;
        private d zze;
        private boolean zzf;
        private String zzg = "";

        public static final class a extends h7.a<c, a> implements t8 {
            private a() {
                super(c.zzh);
            }

            /* synthetic */ a(y0 y0Var) {
                this();
            }

            public final a x(String str) {
                if (this.f) {
                    u();
                    this.f = false;
                }
                ((c) this.e).D(str);
                return this;
            }
        }

        static {
            c cVar = new c();
            zzh = cVar;
            h7.u(c.class, cVar);
        }

        private c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void D(String str) {
            str.getClass();
            this.zzc |= 8;
            this.zzg = str;
        }

        public static c O() {
            return zzh;
        }

        public final boolean E() {
            return (this.zzc & 1) != 0;
        }

        public final f F() {
            f fVar = this.zzd;
            return fVar == null ? f.M() : fVar;
        }

        public final boolean G() {
            return (this.zzc & 2) != 0;
        }

        public final d J() {
            d dVar = this.zze;
            return dVar == null ? d.O() : dVar;
        }

        public final boolean K() {
            return (this.zzc & 4) != 0;
        }

        public final boolean L() {
            return this.zzf;
        }

        public final boolean M() {
            return (this.zzc & 8) != 0;
        }

        public final String N() {
            return this.zzg;
        }

        @Override // c.a.b.b.g.c.h7
        protected final Object r(int r2, Object obj, Object obj2) {
            y0 y0Var = null;
            switch (y0.f1867a[r2 - 1]) {
                case 1:
                    return new c();
                case 2:
                    return new a(y0Var);
                case 3:
                    return h7.s(zzh, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg"});
                case 4:
                    return zzh;
                case 5:
                    e9<c> cVar = zzi;
                    if (cVar == null) {
                        synchronized (c.class) {
                            cVar = zzi;
                            if (cVar == null) {
                                cVar = new h7.c<>(zzh);
                                zzi = cVar;
                            }
                        }
                    }
                    return cVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    public static final class d extends h7<d, b> implements t8 {
        private static final d zzi;
        private static volatile e9<d> zzj;
        private int zzc;
        private int zzd;
        private boolean zze;
        private String zzf = "";
        private String zzg = "";
        private String zzh = "";

        public enum a implements k7 {
            UNKNOWN_COMPARISON_TYPE(0),
            LESS_THAN(1),
            GREATER_THAN(2),
            EQUAL(3),
            BETWEEN(4);

            private static final n7<a> j = new a1();
            private final int d;

            a(int r3) {
                this.d = r3;
            }

            public static a e(int r1) {
                if (r1 == 0) {
                    return UNKNOWN_COMPARISON_TYPE;
                }
                if (r1 == 1) {
                    return LESS_THAN;
                }
                if (r1 == 2) {
                    return GREATER_THAN;
                }
                if (r1 == 3) {
                    return EQUAL;
                }
                if (r1 != 4) {
                    return null;
                }
                return BETWEEN;
            }

            public static m7 g() {
                return z0.f1875a;
            }

            @Override // c.a.b.b.g.c.k7
            public final int a() {
                return this.d;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "<" + a.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.d + " name=" + name() + '>';
            }
        }

        public static final class b extends h7.a<d, b> implements t8 {
            private b() {
                super(d.zzi);
            }

            /* synthetic */ b(y0 y0Var) {
                this();
            }
        }

        static {
            d dVar = new d();
            zzi = dVar;
            h7.u(d.class, dVar);
        }

        private d() {
        }

        public static d O() {
            return zzi;
        }

        public final boolean C() {
            return (this.zzc & 1) != 0;
        }

        public final a D() {
            a aVarE = a.e(this.zzd);
            return aVarE == null ? a.UNKNOWN_COMPARISON_TYPE : aVarE;
        }

        public final boolean E() {
            return (this.zzc & 2) != 0;
        }

        public final boolean F() {
            return this.zze;
        }

        public final boolean G() {
            return (this.zzc & 4) != 0;
        }

        public final String J() {
            return this.zzf;
        }

        public final boolean K() {
            return (this.zzc & 8) != 0;
        }

        public final String L() {
            return this.zzg;
        }

        public final boolean M() {
            return (this.zzc & 16) != 0;
        }

        public final String N() {
            return this.zzh;
        }

        @Override // c.a.b.b.g.c.h7
        protected final Object r(int r2, Object obj, Object obj2) {
            y0 y0Var = null;
            switch (y0.f1867a[r2 - 1]) {
                case 1:
                    return new d();
                case 2:
                    return new b(y0Var);
                case 3:
                    return h7.s(zzi, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"zzc", "zzd", a.g(), "zze", "zzf", "zzg", "zzh"});
                case 4:
                    return zzi;
                case 5:
                    e9<d> cVar = zzj;
                    if (cVar == null) {
                        synchronized (d.class) {
                            cVar = zzj;
                            if (cVar == null) {
                                cVar = new h7.c<>(zzi);
                                zzj = cVar;
                            }
                        }
                    }
                    return cVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    public static final class e extends h7<e, a> implements t8 {
        private static final e zzj;
        private static volatile e9<e> zzk;
        private int zzc;
        private int zzd;
        private String zze = "";
        private c zzf;
        private boolean zzg;
        private boolean zzh;
        private boolean zzi;

        public static final class a extends h7.a<e, a> implements t8 {
            private a() {
                super(e.zzj);
            }

            /* synthetic */ a(y0 y0Var) {
                this();
            }

            public final a x(String str) {
                if (this.f) {
                    u();
                    this.f = false;
                }
                ((e) this.e).D(str);
                return this;
            }
        }

        static {
            e eVar = new e();
            zzj = eVar;
            h7.u(e.class, eVar);
        }

        private e() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void D(String str) {
            str.getClass();
            this.zzc |= 2;
            this.zze = str;
        }

        public static a O() {
            return zzj.w();
        }

        public final boolean E() {
            return (this.zzc & 1) != 0;
        }

        public final int F() {
            return this.zzd;
        }

        public final String G() {
            return this.zze;
        }

        public final c J() {
            c cVar = this.zzf;
            return cVar == null ? c.O() : cVar;
        }

        public final boolean K() {
            return this.zzg;
        }

        public final boolean L() {
            return this.zzh;
        }

        public final boolean M() {
            return (this.zzc & 32) != 0;
        }

        public final boolean N() {
            return this.zzi;
        }

        @Override // c.a.b.b.g.c.h7
        protected final Object r(int r2, Object obj, Object obj2) {
            y0 y0Var = null;
            switch (y0.f1867a[r2 - 1]) {
                case 1:
                    return new e();
                case 2:
                    return new a(y0Var);
                case 3:
                    return h7.s(zzj, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
                case 4:
                    return zzj;
                case 5:
                    e9<e> cVar = zzk;
                    if (cVar == null) {
                        synchronized (e.class) {
                            cVar = zzk;
                            if (cVar == null) {
                                cVar = new h7.c<>(zzj);
                                zzk = cVar;
                            }
                        }
                    }
                    return cVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    public static final class f extends h7<f, a> implements t8 {
        private static final f zzh;
        private static volatile e9<f> zzi;
        private int zzc;
        private int zzd;
        private boolean zzf;
        private String zze = "";
        private r7<String> zzg = h7.B();

        public static final class a extends h7.a<f, a> implements t8 {
            private a() {
                super(f.zzh);
            }

            /* synthetic */ a(y0 y0Var) {
                this();
            }
        }

        public enum b implements k7 {
            UNKNOWN_MATCH_TYPE(0),
            REGEXP(1),
            BEGINS_WITH(2),
            ENDS_WITH(3),
            PARTIAL(4),
            EXACT(5),
            IN_LIST(6);

            private static final n7<b> l = new b1();
            private final int d;

            b(int r3) {
                this.d = r3;
            }

            public static b e(int r0) {
                switch (r0) {
                    case 0:
                        return UNKNOWN_MATCH_TYPE;
                    case 1:
                        return REGEXP;
                    case 2:
                        return BEGINS_WITH;
                    case 3:
                        return ENDS_WITH;
                    case 4:
                        return PARTIAL;
                    case 5:
                        return EXACT;
                    case 6:
                        return IN_LIST;
                    default:
                        return null;
                }
            }

            public static m7 g() {
                return e1.f1677a;
            }

            @Override // c.a.b.b.g.c.k7
            public final int a() {
                return this.d;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "<" + b.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.d + " name=" + name() + '>';
            }
        }

        static {
            f fVar = new f();
            zzh = fVar;
            h7.u(f.class, fVar);
        }

        private f() {
        }

        public static f M() {
            return zzh;
        }

        public final boolean C() {
            return (this.zzc & 1) != 0;
        }

        public final b D() {
            b bVarE = b.e(this.zzd);
            return bVarE == null ? b.UNKNOWN_MATCH_TYPE : bVarE;
        }

        public final boolean E() {
            return (this.zzc & 2) != 0;
        }

        public final String F() {
            return this.zze;
        }

        public final boolean G() {
            return (this.zzc & 4) != 0;
        }

        public final boolean J() {
            return this.zzf;
        }

        public final List<String> K() {
            return this.zzg;
        }

        public final int L() {
            return this.zzg.size();
        }

        @Override // c.a.b.b.g.c.h7
        protected final Object r(int r2, Object obj, Object obj2) {
            y0 y0Var = null;
            switch (y0.f1867a[r2 - 1]) {
                case 1:
                    return new f();
                case 2:
                    return new a(y0Var);
                case 3:
                    return h7.s(zzh, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004\u001a", new Object[]{"zzc", "zzd", b.g(), "zze", "zzf", "zzg"});
                case 4:
                    return zzh;
                case 5:
                    e9<f> cVar = zzi;
                    if (cVar == null) {
                        synchronized (f.class) {
                            cVar = zzi;
                            if (cVar == null) {
                                cVar = new h7.c<>(zzh);
                                zzi = cVar;
                            }
                        }
                    }
                    return cVar;
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
