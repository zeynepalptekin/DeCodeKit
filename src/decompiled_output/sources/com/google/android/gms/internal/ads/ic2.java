package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class ic2 {
    static String a(a82 a82Var) {
        String str;
        lc2 lc2Var = new lc2(a82Var);
        StringBuilder sb = new StringBuilder(lc2Var.size());
        for (int r1 = 0; r1 < lc2Var.size(); r1++) {
            int r2 = lc2Var.a(r1);
            if (r2 == 34) {
                str = "\\\"";
            } else if (r2 == 39) {
                str = "\\'";
            } else if (r2 != 92) {
                switch (r2) {
                    case 7:
                        str = "\\a";
                        break;
                    case 8:
                        str = "\\b";
                        break;
                    case 9:
                        str = "\\t";
                        break;
                    case 10:
                        str = "\\n";
                        break;
                    case 11:
                        str = "\\v";
                        break;
                    case 12:
                        str = "\\f";
                        break;
                    case 13:
                        str = "\\r";
                        break;
                    default:
                        if (r2 < 32 || r2 > 126) {
                            sb.append('\\');
                            sb.append((char) (((r2 >>> 6) & 3) + 48));
                            sb.append((char) (((r2 >>> 3) & 7) + 48));
                            r2 = (r2 & 7) + 48;
                        }
                        sb.append((char) r2);
                        continue;
                        break;
                }
            } else {
                str = "\\\\";
            }
            sb.append(str);
        }
        return sb.toString();
    }
}
