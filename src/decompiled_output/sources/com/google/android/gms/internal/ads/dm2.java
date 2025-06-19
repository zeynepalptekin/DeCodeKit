package com.google.android.gms.internal.ads;

import android.util.Log;
import com.google.android.gms.internal.ads.wm2;

/* loaded from: classes.dex */
final class dm2 {

    /* renamed from: a, reason: collision with root package name */
    private static final int f3141a = nq2.l("nam");

    /* renamed from: b, reason: collision with root package name */
    private static final int f3142b = nq2.l("trk");

    /* renamed from: c, reason: collision with root package name */
    private static final int f3143c = nq2.l("cmt");
    private static final int d = nq2.l("day");
    private static final int e = nq2.l("ART");
    private static final int f = nq2.l("too");
    private static final int g = nq2.l("alb");
    private static final int h = nq2.l("com");
    private static final int i = nq2.l("wrt");
    private static final int j = nq2.l("lyr");
    private static final int k = nq2.l("gen");
    private static final int l = nq2.l("covr");
    private static final int m = nq2.l("gnre");
    private static final int n = nq2.l("grp");
    private static final int o = nq2.l("disk");
    private static final int p = nq2.l("trkn");
    private static final int q = nq2.l("tmpo");
    private static final int r = nq2.l("cpil");
    private static final int s = nq2.l("aART");
    private static final int t = nq2.l("sonm");
    private static final int u = nq2.l("soal");
    private static final int v = nq2.l("soar");
    private static final int w = nq2.l("soaa");
    private static final int x = nq2.l("soco");
    private static final int y = nq2.l("rtng");
    private static final int z = nq2.l("pgap");
    private static final int A = nq2.l("sosn");
    private static final int B = nq2.l("tvsh");
    private static final int C = nq2.l("----");
    private static final String[] D = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Negerpunk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop"};

    private static dn2 a(int r0, String str, hq2 hq2Var, boolean z2, boolean z3) {
        int r2 = e(hq2Var);
        if (z3) {
            r2 = Math.min(1, r2);
        }
        if (r2 >= 0) {
            return z2 ? new gn2(str, null, Integer.toString(r2)) : new cn2("und", str, Integer.toString(r2));
        }
        String strValueOf = String.valueOf(jl2.c(r0));
        Log.w("MetadataUtil", strValueOf.length() != 0 ? "Failed to parse uint8 attribute: ".concat(strValueOf) : new String("Failed to parse uint8 attribute: "));
        return null;
    }

    private static gn2 b(int r4, String str, hq2 hq2Var) {
        int r0 = hq2Var.d();
        if (hq2Var.d() == jl2.G0) {
            hq2Var.m(8);
            return new gn2(str, null, hq2Var.n(r0 - 16));
        }
        String strValueOf = String.valueOf(jl2.c(r4));
        Log.w("MetadataUtil", strValueOf.length() != 0 ? "Failed to parse text attribute: ".concat(strValueOf) : new String("Failed to parse text attribute: "));
        return null;
    }

