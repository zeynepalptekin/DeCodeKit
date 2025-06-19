package c.a.e.c0;

import c.a.e.a0.g;
import java.io.Closeable;
import java.io.IOException;
import java.io.Reader;

/* loaded from: classes.dex */
public class a implements Closeable {
    private static final int A = 6;
    private static final int B = 7;
    private static final int C = 8;
    private static final int D = 9;
    private static final int E = 10;
    private static final int F = 11;
    private static final int G = 12;
    private static final int H = 13;
    private static final int I = 14;
    private static final int J = 15;
    private static final int K = 16;
    private static final int L = 17;
    private static final int M = 0;
    private static final int N = 1;
    private static final int O = 2;
    private static final int P = 3;
    private static final int Q = 4;
    private static final int R = 5;
    private static final int S = 6;
    private static final int T = 7;
    private static final char[] s = ")]}'\n".toCharArray();
    private static final long t = -922337203685477580L;
    private static final int u = 0;
    private static final int v = 1;
    private static final int w = 2;
    private static final int x = 3;
    private static final int y = 4;
    private static final int z = 5;
    private final Reader d;
    private boolean e = false;
    private final char[] f = new char[1024];
    private int g = 0;
    private int h = 0;
    private int i = 0;
    private int j = 0;
    int k = 0;
    private long l;
    private int m;
    private String n;
    private int[] o;
    private int p;
    private String[] q;
    private int[] r;

    /* renamed from: c.a.e.c0.a$a, reason: collision with other inner class name */
    static class C0156a extends g {
        C0156a() {
        }

        @Override // c.a.e.a0.g
        public void a(a aVar) throws IOException {
            int r0;
            if (aVar instanceof c.a.e.a0.p.e) {
                ((c.a.e.a0.p.e) aVar).O();
                return;
            }
            int r02 = aVar.k;
            if (r02 == 0) {
                r02 = aVar.g();
            }
            if (r02 == 13) {
                r0 = 9;
            } else if (r02 == 12) {
                r0 = 8;
            } else {
                if (r02 != 14) {
                    throw new IllegalStateException("Expected a name but was " + aVar.z() + aVar.o());
                }
                r0 = 10;
            }
            aVar.k = r0;
        }
    }

    static {
        g.f2238a = new C0156a();
    }

    public a(Reader reader) {
        int[] r2 = new int[32];
        this.o = r2;
        this.p = 0;
        this.p = 0 + 1;
        r2[0] = 6;
        this.q = new String[32];
        this.r = new int[32];
        if (reader == null) {
            throw new NullPointerException("in == null");
        }
        this.d = reader;
    }

