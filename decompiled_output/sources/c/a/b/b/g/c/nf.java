package c.a.b.b.g.c;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import c.a.b.b.e.c;

/* loaded from: classes.dex */
public abstract class nf extends c1 implements of {
    public nf() {
        super("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    public static of asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        return iInterfaceQueryLocalInterface instanceof of ? (of) iInterfaceQueryLocalInterface : new qf(iBinder);
    }

    @Override // c.a.b.b.g.c.c1
    protected final boolean L0(int r11, Parcel parcel, Parcel parcel2, int r14) throws RemoteException {
        pf rfVar;
        pf rfVar2 = null;
        pf rfVar3 = null;
        pf rfVar4 = null;
        c eVar = null;
        c eVar2 = null;
        c eVar3 = null;
        pf rfVar5 = null;
        pf rfVar6 = null;
        pf rfVar7 = null;
        pf rfVar8 = null;
        pf rfVar9 = null;
        pf rfVar10 = null;
        d gVar = null;
        pf rfVar11 = null;
        pf rfVar12 = null;
        pf rfVar13 = null;
        pf rfVar14 = null;
        switch (r11) {
            case 1:
                initialize(c.a.b2(parcel.readStrongBinder()), (f) b0.a(parcel, f.CREATOR), parcel.readLong());
                break;
            case 2:
                logEvent(parcel.readString(), parcel.readString(), (Bundle) b0.a(parcel, Bundle.CREATOR), b0.e(parcel), b0.e(parcel), parcel.readLong());
                break;
            case 3:
                String string = parcel.readString();
                String string2 = parcel.readString();
                Bundle bundle = (Bundle) b0.a(parcel, Bundle.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    rfVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    rfVar = iInterfaceQueryLocalInterface instanceof pf ? (pf) iInterfaceQueryLocalInterface : new rf(strongBinder);
                }
                logEventAndBundle(string, string2, bundle, rfVar, parcel.readLong());
                break;
            case 4:
                setUserProperty(parcel.readString(), parcel.readString(), c.a.b2(parcel.readStrongBinder()), b0.e(parcel), parcel.readLong());
                break;
            case 5:
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                boolean zE = b0.e(parcel);
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    rfVar2 = iInterfaceQueryLocalInterface2 instanceof pf ? (pf) iInterfaceQueryLocalInterface2 : new rf(strongBinder2);
                }
                getUserProperties(string3, string4, zE, rfVar2);
                break;
            case 6:
                String string5 = parcel.readString();
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    rfVar14 = iInterfaceQueryLocalInterface3 instanceof pf ? (pf) iInterfaceQueryLocalInterface3 : new rf(strongBinder3);
                }
                getMaxUserProperties(string5, rfVar14);
                break;
            case 7:
                setUserId(parcel.readString(), parcel.readLong());
                break;
            case 8:
                setConditionalUserProperty((Bundle) b0.a(parcel, Bundle.CREATOR), parcel.readLong());
                break;
            case 9:
                clearConditionalUserProperty(parcel.readString(), parcel.readString(), (Bundle) b0.a(parcel, Bundle.CREATOR));
                break;
            case 10:
                String string6 = parcel.readString();
                String string7 = parcel.readString();
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    rfVar13 = iInterfaceQueryLocalInterface4 instanceof pf ? (pf) iInterfaceQueryLocalInterface4 : new rf(strongBinder4);
                }
                getConditionalUserProperties(string6, string7, rfVar13);
                break;
            case 11:
                setMeasurementEnabled(b0.e(parcel), parcel.readLong());
                break;
            case 12:
                resetAnalyticsData(parcel.readLong());
                break;
            case 13:
                setMinimumSessionDuration(parcel.readLong());
                break;
            case 14:
                setSessionTimeoutDuration(parcel.readLong());
                break;
            case 15:
                setCurrentScreen(c.a.b2(parcel.readStrongBinder()), parcel.readString(), parcel.readString(), parcel.readLong());
                break;
            case 16:
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    rfVar12 = iInterfaceQueryLocalInterface5 instanceof pf ? (pf) iInterfaceQueryLocalInterface5 : new rf(strongBinder5);
                }
                getCurrentScreenName(rfVar12);
                break;
            case 17:
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    rfVar11 = iInterfaceQueryLocalInterface6 instanceof pf ? (pf) iInterfaceQueryLocalInterface6 : new rf(strongBinder6);
                }
                getCurrentScreenClass(rfVar11);
                break;
            case 18:
                IBinder strongBinder7 = parcel.readStrongBinder();
                if (strongBinder7 != null) {
                    IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.measurement.api.internal.IStringProvider");
                    gVar = iInterfaceQueryLocalInterface7 instanceof d ? (d) iInterfaceQueryLocalInterface7 : new g(strongBinder7);
                }
                setInstanceIdProvider(gVar);
                break;
            case 19:
                IBinder strongBinder8 = parcel.readStrongBinder();
                if (strongBinder8 != null) {
                    IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    rfVar10 = iInterfaceQueryLocalInterface8 instanceof pf ? (pf) iInterfaceQueryLocalInterface8 : new rf(strongBinder8);
                }
                getCachedAppInstanceId(rfVar10);
                break;
            case 20:
                IBinder strongBinder9 = parcel.readStrongBinder();
                if (strongBinder9 != null) {
                    IInterface iInterfaceQueryLocalInterface9 = strongBinder9.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    rfVar9 = iInterfaceQueryLocalInterface9 instanceof pf ? (pf) iInterfaceQueryLocalInterface9 : new rf(strongBinder9);
                }
                getAppInstanceId(rfVar9);
                break;
            case 21:
                IBinder strongBinder10 = parcel.readStrongBinder();
                if (strongBinder10 != null) {
                    IInterface iInterfaceQueryLocalInterface10 = strongBinder10.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    rfVar8 = iInterfaceQueryLocalInterface10 instanceof pf ? (pf) iInterfaceQueryLocalInterface10 : new rf(strongBinder10);
                }
                getGmpAppId(rfVar8);
                break;
            case 22:
                IBinder strongBinder11 = parcel.readStrongBinder();
                if (strongBinder11 != null) {
                    IInterface iInterfaceQueryLocalInterface11 = strongBinder11.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    rfVar7 = iInterfaceQueryLocalInterface11 instanceof pf ? (pf) iInterfaceQueryLocalInterface11 : new rf(strongBinder11);
                }
                generateEventId(rfVar7);
                break;
            case 23:
                beginAdUnitExposure(parcel.readString(), parcel.readLong());
                break;
            case 24:
                endAdUnitExposure(parcel.readString(), parcel.readLong());
                break;
            case 25:
                onActivityStarted(c.a.b2(parcel.readStrongBinder()), parcel.readLong());
                break;
            case 26:
                onActivityStopped(c.a.b2(parcel.readStrongBinder()), parcel.readLong());
                break;
            case 27:
                onActivityCreated(c.a.b2(parcel.readStrongBinder()), (Bundle) b0.a(parcel, Bundle.CREATOR), parcel.readLong());
                break;
            case 28:
                onActivityDestroyed(c.a.b2(parcel.readStrongBinder()), parcel.readLong());
                break;
            case 29:
                onActivityPaused(c.a.b2(parcel.readStrongBinder()), parcel.readLong());
                break;
            case 30:
                onActivityResumed(c.a.b2(parcel.readStrongBinder()), parcel.readLong());
                break;
            case 31:
                c.a.b.b.e.c cVarB2 = c.a.b2(parcel.readStrongBinder());
                IBinder strongBinder12 = parcel.readStrongBinder();
                if (strongBinder12 != null) {
                    IInterface iInterfaceQueryLocalInterface12 = strongBinder12.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    rfVar6 = iInterfaceQueryLocalInterface12 instanceof pf ? (pf) iInterfaceQueryLocalInterface12 : new rf(strongBinder12);
                }
                onActivitySaveInstanceState(cVarB2, rfVar6, parcel.readLong());
                break;
            case 32:
                Bundle bundle2 = (Bundle) b0.a(parcel, Bundle.CREATOR);
                IBinder strongBinder13 = parcel.readStrongBinder();
                if (strongBinder13 != null) {
                    IInterface iInterfaceQueryLocalInterface13 = strongBinder13.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    rfVar5 = iInterfaceQueryLocalInterface13 instanceof pf ? (pf) iInterfaceQueryLocalInterface13 : new rf(strongBinder13);
                }
                performAction(bundle2, rfVar5, parcel.readLong());
                break;
            case 33:
                logHealthData(parcel.readInt(), parcel.readString(), c.a.b2(parcel.readStrongBinder()), c.a.b2(parcel.readStrongBinder()), c.a.b2(parcel.readStrongBinder()));
                break;
            case 34:
                IBinder strongBinder14 = parcel.readStrongBinder();
                if (strongBinder14 != null) {
                    IInterface iInterfaceQueryLocalInterface14 = strongBinder14.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    eVar3 = iInterfaceQueryLocalInterface14 instanceof c ? (c) iInterfaceQueryLocalInterface14 : new e(strongBinder14);
                }
                setEventInterceptor(eVar3);
                break;
            case 35:
                IBinder strongBinder15 = parcel.readStrongBinder();
                if (strongBinder15 != null) {
                    IInterface iInterfaceQueryLocalInterface15 = strongBinder15.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    eVar2 = iInterfaceQueryLocalInterface15 instanceof c ? (c) iInterfaceQueryLocalInterface15 : new e(strongBinder15);
                }
                registerOnMeasurementEventListener(eVar2);
                break;
            case 36:
                IBinder strongBinder16 = parcel.readStrongBinder();
                if (strongBinder16 != null) {
                    IInterface iInterfaceQueryLocalInterface16 = strongBinder16.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    eVar = iInterfaceQueryLocalInterface16 instanceof c ? (c) iInterfaceQueryLocalInterface16 : new e(strongBinder16);
                }
                unregisterOnMeasurementEventListener(eVar);
                break;
            case 37:
                initForTests(b0.f(parcel));
                break;
            case 38:
                IBinder strongBinder17 = parcel.readStrongBinder();
                if (strongBinder17 != null) {
                    IInterface iInterfaceQueryLocalInterface17 = strongBinder17.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    rfVar4 = iInterfaceQueryLocalInterface17 instanceof pf ? (pf) iInterfaceQueryLocalInterface17 : new rf(strongBinder17);
                }
                getTestFlag(rfVar4, parcel.readInt());
                break;
            case 39:
                setDataCollectionEnabled(b0.e(parcel));
                break;
            case 40:
                IBinder strongBinder18 = parcel.readStrongBinder();
                if (strongBinder18 != null) {
                    IInterface iInterfaceQueryLocalInterface18 = strongBinder18.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    rfVar3 = iInterfaceQueryLocalInterface18 instanceof pf ? (pf) iInterfaceQueryLocalInterface18 : new rf(strongBinder18);
                }
                isDataCollectionEnabled(rfVar3);
                break;
            case 41:
            default:
                return false;
            case 42:
                setDefaultEventParameters((Bundle) b0.a(parcel, Bundle.CREATOR));
                break;
            case 43:
                clearMeasurementEnabled(parcel.readLong());
                break;
            case 44:
                setConsent((Bundle) b0.a(parcel, Bundle.CREATOR), parcel.readLong());
                break;
            case 45:
                setConsentThirdParty((Bundle) b0.a(parcel, Bundle.CREATOR), parcel.readLong());
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
