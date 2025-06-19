package c.a.a;

@Deprecated
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final String f1582a = "0.0.0";

    /* renamed from: b, reason: collision with root package name */
    public static final String f1583b = "Ads";

    /* renamed from: c, reason: collision with root package name */
    public static final String f1584c = "B3EEABB8EE11C2BE770B684D95219ECB";

    /* renamed from: c.a.a.a$a, reason: collision with other inner class name */
    public enum EnumC0118a {
        INVALID_REQUEST("Invalid Ad request."),
        NO_FILL("Ad request successful, but no ad returned due to lack of ad inventory."),
        NETWORK_ERROR("A network error occurred."),
        INTERNAL_ERROR("There was an internal error.");

        private final String d;

        EnumC0118a(String str) {
            this.d = str;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return this.d;
        }
    }

    public enum b {
        UNKNOWN,
        MALE,
        FEMALE
    }

    private a() {
    }
}
