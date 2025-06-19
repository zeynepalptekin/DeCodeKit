package c.a.b.b.g.c;

import c.a.b.b.g.c.h7;
import c.a.b.b.g.c.n1;
import c.a.b.b.g.c.x0;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class d1 {

    public static final class a extends h7<a, C0126a> implements t8 {
        private static final a zzh;
        private static volatile e9<a> zzi;
        private int zzc;
        private String zzd = "";
        private boolean zze;
        private boolean zzf;
        private int zzg;

        /* renamed from: c.a.b.b.g.c.d1$a$a, reason: collision with other inner class name */
        public static final class C0126a extends h7.a<a, C0126a> implements t8 {
            private C0126a() {
                super(a.zzh);
            }

            /* synthetic */ C0126a(f1 f1Var) {
                this();
            }

            public final boolean A() {
                return ((a) this.e).F();
            }

            public final boolean C() {
                return ((a) this.e).G();
            }

            public final boolean D() {
                return ((a) this.e).J();
            }

            public final int F() {
                return ((a) this.e).K();
            }

            public final C0126a x(String str) {
                if (this.f) {
                    u();
                    this.f = false;
                }
                ((a) this.e).E(str);
                return this;
            }

            public final String z() {
                return ((a) this.e).C();
            }
        }

        static {
            a aVar = new a();
            zzh = aVar;
            h7.u(a.class, aVar);
        }

        private a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void E(String str) {
            str.getClass();
            this.zzc |= 1;
            this.zzd = str;
        }

        public final String C() {
            return this.zzd;
        }

        public final boolean F() {
            return this.zze;
        }

        public final boolean G() {
            return this.zzf;
        }

        public final boolean J() {
            return (this.zzc & 8) != 0;
        }

        public final int K() {
            return this.zzg;
        }

        @Override // c.a.b.b.g.c.h7
        protected final Object r(int r2, Object obj, Object obj2) {
            f1 f1Var = null;
            switch (f1.f1682a[r2 - 1]) {
                case 1:
                    return new a();
                case 2:
                    return new C0126a(f1Var);
                case 3:
                    return h7.s(zzh, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004င\u0003", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg"});
                case 4:
                    return zzh;
                case 5:
                    e9<a> cVar = zzi;
                    if (cVar == null) {
                        synchronized (a.class) {
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

    public static final class b extends h7<b, a> implements t8 {
        private static final b zzm;
        private static volatile e9<b> zzn;
        private int zzc;
        private long zzd;
        private int zzf;
        private boolean zzk;
        private String zze = "";
        private r7<c> zzg = h7.B();
        private r7<a> zzh = h7.B();
        private r7<x0.a> zzi = h7.B();
        private String zzj = "";
        private r7<n1.a> zzl = h7.B();

        public static final class a extends h7.a<b, a> implements t8 {
            private a() {
                super(b.zzm);
            }

            /* synthetic */ a(f1 f1Var) {
                this();
            }

            public final a A(int r2, a.C0126a c0126a) {
                if (this.f) {
                    u();
                    this.f = false;
                }
                ((b) this.e).D(r2, (a) ((h7) c0126a.j()));
                return this;
            }

            public final List<x0.a> C() {
                return Collections.unmodifiableList(((b) this.e).O());
            }

            public final a D() {
                if (this.f) {
                    u();
                    this.f = false;
                }
                ((b) this.e).T();
                return this;
            }

            public final int x() {
                return ((b) this.e).N();
            }

            public final a z(int r2) {
                return ((b) this.e).C(r2);
            }
        }

        static {
            b bVar = new b();
            zzm = bVar;
            h7.u(b.class, bVar);
        }

        private b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void D(int r3, a aVar) {
            aVar.getClass();
            r7<a> r7Var = this.zzh;
            if (!r7Var.a()) {
                this.zzh = h7.q(r7Var);
            }
            this.zzh.set(r3, aVar);
        }

        public static a Q() {
            return zzm.w();
        }

        public static b R() {
            return zzm;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void T() {
            this.zzi = h7.B();
        }

        public final a C(int r2) {
            return this.zzh.get(r2);
        }

        public final boolean G() {
            return (this.zzc & 1) != 0;
        }

        public final long J() {
            return this.zzd;
        }

        public final boolean K() {
            return (this.zzc & 2) != 0;
        }

        public final String L() {
            return this.zze;
        }

        public final List<c> M() {
            return this.zzg;
        }

        public final int N() {
            return this.zzh.size();
        }

        public final List<x0.a> O() {
            return this.zzi;
        }

        public final boolean P() {
            return this.zzk;
        }

        @Override // c.a.b.b.g.c.h7
        protected final Object r(int r2, Object obj, Object obj2) {
            f1 f1Var = null;
            switch (f1.f1682a[r2 - 1]) {
                case 1:
                    return new b();
                case 2:
                    return new a(f1Var);
                case 3:
                    return h7.s(zzm, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0004\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007ဈ\u0003\bဇ\u0004\t\u001b", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", c.class, "zzh", a.class, "zzi", x0.a.class, "zzj", "zzk", "zzl", n1.a.class});
                case 4:
                    return zzm;
                case 5:
                    e9<b> cVar = zzn;
                    if (cVar == null) {
                        synchronized (b.class) {
                            cVar = zzn;
                            if (cVar == null) {
                                cVar = new h7.c<>(zzm);
                                zzn = cVar;
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
        private static final c zzf;
        private static volatile e9<c> zzg;
        private int zzc;
        private String zzd = "";
        private String zze = "";

        public static final class a extends h7.a<c, a> implements t8 {
            private a() {
                super(c.zzf);
            }

            /* synthetic */ a(f1 f1Var) {
                this();
            }
        }

        static {
            c cVar = new c();
            zzf = cVar;
            h7.u(c.class, cVar);
        }

        private c() {
        }

        public final String C() {
            return this.zzd;
        }

        public final String D() {
            return this.zze;
        }

        @Override // c.a.b.b.g.c.h7
        protected final Object r(int r2, Object obj, Object obj2) {
            f1 f1Var = null;
            switch (f1.f1682a[r2 - 1]) {
                case 1:
                    return new c();
                case 2:
                    return new a(f1Var);
                case 3:
                    return h7.s(zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzc", "zzd", "zze"});
                case 4:
                    return zzf;
                case 5:
                    e9<c> cVar = zzg;
                    if (cVar == null) {
                        synchronized (c.class) {
                            cVar = zzg;
                            if (cVar == null) {
                                cVar = new h7.c<>(zzf);
                                zzg = cVar;
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
