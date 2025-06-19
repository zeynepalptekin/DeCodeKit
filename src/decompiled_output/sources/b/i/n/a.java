package b.i.n;

import android.text.SpannableStringBuilder;
import java.util.Locale;

/* loaded from: classes.dex */
public final class a {
    private static final char e = 8234;
    private static final char f = 8235;
    private static final char g = 8236;
    private static final String l = "";
    private static final int m = 2;
    private static final int n = 2;
    private static final int q = -1;
    private static final int r = 0;
    private static final int s = 1;

    /* renamed from: a, reason: collision with root package name */
    private final boolean f1099a;

    /* renamed from: b, reason: collision with root package name */
    private final int f1100b;

    /* renamed from: c, reason: collision with root package name */
    private final e f1101c;
    static final e d = f.f1124c;
    private static final char h = 8206;
    private static final String j = Character.toString(h);
    private static final char i = 8207;
    private static final String k = Character.toString(i);
    static final a o = new a(false, 2, d);
    static final a p = new a(true, 2, d);

    /* renamed from: b.i.n.a$a, reason: collision with other inner class name */
    public static final class C0065a {

        /* renamed from: a, reason: collision with root package name */
        private boolean f1102a;

        /* renamed from: b, reason: collision with root package name */
        private int f1103b;

        /* renamed from: c, reason: collision with root package name */
        private e f1104c;

        public C0065a() {
            c(a.j(Locale.getDefault()));
        }

        public C0065a(Locale locale) {
            c(a.j(locale));
        }

        public C0065a(boolean z) {
            c(z);
        }

        private static a b(boolean z) {
            return z ? a.p : a.o;
        }

        private void c(boolean z) {
            this.f1102a = z;
            this.f1104c = a.d;
            this.f1103b = 2;
        }

        public a a() {
            return (this.f1103b == 2 && this.f1104c == a.d) ? b(this.f1102a) : new a(this.f1102a, this.f1103b, this.f1104c);
        }

        public C0065a d(e eVar) {
            this.f1104c = eVar;
            return this;
        }

        public C0065a e(boolean z) {
            this.f1103b = z ? this.f1103b | 2 : this.f1103b & (-3);
            return this;
        }
    }

    private static class b {
        private static final int f = 1792;
        private static final byte[] g = new byte[f];

        /* renamed from: a, reason: collision with root package name */
        private final CharSequence f1105a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f1106b;

        /* renamed from: c, reason: collision with root package name */
        private final int f1107c;
        private int d;
        private char e;

        static {
            for (int r1 = 0; r1 < f; r1++) {
                g[r1] = Character.getDirectionality(r1);
            }
        }

        b(CharSequence charSequence, boolean z) {
            this.f1105a = charSequence;
            this.f1106b = z;
            this.f1107c = charSequence.length();
        }

        private static byte c(char c2) {
            return c2 < f ? g[c2] : Character.getDirectionality(c2);
        }