    private int A() throws IOException {
        int r0;
        String str;
        String str2;
        char c2 = this.f[this.g];
        if (c2 == 't' || c2 == 'T') {
            r0 = 5;
            str = "true";
            str2 = "TRUE";
        } else if (c2 == 'f' || c2 == 'F') {
            r0 = 6;
            str = "false";
            str2 = "FALSE";
        } else {
            if (c2 != 'n' && c2 != 'N') {
                return 0;
            }
            r0 = 7;
            str = "null";
            str2 = "NULL";
        }
        int length = str.length();
        for (int r5 = 1; r5 < length; r5++) {
            if (this.g + r5 >= this.h && !j(r5 + 1)) {
                return 0;
            }
            char c3 = this.f[this.g + r5];
            if (c3 != str.charAt(r5) && c3 != str2.charAt(r5)) {
                return 0;
            }
        }
        if ((this.g + length < this.h || j(length + 1)) && n(this.f[this.g + length])) {
            return 0;
        }
        this.g += length;
        this.k = r0;
        return r0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0095, code lost:
    
        if (n(r14) != false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0097, code lost:
    
        if (r9 != 2) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0099, code lost:
    
        if (r10 == false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x009f, code lost:
    
        if (r11 != Long.MIN_VALUE) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00a1, code lost:
    
        if (r13 == false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00a7, code lost:
    
        if (r11 != 0) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00a9, code lost:
    
        if (r13 != false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00ab, code lost:
    
        if (r13 == false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00ae, code lost:
    
        r11 = -r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00af, code lost:
    
        r18.l = r11;
        r18.g += r8;
        r1 = 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00b8, code lost:
    
        r18.k = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00ba, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00bb, code lost:
    
        if (r9 == 2) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00be, code lost:
    
        if (r9 == 4) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00c1, code lost:
    
        if (r9 != 7) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00c4, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00c6, code lost:
    
        r18.m = r8;
        r1 = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00cb, code lost:
    
        return 0;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int B() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c.a.e.c0.a.B():int");
    }

    private void C(int r7) {
        int r0 = this.p;
        int[] r1 = this.o;
        if (r0 == r1.length) {
            int[] r2 = new int[r0 * 2];
            int[] r3 = new int[r0 * 2];
            String[] strArr = new String[r0 * 2];
            System.arraycopy(r1, 0, r2, 0, r0);
            System.arraycopy(this.r, 0, r3, 0, this.p);
            System.arraycopy(this.q, 0, strArr, 0, this.p);
            this.o = r2;
            this.r = r3;
            this.q = strArr;
        }
        int[] r02 = this.o;
        int r12 = this.p;
        this.p = r12 + 1;
        r02[r12] = r7;
    }

    private char D() throws IOException {
        int r6;
        int r62;
        if (this.g == this.h && !j(1)) {
            throw K("Unterminated escape sequence");
        }
        char[] cArr = this.f;
        int r1 = this.g;
        int r4 = r1 + 1;
        this.g = r4;
        char c2 = cArr[r1];
        if (c2 == '\n') {
            this.i++;
            this.j = r4;
        } else if (c2 != '\"' && c2 != '\'' && c2 != '/' && c2 != '\\') {
            if (c2 == 'b') {
                return '\b';
            }
            if (c2 == 'f') {
                return '\f';
            }
            if (c2 == 'n') {
                return '\n';
            }
            if (c2 == 'r') {
                return '\r';
            }
            if (c2 == 't') {
                return '\t';
            }
            if (c2 != 'u') {
                throw K("Invalid escape sequence");
            }
            if (r4 + 4 > this.h && !j(4)) {
                throw K("Unterminated escape sequence");
            }
            char c3 = 0;
            int r42 = this.g;
            int r5 = r42 + 4;
            while (r42 < r5) {
                char c4 = this.f[r42];
                char c5 = (char) (c3 << 4);
                if (c4 < '0' || c4 > '9') {
                    if (c4 >= 'a' && c4 <= 'f') {
                        r6 = c4 - 'a';
                    } else {
                        if (c4 < 'A' || c4 > 'F') {
                            throw new NumberFormatException("\\u" + new String(this.f, this.g, 4));
                        }
                        r6 = c4 - 'A';
                    }
                    r62 = r6 + 10;
                } else {
                    r62 = c4 - '0';
                }
                c3 = (char) (c5 + r62);
                r42++;
            }
            this.g += 4;
            return c3;
        }
        return c2;
    }

    private void F(char c2) throws IOException {
        char[] cArr = this.f;
        while (true) {
            int r1 = this.g;
            int r2 = this.h;
            while (true) {
                if (r1 < r2) {
                    int r4 = r1 + 1;
                    char c3 = cArr[r1];
                    if (c3 == c2) {
                        this.g = r4;
                        return;
                    }
                    if (c3 == '\\') {
                        this.g = r4;
                        D();
                        break;
                    } else {
                        if (c3 == '\n') {
                            this.i++;
                            this.j = r4;
                        }
                        r1 = r4;
                    }
                } else {
                    this.g = r1;
                    if (!j(1)) {
                        throw K("Unterminated string");
                    }
                }
            }
        }
    }

    private boolean G(String str) throws IOException {
        int length = str.length();
        while (true) {
            if (this.g + length > this.h && !j(length)) {
                return false;
            }
            char[] cArr = this.f;
            int r2 = this.g;
            if (cArr[r2] != '\n') {
                for (int r3 = 0; r3 < length; r3++) {
                    if (this.f[this.g + r3] != str.charAt(r3)) {
                        break;
                    }
                }
                return true;
            }
            this.i++;
            this.j = r2 + 1;
            this.g++;
        }
    }

    private void H() throws IOException {
        char c2;
        do {
            if (this.g >= this.h && !j(1)) {
                return;
            }
            char[] cArr = this.f;
            int r1 = this.g;
            int r3 = r1 + 1;
            this.g = r3;
            c2 = cArr[r1];
            if (c2 == '\n') {
                this.i++;
                this.j = r3;
                return;
            }
        } while (c2 != '\r');
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0048, code lost:
    
        e();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void I() throws java.io.IOException {
        /*
            r4 = this;
        L0:
            r0 = 0
        L1:
            int r1 = r4.g
            int r2 = r1 + r0
            int r3 = r4.h
            if (r2 >= r3) goto L51
            char[] r2 = r4.f
            int r1 = r1 + r0
            char r1 = r2[r1]
            r2 = 9
            if (r1 == r2) goto L4b
            r2 = 10
            if (r1 == r2) goto L4b
            r2 = 12
            if (r1 == r2) goto L4b
            r2 = 13
            if (r1 == r2) goto L4b
            r2 = 32
            if (r1 == r2) goto L4b
            r2 = 35
            if (r1 == r2) goto L48
            r2 = 44
            if (r1 == r2) goto L4b
            r2 = 47
            if (r1 == r2) goto L48
            r2 = 61
            if (r1 == r2) goto L48
            r2 = 123(0x7b, float:1.72E-43)
            if (r1 == r2) goto L4b
            r2 = 125(0x7d, float:1.75E-43)
            if (r1 == r2) goto L4b
            r2 = 58
            if (r1 == r2) goto L4b
            r2 = 59
            if (r1 == r2) goto L48
            switch(r1) {
                case 91: goto L4b;
                case 92: goto L48;
                case 93: goto L4b;
                default: goto L45;
            }
        L45:
            int r0 = r0 + 1
            goto L1
        L48:
            r4.e()
        L4b:
            int r1 = r4.g
            int r1 = r1 + r0
            r4.g = r1
            return
        L51:
            int r1 = r1 + r0
            r4.g = r1
            r0 = 1
            boolean r0 = r4.j(r0)
            if (r0 != 0) goto L0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c.a.e.c0.a.I():void");
    }

    private IOException K(String str) throws IOException {
        throw new e(str + o());
    }

    private void e() throws IOException {
        if (!this.e) {
            throw K("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    private void f() throws IOException {
        u(true);
        int r1 = this.g - 1;
        this.g = r1;
        char[] cArr = s;
        if (r1 + cArr.length > this.h && !j(cArr.length)) {
            return;
        }
        int r0 = 0;
        while (true) {
            char[] cArr2 = s;
            if (r0 >= cArr2.length) {
                this.g += cArr2.length;
                return;
            } else if (this.f[this.g + r0] != cArr2[r0]) {
                return;
            } else {
                r0++;
            }
        }
    }

    private boolean j(int r7) throws IOException {
        int r1;
        char[] cArr = this.f;
        int r12 = this.j;
        int r2 = this.g;
        this.j = r12 - r2;
        int r13 = this.h;
        if (r13 != r2) {
            int r14 = r13 - r2;
            this.h = r14;
            System.arraycopy(cArr, r2, cArr, 0, r14);
        } else {
            this.h = 0;
        }
        this.g = 0;
        do {
            Reader reader = this.d;
            int r22 = this.h;
            int r15 = reader.read(cArr, r22, cArr.length - r22);
            if (r15 == -1) {
                return false;
            }
            int r23 = this.h + r15;
            this.h = r23;
            if (this.i == 0 && (r1 = this.j) == 0 && r23 > 0 && cArr[0] == 65279) {
                this.g++;
                this.j = r1 + 1;
                r7++;
            }
        } while (this.h < r7);
        return true;
    }

    private boolean n(char c2) throws IOException {
        if (c2 == '\t' || c2 == '\n' || c2 == '\f' || c2 == '\r' || c2 == ' ') {
            return false;
        }
        if (c2 != '#') {
            if (c2 == ',') {
                return false;
            }
            if (c2 != '/' && c2 != '=') {
                if (c2 == '{' || c2 == '}' || c2 == ':') {
                    return false;
                }
                if (c2 != ';') {
                    switch (c2) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        e();
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0053, code lost:
    
        if (r1 != '/') goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0055, code lost:
    
        r7.g = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0058, code lost:
    
        if (r4 != r2) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005a, code lost:
    
        r7.g = r4 - 1;
        r2 = j(2);
        r7.g++;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0067, code lost:
    
        if (r2 != false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0069, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006a, code lost:
    
        e();
        r2 = r7.g;
        r3 = r0[r2];
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0073, code lost:
    
        if (r3 == '*') goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0075, code lost:
    
        if (r3 == '/') goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0077, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0078, code lost:
    
        r7.g = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0080, code lost:
    
        r7.g = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x008a, code lost:
    
        if (G("*\/") == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0097, code lost:
    
        throw K("Unterminated comment");
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0098, code lost:
    
        r7.g = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x009c, code lost:
    
        if (r1 != '#') goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x009e, code lost:
    
        e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00a2, code lost:
    
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int u(boolean r8) throws java.io.IOException {
        /*
            r7 = this;
            char[] r0 = r7.f
        L2:
            int r1 = r7.g
        L4:
            int r2 = r7.h
        L6:
            r3 = 1
            if (r1 != r2) goto L34
            r7.g = r1
            boolean r1 = r7.j(r3)
            if (r1 != 0) goto L30
            if (r8 != 0) goto L15
            r8 = -1
            return r8
        L15:
            java.io.EOFException r8 = new java.io.EOFException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "End of input"
            r0.append(r1)
            java.lang.String r1 = r7.o()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r8.<init>(r0)
            throw r8
        L30:
            int r1 = r7.g
            int r2 = r7.h
        L34:
            int r4 = r1 + 1
            char r1 = r0[r1]
            r5 = 10
            if (r1 != r5) goto L44
            int r1 = r7.i
            int r1 = r1 + r3
            r7.i = r1
            r7.j = r4
            goto La3
        L44:
            r5 = 32
            if (r1 == r5) goto La3
            r5 = 13
            if (r1 == r5) goto La3
            r5 = 9
            if (r1 != r5) goto L51
            goto La3
        L51:
            r5 = 47
            if (r1 != r5) goto L98
            r7.g = r4
            r6 = 2
            if (r4 != r2) goto L6a
            int r4 = r4 + (-1)
            r7.g = r4
            boolean r2 = r7.j(r6)
            int r4 = r7.g
            int r4 = r4 + r3
            r7.g = r4
            if (r2 != 0) goto L6a
            return r1
        L6a:
            r7.e()
            int r2 = r7.g
            char r3 = r0[r2]
            r4 = 42
            if (r3 == r4) goto L80
            if (r3 == r5) goto L78
            return r1
        L78:
            int r2 = r2 + 1
            r7.g = r2
        L7c:
            r7.H()
            goto L2
        L80:
            int r2 = r2 + 1
            r7.g = r2
        */
        //  java.lang.String r1 = "*/"
        /*
            boolean r1 = r7.G(r1)
            if (r1 == 0) goto L91
            int r1 = r7.g
            int r1 = r1 + r6
            goto L4
        L91:
            java.lang.String r8 = "Unterminated comment"
            java.io.IOException r8 = r7.K(r8)
            throw r8
        L98:
            r2 = 35
            r7.g = r4
            if (r1 != r2) goto La2
            r7.e()
            goto L7c
        La2:
            return r1
        La3:
            r1 = r4
            goto L6
        */
        throw new UnsupportedOperationException("Method not decompiled: c.a.e.c0.a.u(boolean):int");
    }

    private String w(char c2) throws IOException {
        char[] cArr = this.f;
        StringBuilder sb = null;
        while (true) {
            int r2 = this.g;
            int r3 = this.h;
            while (true) {
                if (r2 < r3) {
                    int r7 = r2 + 1;
                    char c3 = cArr[r2];
                    if (c3 == c2) {
                        this.g = r7;
                        int r72 = (r7 - r2) - 1;
                        if (sb == null) {
                            return new String(cArr, r2, r72);
                        }
                        sb.append(cArr, r2, r72);
                        return sb.toString();
                    }
                    if (c3 == '\\') {
                        this.g = r7;
                        int r73 = (r7 - r2) - 1;
                        if (sb == null) {
                            sb = new StringBuilder(Math.max((r73 + 1) * 2, 16));
                        }
                        sb.append(cArr, r2, r73);
                        sb.append(D());
                    } else {
                        if (c3 == '\n') {
                            this.i++;
                            this.j = r7;
                        }
                        r2 = r7;
                    }
                } else {
                    if (sb == null) {
                        sb = new StringBuilder(Math.max((r2 - r2) * 2, 16));
                    }
                    sb.append(cArr, r2, r2 - r2);
                    this.g = r2;
                    if (!j(1)) {
                        throw K("Unterminated string");
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x004a, code lost:
    
        e();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x0044. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String y() throws java.io.IOException {
        /*
            r6 = this;
            r0 = 0
            r1 = 0
        L2:
            r2 = 0
        L3:
            int r3 = r6.g
            int r4 = r3 + r2
            int r5 = r6.h
            if (r4 >= r5) goto L4e
            char[] r4 = r6.f
            int r3 = r3 + r2
            char r3 = r4[r3]
            r4 = 9
            if (r3 == r4) goto L5c
            r4 = 10
            if (r3 == r4) goto L5c
            r4 = 12
            if (r3 == r4) goto L5c
            r4 = 13
            if (r3 == r4) goto L5c
            r4 = 32
            if (r3 == r4) goto L5c
            r4 = 35
            if (r3 == r4) goto L4a
            r4 = 44
            if (r3 == r4) goto L5c
            r4 = 47
            if (r3 == r4) goto L4a
            r4 = 61
            if (r3 == r4) goto L4a
            r4 = 123(0x7b, float:1.72E-43)
            if (r3 == r4) goto L5c
            r4 = 125(0x7d, float:1.75E-43)
            if (r3 == r4) goto L5c
            r4 = 58
            if (r3 == r4) goto L5c
            r4 = 59
            if (r3 == r4) goto L4a
            switch(r3) {
                case 91: goto L5c;
                case 92: goto L4a;
                case 93: goto L5c;
                default: goto L47;
            }
        L47:
            int r2 = r2 + 1
            goto L3
        L4a:
            r6.e()
            goto L5c
        L4e:
            char[] r3 = r6.f
            int r3 = r3.length
            if (r2 >= r3) goto L5e
            int r3 = r2 + 1
            boolean r3 = r6.j(r3)
            if (r3 == 0) goto L5c
            goto L3
        L5c:
            r0 = r2
            goto L7e
        L5e:
            if (r1 != 0) goto L6b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r3 = 16
            int r3 = java.lang.Math.max(r2, r3)
            r1.<init>(r3)
        L6b:
            char[] r3 = r6.f
            int r4 = r6.g
            r1.append(r3, r4, r2)
            int r3 = r6.g
            int r3 = r3 + r2
            r6.g = r3
            r2 = 1
            boolean r2 = r6.j(r2)
            if (r2 != 0) goto L2
        L7e:
            if (r1 != 0) goto L8a
            java.lang.String r1 = new java.lang.String
            char[] r2 = r6.f
            int r3 = r6.g
            r1.<init>(r2, r3, r0)
            goto L95
        L8a:
            char[] r2 = r6.f
            int r3 = r6.g
            r1.append(r2, r3, r0)
            java.lang.String r1 = r1.toString()
        L95:
            int r2 = r6.g
            int r2 = r2 + r0
            r6.g = r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: c.a.e.c0.a.y():java.lang.String");
    }

    public final void E(boolean z2) {
        this.e = z2;
    }

    public void J() throws IOException {
        char c2;
        int r1 = 0;
        do {
            int r2 = this.k;
            if (r2 == 0) {
                r2 = g();
            }
            if (r2 == 3) {
                C(1);
            } else if (r2 == 1) {
                C(3);
            } else {
                if (r2 == 4 || r2 == 2) {
                    this.p--;
                    r1--;
                } else if (r2 == 14 || r2 == 10) {
                    I();
                } else {
                    if (r2 == 8 || r2 == 12) {
                        c2 = '\'';
                    } else if (r2 == 9 || r2 == 13) {
                        c2 = '\"';
                    } else if (r2 == 16) {
                        this.g += this.m;
                    }
                    F(c2);
                }
                this.k = 0;
            }
            r1++;
            this.k = 0;
        } while (r1 != 0);
        int[] r0 = this.r;
        int r12 = this.p;
        int r22 = r12 - 1;
        r0[r22] = r0[r22] + 1;
        this.q[r12 - 1] = "null";
    }

    public void a() throws IOException {
        int r0 = this.k;
        if (r0 == 0) {
            r0 = g();
        }
        if (r0 == 3) {
            C(1);
            this.r[this.p - 1] = 0;
            this.k = 0;
        } else {
            throw new IllegalStateException("Expected BEGIN_ARRAY but was " + z() + o());
        }
    }

    public void b() throws IOException {
        int r0 = this.k;
        if (r0 == 0) {
            r0 = g();
        }
        if (r0 == 1) {
            C(3);
            this.k = 0;
        } else {
            throw new IllegalStateException("Expected BEGIN_OBJECT but was " + z() + o());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.k = 0;
        this.o[0] = 8;
        this.p = 1;
        this.d.close();
    }

    int g() throws IOException {
        int r0;
        int r1;
        int[] r02 = this.o;
        int r12 = this.p;
        int r2 = r02[r12 - 1];
        if (r2 == 1) {
            r02[r12 - 1] = 2;
        } else {
            if (r2 != 2) {
                if (r2 == 3 || r2 == 5) {
                    this.o[this.p - 1] = 4;
                    if (r2 == 5 && (r1 = u(true)) != 44) {
                        if (r1 != 59) {
                            if (r1 != 125) {
                                throw K("Unterminated object");
                            }
                            this.k = 2;
                            return 2;
                        }
                        e();
                    }
                    int r13 = u(true);
                    if (r13 == 34) {
                        r0 = 13;
                    } else if (r13 == 39) {
                        e();
                        r0 = 12;
                    } else {
                        if (r13 == 125) {
                            if (r2 == 5) {
                                throw K("Expected name");
                            }
                            this.k = 2;
                            return 2;
                        }
                        e();
                        this.g--;
                        if (!n((char) r13)) {
                            throw K("Expected name");
                        }
                        r0 = 14;
                    }
                } else if (r2 == 4) {
                    r02[r12 - 1] = 5;
                    int r03 = u(true);
                    if (r03 != 58) {
                        if (r03 != 61) {
                            throw K("Expected ':'");
                        }
                        e();
                        if (this.g < this.h || j(1)) {
                            char[] cArr = this.f;
                            int r14 = this.g;
                            if (cArr[r14] == '>') {
                                this.g = r14 + 1;
                            }
                        }
                    }
                } else if (r2 == 6) {
                    if (this.e) {
                        f();
                    }
                    this.o[this.p - 1] = 7;
                } else if (r2 == 7) {
                    if (u(false) == -1) {
                        r0 = 17;
                    } else {
                        e();
                        this.g--;
                    }
                } else if (r2 == 8) {
                    throw new IllegalStateException("JsonReader is closed");
                }
                this.k = r0;
                return r0;
            }
            int r04 = u(true);
            if (r04 != 44) {
                if (r04 != 59) {
                    if (r04 != 93) {
                        throw K("Unterminated array");
                    }
                    this.k = 4;
                    return 4;
                }
                e();
            }
        }
        int r05 = u(true);
        if (r05 != 34) {
            if (r05 == 39) {
                e();
                this.k = 8;
                return 8;
            }
            if (r05 != 44 && r05 != 59) {
                if (r05 == 91) {
                    this.k = 3;
                    return 3;
                }
                if (r05 != 93) {
                    if (r05 == 123) {
                        this.k = 1;
                        return 1;
                    }
                    this.g--;
                    int r06 = A();
                    if (r06 != 0) {
                        return r06;
                    }
                    int r07 = B();
                    if (r07 != 0) {
                        return r07;
                    }
                    if (!n(this.f[this.g])) {
                        throw K("Expected value");
                    }
                    e();
                    r0 = 10;
                } else if (r2 == 1) {
                    this.k = 4;
                    return 4;
                }
            }
            if (r2 != 1 && r2 != 2) {
                throw K("Unexpected value");
            }
            e();
            this.g--;
            this.k = 7;
            return 7;
        }
        r0 = 9;
        this.k = r0;
        return r0;
    }

    public void h() throws IOException {
        int r0 = this.k;
        if (r0 == 0) {
            r0 = g();
        }
        if (r0 != 4) {
            throw new IllegalStateException("Expected END_ARRAY but was " + z() + o());
        }
        int r02 = this.p - 1;
        this.p = r02;
        int[] r1 = this.r;
        int r03 = r02 - 1;
        r1[r03] = r1[r03] + 1;
        this.k = 0;
    }

    public void i() throws IOException {
        int r0 = this.k;
        if (r0 == 0) {
            r0 = g();
        }
        if (r0 != 2) {
            throw new IllegalStateException("Expected END_OBJECT but was " + z() + o());
        }
        int r02 = this.p - 1;
        this.p = r02;
        this.q[r02] = null;
        int[] r1 = this.r;
        int r03 = r02 - 1;
        r1[r03] = r1[r03] + 1;
        this.k = 0;
    }

    public String k() {
        StringBuilder sb = new StringBuilder();
        sb.append('$');
        int r1 = this.p;
        for (int r2 = 0; r2 < r1; r2++) {
            int r3 = this.o[r2];
            if (r3 == 1 || r3 == 2) {
                sb.append('[');
                sb.append(this.r[r2]);
                sb.append(']');
            } else if (r3 == 3 || r3 == 4 || r3 == 5) {
                sb.append('.');
                String[] strArr = this.q;
                if (strArr[r2] != null) {
                    sb.append(strArr[r2]);
                }
            }
        }
        return sb.toString();
    }

    public boolean l() throws IOException {
        int r0 = this.k;
        if (r0 == 0) {
            r0 = g();
        }
        return (r0 == 2 || r0 == 4) ? false : true;
    }

    public final boolean m() {
        return this.e;
    }

    String o() {
        return " at line " + (this.i + 1) + " column " + ((this.g - this.j) + 1) + " path " + k();
    }

    public boolean p() throws IOException {
        int r0 = this.k;
        if (r0 == 0) {
            r0 = g();
        }
        if (r0 == 5) {
            this.k = 0;
            int[] r02 = this.r;
            int r1 = this.p - 1;
            r02[r1] = r02[r1] + 1;
            return true;
        }
        if (r0 == 6) {
            this.k = 0;
            int[] r03 = this.r;
            int r12 = this.p - 1;
            r03[r12] = r03[r12] + 1;
            return false;
        }
        throw new IllegalStateException("Expected a boolean but was " + z() + o());
    }

    public double q() throws IOException, NumberFormatException {
        String strW;
        int r0 = this.k;
        if (r0 == 0) {
            r0 = g();
        }
        if (r0 == 15) {
            this.k = 0;
            int[] r02 = this.r;
            int r1 = this.p - 1;
            r02[r1] = r02[r1] + 1;
            return this.l;
        }
        if (r0 == 16) {
            this.n = new String(this.f, this.g, this.m);
            this.g += this.m;
        } else {
            if (r0 == 8 || r0 == 9) {
                strW = w(r0 == 8 ? '\'' : '\"');
            } else if (r0 == 10) {
                strW = y();
            } else if (r0 != 11) {
                throw new IllegalStateException("Expected a double but was " + z() + o());
            }
            this.n = strW;
        }
        this.k = 11;
        double d = Double.parseDouble(this.n);
        if (!this.e && (Double.isNaN(d) || Double.isInfinite(d))) {
            throw new e("JSON forbids NaN and infinities: " + d + o());
        }
        this.n = null;
        this.k = 0;
        int[] r2 = this.r;
        int r3 = this.p - 1;
        r2[r3] = r2[r3] + 1;
        return d;
    }

    public int r() throws IOException, NumberFormatException {
        String strW;
        int r0 = this.k;
        if (r0 == 0) {
            r0 = g();
        }
        if (r0 == 15) {
            long j = this.l;
            int r4 = (int) j;
            if (j == r4) {
                this.k = 0;
                int[] r02 = this.r;
                int r1 = this.p - 1;
                r02[r1] = r02[r1] + 1;
                return r4;
            }
            throw new NumberFormatException("Expected an int but was " + this.l + o());
        }
        if (r0 == 16) {
            this.n = new String(this.f, this.g, this.m);
            this.g += this.m;
        } else {
            if (r0 != 8 && r0 != 9 && r0 != 10) {
                throw new IllegalStateException("Expected an int but was " + z() + o());
            }
            if (r0 == 10) {
                strW = y();
            } else {
                strW = w(r0 == 8 ? '\'' : '\"');
            }
            this.n = strW;
            try {
                int r03 = Integer.parseInt(this.n);
                this.k = 0;
                int[] r12 = this.r;
                int r42 = this.p - 1;
                r12[r42] = r12[r42] + 1;
                return r03;
            } catch (NumberFormatException unused) {
            }
        }
        this.k = 11;
        double d = Double.parseDouble(this.n);
        int r43 = (int) d;
        if (r43 != d) {
            throw new NumberFormatException("Expected an int but was " + this.n + o());
        }
        this.n = null;
        this.k = 0;
        int[] r04 = this.r;
        int r13 = this.p - 1;
        r04[r13] = r04[r13] + 1;
        return r43;
    }

    public long s() throws IOException, NumberFormatException {
        String strW;
        int r0 = this.k;
        if (r0 == 0) {
            r0 = g();
        }
        if (r0 == 15) {
            this.k = 0;
            int[] r02 = this.r;
            int r1 = this.p - 1;
            r02[r1] = r02[r1] + 1;
            return this.l;
        }
        if (r0 == 16) {
            this.n = new String(this.f, this.g, this.m);
            this.g += this.m;
        } else {
            if (r0 != 8 && r0 != 9 && r0 != 10) {
                throw new IllegalStateException("Expected a long but was " + z() + o());
            }
            if (r0 == 10) {
                strW = y();
            } else {
                strW = w(r0 == 8 ? '\'' : '\"');
            }
            this.n = strW;
            try {
                long j = Long.parseLong(this.n);
                this.k = 0;
                int[] r4 = this.r;
                int r5 = this.p - 1;
                r4[r5] = r4[r5] + 1;
                return j;
            } catch (NumberFormatException unused) {
            }
        }
        this.k = 11;
        double d = Double.parseDouble(this.n);
        long j2 = (long) d;
        if (j2 != d) {
            throw new NumberFormatException("Expected a long but was " + this.n + o());
        }
        this.n = null;
        this.k = 0;
        int[] r03 = this.r;
        int r12 = this.p - 1;
        r03[r12] = r03[r12] + 1;
        return j2;
    }

    public String t() throws IOException {
        char c2;
        String strW;
        int r0 = this.k;
        if (r0 == 0) {
            r0 = g();
        }
        if (r0 == 14) {
            strW = y();
        } else {
            if (r0 == 12) {
                c2 = '\'';
            } else {
                if (r0 != 13) {
                    throw new IllegalStateException("Expected a name but was " + z() + o());
                }
                c2 = '\"';
            }
            strW = w(c2);
        }
        this.k = 0;
        this.q[this.p - 1] = strW;
        return strW;
    }

    public String toString() {
        return getClass().getSimpleName() + o();
    }

    public void v() throws IOException {
        int r0 = this.k;
        if (r0 == 0) {
            r0 = g();
        }
        if (r0 == 7) {
            this.k = 0;
            int[] r02 = this.r;
            int r1 = this.p - 1;
            r02[r1] = r02[r1] + 1;
            return;
        }
        throw new IllegalStateException("Expected null but was " + z() + o());
    }

    public String x() throws IOException {
        String str;
        char c2;
        int r0 = this.k;
        if (r0 == 0) {
            r0 = g();
        }
        if (r0 == 10) {
            str = y();
        } else {
            if (r0 == 8) {
                c2 = '\'';
            } else if (r0 == 9) {
                c2 = '\"';
            } else if (r0 == 11) {
                str = this.n;
                this.n = null;
            } else if (r0 == 15) {
                str = Long.toString(this.l);
            } else {
                if (r0 != 16) {
                    throw new IllegalStateException("Expected a string but was " + z() + o());
                }
                str = new String(this.f, this.g, this.m);
                this.g += this.m;
            }
            str = w(c2);
        }
        this.k = 0;
        int[] r1 = this.r;
        int r2 = this.p - 1;
        r1[r2] = r1[r2] + 1;
        return str;
    }

    public c z() throws IOException {
        int r0 = this.k;
        if (r0 == 0) {
            r0 = g();
        }
        switch (r0) {
            case 1:
                return c.BEGIN_OBJECT;
            case 2:
                return c.END_OBJECT;
            case 3:
                return c.BEGIN_ARRAY;
            case 4:
                return c.END_ARRAY;
            case 5:
            case 6:
                return c.BOOLEAN;
            case 7:
                return c.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return c.STRING;
            case 12:
            case 13:
            case 14:
                return c.NAME;
            case 15:
            case 16:
                return c.NUMBER;
            case 17:
                return c.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }
}
