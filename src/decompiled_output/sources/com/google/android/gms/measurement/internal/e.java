package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: c, reason: collision with root package name */
    public static final e f6371c = new e(null, null);

    /* renamed from: a, reason: collision with root package name */
    private final Boolean f6372a;

    /* renamed from: b, reason: collision with root package name */
    private final Boolean f6373b;

    public e(Boolean bool, Boolean bool2) {
        this.f6372a = bool;
        this.f6373b = bool2;
    }

    private static int a(Boolean bool) {
        if (bool == null) {
            return 0;
        }
        return bool.booleanValue() ? 1 : 2;
    }

    public static e b(String str) {
        Boolean boolC;
        if (str != null) {
            Boolean boolC2 = str.length() >= 3 ? c(str.charAt(2)) : null;
            boolC = str.length() >= 4 ? c(str.charAt(3)) : null;
            bool = boolC2;
        } else {
            boolC = null;
        }
        return new e(bool, boolC);
    }

    private static Boolean c(char c2) {
        if (c2 == '0') {
            return Boolean.FALSE;
        }
        if (c2 != '1') {
            return null;
        }
        return Boolean.TRUE;
    }

    private static Boolean d(Boolean bool, Boolean bool2) {
        if (bool == null) {
            return bool2;
        }
        if (bool2 == null) {
            return bool;
        }
        return Boolean.valueOf(bool.booleanValue() && bool2.booleanValue());
    }

    public static String f(Bundle bundle) {
        String string = bundle.getString("ad_storage");
        if (string != null && m(string) == null) {
            return string;
        }
        String string2 = bundle.getString("analytics_storage");
        if (string2 == null || m(string2) != null) {
            return null;
        }
        return string2;
    }

    public static boolean g(int r0, int r1) {
        return r0 <= r1;
    }

    private static char i(Boolean bool) {
        if (bool == null) {
            return '-';
        }
        return bool.booleanValue() ? '1' : '0';
    }

    public static e j(Bundle bundle) {
        return bundle == null ? f6371c : new e(m(bundle.getString("ad_storage")), m(bundle.getString("analytics_storage")));
    }

    private static Boolean m(String str) {
        if (str == null) {
            return null;
        }
        if (str.equals("granted")) {
            return Boolean.TRUE;
        }
        if (str.equals("denied")) {
            return Boolean.FALSE;
        }
        return null;
    }

    public final String e() {
        return "G1" + i(this.f6372a) + i(this.f6373b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return a(this.f6372a) == a(eVar.f6372a) && a(this.f6373b) == a(eVar.f6373b);
    }

    public final boolean h(e eVar) {
        Boolean bool = this.f6372a;
        Boolean bool2 = Boolean.FALSE;
        if (bool == bool2 && eVar.f6372a != bool2) {
            return true;
        }
        Boolean bool3 = this.f6373b;
        Boolean bool4 = Boolean.FALSE;
        return bool3 == bool4 && eVar.f6373b != bool4;
    }

    public final int hashCode() {
        return ((a(this.f6372a) + 527) * 31) + a(this.f6373b);
    }

    public final e k(e eVar) {
        return new e(d(this.f6372a, eVar.f6372a), d(this.f6373b, eVar.f6373b));
    }

    public final Boolean l() {
        return this.f6372a;
    }

    public final e n(e eVar) {
        Boolean bool = this.f6372a;
        if (bool == null) {
            bool = eVar.f6372a;
        }
        Boolean bool2 = this.f6373b;
        if (bool2 == null) {
            bool2 = eVar.f6373b;
        }
        return new e(bool, bool2);
    }

    public final boolean o() {
        Boolean bool = this.f6372a;
        return bool == null || bool.booleanValue();
    }

    public final Boolean p() {
        return this.f6373b;
    }

    public final boolean q() {
        Boolean bool = this.f6373b;
        return bool == null || bool.booleanValue();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ConsentSettings: ");
        sb.append("adStorage=");
        Boolean bool = this.f6372a;
        if (bool == null) {
            sb.append("uninitialized");
        } else {
            sb.append(bool.booleanValue() ? "granted" : "denied");
        }
        sb.append(", analyticsStorage=");
        Boolean bool2 = this.f6373b;
        if (bool2 == null) {
            sb.append("uninitialized");
        } else {
            sb.append(bool2.booleanValue() ? "granted" : "denied");
        }
        return sb.toString();
    }
}
