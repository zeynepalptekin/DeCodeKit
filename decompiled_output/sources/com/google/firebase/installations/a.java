package com.google.firebase.installations;

import androidx.annotation.h0;
import com.google.firebase.installations.n;

/* loaded from: classes.dex */
final class a extends n {

    /* renamed from: a, reason: collision with root package name */
    private final String f6946a;

    /* renamed from: b, reason: collision with root package name */
    private final long f6947b;

    /* renamed from: c, reason: collision with root package name */
    private final long f6948c;

    static final class b extends n.a {

        /* renamed from: a, reason: collision with root package name */
        private String f6949a;

        /* renamed from: b, reason: collision with root package name */
        private Long f6950b;

        /* renamed from: c, reason: collision with root package name */
        private Long f6951c;

        b() {
        }

        private b(n nVar) {
            this.f6949a = nVar.b();
            this.f6950b = Long.valueOf(nVar.d());
            this.f6951c = Long.valueOf(nVar.c());
        }

        @Override // com.google.firebase.installations.n.a
        public n a() {
            String str = "";
            if (this.f6949a == null) {
                str = " token";
            }
            if (this.f6950b == null) {
                str = str + " tokenExpirationTimestamp";
            }
            if (this.f6951c == null) {
                str = str + " tokenCreationTimestamp";
            }
            if (str.isEmpty()) {
                return new a(this.f6949a, this.f6950b.longValue(), this.f6951c.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.installations.n.a
        public n.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null token");
            }
            this.f6949a = str;
            return this;
        }

        @Override // com.google.firebase.installations.n.a
        public n.a c(long j) {
            this.f6951c = Long.valueOf(j);
            return this;
        }

        @Override // com.google.firebase.installations.n.a
        public n.a d(long j) {
            this.f6950b = Long.valueOf(j);
            return this;
        }
    }

    private a(String str, long j, long j2) {
        this.f6946a = str;
        this.f6947b = j;
        this.f6948c = j2;
    }

    @Override // com.google.firebase.installations.n
    @h0
    public String b() {
        return this.f6946a;
    }

    @Override // com.google.firebase.installations.n
    @h0
    public long c() {
        return this.f6948c;
    }

    @Override // com.google.firebase.installations.n
    @h0
    public long d() {
        return this.f6947b;
    }

    @Override // com.google.firebase.installations.n
    public n.a e() {
        return new b(this);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f6946a.equals(nVar.b()) && this.f6947b == nVar.d() && this.f6948c == nVar.c();
    }

    public int hashCode() {
        int r0 = (this.f6946a.hashCode() ^ 1000003) * 1000003;
        long j = this.f6947b;
        long j2 = this.f6948c;
        return ((r0 ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)));
    }

    public String toString() {
        return "InstallationTokenResult{token=" + this.f6946a + ", tokenExpirationTimestamp=" + this.f6947b + ", tokenCreationTimestamp=" + this.f6948c + "}";
    }
}
