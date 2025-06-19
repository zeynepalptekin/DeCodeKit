package c.a.e;

import java.lang.reflect.Field;
import java.util.Locale;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public abstract class d implements c.a.e.e {
    public static final d d = new a("IDENTITY", 0);
    public static final d e = new d("UPPER_CAMEL_CASE", 1) { // from class: c.a.e.d.b
        {
            a aVar = null;
        }

        @Override // c.a.e.e
        public String e(Field field) {
            return d.j(field.getName());
        }
    };
    public static final d f = new d("UPPER_CAMEL_CASE_WITH_SPACES", 2) { // from class: c.a.e.d.c
        {
            a aVar = null;
        }

        @Override // c.a.e.e
        public String e(Field field) {
            return d.j(d.i(field.getName(), " "));
        }
    };
    public static final d g = new d("LOWER_CASE_WITH_UNDERSCORES", 3) { // from class: c.a.e.d.d
        {
            a aVar = null;
        }

        @Override // c.a.e.e
        public String e(Field field) {
            return d.i(field.getName(), "_").toLowerCase(Locale.ENGLISH);
        }
    };
    public static final d h = new d("LOWER_CASE_WITH_DASHES", 4) { // from class: c.a.e.d.e
        {
            a aVar = null;
        }

        @Override // c.a.e.e
        public String e(Field field) {
            return d.i(field.getName(), "-").toLowerCase(Locale.ENGLISH);
        }
    };
    public static final d i;
    private static final /* synthetic */ d[] j;

    enum a extends d {
        a(String str, int r3) {
            super(str, r3, null);
        }

        @Override // c.a.e.e
        public String e(Field field) {
            return field.getName();
        }
    }

    static {
        d dVar = new d("LOWER_CASE_WITH_DOTS", 5) { // from class: c.a.e.d.f
            {
                a aVar = null;
            }

            @Override // c.a.e.e
            public String e(Field field) {
                return d.i(field.getName(), ".").toLowerCase(Locale.ENGLISH);
            }
        };
        i = dVar;
        j = new d[]{d, e, f, g, h, dVar};
    }

    private d(String str, int r2) {
    }

    /* synthetic */ d(String str, int r2, a aVar) {
        this(str, r2);
    }

    private static String g(char c2, String str, int r3) {
        if (r3 >= str.length()) {
            return String.valueOf(c2);
        }
        return c2 + str.substring(r3);
    }

    static String i(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int r2 = 0; r2 < length; r2++) {
            char cCharAt = str.charAt(r2);
            if (Character.isUpperCase(cCharAt) && sb.length() != 0) {
                sb.append(str2);
            }
            sb.append(cCharAt);
        }
        return sb.toString();
    }

    static String j(String str) {
        StringBuilder sb = new StringBuilder();
        int r1 = 0;
        char cCharAt = str.charAt(0);
        int length = str.length();
        while (r1 < length - 1 && !Character.isLetter(cCharAt)) {
            sb.append(cCharAt);
            r1++;
            cCharAt = str.charAt(r1);
        }
        if (Character.isUpperCase(cCharAt)) {
            return str;
        }
        sb.append(g(Character.toUpperCase(cCharAt), str, r1 + 1));
        return sb.toString();
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) j.clone();
    }
}
