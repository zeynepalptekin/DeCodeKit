package android.support.v4.app;

import androidx.annotation.p0;
import androidx.core.app.RemoteActionCompat;
import androidx.versionedparcelable.e;
import java.lang.reflect.InvocationTargetException;

@p0({p0.a.LIBRARY})
/* loaded from: classes.dex */
public final class RemoteActionCompatParcelizer extends androidx.core.app.RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(e eVar) {
        return androidx.core.app.RemoteActionCompatParcelizer.read(eVar);
    }

    public static void write(RemoteActionCompat remoteActionCompat, e eVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        androidx.core.app.RemoteActionCompatParcelizer.write(remoteActionCompat, eVar);
    }
}
