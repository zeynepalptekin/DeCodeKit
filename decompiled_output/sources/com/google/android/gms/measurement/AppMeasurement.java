package com.google.android.gms.measurement;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.y0;
import c.a.b.b.g.c.f;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.common.internal.v;
import com.google.android.gms.common.util.d0;
import com.google.android.gms.measurement.c.a;
import com.google.android.gms.measurement.internal.a6;
import com.google.android.gms.measurement.internal.b5;
import com.google.android.gms.measurement.internal.b6;
import com.google.android.gms.measurement.internal.c6;
import com.google.android.gms.measurement.internal.ca;
import com.google.android.gms.measurement.internal.d6;
import com.google.android.gms.measurement.internal.e6;
import com.google.android.gms.measurement.internal.k7;
import com.google.android.gms.measurement.internal.q7;
import com.google.android.gms.measurement.internal.z5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@v
@com.google.android.gms.common.annotation.a
@Deprecated
/* loaded from: classes.dex */
public class AppMeasurement {

    @v
    @com.google.android.gms.common.annotation.a
    public static final String d = "crash";

    @v
    @com.google.android.gms.common.annotation.a
    public static final String e = "fcm";

    @v
    @com.google.android.gms.common.annotation.a
    public static final String f = "fiam";
    private static volatile AppMeasurement g;

    /* renamed from: a, reason: collision with root package name */
    private final b5 f6328a;

    /* renamed from: b, reason: collision with root package name */
    private final k7 f6329b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f6330c;

    @v
    @com.google.android.gms.common.annotation.a
    public static class ConditionalUserProperty {

        @Keep
        @v
        @com.google.android.gms.common.annotation.a
        public boolean mActive;

        @Keep
        @v
        @com.google.android.gms.common.annotation.a
        public String mAppId;

        @Keep
        @v
        @com.google.android.gms.common.annotation.a
        public long mCreationTimestamp;

        @Keep
        public String mExpiredEventName;

        @Keep
        public Bundle mExpiredEventParams;

        @Keep
        @v
        @com.google.android.gms.common.annotation.a
        public String mName;

        @Keep
        @v
        @com.google.android.gms.common.annotation.a
        public String mOrigin;

        @Keep
        @v
        @com.google.android.gms.common.annotation.a
        public long mTimeToLive;

        @Keep
        public String mTimedOutEventName;

        @Keep
        public Bundle mTimedOutEventParams;

        @Keep
        @v
        @com.google.android.gms.common.annotation.a
        public String mTriggerEventName;

        @Keep
        @v
        @com.google.android.gms.common.annotation.a
        public long mTriggerTimeout;

        @Keep
        public String mTriggeredEventName;

        @Keep
        public Bundle mTriggeredEventParams;

        @Keep
        @v
        @com.google.android.gms.common.annotation.a
        public long mTriggeredTimestamp;

        @Keep
        @v
        @com.google.android.gms.common.annotation.a
        public Object mValue;

        @com.google.android.gms.common.annotation.a
        public ConditionalUserProperty() {
        }

        @d0
        ConditionalUserProperty(@h0 Bundle bundle) {
            r.k(bundle);
            this.mAppId = (String) a6.a(bundle, "app_id", String.class, null);
            this.mOrigin = (String) a6.a(bundle, "origin", String.class, null);
            this.mName = (String) a6.a(bundle, a.C0190a.f6334b, String.class, null);
            this.mValue = a6.a(bundle, "value", Object.class, null);
            this.mTriggerEventName = (String) a6.a(bundle, a.C0190a.d, String.class, null);
            this.mTriggerTimeout = ((Long) a6.a(bundle, a.C0190a.e, Long.class, 0L)).longValue();
            this.mTimedOutEventName = (String) a6.a(bundle, a.C0190a.f, String.class, null);
            this.mTimedOutEventParams = (Bundle) a6.a(bundle, a.C0190a.g, Bundle.class, null);
            this.mTriggeredEventName = (String) a6.a(bundle, a.C0190a.h, String.class, null);
            this.mTriggeredEventParams = (Bundle) a6.a(bundle, a.C0190a.i, Bundle.class, null);
            this.mTimeToLive = ((Long) a6.a(bundle, a.C0190a.j, Long.class, 0L)).longValue();
            this.mExpiredEventName = (String) a6.a(bundle, a.C0190a.k, String.class, null);
            this.mExpiredEventParams = (Bundle) a6.a(bundle, a.C0190a.l, Bundle.class, null);
            this.mActive = ((Boolean) a6.a(bundle, a.C0190a.n, Boolean.class, Boolean.FALSE)).booleanValue();
            this.mCreationTimestamp = ((Long) a6.a(bundle, a.C0190a.m, Long.class, 0L)).longValue();
            this.mTriggeredTimestamp = ((Long) a6.a(bundle, a.C0190a.o, Long.class, 0L)).longValue();
        }

