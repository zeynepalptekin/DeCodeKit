package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;

/* loaded from: classes.dex */
public class ef {
    public static ye a(String str) throws RemoteException {
        return new hf((RtbAdapter) Class.forName(str, false, ef.class.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
    }
}
