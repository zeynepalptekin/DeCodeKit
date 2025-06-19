package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.l92;

/* loaded from: classes.dex */
public final class vu2 {

    public static final class a extends l92<a, C0188a> implements za2 {
        private static final a zzbvz;
        private static volatile kb2<a> zzel;

        /* renamed from: com.google.android.gms.internal.ads.vu2$a$a, reason: collision with other inner class name */
        public static final class C0188a extends l92.b<a, C0188a> implements za2 {
            private C0188a() {
                super(a.zzbvz);
            }

            /* synthetic */ C0188a(uu2 uu2Var) {
                this();
            }
        }

        public enum b implements r92 {
            UNKNOWN_EVENT_TYPE(0),
            AD_REQUEST(1),
            AD_LOADED(2),
            AD_IMPRESSION(5),
            AD_FIRST_CLICK(6),
            AD_SUBSEQUENT_CLICK(7),
            REQUEST_WILL_START(8),
            REQUEST_DID_END(9),
            REQUEST_WILL_UPDATE_SIGNALS(10),
            REQUEST_DID_UPDATE_SIGNALS(11),
            REQUEST_WILL_BUILD_URL(12),
            REQUEST_DID_BUILD_URL(13),
            REQUEST_WILL_MAKE_NETWORK_REQUEST(14),
            REQUEST_DID_RECEIVE_NETWORK_RESPONSE(15),
            REQUEST_WILL_PROCESS_RESPONSE(16),
            REQUEST_DID_PROCESS_RESPONSE(17),
            REQUEST_WILL_RENDER(18),
            REQUEST_DID_RENDER(19),
            AD_FAILED_TO_LOAD(3),
            AD_FAILED_TO_LOAD_NO_FILL(4),
            AD_FAILED_TO_LOAD_INVALID_REQUEST(100),
            AD_FAILED_TO_LOAD_NETWORK_ERROR(101),
            AD_FAILED_TO_LOAD_TIMEOUT(102),
            AD_FAILED_TO_LOAD_CANCELLED(103),
            AD_FAILED_TO_LOAD_NO_ERROR(104),
            AD_FAILED_TO_LOAD_NOT_FOUND(105),
            REQUEST_WILL_UPDATE_GMS_SIGNALS(1000),
            REQUEST_DID_UPDATE_GMS_SIGNALS(b.i.p.a0.d),
            REQUEST_FAILED_TO_UPDATE_GMS_SIGNALS(b.i.p.a0.e),
            REQUEST_FAILED_TO_BUILD_URL(b.i.p.a0.f),
            REQUEST_FAILED_TO_MAKE_NETWORK_REQUEST(b.i.p.a0.g),
            REQUEST_FAILED_TO_PROCESS_RESPONSE(1005),
            REQUEST_FAILED_TO_UPDATE_SIGNALS(b.i.p.a0.h),
            REQUEST_FAILED_TO_RENDER(b.i.p.a0.i),
            REQUEST_IS_PREFETCH(1100),
            REQUEST_SAVED_TO_CACHE(1101),
            REQUEST_LOADED_FROM_CACHE(1102),
            REQUEST_PREFETCH_INTERCEPTED(1103),
            REQUESTED_CACHE_KEY_FROM_SERVICE_SUCCEEDED(1104),
            REQUESTED_CACHE_KEY_FROM_SERVICE_FAILED(1105),
            NOTIFIED_CACHE_HIT_TO_SERVICE_SUCCEEDED(1106),
            NOTIFIED_CACHE_HIT_TO_SERVICE_FAILED(1107),
            REQUEST_FAILED_TO_LOAD_FROM_CACHE(1108),
            BANNER_SIZE_INVALID(10000),
            BANNER_SIZE_VALID(10001),
            ANDROID_WEBVIEW_CRASH(10002),
            OFFLINE_UPLOAD(10003),
            DELAY_PAGE_LOAD_CANCELLED_AD(10004);

            private static final q92<b> a0 = new wu2();
            private final int d;

            b(int r3) {
                this.d = r3;
            }

            @Override // com.google.android.gms.internal.ads.r92
            public final int h() {
                return this.d;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "<" + b.class.getName() + '@' + Integer.toHexString(System.identityHashCode(this)) + " number=" + this.d + " name=" + name() + '>';
            }
        }

        static {
            a aVar = new a();
            zzbvz = aVar;
            l92.w(a.class, aVar);
        }

        private a() {
        }

        @Override // com.google.android.gms.internal.ads.l92
        protected final Object t(int r1, Object obj, Object obj2) {
            uu2 uu2Var = null;
            switch (uu2.f5603a[r1 - 1]) {
                case 1:
                    return new a();
                case 2:
                    return new C0188a(uu2Var);
                case 3:
                    return l92.u(zzbvz, "\u0001\u0000", null);
                case 4:
                    return zzbvz;
                case 5:
                    kb2<a> aVar = zzel;
                    if (aVar == null) {
                        synchronized (a.class) {
                            aVar = zzel;
                            if (aVar == null) {
                                aVar = new l92.a<>(zzbvz);
                                zzel = aVar;
                            }
                        }
                    }
                    return aVar;
                case 6:
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }
}
