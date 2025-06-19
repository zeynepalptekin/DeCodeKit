package com.google.android.gms.ads;

import com.google.android.gms.internal.ads.tr;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.annotation.Nullable;

/* loaded from: classes.dex */
public class x {
    public static final int e = -1;
    public static final int f = 0;
    public static final int g = 1;
    public static final int h = 1;
    public static final int i = 0;
    public static final int j = -1;
    public static final String k = "";
    public static final String l = "G";
    public static final String m = "PG";
    public static final String n = "T";
    public static final String o = "MA";
    public static final List<String> p = Arrays.asList("MA", "T", "PG", "G");

    /* renamed from: a, reason: collision with root package name */
    private final int f2485a;

    /* renamed from: b, reason: collision with root package name */
    private final int f2486b;

    /* renamed from: c, reason: collision with root package name */
    private final String f2487c;
    private final List<String> d;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private int f2488a = -1;

        /* renamed from: b, reason: collision with root package name */
        private int f2489b = -1;

        /* renamed from: c, reason: collision with root package name */
        private String f2490c = null;
        private final List<String> d = new ArrayList();

        public x a() {
            return new x(this.f2488a, this.f2489b, this.f2490c, this.d);
        }

        public a b(String str) {
            if (str != null && !"".equals(str)) {
                if (!"G".equals(str) && !"PG".equals(str) && !"T".equals(str) && !"MA".equals(str)) {
                    String strValueOf = String.valueOf(str);
                    tr.i(strValueOf.length() != 0 ? "Invalid value passed to setMaxAdContentRating: ".concat(strValueOf) : new String("Invalid value passed to setMaxAdContentRating: "));
                }
                return this;
            }
            str = null;
            this.f2490c = str;
            return this;
        }

        public a c(int r3) {
            if (r3 == -1 || r3 == 0 || r3 == 1) {
                this.f2488a = r3;
            } else {
                StringBuilder sb = new StringBuilder(68);
                sb.append("Invalid value passed to setTagForChildDirectedTreatment: ");
                sb.append(r3);
                tr.i(sb.toString());
            }
            return this;
        }

        public a d(int r3) {
            if (r3 == -1 || r3 == 0 || r3 == 1) {
                this.f2489b = r3;
            } else {
                StringBuilder sb = new StringBuilder(63);
                sb.append("Invalid value passed to setTagForUnderAgeOfConsent: ");
                sb.append(r3);
                tr.i(sb.toString());
            }
            return this;
        }

        public a e(@Nullable List<String> list) {
            this.d.clear();
            if (list != null) {
                this.d.addAll(list);
            }
            return this;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface c {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface d {
    }

    private x(int r1, int r2, String str, List<String> list) {
        this.f2485a = r1;
        this.f2486b = r2;
        this.f2487c = str;
        this.d = list;
    }

    public String a() {
        String str = this.f2487c;
        return str == null ? "" : str;
    }

    public int b() {
        return this.f2485a;
    }

    public int c() {
        return this.f2486b;
    }

    public List<String> d() {
        return new ArrayList(this.d);
    }

    public a e() {
        return new a().c(this.f2485a).d(this.f2486b).b(this.f2487c).e(this.d);
    }
}
