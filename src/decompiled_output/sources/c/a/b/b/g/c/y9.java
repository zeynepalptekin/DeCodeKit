package c.a.b.b.g.c;

/* loaded from: classes.dex */
final class y9 {
    static String a(y5 y5Var) {
        String str;
        ba baVar = new ba(y5Var);
        StringBuilder sb = new StringBuilder(baVar.a());
        for (int r1 = 0; r1 < baVar.a(); r1++) {
            int r2 = baVar.e(r1);
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