        private byte f() {
            char cCharAt;
            int r0 = this.d;
            do {
                int r1 = this.d;
                if (r1 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f1105a;
                int r12 = r1 - 1;
                this.d = r12;
                cCharAt = charSequence.charAt(r12);
                this.e = cCharAt;
                if (cCharAt == '&') {
                    return (byte) 12;
                }
            } while (cCharAt != ';');
            this.d = r0;
            this.e = ';';
            return (byte) 13;
        }

        private byte g() {
            char cCharAt;
            do {
                int r0 = this.d;
                if (r0 >= this.f1107c) {
                    return (byte) 12;
                }
                CharSequence charSequence = this.f1105a;
                this.d = r0 + 1;
                cCharAt = charSequence.charAt(r0);
                this.e = cCharAt;
            } while (cCharAt != ';');
            return (byte) 12;
        }

        private byte h() {
            char cCharAt;
            int r0 = this.d;
            while (true) {
                int r1 = this.d;
                if (r1 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f1105a;
                int r12 = r1 - 1;
                this.d = r12;
                char cCharAt2 = charSequence.charAt(r12);
                this.e = cCharAt2;
                if (cCharAt2 == '<') {
                    return (byte) 12;
                }
                if (cCharAt2 == '>') {
                    break;
                }
                if (cCharAt2 == '\"' || cCharAt2 == '\'') {
                    char c2 = this.e;
                    do {
                        int r2 = this.d;
                        if (r2 > 0) {
                            CharSequence charSequence2 = this.f1105a;
                            int r22 = r2 - 1;
                            this.d = r22;
                            cCharAt = charSequence2.charAt(r22);
                            this.e = cCharAt;
                        }
                    } while (cCharAt != c2);
                }
            }
            this.d = r0;
            this.e = '>';
            return (byte) 13;
        }

        private byte i() {
            char cCharAt;
            int r0 = this.d;
            while (true) {
                int r1 = this.d;
                if (r1 >= this.f1107c) {
                    this.d = r0;
                    this.e = '<';
                    return (byte) 13;
                }
                CharSequence charSequence = this.f1105a;
                this.d = r1 + 1;
                char cCharAt2 = charSequence.charAt(r1);
                this.e = cCharAt2;
                if (cCharAt2 == '>') {
                    return (byte) 12;
                }
                if (cCharAt2 == '\"' || cCharAt2 == '\'') {
                    char c2 = this.e;
                    do {
                        int r2 = this.d;
                        if (r2 < this.f1107c) {
                            CharSequence charSequence2 = this.f1105a;
                            this.d = r2 + 1;
                            cCharAt = charSequence2.charAt(r2);
                            this.e = cCharAt;
                        }
                    } while (cCharAt != c2);
                }
            }
        }

        byte a() {
            char cCharAt = this.f1105a.charAt(this.d - 1);
            this.e = cCharAt;
            if (Character.isLowSurrogate(cCharAt)) {
                int r0 = Character.codePointBefore(this.f1105a, this.d);
                this.d -= Character.charCount(r0);
                return Character.getDirectionality(r0);
            }
            this.d--;
            byte bC = c(this.e);
            if (!this.f1106b) {
                return bC;
            }
            char c2 = this.e;
            return c2 == '>' ? h() : c2 == ';' ? f() : bC;
        }

        byte b() {
            char cCharAt = this.f1105a.charAt(this.d);
            this.e = cCharAt;
            if (Character.isHighSurrogate(cCharAt)) {
                int r0 = Character.codePointAt(this.f1105a, this.d);
                this.d += Character.charCount(r0);
                return Character.getDirectionality(r0);
            }
            this.d++;
            byte bC = c(this.e);
            if (!this.f1106b) {
                return bC;
            }
            char c2 = this.e;
            return c2 == '<' ? i() : c2 == '&' ? g() : bC;
        }

        int d() {
            this.d = 0;
            int r3 = 0;
            int r4 = 0;
            int r5 = 0;
            while (this.d < this.f1107c && r3 == 0) {
                byte b2 = b();
                if (b2 != 0) {
                    if (b2 == 1 || b2 == 2) {
                        if (r5 == 0) {
                            return 1;
                        }
                    } else if (b2 != 9) {
                        switch (b2) {
                            case 14:
                            case 15:
                                r5++;
                                r4 = -1;
                                continue;
                            case 16:
                            case 17:
                                r5++;
                                r4 = 1;
                                continue;
                            case 18:
                                r5--;
                                r4 = 0;
                                continue;
                        }
                    }
                } else if (r5 == 0) {
                    return -1;
                }
                r3 = r5;
            }
            if (r3 == 0) {
                return 0;
            }
            if (r4 != 0) {
                return r4;
            }
            while (this.d > 0) {
                switch (a()) {
                    case 14:
                    case 15:
                        if (r3 == r5) {
                            return -1;
                        }
                        break;
                    case 16:
                    case 17:
                        if (r3 == r5) {
                            return 1;
                        }
                        break;
                    case 18:
                        r5++;
                        continue;
                }
                r5--;
            }
            return 0;
        }

        int e() {
            this.d = this.f1107c;
            int r1 = 0;
            int r2 = 0;
            while (this.d > 0) {
                byte bA = a();
                if (bA != 0) {
                    if (bA == 1 || bA == 2) {
                        if (r1 == 0) {
                            return 1;
                        }
                        if (r2 == 0) {
                            r2 = r1;
                        }
                    } else if (bA != 9) {
                        switch (bA) {
                            case 14:
                            case 15:
                                if (r2 == r1) {
                                    return -1;
                                }
                                r1--;
                                break;
                            case 16:
                            case 17:
                                if (r2 == r1) {
                                    return 1;
                                }
                                r1--;
                                break;
                            case 18:
                                r1++;
                                break;
                            default:
                                if (r2 != 0) {
                                    break;
                                } else {
                                    r2 = r1;
                                    break;
                                }
                        }
                    } else {
                        continue;
                    }
                } else {
                    if (r1 == 0) {
                        return -1;
                    }
                    if (r2 == 0) {
                        r2 = r1;
                    }
                }
            }
            return 0;
        }
    }

    a(boolean z, int r2, e eVar) {
        this.f1099a = z;
        this.f1100b = r2;
        this.f1101c = eVar;
    }

    private static int a(CharSequence charSequence) {
        return new b(charSequence, false).d();
    }

    private static int b(CharSequence charSequence) {
        return new b(charSequence, false).e();
    }

    public static a c() {
        return new C0065a().a();
    }

    public static a d(Locale locale) {
        return new C0065a(locale).a();
    }

    public static a e(boolean z) {
        return new C0065a(z).a();
    }

    static boolean j(Locale locale) {
        return g.b(locale) == 1;
    }

    private String k(CharSequence charSequence, e eVar) {
        boolean zB = eVar.b(charSequence, 0, charSequence.length());
        return (this.f1099a || !(zB || b(charSequence) == 1)) ? this.f1099a ? (!zB || b(charSequence) == -1) ? k : "" : "" : j;
    }

    private String l(CharSequence charSequence, e eVar) {
        boolean zB = eVar.b(charSequence, 0, charSequence.length());
        return (this.f1099a || !(zB || a(charSequence) == 1)) ? this.f1099a ? (!zB || a(charSequence) == -1) ? k : "" : "" : j;
    }

    public boolean f() {
        return (this.f1100b & 2) != 0;
    }

    public boolean g(CharSequence charSequence) {
        return this.f1101c.b(charSequence, 0, charSequence.length());
    }

    public boolean h(String str) {
        return g(str);
    }

    public boolean i() {
        return this.f1099a;
    }

    public CharSequence m(CharSequence charSequence) {
        return o(charSequence, this.f1101c, true);
    }

    public CharSequence n(CharSequence charSequence, e eVar) {
        return o(charSequence, eVar, true);
    }

    public CharSequence o(CharSequence charSequence, e eVar, boolean z) {
        if (charSequence == null) {
            return null;
        }
        boolean zB = eVar.b(charSequence, 0, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (f() && z) {
            spannableStringBuilder.append((CharSequence) l(charSequence, zB ? f.f1123b : f.f1122a));
        }
        if (zB != this.f1099a) {
            spannableStringBuilder.append(zB ? f : e);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append(g);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (z) {
            spannableStringBuilder.append((CharSequence) k(charSequence, zB ? f.f1123b : f.f1122a));
        }
        return spannableStringBuilder;
    }

    public CharSequence p(CharSequence charSequence, boolean z) {
        return o(charSequence, this.f1101c, z);
    }

    public String q(String str) {
        return s(str, this.f1101c, true);
    }

    public String r(String str, e eVar) {
        return s(str, eVar, true);
    }

    public String s(String str, e eVar, boolean z) {
        if (str == null) {
            return null;
        }
        return o(str, eVar, z).toString();
    }

    public String t(String str, boolean z) {
        return s(str, this.f1101c, z);
    }
}