        @com.google.android.gms.common.annotation.a
        public ConditionalUserProperty(ConditionalUserProperty conditionalUserProperty) throws Throwable {
            r.k(conditionalUserProperty);
            this.mAppId = conditionalUserProperty.mAppId;
            this.mOrigin = conditionalUserProperty.mOrigin;
            this.mCreationTimestamp = conditionalUserProperty.mCreationTimestamp;
            this.mName = conditionalUserProperty.mName;
            Object obj = conditionalUserProperty.mValue;
            if (obj != null) {
                Object objA = q7.a(obj);
                this.mValue = objA;
                if (objA == null) {
                    this.mValue = conditionalUserProperty.mValue;
                }
            }
            this.mActive = conditionalUserProperty.mActive;
            this.mTriggerEventName = conditionalUserProperty.mTriggerEventName;
            this.mTriggerTimeout = conditionalUserProperty.mTriggerTimeout;
            this.mTimedOutEventName = conditionalUserProperty.mTimedOutEventName;
            if (conditionalUserProperty.mTimedOutEventParams != null) {
                this.mTimedOutEventParams = new Bundle(conditionalUserProperty.mTimedOutEventParams);
            }
            this.mTriggeredEventName = conditionalUserProperty.mTriggeredEventName;
            if (conditionalUserProperty.mTriggeredEventParams != null) {
                this.mTriggeredEventParams = new Bundle(conditionalUserProperty.mTriggeredEventParams);
            }
            this.mTriggeredTimestamp = conditionalUserProperty.mTriggeredTimestamp;
            this.mTimeToLive = conditionalUserProperty.mTimeToLive;
            this.mExpiredEventName = conditionalUserProperty.mExpiredEventName;
            if (conditionalUserProperty.mExpiredEventParams != null) {
                this.mExpiredEventParams = new Bundle(conditionalUserProperty.mExpiredEventParams);
            }
        }

        @d0
        final Bundle a() {
            Bundle bundle = new Bundle();
            String str = this.mAppId;
            if (str != null) {
                bundle.putString("app_id", str);
            }
            String str2 = this.mOrigin;
            if (str2 != null) {
                bundle.putString("origin", str2);
            }
            String str3 = this.mName;
            if (str3 != null) {
                bundle.putString(a.C0190a.f6334b, str3);
            }
            Object obj = this.mValue;
            if (obj != null) {
                a6.b(bundle, obj);
            }
            String str4 = this.mTriggerEventName;
            if (str4 != null) {
                bundle.putString(a.C0190a.d, str4);
            }
            bundle.putLong(a.C0190a.e, this.mTriggerTimeout);
            String str5 = this.mTimedOutEventName;
            if (str5 != null) {
                bundle.putString(a.C0190a.f, str5);
            }
            Bundle bundle2 = this.mTimedOutEventParams;
            if (bundle2 != null) {
                bundle.putBundle(a.C0190a.g, bundle2);
            }
            String str6 = this.mTriggeredEventName;
            if (str6 != null) {
                bundle.putString(a.C0190a.h, str6);
            }
            Bundle bundle3 = this.mTriggeredEventParams;
            if (bundle3 != null) {
                bundle.putBundle(a.C0190a.i, bundle3);
            }
            bundle.putLong(a.C0190a.j, this.mTimeToLive);
            String str7 = this.mExpiredEventName;
            if (str7 != null) {
                bundle.putString(a.C0190a.k, str7);
            }
            Bundle bundle4 = this.mExpiredEventParams;
            if (bundle4 != null) {
                bundle.putBundle(a.C0190a.l, bundle4);
            }
            bundle.putLong(a.C0190a.m, this.mCreationTimestamp);
            bundle.putBoolean(a.C0190a.n, this.mActive);
            bundle.putLong(a.C0190a.o, this.mTriggeredTimestamp);
            return bundle;
        }
    }

