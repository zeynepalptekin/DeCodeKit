package androidx.core.app;

import android.app.Notification;
import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.Build;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.v4.app.a;

/* loaded from: classes.dex */
public abstract class t extends Service {

    private class a extends a.b {
        a() {
        }

        @Override // android.support.v4.app.a
        public void B7(String str, int r5, String str2, Notification notification) throws RemoteException {
            t.this.c(Binder.getCallingUid(), str);
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            try {
                t.this.d(str, r5, str2, notification);
            } finally {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
            }
        }

        @Override // android.support.v4.app.a
        public void i5(String str) {
            t.this.c(Binder.getCallingUid(), str);
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            try {
                t.this.b(str);
            } finally {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
            }
        }

        @Override // android.support.v4.app.a
        public void x2(String str, int r5, String str2) throws RemoteException {
            t.this.c(Binder.getCallingUid(), str);
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            try {
                t.this.a(str, r5, str2);
            } finally {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
            }
        }
    }

    public abstract void a(String str, int r2, String str2);

    public abstract void b(String str);

    void c(int r5, String str) {
        for (String str2 : getPackageManager().getPackagesForUid(r5)) {
            if (str2.equals(str)) {
                return;
            }
        }
        throw new SecurityException("NotificationSideChannelService: Uid " + r5 + " is not authorized for package " + str);
    }

    public abstract void d(String str, int r2, String str2, Notification notification);

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        if (!intent.getAction().equals(u.g) || Build.VERSION.SDK_INT > 19) {
            return null;
        }
        return new a();
    }
}
