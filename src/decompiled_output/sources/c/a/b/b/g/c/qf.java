package c.a.b.b.g.c;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.Map;

/* loaded from: classes.dex */
public final class qf extends a implements of {
    qf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    @Override // c.a.b.b.g.c.of
    public final void beginAdUnitExposure(String str, long j) throws RemoteException {
        Parcel parcelL0 = L0();
        parcelL0.writeString(str);
        parcelL0.writeLong(j);
        e2(23, parcelL0);
    }

    @Override // c.a.b.b.g.c.of
    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) throws RemoteException {
        Parcel parcelL0 = L0();
        parcelL0.writeString(str);
        parcelL0.writeString(str2);
        b0.c(parcelL0, bundle);
        e2(9, parcelL0);
    }

    @Override // c.a.b.b.g.c.of
    public final void clearMeasurementEnabled(long j) throws RemoteException {
        Parcel parcelL0 = L0();
        parcelL0.writeLong(j);
        e2(43, parcelL0);
    }

    @Override // c.a.b.b.g.c.of
    public final void endAdUnitExposure(String str, long j) throws RemoteException {
        Parcel parcelL0 = L0();
        parcelL0.writeString(str);
        parcelL0.writeLong(j);
        e2(24, parcelL0);
    }

    @Override // c.a.b.b.g.c.of
    public final void generateEventId(pf pfVar) throws RemoteException {
        Parcel parcelL0 = L0();
        b0.b(parcelL0, pfVar);
        e2(22, parcelL0);
    }

    @Override // c.a.b.b.g.c.of
    public final void getAppInstanceId(pf pfVar) throws RemoteException {
        Parcel parcelL0 = L0();
        b0.b(parcelL0, pfVar);
        e2(20, parcelL0);
    }

    @Override // c.a.b.b.g.c.of
    public final void getCachedAppInstanceId(pf pfVar) throws RemoteException {
        Parcel parcelL0 = L0();
        b0.b(parcelL0, pfVar);
        e2(19, parcelL0);
    }

    @Override // c.a.b.b.g.c.of
    public final void getConditionalUserProperties(String str, String str2, pf pfVar) throws RemoteException {
        Parcel parcelL0 = L0();
        parcelL0.writeString(str);
        parcelL0.writeString(str2);
        b0.b(parcelL0, pfVar);
        e2(10, parcelL0);
    }

    @Override // c.a.b.b.g.c.of
    public final void getCurrentScreenClass(pf pfVar) throws RemoteException {
        Parcel parcelL0 = L0();
        b0.b(parcelL0, pfVar);
        e2(17, parcelL0);
    }

    @Override // c.a.b.b.g.c.of
    public final void getCurrentScreenName(pf pfVar) throws RemoteException {
        Parcel parcelL0 = L0();
        b0.b(parcelL0, pfVar);
        e2(16, parcelL0);
    }

    @Override // c.a.b.b.g.c.of
    public final void getGmpAppId(pf pfVar) throws RemoteException {
        Parcel parcelL0 = L0();
        b0.b(parcelL0, pfVar);
        e2(21, parcelL0);
    }

    @Override // c.a.b.b.g.c.of
    public final void getMaxUserProperties(String str, pf pfVar) throws RemoteException {
        Parcel parcelL0 = L0();
        parcelL0.writeString(str);
        b0.b(parcelL0, pfVar);
        e2(6, parcelL0);
    }

    @Override // c.a.b.b.g.c.of
    public final void getTestFlag(pf pfVar, int r3) throws RemoteException {
        Parcel parcelL0 = L0();
        b0.b(parcelL0, pfVar);
        parcelL0.writeInt(r3);
        e2(38, parcelL0);
    }

    @Override // c.a.b.b.g.c.of
    public final void getUserProperties(String str, String str2, boolean z, pf pfVar) throws RemoteException {
        Parcel parcelL0 = L0();
        parcelL0.writeString(str);
        parcelL0.writeString(str2);
        b0.d(parcelL0, z);
        b0.b(parcelL0, pfVar);
        e2(5, parcelL0);
    }

    @Override // c.a.b.b.g.c.of
    public final void initForTests(Map map) throws RemoteException {
        Parcel parcelL0 = L0();
        parcelL0.writeMap(map);
        e2(37, parcelL0);
    }

    @Override // c.a.b.b.g.c.of
    public final void initialize(c.a.b.b.e.c cVar, f fVar, long j) throws RemoteException {
        Parcel parcelL0 = L0();
        b0.b(parcelL0, cVar);
        b0.c(parcelL0, fVar);
        parcelL0.writeLong(j);
        e2(1, parcelL0);
    }

    @Override // c.a.b.b.g.c.of
    public final void isDataCollectionEnabled(pf pfVar) throws RemoteException {
        Parcel parcelL0 = L0();
        b0.b(parcelL0, pfVar);
        e2(40, parcelL0);
    }

    @Override // c.a.b.b.g.c.of
    public final void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) throws RemoteException {
        Parcel parcelL0 = L0();
        parcelL0.writeString(str);
        parcelL0.writeString(str2);
        b0.c(parcelL0, bundle);
        b0.d(parcelL0, z);
        b0.d(parcelL0, z2);
        parcelL0.writeLong(j);
        e2(2, parcelL0);
    }

    @Override // c.a.b.b.g.c.of
    public final void logEventAndBundle(String str, String str2, Bundle bundle, pf pfVar, long j) throws RemoteException {
        Parcel parcelL0 = L0();
        parcelL0.writeString(str);
        parcelL0.writeString(str2);
        b0.c(parcelL0, bundle);
        b0.b(parcelL0, pfVar);
        parcelL0.writeLong(j);
        e2(3, parcelL0);
    }

    @Override // c.a.b.b.g.c.of
    public final void logHealthData(int r2, String str, c.a.b.b.e.c cVar, c.a.b.b.e.c cVar2, c.a.b.b.e.c cVar3) throws RemoteException {
        Parcel parcelL0 = L0();
        parcelL0.writeInt(r2);
        parcelL0.writeString(str);
        b0.b(parcelL0, cVar);
        b0.b(parcelL0, cVar2);
        b0.b(parcelL0, cVar3);
        e2(33, parcelL0);
    }

    @Override // c.a.b.b.g.c.of
    public final void onActivityCreated(c.a.b.b.e.c cVar, Bundle bundle, long j) throws RemoteException {
        Parcel parcelL0 = L0();
        b0.b(parcelL0, cVar);
        b0.c(parcelL0, bundle);
        parcelL0.writeLong(j);
        e2(27, parcelL0);
    }

    @Override // c.a.b.b.g.c.of
    public final void onActivityDestroyed(c.a.b.b.e.c cVar, long j) throws RemoteException {
        Parcel parcelL0 = L0();
        b0.b(parcelL0, cVar);
        parcelL0.writeLong(j);
        e2(28, parcelL0);
    }

    @Override // c.a.b.b.g.c.of
    public final void onActivityPaused(c.a.b.b.e.c cVar, long j) throws RemoteException {
        Parcel parcelL0 = L0();
        b0.b(parcelL0, cVar);
        parcelL0.writeLong(j);
        e2(29, parcelL0);
    }

    @Override // c.a.b.b.g.c.of
    public final void onActivityResumed(c.a.b.b.e.c cVar, long j) throws RemoteException {
        Parcel parcelL0 = L0();
        b0.b(parcelL0, cVar);
        parcelL0.writeLong(j);
        e2(30, parcelL0);
    }

    @Override // c.a.b.b.g.c.of
    public final void onActivitySaveInstanceState(c.a.b.b.e.c cVar, pf pfVar, long j) throws RemoteException {
        Parcel parcelL0 = L0();
        b0.b(parcelL0, cVar);
        b0.b(parcelL0, pfVar);
        parcelL0.writeLong(j);
        e2(31, parcelL0);
    }

    @Override // c.a.b.b.g.c.of
    public final void onActivityStarted(c.a.b.b.e.c cVar, long j) throws RemoteException {
        Parcel parcelL0 = L0();
        b0.b(parcelL0, cVar);
        parcelL0.writeLong(j);
        e2(25, parcelL0);
    }

    @Override // c.a.b.b.g.c.of
    public final void onActivityStopped(c.a.b.b.e.c cVar, long j) throws RemoteException {
        Parcel parcelL0 = L0();
        b0.b(parcelL0, cVar);
        parcelL0.writeLong(j);
        e2(26, parcelL0);
    }

    @Override // c.a.b.b.g.c.of
    public final void performAction(Bundle bundle, pf pfVar, long j) throws RemoteException {
        Parcel parcelL0 = L0();
        b0.c(parcelL0, bundle);
        b0.b(parcelL0, pfVar);
        parcelL0.writeLong(j);
        e2(32, parcelL0);
    }

    @Override // c.a.b.b.g.c.of
    public final void registerOnMeasurementEventListener(c cVar) throws RemoteException {
        Parcel parcelL0 = L0();
        b0.b(parcelL0, cVar);
        e2(35, parcelL0);
    }

    @Override // c.a.b.b.g.c.of
    public final void resetAnalyticsData(long j) throws RemoteException {
        Parcel parcelL0 = L0();
        parcelL0.writeLong(j);
        e2(12, parcelL0);
    }

    @Override // c.a.b.b.g.c.of
    public final void setConditionalUserProperty(Bundle bundle, long j) throws RemoteException {
        Parcel parcelL0 = L0();
        b0.c(parcelL0, bundle);
        parcelL0.writeLong(j);
        e2(8, parcelL0);
    }

    @Override // c.a.b.b.g.c.of
    public final void setConsent(Bundle bundle, long j) throws RemoteException {
        Parcel parcelL0 = L0();
        b0.c(parcelL0, bundle);
        parcelL0.writeLong(j);
        e2(44, parcelL0);
    }

    @Override // c.a.b.b.g.c.of
    public final void setConsentThirdParty(Bundle bundle, long j) throws RemoteException {
        Parcel parcelL0 = L0();
        b0.c(parcelL0, bundle);
        parcelL0.writeLong(j);
        e2(45, parcelL0);
    }

    @Override // c.a.b.b.g.c.of
    public final void setCurrentScreen(c.a.b.b.e.c cVar, String str, String str2, long j) throws RemoteException {
        Parcel parcelL0 = L0();
        b0.b(parcelL0, cVar);
        parcelL0.writeString(str);
        parcelL0.writeString(str2);
        parcelL0.writeLong(j);
        e2(15, parcelL0);
    }

    @Override // c.a.b.b.g.c.of
    public final void setDataCollectionEnabled(boolean z) throws RemoteException {
        Parcel parcelL0 = L0();
        b0.d(parcelL0, z);
        e2(39, parcelL0);
    }

    @Override // c.a.b.b.g.c.of
    public final void setDefaultEventParameters(Bundle bundle) throws RemoteException {
        Parcel parcelL0 = L0();
        b0.c(parcelL0, bundle);
        e2(42, parcelL0);
    }

    @Override // c.a.b.b.g.c.of
    public final void setEventInterceptor(c cVar) throws RemoteException {
        Parcel parcelL0 = L0();
        b0.b(parcelL0, cVar);
        e2(34, parcelL0);
    }

    @Override // c.a.b.b.g.c.of
    public final void setInstanceIdProvider(d dVar) throws RemoteException {
        Parcel parcelL0 = L0();
        b0.b(parcelL0, dVar);
        e2(18, parcelL0);
    }

    @Override // c.a.b.b.g.c.of
    public final void setMeasurementEnabled(boolean z, long j) throws RemoteException {
        Parcel parcelL0 = L0();
        b0.d(parcelL0, z);
        parcelL0.writeLong(j);
        e2(11, parcelL0);
    }

    @Override // c.a.b.b.g.c.of
    public final void setMinimumSessionDuration(long j) throws RemoteException {
        Parcel parcelL0 = L0();
        parcelL0.writeLong(j);
        e2(13, parcelL0);
    }

    @Override // c.a.b.b.g.c.of
    public final void setSessionTimeoutDuration(long j) throws RemoteException {
        Parcel parcelL0 = L0();
        parcelL0.writeLong(j);
        e2(14, parcelL0);
    }

    @Override // c.a.b.b.g.c.of
    public final void setUserId(String str, long j) throws RemoteException {
        Parcel parcelL0 = L0();
        parcelL0.writeString(str);
        parcelL0.writeLong(j);
        e2(7, parcelL0);
    }

    @Override // c.a.b.b.g.c.of
    public final void setUserProperty(String str, String str2, c.a.b.b.e.c cVar, boolean z, long j) throws RemoteException {
        Parcel parcelL0 = L0();
        parcelL0.writeString(str);
        parcelL0.writeString(str2);
        b0.b(parcelL0, cVar);
        b0.d(parcelL0, z);
        parcelL0.writeLong(j);
        e2(4, parcelL0);
    }

    @Override // c.a.b.b.g.c.of
    public final void unregisterOnMeasurementEventListener(c cVar) throws RemoteException {
        Parcel parcelL0 = L0();
        b0.b(parcelL0, cVar);
        e2(36, parcelL0);
    }
}
