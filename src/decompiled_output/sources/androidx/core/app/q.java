package androidx.core.app;

import android.app.Notification;
import android.app.RemoteInput;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.widget.RemoteViews;
import androidx.annotation.p0;
import androidx.core.app.p;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@p0({p0.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
class q implements o {

    /* renamed from: a, reason: collision with root package name */
    private final Notification.Builder f335a;

    /* renamed from: b, reason: collision with root package name */
    private final p.g f336b;

    /* renamed from: c, reason: collision with root package name */
    private RemoteViews f337c;
    private RemoteViews d;
    private final List<Bundle> e = new ArrayList();
    private final Bundle f = new Bundle();
    private int g;
    private RemoteViews h;

    q(p.g gVar) {
        ArrayList<String> arrayList;
        Bundle bundle;
        String str;
        this.f336b = gVar;
        this.f335a = Build.VERSION.SDK_INT >= 26 ? new Notification.Builder(gVar.f314a, gVar.J) : new Notification.Builder(gVar.f314a);
        Notification notification = gVar.Q;
        this.f335a.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, gVar.h).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(gVar.d).setContentText(gVar.e).setContentInfo(gVar.j).setContentIntent(gVar.f).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(gVar.g, (notification.flags & 128) != 0).setLargeIcon(gVar.i).setNumber(gVar.k).setProgress(gVar.s, gVar.t, gVar.u);
        if (Build.VERSION.SDK_INT < 21) {
            this.f335a.setSound(notification.sound, notification.audioStreamType);
        }
        if (Build.VERSION.SDK_INT >= 16) {
            this.f335a.setSubText(gVar.q).setUsesChronometer(gVar.n).setPriority(gVar.l);
            Iterator<p.b> it = gVar.f315b.iterator();
            while (it.hasNext()) {
                b(it.next());
            }
            Bundle bundle2 = gVar.C;
            if (bundle2 != null) {
                this.f.putAll(bundle2);
            }
            if (Build.VERSION.SDK_INT < 20) {
                if (gVar.y) {
                    this.f.putBoolean(r.f338a, true);
                }
                String str2 = gVar.v;
                if (str2 != null) {
                    this.f.putString(r.f339b, str2);
                    if (gVar.w) {
                        bundle = this.f;
                        str = r.f340c;
                    } else {
                        bundle = this.f;
                        str = u.f;
                    }
                    bundle.putBoolean(str, true);
                }
                String str3 = gVar.x;
                if (str3 != null) {
                    this.f.putString(r.d, str3);
                }
            }
            this.f337c = gVar.G;
            this.d = gVar.H;
        }
        if (Build.VERSION.SDK_INT >= 19) {
            this.f335a.setShowWhen(gVar.m);
            if (Build.VERSION.SDK_INT < 21 && (arrayList = gVar.S) != null && !arrayList.isEmpty()) {
                Bundle bundle3 = this.f;
                ArrayList<String> arrayList2 = gVar.S;
                bundle3.putStringArray(p.P, (String[]) arrayList2.toArray(new String[arrayList2.size()]));
            }
        }
        if (Build.VERSION.SDK_INT >= 20) {
            this.f335a.setLocalOnly(gVar.y).setGroup(gVar.v).setGroupSummary(gVar.w).setSortKey(gVar.x);
            this.g = gVar.N;
        }
        if (Build.VERSION.SDK_INT >= 21) {
            this.f335a.setCategory(gVar.B).setColor(gVar.D).setVisibility(gVar.E).setPublicVersion(gVar.F).setSound(notification.sound, notification.audioAttributes);
            Iterator<String> it2 = gVar.S.iterator();
            while (it2.hasNext()) {
                this.f335a.addPerson(it2.next());
            }
            this.h = gVar.I;
            if (gVar.f316c.size() > 0) {
                Bundle bundle4 = gVar.m().getBundle("android.car.EXTENSIONS");
                bundle4 = bundle4 == null ? new Bundle() : bundle4;
                Bundle bundle5 = new Bundle();
                for (int r8 = 0; r8 < gVar.f316c.size(); r8++) {
                    bundle5.putBundle(Integer.toString(r8), s.j(gVar.f316c.get(r8)));
                }
                bundle4.putBundle("invisible_actions", bundle5);
                gVar.m().putBundle("android.car.EXTENSIONS", bundle4);
                this.f.putBundle("android.car.EXTENSIONS", bundle4);
            }
        }
        if (Build.VERSION.SDK_INT >= 24) {
            this.f335a.setExtras(gVar.C).setRemoteInputHistory(gVar.r);
            RemoteViews remoteViews = gVar.G;
            if (remoteViews != null) {
                this.f335a.setCustomContentView(remoteViews);
            }
            RemoteViews remoteViews2 = gVar.H;
            if (remoteViews2 != null) {
                this.f335a.setCustomBigContentView(remoteViews2);
            }
            RemoteViews remoteViews3 = gVar.I;
            if (remoteViews3 != null) {
                this.f335a.setCustomHeadsUpContentView(remoteViews3);
            }
        }
        if (Build.VERSION.SDK_INT >= 26) {
            this.f335a.setBadgeIconType(gVar.K).setShortcutId(gVar.L).setTimeoutAfter(gVar.M).setGroupAlertBehavior(gVar.N);
            if (gVar.A) {
                this.f335a.setColorized(gVar.z);
            }
            if (!TextUtils.isEmpty(gVar.J)) {
                this.f335a.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (Build.VERSION.SDK_INT >= 29) {
            this.f335a.setAllowSystemGeneratedContextualActions(gVar.O);
            this.f335a.setBubbleMetadata(p.f.i(gVar.P));
        }
        if (gVar.R) {
            if (this.f336b.w) {
                this.g = 2;
            } else {
                this.g = 1;
            }
            this.f335a.setVibrate(null);
            this.f335a.setSound(null);
            int r12 = notification.defaults & (-2);
            notification.defaults = r12;
            int r122 = r12 & (-3);
            notification.defaults = r122;
            this.f335a.setDefaults(r122);
            if (Build.VERSION.SDK_INT >= 26) {
                if (TextUtils.isEmpty(this.f336b.v)) {
                    this.f335a.setGroup(p.A0);
                }
                this.f335a.setGroupAlertBehavior(this.g);
            }
        }
    }

    private void b(p.b bVar) {
        int r0 = Build.VERSION.SDK_INT;
        if (r0 < 20) {
            if (r0 >= 16) {
                this.e.add(s.o(this.f335a, bVar));
                return;
            }
            return;
        }
        IconCompat iconCompatF = bVar.f();
        Notification.Action.Builder builder = Build.VERSION.SDK_INT >= 23 ? new Notification.Action.Builder(iconCompatF != null ? iconCompatF.J() : null, bVar.j(), bVar.a()) : new Notification.Action.Builder(iconCompatF != null ? iconCompatF.t() : 0, bVar.j(), bVar.a());
        if (bVar.g() != null) {
            for (RemoteInput remoteInput : w.d(bVar.g())) {
                builder.addRemoteInput(remoteInput);
            }
        }
        Bundle bundle = bVar.d() != null ? new Bundle(bVar.d()) : new Bundle();
        bundle.putBoolean("android.support.allowGeneratedReplies", bVar.b());
        if (Build.VERSION.SDK_INT >= 24) {
            builder.setAllowGeneratedReplies(bVar.b());
        }
        bundle.putInt("android.support.action.semanticAction", bVar.h());
        if (Build.VERSION.SDK_INT >= 28) {
            builder.setSemanticAction(bVar.h());
        }
        if (Build.VERSION.SDK_INT >= 29) {
            builder.setContextual(bVar.k());
        }
        bundle.putBoolean("android.support.action.showsUserInterface", bVar.i());
        builder.addExtras(bundle);
        this.f335a.addAction(builder.build());
    }

    private void e(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        int r0 = notification.defaults & (-2);
        notification.defaults = r0;
        notification.defaults = r0 & (-3);
    }

    @Override // androidx.core.app.o
    public Notification.Builder a() {
        return this.f335a;
    }

    public Notification c() {
        Bundle bundleJ;
        RemoteViews remoteViewsP;
        RemoteViews remoteViewsN;
        p.AbstractC0026p abstractC0026p = this.f336b.p;
        if (abstractC0026p != null) {
            abstractC0026p.b(this);
        }
        RemoteViews remoteViewsO = abstractC0026p != null ? abstractC0026p.o(this) : null;
        Notification notificationD = d();
        if (remoteViewsO != null || (remoteViewsO = this.f336b.G) != null) {
            notificationD.contentView = remoteViewsO;
        }
        if (Build.VERSION.SDK_INT >= 16 && abstractC0026p != null && (remoteViewsN = abstractC0026p.n(this)) != null) {
            notificationD.bigContentView = remoteViewsN;
        }
        if (Build.VERSION.SDK_INT >= 21 && abstractC0026p != null && (remoteViewsP = this.f336b.p.p(this)) != null) {
            notificationD.headsUpContentView = remoteViewsP;
        }
        if (Build.VERSION.SDK_INT >= 16 && abstractC0026p != null && (bundleJ = p.j(notificationD)) != null) {
            abstractC0026p.a(bundleJ);
        }
        return notificationD;
    }

    protected Notification d() {
        int r0 = Build.VERSION.SDK_INT;
        if (r0 >= 26) {
            return this.f335a.build();
        }
        if (r0 >= 24) {
            Notification notificationBuild = this.f335a.build();
            if (this.g != 0) {
                if (notificationBuild.getGroup() != null && (notificationBuild.flags & 512) != 0 && this.g == 2) {
                    e(notificationBuild);
                }
                if (notificationBuild.getGroup() != null && (notificationBuild.flags & 512) == 0 && this.g == 1) {
                    e(notificationBuild);
                }
            }
            return notificationBuild;
        }
        if (r0 >= 21) {
            this.f335a.setExtras(this.f);
            Notification notificationBuild2 = this.f335a.build();
            RemoteViews remoteViews = this.f337c;
            if (remoteViews != null) {
                notificationBuild2.contentView = remoteViews;
            }
            RemoteViews remoteViews2 = this.d;
            if (remoteViews2 != null) {
                notificationBuild2.bigContentView = remoteViews2;
            }
            RemoteViews remoteViews3 = this.h;
            if (remoteViews3 != null) {
                notificationBuild2.headsUpContentView = remoteViews3;
            }
            if (this.g != 0) {
                if (notificationBuild2.getGroup() != null && (notificationBuild2.flags & 512) != 0 && this.g == 2) {
                    e(notificationBuild2);
                }
                if (notificationBuild2.getGroup() != null && (notificationBuild2.flags & 512) == 0 && this.g == 1) {
                    e(notificationBuild2);
                }
            }
            return notificationBuild2;
        }
        if (r0 >= 20) {
            this.f335a.setExtras(this.f);
            Notification notificationBuild3 = this.f335a.build();
            RemoteViews remoteViews4 = this.f337c;
            if (remoteViews4 != null) {
                notificationBuild3.contentView = remoteViews4;
            }
            RemoteViews remoteViews5 = this.d;
            if (remoteViews5 != null) {
                notificationBuild3.bigContentView = remoteViews5;
            }
            if (this.g != 0) {
                if (notificationBuild3.getGroup() != null && (notificationBuild3.flags & 512) != 0 && this.g == 2) {
                    e(notificationBuild3);
                }
                if (notificationBuild3.getGroup() != null && (notificationBuild3.flags & 512) == 0 && this.g == 1) {
                    e(notificationBuild3);
                }
            }
            return notificationBuild3;
        }
        if (r0 >= 19) {
            SparseArray<Bundle> sparseArrayA = s.a(this.e);
            if (sparseArrayA != null) {
                this.f.putSparseParcelableArray(r.e, sparseArrayA);
            }
            this.f335a.setExtras(this.f);
            Notification notificationBuild4 = this.f335a.build();
            RemoteViews remoteViews6 = this.f337c;
            if (remoteViews6 != null) {
                notificationBuild4.contentView = remoteViews6;
            }
            RemoteViews remoteViews7 = this.d;
            if (remoteViews7 != null) {
                notificationBuild4.bigContentView = remoteViews7;
            }
            return notificationBuild4;
        }
        if (r0 < 16) {
            return this.f335a.getNotification();
        }
        Notification notificationBuild5 = this.f335a.build();
        Bundle bundleJ = p.j(notificationBuild5);
        Bundle bundle = new Bundle(this.f);
        for (String str : this.f.keySet()) {
            if (bundleJ.containsKey(str)) {
                bundle.remove(str);
            }
        }
        bundleJ.putAll(bundle);
        SparseArray<Bundle> sparseArrayA2 = s.a(this.e);
        if (sparseArrayA2 != null) {
            p.j(notificationBuild5).putSparseParcelableArray(r.e, sparseArrayA2);
        }
        RemoteViews remoteViews8 = this.f337c;
        if (remoteViews8 != null) {
            notificationBuild5.contentView = remoteViews8;
        }
        RemoteViews remoteViews9 = this.d;
        if (remoteViews9 != null) {
            notificationBuild5.bigContentView = remoteViews9;
        }
        return notificationBuild5;
    }
}