    @v
    @com.google.android.gms.common.annotation.a
    public static final class a extends z5 {

        @v
        @com.google.android.gms.common.annotation.a
        public static final String e = "_ae";

        @v
        @com.google.android.gms.common.annotation.a
        public static final String f = "_ar";

        private a() {
        }
    }

    @v
    @com.google.android.gms.common.annotation.a
    public interface b extends e6 {
        @Override // com.google.android.gms.measurement.internal.e6
        @y0
        @v
        @com.google.android.gms.common.annotation.a
        void a(String str, String str2, Bundle bundle, long j);
    }

    @v
    @com.google.android.gms.common.annotation.a
    public interface c extends d6 {
        @Override // com.google.android.gms.measurement.internal.d6
        @y0
        @v
        @com.google.android.gms.common.annotation.a
        void a(String str, String str2, Bundle bundle, long j);
    }

    @v
    @com.google.android.gms.common.annotation.a
    public static final class d extends c6 {

        @v
        @com.google.android.gms.common.annotation.a
        public static final String e = "fatal";

        @v
        @com.google.android.gms.common.annotation.a
        public static final String f = "timestamp";

        @v
        @com.google.android.gms.common.annotation.a
        public static final String g = "type";

        private d() {
        }
    }

    @v
    @com.google.android.gms.common.annotation.a
    public static final class e extends b6 {

        /* renamed from: c, reason: collision with root package name */
        @v
        @com.google.android.gms.common.annotation.a
        public static final String f6331c = "_ln";

        private e() {
        }
    }

    private AppMeasurement(b5 b5Var) {
        r.k(b5Var);
        this.f6328a = b5Var;
        this.f6329b = null;
        this.f6330c = false;
    }

    private AppMeasurement(k7 k7Var) {
        r.k(k7Var);
        this.f6329b = k7Var;
        this.f6328a = null;
        this.f6330c = true;
    }

    @Keep
    @v
    @com.google.android.gms.common.annotation.a
    @Deprecated
    @o0(allOf = {"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE", "android.permission.WAKE_LOCK"})
    public static AppMeasurement getInstance(Context context) {
        return m(context, null, null);
    }

    @d0
    private static AppMeasurement m(Context context, String str, String str2) {
        if (g == null) {
            synchronized (AppMeasurement.class) {
                if (g == null) {
                    k7 k7VarN = n(context, null);
                    if (k7VarN != null) {
                        g = new AppMeasurement(k7VarN);
                    } else {
                        g = new AppMeasurement(b5.a(context, new f(0L, 0L, true, null, null, null, null), null));
                    }
                }
            }
        }
        return g;
    }

    private static k7 n(Context context, Bundle bundle) {
        try {
            return (k7) Class.forName("com.google.firebase.analytics.FirebaseAnalytics").getDeclaredMethod("getScionFrontendApiImplementation", Context.class, Bundle.class).invoke(null, context, null);
        } catch (ClassNotFoundException | Exception unused) {
            return null;
        }
    }

    @com.google.android.gms.common.annotation.a
    public Boolean a() {
        return this.f6330c ? (Boolean) this.f6329b.e(4) : this.f6328a.E().h0();
    }

    @com.google.android.gms.common.annotation.a
    public Double b() {
        return this.f6330c ? (Double) this.f6329b.e(2) : this.f6328a.E().l0();
    }

