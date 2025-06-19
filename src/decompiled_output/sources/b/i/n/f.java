package b.i.n;

import java.nio.CharBuffer;
import java.util.Locale;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final b.i.n.e f1122a = new e(null, false);

    /* renamed from: b, reason: collision with root package name */
    public static final b.i.n.e f1123b = new e(null, true);

    /* renamed from: c, reason: collision with root package name */
    public static final b.i.n.e f1124c = new e(b.f1127a, false);
    public static final b.i.n.e d = new e(b.f1127a, true);
    public static final b.i.n.e e = new e(a.f1125b, false);
    public static final b.i.n.e f = C0067f.f1130b;
    private static final int g = 0;
    private static final int h = 1;
    private static final int i = 2;

    private static class a implements c {

        /* renamed from: b, reason: collision with root package name */
        static final a f1125b = new a(true);

        /* renamed from: a, reason: collision with root package name */
        private final boolean f1126a;

        private a(boolean z) {
            this.f1126a = z;
        }

        @Override // b.i.n.f.c
        public int a(CharSequence charSequence, int r6, int r7) {
            int r72 = r7 + r6;
            boolean z = false;
            while (r6 < r72) {
                int r2 = f.a(Character.getDirectionality(charSequence.charAt(r6)));
                if (r2 != 0) {
                    if (r2 != 1) {
                        continue;
                        r6++;
                    } else if (!this.f1126a) {
                        return 1;
                    }
                } else if (this.f1126a) {
                    return 0;
                }
                z = true;
                r6++;
            }
            if (z) {
                return this.f1126a ? 1 : 0;
            }
            return 2;
        }
    }

    private static class b implements c {

        /* renamed from: a, reason: collision with root package name */
        static final b f1127a = new b();

        private b() {
        }

        @Override // b.i.n.f.c
        public int a(CharSequence charSequence, int r4, int r5) {
            int r52 = r5 + r4;
            int r1 = 2;
            while (r4 < r52 && r1 == 2) {
                r1 = f.b(Character.getDirectionality(charSequence.charAt(r4)));
                r4++;
            }
            return r1;
        }
    }

    private interface c {
        int a(CharSequence charSequence, int r2, int r3);
    }

    private static abstract class d implements b.i.n.e {

        /* renamed from: a, reason: collision with root package name */
        private final c f1128a;

        d(c cVar) {
            this.f1128a = cVar;
        }

        private boolean d(CharSequence charSequence, int r3, int r4) {
            int r2 = this.f1128a.a(charSequence, r3, r4);
            if (r2 == 0) {
                return true;
            }
            if (r2 != 1) {
                return c();
            }
            return false;
        }

        @Override // b.i.n.e
        public boolean a(char[] cArr, int r2, int r3) {
            return b(CharBuffer.wrap(cArr), r2, r3);
        }

        @Override // b.i.n.e
        public boolean b(CharSequence charSequence, int r3, int r4) {
            if (charSequence == null || r3 < 0 || r4 < 0 || charSequence.length() - r4 < r3) {
                throw new IllegalArgumentException();
            }
            return this.f1128a == null ? c() : d(charSequence, r3, r4);
        }

        protected abstract boolean c();
    }

    private static class e extends d {

        /* renamed from: b, reason: collision with root package name */
        private final boolean f1129b;

        e(c cVar, boolean z) {
            super(cVar);
            this.f1129b = z;
        }

        @Override // b.i.n.f.d
        protected boolean c() {
            return this.f1129b;
        }
    }

    /* renamed from: b.i.n.f$f, reason: collision with other inner class name */
    private static class C0067f extends d {

        /* renamed from: b, reason: collision with root package name */
        static final C0067f f1130b = new C0067f();

        C0067f() {
            super(null);
        }

        @Override // b.i.n.f.d
        protected boolean c() {
            return g.b(Locale.getDefault()) == 1;
        }
    }

    private f() {
    }

    static int a(int r1) {
        if (r1 != 0) {
            return (r1 == 1 || r1 == 2) ? 0 : 2;
        }
        return 1;
    }

    static int b(int r2) {
        if (r2 != 0) {
            if (r2 == 1 || r2 == 2) {
                return 0;
            }
            switch (r2) {
                case 14:
                case 15:
                    break;
                case 16:
                case 17:
                    return 0;
                default:
                    return 2;
            }
        }
        return 1;
    }
}
