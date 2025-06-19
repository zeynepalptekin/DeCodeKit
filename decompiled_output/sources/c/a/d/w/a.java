package c.a.d.w;

import javax.annotation.Nonnull;

/* loaded from: classes.dex */
final class a extends f {

    /* renamed from: a, reason: collision with root package name */
    private final String f2198a;

    /* renamed from: b, reason: collision with root package name */
    private final String f2199b;

    a(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("Null libraryName");
        }
        this.f2198a = str;
        if (str2 == null) {
            throw new NullPointerException("Null version");
        }
        this.f2199b = str2;
    }

    @Override // c.a.d.w.f
    @Nonnull
    public String b() {
        return this.f2198a;
    }

    @Override // c.a.d.w.f
    @Nonnull
    public String c() {
        return this.f2199b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f2198a.equals(fVar.b()) && this.f2199b.equals(fVar.c());
    }

    public int hashCode() {
        return ((this.f2198a.hashCode() ^ 1000003) * 1000003) ^ this.f2199b.hashCode();
    }

    public String toString() {
        return "LibraryVersion{libraryName=" + this.f2198a + ", version=" + this.f2199b + "}";
    }
}