    @Keep
    public void beginAdUnitExposure(@q0(min = 1) @h0 String str) throws IllegalStateException {
        if (this.f6330c) {
            this.f6329b.i(str);
        } else {
            this.f6328a.S().v(str, this.f6328a.z().c());
        }
    }

    @com.google.android.gms.common.annotation.a
    public Integer c() {
        return this.f6330c ? (Integer) this.f6329b.e(3) : this.f6328a.E().k0();
    }

    @Keep
    @v
    @com.google.android.gms.common.annotation.a
    public void clearConditionalUserProperty(@q0(max = 24, min = 1) @h0 String str, @i0 String str2, @i0 Bundle bundle) throws IllegalStateException {
        if (this.f6330c) {
            this.f6329b.n(str, str2, bundle);
        } else {
            this.f6328a.E().C0(str, str2, bundle);
        }
    }

    @Keep
    @d0
    protected void clearConditionalUserPropertyAs(@q0(min = 1) @h0 String str, @q0(max = 24, min = 1) @h0 String str2, @i0 String str3, @i0 Bundle bundle) throws IllegalStateException {
        if (this.f6330c) {
            throw new IllegalStateException("Unexpected call on client side");
        }
        this.f6328a.E().f0(str, str2, str3, bundle);
    }

    @com.google.android.gms.common.annotation.a
    public Long d() {
        return this.f6330c ? (Long) this.f6329b.e(1) : this.f6328a.E().j0();
    }

    @com.google.android.gms.common.annotation.a
    public String e() {
        return this.f6330c ? (String) this.f6329b.e(0) : this.f6328a.E().i0();
    }

    @Keep
    public void endAdUnitExposure(@q0(min = 1) @h0 String str) throws IllegalStateException {
        if (this.f6330c) {
            this.f6329b.F0(str);
        } else {
            this.f6328a.S().C(str, this.f6328a.z().c());
        }
    }

    @y0
    @v
    @com.google.android.gms.common.annotation.a
    public Map<String, Object> f(boolean z) {
        if (this.f6330c) {
            return this.f6329b.h(null, null, z);
        }
        List<ca> listC = this.f6328a.E().C(z);
        b.f.a aVar = new b.f.a(listC.size());
        for (ca caVar : listC) {
            aVar.put(caVar.e, caVar.h());
        }
        return aVar;
    }

    @v
    @com.google.android.gms.common.annotation.a
    public void g(String str, String str2, Bundle bundle, long j) throws IllegalStateException {
        if (this.f6330c) {
            this.f6329b.K0(str, str2, bundle, j);
        } else {
            this.f6328a.E().b0(str, str2, bundle, true, false, j);
        }
    }

    @Keep
    public long generateEventId() {
        return this.f6330c ? this.f6329b.f() : this.f6328a.G().E0();
    }

    @i0
    @Keep
    public String getAppInstanceId() {
        return this.f6330c ? this.f6329b.c() : this.f6328a.E().m0();
    }

    @Keep
    @v
    @com.google.android.gms.common.annotation.a
    @y0
    public List<ConditionalUserProperty> getConditionalUserProperties(@i0 String str, @i0 @q0(max = 23, min = 1) String str2) {
        List<Bundle> listG = this.f6330c ? this.f6329b.g(str, str2) : this.f6328a.E().y(str, str2);
        ArrayList arrayList = new ArrayList(listG == null ? 0 : listG.size());
        Iterator<Bundle> it = listG.iterator();
        while (it.hasNext()) {
            arrayList.add(new ConditionalUserProperty(it.next()));
        }
        return arrayList;
    }

    @y0
    @Keep
    @d0
    protected List<ConditionalUserProperty> getConditionalUserPropertiesAs(@q0(min = 1) @h0 String str, @i0 String str2, @i0 @q0(max = 23, min = 1) String str3) {
        if (this.f6330c) {
            throw new IllegalStateException("Unexpected call on client side");
        }
        ArrayList<Bundle> arrayListA = this.f6328a.E().A(str, str2, str3);
        int r6 = 0;
        ArrayList arrayList = new ArrayList(arrayListA == null ? 0 : arrayListA.size());
        int size = arrayListA.size();
        while (r6 < size) {
            Bundle bundle = arrayListA.get(r6);
            r6++;
            arrayList.add(new ConditionalUserProperty(bundle));
        }
        return arrayList;
    }