    private static gn2 c(int r4, String str, hq2 hq2Var) {
        int r0 = hq2Var.d();
        if (hq2Var.d() == jl2.G0 && r0 >= 22) {
            hq2Var.m(10);
            int r02 = hq2Var.h();
            if (r02 > 0) {
                StringBuilder sb = new StringBuilder(11);
                sb.append(r02);
                String string = sb.toString();
                int r6 = hq2Var.h();
                if (r6 > 0) {
                    String strValueOf = String.valueOf(string);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(strValueOf).length() + 12);
                    sb2.append(strValueOf);
                    sb2.append("/");
                    sb2.append(r6);
                    string = sb2.toString();
                }
                return new gn2(str, null, string);
            }
        }
        String strValueOf2 = String.valueOf(jl2.c(r4));
        Log.w("MetadataUtil", strValueOf2.length() != 0 ? "Failed to parse index/count attribute: ".concat(strValueOf2) : new String("Failed to parse index/count attribute: "));
        return null;
    }

    public static wm2.a d(hq2 hq2Var) {
        String string;
        int r0 = hq2Var.b() + hq2Var.d();
        int r1 = hq2Var.d();
        int r2 = r1 >>> 24;
        wm2.a cn2Var = null;
        try {
            if (r2 == 169 || r2 == 65533) {
                int r22 = 16777215 & r1;
                if (r22 == f3143c) {
                    int r23 = hq2Var.d();
                    if (hq2Var.d() == jl2.G0) {
                        hq2Var.m(8);
                        String strN = hq2Var.n(r23 - 16);
                        cn2Var = new cn2("und", strN, strN);
                    } else {
                        String strValueOf = String.valueOf(jl2.c(r1));
                        Log.w("MetadataUtil", strValueOf.length() != 0 ? "Failed to parse comment attribute: ".concat(strValueOf) : new String("Failed to parse comment attribute: "));
                    }
                    return cn2Var;
                }
                if (r22 != f3141a && r22 != f3142b) {
                    if (r22 != h && r22 != i) {
                        if (r22 == d) {
                            return b(r1, "TDRC", hq2Var);
                        }
                        if (r22 == e) {
                            return b(r1, "TPE1", hq2Var);
                        }
                        if (r22 == f) {
                            return b(r1, "TSSE", hq2Var);
                        }
                        if (r22 == g) {
                            return b(r1, "TALB", hq2Var);
                        }
                        if (r22 == j) {
                            return b(r1, "USLT", hq2Var);
                        }
                        if (r22 == k) {
                            return b(r1, "TCON", hq2Var);
                        }
                        if (r22 == n) {
                            return b(r1, "TIT1", hq2Var);
                        }
                    }
                    return b(r1, "TCOM", hq2Var);
                }
                return b(r1, "TIT2", hq2Var);
            }
            if (r1 == m) {
                int r12 = e(hq2Var);
                String str = (r12 <= 0 || r12 > D.length) ? null : D[r12 - 1];
                if (str != null) {
                    cn2Var = new gn2("TCON", null, str);
                } else {
                    Log.w("MetadataUtil", "Failed to parse standard genre code");
                }
                return cn2Var;
            }
            if (r1 == o) {
                return c(r1, "TPOS", hq2Var);
            }
            if (r1 == p) {
                return c(r1, "TRCK", hq2Var);
            }
            if (r1 == q) {
                return a(r1, "TBPM", hq2Var, true, false);
            }
            if (r1 == r) {
                return a(r1, "TCMP", hq2Var, true, true);
            }
            if (r1 == l) {
                int r13 = hq2Var.d();
                if (hq2Var.d() == jl2.G0) {
                    int r24 = jl2.b(hq2Var.d());
                    String str2 = r24 == 13 ? "image/jpeg" : r24 == 14 ? "image/png" : null;
                    if (str2 != null) {
                        hq2Var.m(4);
                        int r14 = r13 - 16;
                        byte[] bArr = new byte[r14];
                        hq2Var.p(bArr, 0, r14);
                        cn2Var = new an2(str2, null, 3, bArr);
                        return cn2Var;
                    }
                    StringBuilder sb = new StringBuilder(41);
                    sb.append("Unrecognized cover art flags: ");
                    sb.append(r24);
                    string = sb.toString();
                } else {
                    string = "Failed to parse cover art attribute";
                }
                Log.w("MetadataUtil", string);
                return cn2Var;
            }
            if (r1 == s) {
                return b(r1, "TPE2", hq2Var);
            }
            if (r1 == t) {
                return b(r1, "TSOT", hq2Var);
            }
            if (r1 == u) {
                return b(r1, "TSO2", hq2Var);
            }
            if (r1 == v) {
                return b(r1, "TSOA", hq2Var);
            }
            if (r1 == w) {
                return b(r1, "TSOP", hq2Var);
            }
            if (r1 == x) {
                return b(r1, "TSOC", hq2Var);
            }
            if (r1 == y) {
                return a(r1, "ITUNESADVISORY", hq2Var, false, false);
            }
            if (r1 == z) {
                return a(r1, "ITUNESGAPLESS", hq2Var, false, true);
            }
            if (r1 == A) {
                return b(r1, "TVSHOWSORT", hq2Var);
            }
            if (r1 == B) {
                return b(r1, "TVSHOW", hq2Var);
            }
            if (r1 == C) {
                String strN2 = null;
                String strN3 = null;
                int r5 = -1;
                int r7 = -1;
                while (hq2Var.b() < r0) {
                    int r10 = hq2Var.b();
                    int r11 = hq2Var.d();
                    int r122 = hq2Var.d();
                    hq2Var.m(4);
                    if (r122 == jl2.E0) {
                        strN2 = hq2Var.n(r11 - 12);
                    } else if (r122 == jl2.F0) {
                        strN3 = hq2Var.n(r11 - 12);
                    } else {
                        if (r122 == jl2.G0) {
                            r5 = r10;
                            r7 = r11;
                        }
                        hq2Var.m(r11 - 12);
                    }
                }
                if ("com.apple.iTunes".equals(strN2) && "iTunSMPB".equals(strN3) && r5 != -1) {
                    hq2Var.l(r5);
                    hq2Var.m(16);
                    cn2Var = new cn2("und", strN3, hq2Var.n(r7 - 16));
                }
                return cn2Var;
            }
            String strValueOf2 = String.valueOf(jl2.c(r1));
            Log.d("MetadataUtil", strValueOf2.length() != 0 ? "Skipped unknown metadata entry: ".concat(strValueOf2) : new String("Skipped unknown metadata entry: "));
            return null;
        } finally {
            hq2Var.l(r0);
        }
    }

    private static int e(hq2 hq2Var) {
        hq2Var.m(4);
        if (hq2Var.d() == jl2.G0) {
            hq2Var.m(8);
            return hq2Var.g();
        }
        Log.w("MetadataUtil", "Failed to parse uint8 attribute value");
        return -1;
    }
}
