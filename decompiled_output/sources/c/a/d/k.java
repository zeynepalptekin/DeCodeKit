package c.a.d;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.h0;
import androidx.annotation.i0;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.internal.w;
import com.google.android.gms.common.util.b0;

/* loaded from: classes.dex */
public final class k {
    private static final String h = "google_api_key";
    private static final String i = "google_app_id";
    private static final String j = "firebase_database_url";
    private static final String k = "ga_trackingId";
    private static final String l = "gcm_defaultSenderId";
    private static final String m = "google_storage_bucket";
    private static final String n = "project_id";

    /* renamed from: a, reason: collision with root package name */
    private final String f2182a;

    /* renamed from: b, reason: collision with root package name */
    private final String f2183b;

    /* renamed from: c, reason: collision with root package name */
    private final String f2184c;
    private final String d;
    private final String e;
    private final String f;
    private final String g;

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private String f2185a;

        /* renamed from: b, reason: collision with root package name */
        private String f2186b;

        /* renamed from: c, reason: collision with root package name */
        private String f2187c;
        private String d;
        private String e;
        private String f;
        private String g;

        public b() {
        }

        public b(@h0 k kVar) {
            this.f2186b = kVar.f2183b;
            this.f2185a = kVar.f2182a;
            this.f2187c = kVar.f2184c;
            this.d = kVar.d;
            this.e = kVar.e;
            this.f = kVar.f;
            this.g = kVar.g;
        }

        @h0
        public k a() {
            return new k(this.f2186b, this.f2185a, this.f2187c, this.d, this.e, this.f, this.g);
        }

        @h0
        public b b(@h0 String str) {
            this.f2185a = r.h(str, "ApiKey must be set.");
            return this;
        }

        @h0
        public b c(@h0 String str) {
            this.f2186b = r.h(str, "ApplicationId must be set.");
            return this;
        }

        @h0
        public b d(@i0 String str) {
            this.f2187c = str;
            return this;
        }

        @h0
        @com.google.android.gms.common.annotation.a
        public b e(@i0 String str) {
            this.d = str;
            return this;
        }

        @h0
        public b f(@i0 String str) {
            this.e = str;
            return this;
        }

        @h0
        public b g(@i0 String str) {
            this.g = str;
            return this;
        }

        @h0
        public b h(@i0 String str) {
            this.f = str;
            return this;
        }
    }

    private k(@h0 String str, @h0 String str2, @i0 String str3, @i0 String str4, @i0 String str5, @i0 String str6, @i0 String str7) {
        r.r(!b0.b(str), "ApplicationId must be set.");
        this.f2183b = str;
        this.f2182a = str2;
        this.f2184c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
    }

    @i0
    public static k h(@h0 Context context) {
        w wVar = new w(context);
        String strA = wVar.a(i);
        if (TextUtils.isEmpty(strA)) {
            return null;
        }
        return new k(strA, wVar.a(h), wVar.a(j), wVar.a(k), wVar.a(l), wVar.a(m), wVar.a(n));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return q.b(this.f2183b, kVar.f2183b) && q.b(this.f2182a, kVar.f2182a) && q.b(this.f2184c, kVar.f2184c) && q.b(this.d, kVar.d) && q.b(this.e, kVar.e) && q.b(this.f, kVar.f) && q.b(this.g, kVar.g);
    }

    public int hashCode() {
        return q.c(this.f2183b, this.f2182a, this.f2184c, this.d, this.e, this.f, this.g);
    }

    @h0
    public String i() {
        return this.f2182a;
    }

    @h0
    public String j() {
        return this.f2183b;
    }

    @i0
    public String k() {
        return this.f2184c;
    }

    @i0
    @com.google.android.gms.common.annotation.a
    public String l() {
        return this.d;
    }

    @i0
    public String m() {
        return this.e;
    }

    @i0
    public String n() {
        return this.g;
    }

    @i0
    public String o() {
        return this.f;
    }

    public String toString() {
        return q.d(this).a("applicationId", this.f2183b).a("apiKey", this.f2182a).a("databaseUrl", this.f2184c).a("gcmSenderId", this.e).a("storageBucket", this.f).a("projectId", this.g).toString();
    }
}
