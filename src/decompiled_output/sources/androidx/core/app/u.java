package androidx.core.app;

import android.app.AppOpsManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ApplicationInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import android.provider.Settings;
import android.support.v4.app.a;
import android.util.Log;
import androidx.annotation.h0;
import androidx.annotation.i0;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: c, reason: collision with root package name */
    private static final String f344c = "NotifManCompat";
    private static final String d = "checkOpNoThrow";
    private static final String e = "OP_POST_NOTIFICATION";
    public static final String f = "android.support.useSideChannel";
    public static final String g = "android.support.BIND_NOTIFICATION_SIDE_CHANNEL";
    static final int h = 19;
    private static final int i = 1000;
    private static final int j = 6;
    private static final String k = "enabled_notification_listeners";

    @androidx.annotation.u("sEnabledNotificationListenersLock")
    private static String m = null;

    @androidx.annotation.u("sLock")
    private static d p = null;
    public static final int q = -1000;
    public static final int r = 0;
    public static final int s = 1;
    public static final int t = 2;
    public static final int u = 3;
    public static final int v = 4;
    public static final int w = 5;

    /* renamed from: a, reason: collision with root package name */
    private final Context f345a;

    /* renamed from: b, reason: collision with root package name */
    private final NotificationManager f346b;
    private static final Object l = new Object();

    @androidx.annotation.u("sEnabledNotificationListenersLock")
    private static Set<String> n = new HashSet();
    private static final Object o = new Object();

    private static class a implements e {

        /* renamed from: a, reason: collision with root package name */
        final String f347a;

        /* renamed from: b, reason: collision with root package name */
        final int f348b;

        /* renamed from: c, reason: collision with root package name */
        final String f349c;
        final boolean d;

        a(String str) {
            this.f347a = str;
            this.f348b = 0;
            this.f349c = null;
            this.d = true;
        }

        a(String str, int r2, String str2) {
            this.f347a = str;
            this.f348b = r2;
            this.f349c = str2;
            this.d = false;
        }

        @Override // androidx.core.app.u.e
        public void a(android.support.v4.app.a aVar) throws RemoteException {
            if (this.d) {
                aVar.i5(this.f347a);
            } else {
                aVar.x2(this.f347a, this.f348b, this.f349c);
            }
        }

        @h0
        public String toString() {
            return "CancelTask[packageName:" + this.f347a + ", id:" + this.f348b + ", tag:" + this.f349c + ", all:" + this.d + "]";
        }
    }

    private static class b implements e {

        /* renamed from: a, reason: collision with root package name */
        final String f350a;

        /* renamed from: b, reason: collision with root package name */
        final int f351b;

        /* renamed from: c, reason: collision with root package name */
        final String f352c;
        final Notification d;

        b(String str, int r2, String str2, Notification notification) {
            this.f350a = str;
            this.f351b = r2;
            this.f352c = str2;
            this.d = notification;
        }

        @Override // androidx.core.app.u.e
        public void a(android.support.v4.app.a aVar) throws RemoteException {
            aVar.B7(this.f350a, this.f351b, this.f352c, this.d);
        }

        @h0
        public String toString() {
            return "NotifyTask[packageName:" + this.f350a + ", id:" + this.f351b + ", tag:" + this.f352c + "]";
        }
    }

    private static class c {

        /* renamed from: a, reason: collision with root package name */
        final ComponentName f353a;

        /* renamed from: b, reason: collision with root package name */
        final IBinder f354b;

        c(ComponentName componentName, IBinder iBinder) {
            this.f353a = componentName;
            this.f354b = iBinder;
        }
    }

    private static class d implements Handler.Callback, ServiceConnection {
        private static final int i = 0;
        private static final int j = 1;
        private static final int k = 2;
        private static final int l = 3;
        private final Context d;
        private final HandlerThread e;
        private final Handler f;
        private final Map<ComponentName, a> g = new HashMap();
        private Set<String> h = new HashSet();

        private static class a {

            /* renamed from: a, reason: collision with root package name */
            final ComponentName f355a;

            /* renamed from: c, reason: collision with root package name */
            android.support.v4.app.a f357c;

            /* renamed from: b, reason: collision with root package name */
            boolean f356b = false;
            ArrayDeque<e> d = new ArrayDeque<>();
            int e = 0;

            a(ComponentName componentName) {
                this.f355a = componentName;
            }
        }

        d(Context context) {
            this.d = context;
            HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
            this.e = handlerThread;
            handlerThread.start();
            this.f = new Handler(this.e.getLooper(), this);
        }

        private boolean a(a aVar) {
            if (aVar.f356b) {
                return true;
            }
            boolean zBindService = this.d.bindService(new Intent(u.g).setComponent(aVar.f355a), this, 33);
            aVar.f356b = zBindService;
            if (zBindService) {
                aVar.e = 0;
            } else {
                Log.w(u.f344c, "Unable to bind to listener " + aVar.f355a);
                this.d.unbindService(this);
            }
            return aVar.f356b;
        }

        private void b(a aVar) {
            if (aVar.f356b) {
                this.d.unbindService(this);
                aVar.f356b = false;
            }
            aVar.f357c = null;
        }

        private void c(e eVar) {
            j();
            for (a aVar : this.g.values()) {
                aVar.d.add(eVar);
                g(aVar);
            }
        }

        private void d(ComponentName componentName) {
            a aVar = this.g.get(componentName);
            if (aVar != null) {
                g(aVar);
            }
        }

        private void e(ComponentName componentName, IBinder iBinder) {
            a aVar = this.g.get(componentName);
            if (aVar != null) {
                aVar.f357c = a.b.L0(iBinder);
                aVar.e = 0;
                g(aVar);
            }
        }

        private void f(ComponentName componentName) {
            a aVar = this.g.get(componentName);
            if (aVar != null) {
                b(aVar);
            }
        }

        private void g(a aVar) {
            if (Log.isLoggable(u.f344c, 3)) {
                Log.d(u.f344c, "Processing component " + aVar.f355a + ", " + aVar.d.size() + " queued tasks");
            }
            if (aVar.d.isEmpty()) {
                return;
            }
            if (!a(aVar) || aVar.f357c == null) {
                i(aVar);
                return;
            }
            while (true) {
                e eVarPeek = aVar.d.peek();
                if (eVarPeek == null) {
                    break;
                }
                try {
                    if (Log.isLoggable(u.f344c, 3)) {
                        Log.d(u.f344c, "Sending task " + eVarPeek);
                    }
                    eVarPeek.a(aVar.f357c);
                    aVar.d.remove();
                } catch (DeadObjectException unused) {
                    if (Log.isLoggable(u.f344c, 3)) {
                        Log.d(u.f344c, "Remote service has died: " + aVar.f355a);
                    }
                } catch (RemoteException e) {
                    Log.w(u.f344c, "RemoteException communicating with " + aVar.f355a, e);
                }
            }
            if (aVar.d.isEmpty()) {
                return;
            }
            i(aVar);
        }

        private void i(a aVar) {
            if (this.f.hasMessages(3, aVar.f355a)) {
                return;
            }
            int r0 = aVar.e + 1;
            aVar.e = r0;
            if (r0 <= 6) {
                int r02 = (1 << (r0 - 1)) * 1000;
                if (Log.isLoggable(u.f344c, 3)) {
                    Log.d(u.f344c, "Scheduling retry for " + r02 + " ms");
                }
                this.f.sendMessageDelayed(this.f.obtainMessage(3, aVar.f355a), r02);
                return;
            }
            Log.w(u.f344c, "Giving up on delivering " + aVar.d.size() + " tasks to " + aVar.f355a + " after " + aVar.e + " retries");
            aVar.d.clear();
        }

        private void j() {
            Set<String> setL = u.l(this.d);
            if (setL.equals(this.h)) {
                return;
            }
            this.h = setL;
            List<ResolveInfo> listQueryIntentServices = this.d.getPackageManager().queryIntentServices(new Intent().setAction(u.g), 0);
            HashSet<ComponentName> hashSet = new HashSet();
            for (ResolveInfo resolveInfo : listQueryIntentServices) {
                if (setL.contains(resolveInfo.serviceInfo.packageName)) {
                    ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                    ComponentName componentName = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                    if (resolveInfo.serviceInfo.permission != null) {
                        Log.w(u.f344c, "Permission present on component " + componentName + ", not adding listener record.");
                    } else {
                        hashSet.add(componentName);
                    }
                }
            }
            for (ComponentName componentName2 : hashSet) {
                if (!this.g.containsKey(componentName2)) {
                    if (Log.isLoggable(u.f344c, 3)) {
                        Log.d(u.f344c, "Adding listener record for " + componentName2);
                    }
                    this.g.put(componentName2, new a(componentName2));
                }
            }
            Iterator<Map.Entry<ComponentName, a>> it = this.g.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<ComponentName, a> next = it.next();
                if (!hashSet.contains(next.getKey())) {
                    if (Log.isLoggable(u.f344c, 3)) {
                        Log.d(u.f344c, "Removing listener record for " + next.getKey());
                    }
                    b(next.getValue());
                    it.remove();
                }
            }
        }

        public void h(e eVar) {
            this.f.obtainMessage(0, eVar).sendToTarget();
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int r0 = message.what;
            if (r0 == 0) {
                c((e) message.obj);
                return true;
            }
            if (r0 == 1) {
                c cVar = (c) message.obj;
                e(cVar.f353a, cVar.f354b);
                return true;
            }
            if (r0 == 2) {
                f((ComponentName) message.obj);
                return true;
            }
            if (r0 != 3) {
                return false;
            }
            d((ComponentName) message.obj);
            return true;
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (Log.isLoggable(u.f344c, 3)) {
                Log.d(u.f344c, "Connected to service " + componentName);
            }
            this.f.obtainMessage(1, new c(componentName, iBinder)).sendToTarget();
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            if (Log.isLoggable(u.f344c, 3)) {
                Log.d(u.f344c, "Disconnected from service " + componentName);
            }
            this.f.obtainMessage(2, componentName).sendToTarget();
        }
    }

    private interface e {
        void a(android.support.v4.app.a aVar) throws RemoteException;
    }

    private u(Context context) {
        this.f345a = context;
        this.f346b = (NotificationManager) context.getSystemService("notification");
    }

    @h0
    public static u k(@h0 Context context) {
        return new u(context);
    }

    @h0
    public static Set<String> l(@h0 Context context) {
        Set<String> set;
        String string = Settings.Secure.getString(context.getContentResolver(), k);
        synchronized (l) {
            if (string != null) {
                if (!string.equals(m)) {
                    String[] strArrSplit = string.split(":", -1);
                    HashSet hashSet = new HashSet(strArrSplit.length);
                    for (String str : strArrSplit) {
                        ComponentName componentNameUnflattenFromString = ComponentName.unflattenFromString(str);
                        if (componentNameUnflattenFromString != null) {
                            hashSet.add(componentNameUnflattenFromString.getPackageName());
                        }
                    }
                    n = hashSet;
                    m = string;
                }
                set = n;
            } else {
                set = n;
            }
        }
        return set;
    }

    private void t(e eVar) {
        synchronized (o) {
            if (p == null) {
                p = new d(this.f345a.getApplicationContext());
            }
            p.h(eVar);
        }
    }

    private static boolean u(Notification notification) {
        Bundle bundleJ = p.j(notification);
        return bundleJ != null && bundleJ.getBoolean(f);
    }

    public boolean a() throws ClassNotFoundException {
        int r0 = Build.VERSION.SDK_INT;
        if (r0 >= 24) {
            return this.f346b.areNotificationsEnabled();
        }
        if (r0 < 19) {
            return true;
        }
        AppOpsManager appOpsManager = (AppOpsManager) this.f345a.getSystemService("appops");
        ApplicationInfo applicationInfo = this.f345a.getApplicationInfo();
        String packageName = this.f345a.getApplicationContext().getPackageName();
        int r1 = applicationInfo.uid;
        try {
            Class<?> cls = Class.forName(AppOpsManager.class.getName());
            return ((Integer) cls.getMethod(d, Integer.TYPE, Integer.TYPE, String.class).invoke(appOpsManager, Integer.valueOf(((Integer) cls.getDeclaredField(e).get(Integer.class)).intValue()), Integer.valueOf(r1), packageName)).intValue() == 0;
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | RuntimeException | InvocationTargetException unused) {
            return true;
        }
    }

    public void b(int r2) {
        c(null, r2);
    }

    public void c(@i0 String str, int r4) {
        this.f346b.cancel(str, r4);
        if (Build.VERSION.SDK_INT <= 19) {
            t(new a(this.f345a.getPackageName(), r4, str));
        }
    }

    public void d() {
        this.f346b.cancelAll();
        if (Build.VERSION.SDK_INT <= 19) {
            t(new a(this.f345a.getPackageName()));
        }
    }

    public void e(@h0 NotificationChannel notificationChannel) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f346b.createNotificationChannel(notificationChannel);
        }
    }

    public void f(@h0 NotificationChannelGroup notificationChannelGroup) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f346b.createNotificationChannelGroup(notificationChannelGroup);
        }
    }

    public void g(@h0 List<NotificationChannelGroup> list) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f346b.createNotificationChannelGroups(list);
        }
    }

    public void h(@h0 List<NotificationChannel> list) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f346b.createNotificationChannels(list);
        }
    }

    public void i(@h0 String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f346b.deleteNotificationChannel(str);
        }
    }

    public void j(@h0 String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f346b.deleteNotificationChannelGroup(str);
        }
    }

    public int m() {
        return Build.VERSION.SDK_INT >= 24 ? this.f346b.getImportance() : q;
    }

    @i0
    public NotificationChannel n(@h0 String str) {
        if (Build.VERSION.SDK_INT >= 26) {
            return this.f346b.getNotificationChannel(str);
        }
        return null;
    }

    @i0
    public NotificationChannelGroup o(@h0 String str) {
        int r0 = Build.VERSION.SDK_INT;
        if (r0 >= 28) {
            return this.f346b.getNotificationChannelGroup(str);
        }
        if (r0 >= 26) {
            for (NotificationChannelGroup notificationChannelGroup : p()) {
                if (notificationChannelGroup.getId().equals(str)) {
                    return notificationChannelGroup;
                }
            }
        }
        return null;
    }

    @h0
    public List<NotificationChannelGroup> p() {
        return Build.VERSION.SDK_INT >= 26 ? this.f346b.getNotificationChannelGroups() : Collections.emptyList();
    }

    @h0
    public List<NotificationChannel> q() {
        return Build.VERSION.SDK_INT >= 26 ? this.f346b.getNotificationChannels() : Collections.emptyList();
    }

    public void r(int r2, @h0 Notification notification) {
        s(null, r2, notification);
    }

    public void s(@i0 String str, int r4, @h0 Notification notification) {
        if (!u(notification)) {
            this.f346b.notify(str, r4, notification);
        } else {
            t(new b(this.f345a.getPackageName(), r4, str, notification));
            this.f346b.cancel(str, r4);
        }
    }
}
