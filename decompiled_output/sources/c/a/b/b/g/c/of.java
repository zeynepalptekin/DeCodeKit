package c.a.b.b.g.c;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.Map;

/* loaded from: classes.dex */
public interface of extends IInterface {
    void beginAdUnitExposure(String str, long j) throws RemoteException;

    void clearConditionalUserProperty(String str, String str2, Bundle bundle) throws RemoteException;

    void clearMeasurementEnabled(long j) throws RemoteException;

    void endAdUnitExposure(String str, long j) throws RemoteException;

    void generateEventId(pf pfVar) throws RemoteException;

    void getAppInstanceId(pf pfVar) throws RemoteException;

    void getCachedAppInstanceId(pf pfVar) throws RemoteException;

    void getConditionalUserProperties(String str, String str2, pf pfVar) throws RemoteException;

    void getCurrentScreenClass(pf pfVar) throws RemoteException;

    void getCurrentScreenName(pf pfVar) throws RemoteException;

    void getGmpAppId(pf pfVar) throws RemoteException;

    void getMaxUserProperties(String str, pf pfVar) throws RemoteException;

    void getTestFlag(pf pfVar, int r2) throws RemoteException;

    void getUserProperties(String str, String str2, boolean z, pf pfVar) throws RemoteException;

    void initForTests(Map map) throws RemoteException;

    void initialize(c.a.b.b.e.c cVar, f fVar, long j) throws RemoteException;

    void isDataCollectionEnabled(pf pfVar) throws RemoteException;

    void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j) throws RemoteException;

    void logEventAndBundle(String str, String str2, Bundle bundle, pf pfVar, long j) throws RemoteException;

    void logHealthData(int r1, String str, c.a.b.b.e.c cVar, c.a.b.b.e.c cVar2, c.a.b.b.e.c cVar3) throws RemoteException;

    void onActivityCreated(c.a.b.b.e.c cVar, Bundle bundle, long j) throws RemoteException;

    void onActivityDestroyed(c.a.b.b.e.c cVar, long j) throws RemoteException;

    void onActivityPaused(c.a.b.b.e.c cVar, long j) throws RemoteException;

    void onActivityResumed(c.a.b.b.e.c cVar, long j) throws RemoteException;

    void onActivitySaveInstanceState(c.a.b.b.e.c cVar, pf pfVar, long j) throws RemoteException;

    void onActivityStarted(c.a.b.b.e.c cVar, long j) throws RemoteException;

    void onActivityStopped(c.a.b.b.e.c cVar, long j) throws RemoteException;

    void performAction(Bundle bundle, pf pfVar, long j) throws RemoteException;

    void registerOnMeasurementEventListener(c cVar) throws RemoteException;

    void resetAnalyticsData(long j) throws RemoteException;

    void setConditionalUserProperty(Bundle bundle, long j) throws RemoteException;

    void setConsent(Bundle bundle, long j) throws RemoteException;

    void setConsentThirdParty(Bundle bundle, long j) throws RemoteException;

    void setCurrentScreen(c.a.b.b.e.c cVar, String str, String str2, long j) throws RemoteException;

    void setDataCollectionEnabled(boolean z) throws RemoteException;

    void setDefaultEventParameters(Bundle bundle) throws RemoteException;

    void setEventInterceptor(c cVar) throws RemoteException;

    void setInstanceIdProvider(d dVar) throws RemoteException;

    void setMeasurementEnabled(boolean z, long j) throws RemoteException;

    void setMinimumSessionDuration(long j) throws RemoteException;

    void setSessionTimeoutDuration(long j) throws RemoteException;

    void setUserId(String str, long j) throws RemoteException;

    void setUserProperty(String str, String str2, c.a.b.b.e.c cVar, boolean z, long j) throws RemoteException;

    void unregisterOnMeasurementEventListener(c cVar) throws RemoteException;
}