    @i0
    @Keep
    public String getCurrentScreenClass() {
        return this.f6330c ? this.f6329b.b() : this.f6328a.E().p0();
    }

    @i0
    @Keep
    public String getCurrentScreenName() {
        return this.f6330c ? this.f6329b.a() : this.f6328a.E().o0();
    }

    @i0
    @Keep
    public String getGmpAppId() {
        return this.f6330c ? this.f6329b.d() : this.f6328a.E().q0();
    }

    @Keep
    @v
    @com.google.android.gms.common.annotation.a
    @y0
    public int getMaxUserProperties(@q0(min = 1) @h0 String str) {
        if (this.f6330c) {
            return this.f6329b.j(str);
        }
        this.f6328a.E();
        r.g(str);
        return 25;
    }

    @y0
    @Keep
    @d0
    protected Map<String, Object> getUserProperties(@i0 String str, @i0 @q0(max = 24, min = 1) String str2, boolean z) {
        return this.f6330c ? this.f6329b.h(str, str2, z) : this.f6328a.E().E(str, str2, z);
    }

    @y0
    @Keep
    @d0
    protected Map<String, Object> getUserPropertiesAs(@q0(min = 1) @h0 String str, @i0 String str2, @i0 @q0(max = 23, min = 1) String str3, boolean z) {
        if (this.f6330c) {
            throw new IllegalStateException("Unexpected call on client side");
        }
        return this.f6328a.E().D(str, str2, str3, z);
    }

    @v
    @com.google.android.gms.common.annotation.a
    public void h(c cVar) {
        if (this.f6330c) {
            this.f6329b.k(cVar);
        } else {
            this.f6328a.E().N(cVar);
        }
    }

    @y0
    @v
    @com.google.android.gms.common.annotation.a
    public void i(b bVar) {
        if (this.f6330c) {
            this.f6329b.p(bVar);
        } else {
            this.f6328a.E().O(bVar);
        }
    }

    @com.google.android.gms.common.annotation.a
    @Deprecated
    public void j(boolean z) throws IllegalStateException {
        if (this.f6330c) {
            this.f6329b.l(Boolean.valueOf(z));
        } else {
            this.f6328a.E().T(Boolean.valueOf(z));
        }
    }

    @v
    @com.google.android.gms.common.annotation.a
    public void k(String str, String str2, Object obj) throws IllegalStateException {
        r.g(str);
        if (this.f6330c) {
            this.f6329b.m(str, str2, obj);
        } else {
            this.f6328a.E().d0(str, str2, obj, true);
        }
    }

    @v
    @com.google.android.gms.common.annotation.a
    public void l(c cVar) {
        if (this.f6330c) {
            this.f6329b.o(cVar);
        } else {
            this.f6328a.E().w0(cVar);
        }
    }

    @Keep
    @v
    public void logEventInternal(String str, String str2, Bundle bundle) {
        if (this.f6330c) {
            this.f6329b.v1(str, str2, bundle);
        } else {
            this.f6328a.E().Z(str, str2, bundle);
        }
    }

    @Keep
    @v
    @com.google.android.gms.common.annotation.a
    public void setConditionalUserProperty(@h0 ConditionalUserProperty conditionalUserProperty) throws IllegalStateException {
        r.k(conditionalUserProperty);
        if (this.f6330c) {
            this.f6329b.s0(conditionalUserProperty.a());
        } else {
            this.f6328a.E().H(conditionalUserProperty.a());
        }
    }

    @Keep
    @d0
    protected void setConditionalUserPropertyAs(@h0 ConditionalUserProperty conditionalUserProperty) throws IllegalStateException {
        r.k(conditionalUserProperty);
        if (this.f6330c) {
            throw new IllegalStateException("Unexpected call on client side");
        }
        this.f6328a.E().u0(conditionalUserProperty.a());
    }
}
