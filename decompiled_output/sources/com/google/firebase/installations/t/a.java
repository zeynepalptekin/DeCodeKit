package com.google.firebase.installations.t;

import androidx.annotation.h0;
import androidx.annotation.i0;
import com.google.firebase.installations.t.c;
import com.google.firebase.installations.t.d;

/* loaded from: classes.dex */
final class a extends d {

    /* renamed from: b, reason: collision with root package name */
    private final String f6978b;

    /* renamed from: c, reason: collision with root package name */
    private final c.a f6979c;
    private final String d;
    private final String e;
    private final long f;
    private final long g;
    private final String h;

    static final class b extends d.a {

        /* renamed from: a, reason: collision with root package name */
        private String f6980a;

        /* renamed from: b, reason: collision with root package name */
        private c.a f6981b;

        /* renamed from: c, reason: collision with root package name */
        private String f6982c;
        private String d;
        private Long e;
        private Long f;
        private String g;

        b() {
        }

        private b(d dVar) {
            this.f6980a = dVar.d();
            this.f6981b = dVar.g();
            this.f6982c = dVar.b();
            this.d = dVar.f();
            this.e = Long.valueOf(dVar.c());
            this.f = Long.valueOf(dVar.h());
            this.g = dVar.e();
        }

        @Override // com.google.firebase.installations.t.d.a
        public d a() {
            String str = "";
            if (this.f6981b == null) {
                str = " registrationStatus";
            }
            if (this.e == null) {
                str = str + " expiresInSecs";
            }
            if (this.f == null) {
                str = str + " tokenCreationEpochInSecs";
            }
            if (str.isEmpty()) {
                return new a(this.f6980a, this.f6981b, this.f6982c, this.d, this.e.longValue(), this.f.longValue(), this.g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.installations.t.d.a
        public d.a b(@i0 String str) {
            this.f6982c = str;
            return this;
        }

        @Override // com.google.firebase.installations.t.d.a
        public d.a c(long j) {
            this.e = Long.valueOf(j);
            return this;
        }

        @Override // com.google.firebase.installations.t.d.a
        public d.a d(String str) {
            this.f6980a = str;
            return this;
        }

        @Override // com.google.firebase.installations.t.d.a
        public d.a e(@i0 String str) {
            this.g = str;
            return this;
        }

        @Override // com.google.firebase.installations.t.d.a
        public d.a f(@i0 String str) {
            this.d = str;
            return this;
        }

        @Override // com.google.firebase.installations.t.d.a
        public d.a g(c.a aVar) {
            if (aVar == null) {
                throw new NullPointerException("Null registrationStatus");
            }
            this.f6981b = aVar;
            return this;
        }

        @Override // com.google.firebase.installations.t.d.a
        public d.a h(long j) {
            this.f = Long.valueOf(j);
            return this;
        }
    }

    private a(@i0 String str, c.a aVar, @i0 String str2, @i0 String str3, long j, long j2, @i0 String str4) {
        this.f6978b = str;
        this.f6979c = aVar;
        this.d = str2;
        this.e = str3;
        this.f = j;
        this.g = j2;
        this.h = str4;
    }

    @Override // com.google.firebase.installations.t.d
    @i0
    public String b() {
        return this.d;
    }

    @Override // com.google.firebase.installations.t.d
    public long c() {
        return this.f;
    }

    @Override // com.google.firebase.installations.t.d
    @i0
    public String d() {
        return this.f6978b;
    }

    @Override // com.google.firebase.installations.t.d
    @i0
    public String e() {
        return this.h;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        String str3 = this.f6978b;
        if (str3 != null ? str3.equals(dVar.d()) : dVar.d() == null) {
            if (this.f6979c.equals(dVar.g()) && ((str = this.d) != null ? str.equals(dVar.b()) : dVar.b() == null) && ((str2 = this.e) != null ? str2.equals(dVar.f()) : dVar.f() == null) && this.f == dVar.c() && this.g == dVar.h()) {
                String str4 = this.h;
                String strE = dVar.e();
                if (str4 == null) {
                    if (strE == null) {
                        return true;
                    }
                } else if (str4.equals(strE)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.firebase.installations.t.d
    @i0
    public String f() {
        return this.e;
    }

    @Override // com.google.firebase.installations.t.d
    @h0
    public c.a g() {
        return this.f6979c;
    }

    @Override // com.google.firebase.installations.t.d
    public long h() {
        return this.g;
    }

    public int hashCode() {
        String str = this.f6978b;
        int r0 = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.f6979c.hashCode()) * 1000003;
        String str2 = this.d;
        int r02 = (r0 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.e;
        int r03 = (r02 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        long j = this.f;
        int r04 = (r03 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.g;
        int r05 = (r04 ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        String str4 = this.h;
        return r05 ^ (str4 != null ? str4.hashCode() : 0);
    }

    @Override // com.google.firebase.installations.t.d
    public d.a n() {
        return new b(this);
    }

    public String toString() {
        return "PersistedInstallationEntry{firebaseInstallationId=" + this.f6978b + ", registrationStatus=" + this.f6979c + ", authToken=" + this.d + ", refreshToken=" + this.e + ", expiresInSecs=" + this.f + ", tokenCreationEpochInSecs=" + this.g + ", fisError=" + this.h + "}";
    }
}
