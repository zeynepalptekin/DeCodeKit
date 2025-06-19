package androidx.core.app;

import android.app.PendingIntent;
import androidx.annotation.p0;
import androidx.core.graphics.drawable.IconCompat;
import java.lang.reflect.InvocationTargetException;

@p0({p0.a.LIBRARY})
/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(androidx.versionedparcelable.e eVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.f255a = (IconCompat) eVar.h0(remoteActionCompat.f255a, 1);
        remoteActionCompat.f256b = eVar.w(remoteActionCompat.f256b, 2);
        remoteActionCompat.f257c = eVar.w(remoteActionCompat.f257c, 3);
        remoteActionCompat.d = (PendingIntent) eVar.W(remoteActionCompat.d, 4);
        remoteActionCompat.e = eVar.m(remoteActionCompat.e, 5);
        remoteActionCompat.f = eVar.m(remoteActionCompat.f, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, androidx.versionedparcelable.e eVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        eVar.j0(false, false);
        eVar.m1(remoteActionCompat.f255a, 1);
        eVar.z0(remoteActionCompat.f256b, 2);
        eVar.z0(remoteActionCompat.f257c, 3);
        eVar.X0(remoteActionCompat.d, 4);
        eVar.n0(remoteActionCompat.e, 5);
        eVar.n0(remoteActionCompat.f, 6);
    }
}
