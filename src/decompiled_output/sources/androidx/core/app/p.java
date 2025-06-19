package androidx.core.app;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.PendingIntent;
import android.app.Person;
import android.app.RemoteInput;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.SparseArray;
import android.widget.RemoteViews;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.annotation.m0;
import androidx.annotation.p0;
import androidx.core.app.v;
import androidx.core.graphics.drawable.IconCompat;
import b.i.a;
import b.i.p.f0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class p {
    public static final String A = "android.infoText";
    public static final String A0 = "silent";
    public static final String B = "android.summaryText";
    public static final String C = "android.bigText";
    public static final String D = "android.icon";
    public static final String E = "android.largeIcon";
    public static final String F = "android.largeIcon.big";
    public static final String G = "android.progress";
    public static final String H = "android.progressMax";
    public static final String I = "android.progressIndeterminate";
    public static final String J = "android.showChronometer";
    public static final String K = "android.chronometerCountDown";
    public static final String L = "android.showWhen";
    public static final String M = "android.picture";
    public static final String N = "android.textLines";
    public static final String O = "android.template";
    public static final String P = "android.people";
    public static final String Q = "android.backgroundImageUri";
    public static final String R = "android.mediaSession";
    public static final String S = "android.compactActions";
    public static final String T = "android.selfDisplayName";
    public static final String U = "android.messagingStyleUser";
    public static final String V = "android.conversationTitle";
    public static final String W = "android.messages";
    public static final String X = "android.isGroupConversation";
    public static final String Y = "android.hiddenConversationTitle";
    public static final String Z = "android.audioContents";

    /* renamed from: a, reason: collision with root package name */
    public static final int f296a = -1;

    @androidx.annotation.k
    public static final int a0 = 0;

    /* renamed from: b, reason: collision with root package name */
    public static final int f297b = 1;
    public static final int b0 = 1;

    /* renamed from: c, reason: collision with root package name */
    public static final int f298c = 2;
    public static final int c0 = 0;
    public static final int d = 4;
    public static final int d0 = -1;
    public static final int e = -1;
    public static final String e0 = "call";
    public static final int f = 1;
    public static final String f0 = "navigation";
    public static final int g = 2;
    public static final String g0 = "msg";
    public static final int h = 4;
    public static final String h0 = "email";
    public static final int i = 8;
    public static final String i0 = "event";
    public static final int j = 16;
    public static final String j0 = "promo";
    public static final int k = 32;
    public static final String k0 = "alarm";
    public static final int l = 64;
    public static final String l0 = "progress";

    @Deprecated
    public static final int m = 128;
    public static final String m0 = "social";
    public static final int n = 256;
    public static final String n0 = "err";
    public static final int o = 512;
    public static final String o0 = "transport";
    public static final int p = 4096;
    public static final String p0 = "sys";
    public static final int q = 0;
    public static final String q0 = "service";
    public static final int r = -1;
    public static final String r0 = "reminder";
    public static final int s = -2;
    public static final String s0 = "recommendation";
    public static final int t = 1;
    public static final String t0 = "status";
    public static final int u = 2;
    public static final int u0 = 0;
    public static final String v = "android.title";
    public static final int v0 = 1;
    public static final String w = "android.title.big";
    public static final int w0 = 2;
    public static final String x = "android.text";
    public static final int x0 = 0;
    public static final String y = "android.subText";
    public static final int y0 = 1;
    public static final String z = "android.remoteInputHistory";
    public static final int z0 = 2;

    public static class b {
        public static final int l = 0;
        public static final int m = 1;
        public static final int n = 2;
        public static final int o = 3;
        public static final int p = 4;
        public static final int q = 5;
        public static final int r = 6;
        public static final int s = 7;
        public static final int t = 8;
        public static final int u = 9;
        public static final int v = 10;
        static final String w = "android.support.action.showsUserInterface";
        static final String x = "android.support.action.semanticAction";

        /* renamed from: a, reason: collision with root package name */
        final Bundle f299a;

        /* renamed from: b, reason: collision with root package name */
        @i0
        private IconCompat f300b;

        /* renamed from: c, reason: collision with root package name */
        private final w[] f301c;
        private final w[] d;
        private boolean e;
        boolean f;
        private final int g;
        private final boolean h;

        @Deprecated
        public int i;
        public CharSequence j;
        public PendingIntent k;

        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            private final IconCompat f302a;

            /* renamed from: b, reason: collision with root package name */
            private final CharSequence f303b;

            /* renamed from: c, reason: collision with root package name */
            private final PendingIntent f304c;
            private boolean d;
            private final Bundle e;
            private ArrayList<w> f;
            private int g;
            private boolean h;
            private boolean i;

            public a(int r12, CharSequence charSequence, PendingIntent pendingIntent) {
                this(r12 != 0 ? IconCompat.r(null, "", r12) : null, charSequence, pendingIntent, new Bundle(), null, true, 0, true, false);
            }

            public a(b bVar) {
                this(bVar.f(), bVar.j, bVar.k, new Bundle(bVar.f299a), bVar.g(), bVar.b(), bVar.h(), bVar.f, bVar.k());
            }

            public a(@i0 IconCompat iconCompat, @i0 CharSequence charSequence, @i0 PendingIntent pendingIntent) {
                this(iconCompat, charSequence, pendingIntent, new Bundle(), null, true, 0, true, false);
            }

            private a(@i0 IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, w[] wVarArr, boolean z, int r8, boolean z2, boolean z3) {
                this.d = true;
                this.h = true;
                this.f302a = iconCompat;
                this.f303b = g.r(charSequence);
                this.f304c = pendingIntent;
                this.e = bundle;
                this.f = wVarArr == null ? null : new ArrayList<>(Arrays.asList(wVarArr));
                this.d = z;
                this.g = r8;
                this.h = z2;
                this.i = z3;
            }

            private void d() {
                if (this.i && this.f304c == null) {
                    throw new NullPointerException("Contextual Actions must contain a valid PendingIntent");
                }
            }

            public a a(Bundle bundle) {
                if (bundle != null) {
                    this.e.putAll(bundle);
                }
                return this;
            }

            public a b(w wVar) {
                if (this.f == null) {
                    this.f = new ArrayList<>();
                }
                this.f.add(wVar);
                return this;
            }

            public b c() {
                d();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList<w> arrayList3 = this.f;
                if (arrayList3 != null) {
                    Iterator<w> it = arrayList3.iterator();
                    while (it.hasNext()) {
                        w next = it.next();
                        if (next.q()) {
                            arrayList.add(next);
                        } else {
                            arrayList2.add(next);
                        }
                    }
                }
                w[] wVarArr = arrayList.isEmpty() ? null : (w[]) arrayList.toArray(new w[arrayList.size()]);
                return new b(this.f302a, this.f303b, this.f304c, this.e, arrayList2.isEmpty() ? null : (w[]) arrayList2.toArray(new w[arrayList2.size()]), wVarArr, this.d, this.g, this.h, this.i);
            }

            public a e(InterfaceC0024b interfaceC0024b) {
                interfaceC0024b.a(this);
                return this;
            }

            public Bundle f() {
                return this.e;
            }

            public a g(boolean z) {
                this.d = z;
                return this;
            }

            @h0
            public a h(boolean z) {
                this.i = z;
                return this;
            }

            public a i(int r1) {
                this.g = r1;
                return this;
            }

            public a j(boolean z) {
                this.h = z;
                return this;
            }
        }

        /* renamed from: androidx.core.app.p$b$b, reason: collision with other inner class name */
        public interface InterfaceC0024b {
            a a(a aVar);
        }

        @Retention(RetentionPolicy.SOURCE)
        public @interface c {
        }

        public static final class d implements InterfaceC0024b {
            private static final String e = "android.wearable.EXTENSIONS";
            private static final String f = "flags";
            private static final String g = "inProgressLabel";
            private static final String h = "confirmLabel";
            private static final String i = "cancelLabel";
            private static final int j = 1;
            private static final int k = 2;
            private static final int l = 4;
            private static final int m = 1;

            /* renamed from: a, reason: collision with root package name */
            private int f305a;

            /* renamed from: b, reason: collision with root package name */
            private CharSequence f306b;

            /* renamed from: c, reason: collision with root package name */
            private CharSequence f307c;
            private CharSequence d;

            public d() {
                this.f305a = 1;
            }

            public d(b bVar) {
                this.f305a = 1;
                Bundle bundle = bVar.d().getBundle(e);
                if (bundle != null) {
                    this.f305a = bundle.getInt(f, 1);
                    this.f306b = bundle.getCharSequence(g);
                    this.f307c = bundle.getCharSequence(h);
                    this.d = bundle.getCharSequence(i);
                }
            }

            private void l(int r1, boolean z) {
                int r12;
                if (z) {
                    r12 = r1 | this.f305a;
                } else {
                    r12 = (~r1) & this.f305a;
                }
                this.f305a = r12;
            }

            @Override // androidx.core.app.p.b.InterfaceC0024b
            public a a(a aVar) {
                Bundle bundle = new Bundle();
                int r1 = this.f305a;
                if (r1 != 1) {
                    bundle.putInt(f, r1);
                }
                CharSequence charSequence = this.f306b;
                if (charSequence != null) {
                    bundle.putCharSequence(g, charSequence);
                }
                CharSequence charSequence2 = this.f307c;
                if (charSequence2 != null) {
                    bundle.putCharSequence(h, charSequence2);
                }
                CharSequence charSequence3 = this.d;
                if (charSequence3 != null) {
                    bundle.putCharSequence(i, charSequence3);
                }
                aVar.f().putBundle(e, bundle);
                return aVar;
            }

            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public d clone() {
                d dVar = new d();
                dVar.f305a = this.f305a;
                dVar.f306b = this.f306b;
                dVar.f307c = this.f307c;
                dVar.d = this.d;
                return dVar;
            }

            @Deprecated
            public CharSequence c() {
                return this.d;
            }

            @Deprecated
            public CharSequence d() {
                return this.f307c;
            }

            public boolean e() {
                return (this.f305a & 4) != 0;
            }

            public boolean f() {
                return (this.f305a & 2) != 0;
            }

            @Deprecated
            public CharSequence g() {
                return this.f306b;
            }

            public boolean h() {
                return (this.f305a & 1) != 0;
            }

            public d i(boolean z) {
                l(1, z);
                return this;
            }

            @Deprecated
            public d j(CharSequence charSequence) {
                this.d = charSequence;
                return this;
            }

            @Deprecated
            public d k(CharSequence charSequence) {
                this.f307c = charSequence;
                return this;
            }

            public d m(boolean z) {
                l(4, z);
                return this;
            }

            public d n(boolean z) {
                l(2, z);
                return this;
            }

            @Deprecated
            public d o(CharSequence charSequence) {
                this.f306b = charSequence;
                return this;
            }
        }

        public b(int r3, CharSequence charSequence, PendingIntent pendingIntent) {
            this(r3 != 0 ? IconCompat.r(null, "", r3) : null, charSequence, pendingIntent);
        }

        b(int r14, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, w[] wVarArr, w[] wVarArr2, boolean z, int r21, boolean z2, boolean z3) {
            this(r14 != 0 ? IconCompat.r(null, "", r14) : null, charSequence, pendingIntent, bundle, wVarArr, wVarArr2, z, r21, z2, z3);
        }

        public b(@i0 IconCompat iconCompat, @i0 CharSequence charSequence, @i0 PendingIntent pendingIntent) {
            this(iconCompat, charSequence, pendingIntent, new Bundle(), (w[]) null, (w[]) null, true, 0, true, false);
        }

        b(@i0 IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, w[] wVarArr, w[] wVarArr2, boolean z, int r10, boolean z2, boolean z3) {
            this.f = true;
            this.f300b = iconCompat;
            if (iconCompat != null && iconCompat.y() == 2) {
                this.i = iconCompat.t();
            }
            this.j = g.r(charSequence);
            this.k = pendingIntent;
            this.f299a = bundle == null ? new Bundle() : bundle;
            this.f301c = wVarArr;
            this.d = wVarArr2;
            this.e = z;
            this.g = r10;
            this.f = z2;
            this.h = z3;
        }

        public PendingIntent a() {
            return this.k;
        }

        public boolean b() {
            return this.e;
        }

        public w[] c() {
            return this.d;
        }

        public Bundle d() {
            return this.f299a;
        }

        @Deprecated
        public int e() {
            return this.i;
        }

        @i0
        public IconCompat f() {
            int r0;
            if (this.f300b == null && (r0 = this.i) != 0) {
                this.f300b = IconCompat.r(null, "", r0);
            }
            return this.f300b;
        }

        public w[] g() {
            return this.f301c;
        }

        public int h() {
            return this.g;
        }

        public boolean i() {
            return this.f;
        }

        public CharSequence j() {
            return this.j;
        }

        public boolean k() {
            return this.h;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @p0({p0.a.LIBRARY_GROUP_PREFIX})
    public @interface c {
    }

    public static class d extends AbstractC0026p {
        private Bitmap e;
        private Bitmap f;
        private boolean g;

        public d() {
        }

        public d(g gVar) {
            r(gVar);
        }

        @Override // androidx.core.app.p.AbstractC0026p
        @p0({p0.a.LIBRARY_GROUP_PREFIX})
        public void b(androidx.core.app.o oVar) {
            if (Build.VERSION.SDK_INT >= 16) {
                Notification.BigPictureStyle bigPictureStyleBigPicture = new Notification.BigPictureStyle(oVar.a()).setBigContentTitle(this.f330b).bigPicture(this.e);
                if (this.g) {
                    bigPictureStyleBigPicture.bigLargeIcon(this.f);
                }
                if (this.d) {
                    bigPictureStyleBigPicture.setSummaryText(this.f331c);
                }
            }
        }

        public d s(Bitmap bitmap) {
            this.f = bitmap;
            this.g = true;
            return this;
        }

        public d t(Bitmap bitmap) {
            this.e = bitmap;
            return this;
        }

        public d u(CharSequence charSequence) {
            this.f330b = g.r(charSequence);
            return this;
        }

        public d v(CharSequence charSequence) {
            this.f331c = g.r(charSequence);
            this.d = true;
            return this;
        }
    }

    public static class e extends AbstractC0026p {
        private CharSequence e;

        public e() {
        }

        public e(g gVar) {
            r(gVar);
        }

        @Override // androidx.core.app.p.AbstractC0026p
        @p0({p0.a.LIBRARY_GROUP_PREFIX})
        public void b(androidx.core.app.o oVar) {
            if (Build.VERSION.SDK_INT >= 16) {
                Notification.BigTextStyle bigTextStyleBigText = new Notification.BigTextStyle(oVar.a()).setBigContentTitle(this.f330b).bigText(this.e);
                if (this.d) {
                    bigTextStyleBigText.setSummaryText(this.f331c);
                }
            }
        }

        public e s(CharSequence charSequence) {
            this.e = g.r(charSequence);
            return this;
        }

        public e t(CharSequence charSequence) {
            this.f330b = g.r(charSequence);
            return this;
        }

        public e u(CharSequence charSequence) {
            this.f331c = g.r(charSequence);
            this.d = true;
            return this;
        }
    }

    public static final class f {
        private static final int g = 1;
        private static final int h = 2;

        /* renamed from: a, reason: collision with root package name */
        private PendingIntent f308a;

        /* renamed from: b, reason: collision with root package name */
        private PendingIntent f309b;

        /* renamed from: c, reason: collision with root package name */
        private IconCompat f310c;
        private int d;

        @androidx.annotation.o
        private int e;
        private int f;

        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            private PendingIntent f311a;

            /* renamed from: b, reason: collision with root package name */
            private IconCompat f312b;

            /* renamed from: c, reason: collision with root package name */
            private int f313c;

            @androidx.annotation.o
            private int d;
            private int e;
            private PendingIntent f;

            private a f(int r1, boolean z) {
                int r12;
                if (z) {
                    r12 = r1 | this.e;
                } else {
                    r12 = (~r1) & this.e;
                }
                this.e = r12;
                return this;
            }

            @SuppressLint({"SyntheticAccessor"})
            @h0
            public f a() {
                PendingIntent pendingIntent = this.f311a;
                if (pendingIntent == null) {
                    throw new IllegalStateException("Must supply pending intent to bubble");
                }
                IconCompat iconCompat = this.f312b;
                if (iconCompat != null) {
                    return new f(pendingIntent, this.f, iconCompat, this.f313c, this.d, this.e);
                }
                throw new IllegalStateException("Must supply an icon for the bubble");
            }

            @h0
            public a b(boolean z) {
                f(1, z);
                return this;
            }

            @h0
            public a c(@i0 PendingIntent pendingIntent) {
                this.f = pendingIntent;
                return this;
            }

            @h0
            public a d(@androidx.annotation.p(unit = 0) int r2) {
                this.f313c = Math.max(r2, 0);
                this.d = 0;
                return this;
            }

            @h0
            public a e(@androidx.annotation.o int r1) {
                this.d = r1;
                this.f313c = 0;
                return this;
            }

            @h0
            public a g(@h0 IconCompat iconCompat) {
                if (iconCompat == null) {
                    throw new IllegalArgumentException("Bubbles require non-null icon");
                }
                if (iconCompat.y() == 1) {
                    throw new IllegalArgumentException("When using bitmap based icons, Bubbles require TYPE_ADAPTIVE_BITMAP, please use IconCompat#createWithAdaptiveBitmap instead");
                }
                this.f312b = iconCompat;
                return this;
            }

            @h0
            public a h(@h0 PendingIntent pendingIntent) {
                if (pendingIntent == null) {
                    throw new IllegalArgumentException("Bubble requires non-null pending intent");
                }
                this.f311a = pendingIntent;
                return this;
            }

            @h0
            public a i(boolean z) {
                f(2, z);
                return this;
            }
        }

        private f(PendingIntent pendingIntent, PendingIntent pendingIntent2, IconCompat iconCompat, int r4, @androidx.annotation.o int r5, int r6) {
            this.f308a = pendingIntent;
            this.f310c = iconCompat;
            this.d = r4;
            this.e = r5;
            this.f309b = pendingIntent2;
            this.f = r6;
        }

        @i0
        @m0(29)
        public static f a(@i0 Notification.BubbleMetadata bubbleMetadata) {
            if (bubbleMetadata == null) {
                return null;
            }
            a aVarI = new a().b(bubbleMetadata.getAutoExpandBubble()).c(bubbleMetadata.getDeleteIntent()).g(IconCompat.g(bubbleMetadata.getIcon())).h(bubbleMetadata.getIntent()).i(bubbleMetadata.isNotificationSuppressed());
            if (bubbleMetadata.getDesiredHeight() != 0) {
                aVarI.d(bubbleMetadata.getDesiredHeight());
            }
            if (bubbleMetadata.getDesiredHeightResId() != 0) {
                aVarI.e(bubbleMetadata.getDesiredHeightResId());
            }
            return aVarI.a();
        }

        @i0
        @m0(29)
        public static Notification.BubbleMetadata i(@i0 f fVar) {
            if (fVar == null) {
                return null;
            }
            Notification.BubbleMetadata.Builder suppressNotification = new Notification.BubbleMetadata.Builder().setAutoExpandBubble(fVar.b()).setDeleteIntent(fVar.c()).setIcon(fVar.f().J()).setIntent(fVar.g()).setSuppressNotification(fVar.h());
            if (fVar.d() != 0) {
                suppressNotification.setDesiredHeight(fVar.d());
            }
            if (fVar.e() != 0) {
                suppressNotification.setDesiredHeightResId(fVar.e());
            }
            return suppressNotification.build();
        }

        public boolean b() {
            return (this.f & 1) != 0;
        }

        @i0
        public PendingIntent c() {
            return this.f309b;
        }

        @androidx.annotation.p(unit = 0)
        public int d() {
            return this.d;
        }

        @androidx.annotation.o
        public int e() {
            return this.e;
        }

        @h0
        public IconCompat f() {
            return this.f310c;
        }

        @h0
        public PendingIntent g() {
            return this.f308a;
        }

        public boolean h() {
            return (this.f & 2) != 0;
        }
    }

    public static class g {
        private static final int T = 5120;
        boolean A;
        String B;
        Bundle C;
        int D;
        int E;
        Notification F;
        RemoteViews G;
        RemoteViews H;
        RemoteViews I;
        String J;
        int K;
        String L;
        long M;
        int N;
        boolean O;
        f P;
        Notification Q;
        boolean R;

        @Deprecated
        public ArrayList<String> S;

        /* renamed from: a, reason: collision with root package name */
        @p0({p0.a.LIBRARY_GROUP_PREFIX})
        public Context f314a;

        /* renamed from: b, reason: collision with root package name */
        @p0({p0.a.LIBRARY_GROUP_PREFIX})
        public ArrayList<b> f315b;

        /* renamed from: c, reason: collision with root package name */
        ArrayList<b> f316c;
        CharSequence d;
        CharSequence e;
        PendingIntent f;
        PendingIntent g;
        RemoteViews h;
        Bitmap i;
        CharSequence j;
        int k;
        int l;
        boolean m;
        boolean n;
        boolean o;
        AbstractC0026p p;
        CharSequence q;
        CharSequence[] r;
        int s;
        int t;
        boolean u;
        String v;
        boolean w;
        String x;
        boolean y;
        boolean z;

        @Deprecated
        public g(Context context) {
            this(context, null);
        }

        public g(@h0 Context context, @h0 String str) {
            this.f315b = new ArrayList<>();
            this.f316c = new ArrayList<>();
            this.m = true;
            this.y = false;
            this.D = 0;
            this.E = 0;
            this.K = 0;
            this.N = 0;
            Notification notification = new Notification();
            this.Q = notification;
            this.f314a = context;
            this.J = str;
            notification.when = System.currentTimeMillis();
            this.Q.audioStreamType = -1;
            this.l = 0;
            this.S = new ArrayList<>();
            this.O = true;
        }

        private void N(int r2, boolean z) {
            Notification notification;
            int r22;
            if (z) {
                notification = this.Q;
                r22 = r2 | notification.flags;
            } else {
                notification = this.Q;
                r22 = (~r2) & notification.flags;
            }
            notification.flags = r22;
        }

        protected static CharSequence r(CharSequence charSequence) {
            return (charSequence != null && charSequence.length() > T) ? charSequence.subSequence(0, T) : charSequence;
        }

        private Bitmap s(Bitmap bitmap) throws Resources.NotFoundException {
            if (bitmap == null || Build.VERSION.SDK_INT >= 27) {
                return bitmap;
            }
            Resources resources = this.f314a.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(a.c.compat_notification_large_icon_max_width);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(a.c.compat_notification_large_icon_max_height);
            if (bitmap.getWidth() <= dimensionPixelSize && bitmap.getHeight() <= dimensionPixelSize2) {
                return bitmap;
            }
            double dMin = Math.min(dimensionPixelSize / Math.max(1, bitmap.getWidth()), dimensionPixelSize2 / Math.max(1, bitmap.getHeight()));
            return Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(bitmap.getWidth() * dMin), (int) Math.ceil(bitmap.getHeight() * dMin), true);
        }

        public g A(@androidx.annotation.k int r1) {
            this.D = r1;
            return this;
        }

        public g B(boolean z) {
            this.z = z;
            this.A = true;
            return this;
        }

        public g C(RemoteViews remoteViews) {
            this.Q.contentView = remoteViews;
            return this;
        }

        public g D(CharSequence charSequence) {
            this.j = r(charSequence);
            return this;
        }

        public g E(PendingIntent pendingIntent) {
            this.f = pendingIntent;
            return this;
        }

        public g F(CharSequence charSequence) {
            this.e = r(charSequence);
            return this;
        }

        public g G(CharSequence charSequence) {
            this.d = r(charSequence);
            return this;
        }

        public g H(RemoteViews remoteViews) {
            this.H = remoteViews;
            return this;
        }

        public g I(RemoteViews remoteViews) {
            this.G = remoteViews;
            return this;
        }

        public g J(RemoteViews remoteViews) {
            this.I = remoteViews;
            return this;
        }

        public g K(int r2) {
            Notification notification = this.Q;
            notification.defaults = r2;
            if ((r2 & 4) != 0) {
                notification.flags |= 1;
            }
            return this;
        }

        public g L(PendingIntent pendingIntent) {
            this.Q.deleteIntent = pendingIntent;
            return this;
        }

        public g M(Bundle bundle) {
            this.C = bundle;
            return this;
        }

        public g O(PendingIntent pendingIntent, boolean z) {
            this.g = pendingIntent;
            N(128, z);
            return this;
        }

        public g P(String str) {
            this.v = str;
            return this;
        }

        public g Q(int r1) {
            this.N = r1;
            return this;
        }

        public g R(boolean z) {
            this.w = z;
            return this;
        }

        public g S(Bitmap bitmap) {
            this.i = s(bitmap);
            return this;
        }

        public g T(@androidx.annotation.k int r2, int r3, int r4) {
            Notification notification = this.Q;
            notification.ledARGB = r2;
            notification.ledOnMS = r3;
            notification.ledOffMS = r4;
            int r22 = (r3 == 0 || r4 == 0) ? 0 : 1;
            Notification notification2 = this.Q;
            notification2.flags = r22 | (notification2.flags & (-2));
            return this;
        }

        public g U(boolean z) {
            this.y = z;
            return this;
        }

        @h0
        public g V() {
            this.R = true;
            return this;
        }

        public g W(int r1) {
            this.k = r1;
            return this;
        }

        public g X(boolean z) {
            N(2, z);
            return this;
        }

        public g Y(boolean z) {
            N(8, z);
            return this;
        }

        public g Z(int r1) {
            this.l = r1;
            return this;
        }

        public g a(int r3, CharSequence charSequence, PendingIntent pendingIntent) {
            this.f315b.add(new b(r3, charSequence, pendingIntent));
            return this;
        }

        public g a0(int r1, int r2, boolean z) {
            this.s = r1;
            this.t = r2;
            this.u = z;
            return this;
        }

        public g b(b bVar) {
            this.f315b.add(bVar);
            return this;
        }

        public g b0(Notification notification) {
            this.F = notification;
            return this;
        }

        public g c(Bundle bundle) {
            if (bundle != null) {
                Bundle bundle2 = this.C;
                if (bundle2 == null) {
                    this.C = new Bundle(bundle);
                } else {
                    bundle2.putAll(bundle);
                }
            }
            return this;
        }

        public g c0(CharSequence[] charSequenceArr) {
            this.r = charSequenceArr;
            return this;
        }

        @m0(21)
        public g d(int r2, CharSequence charSequence, PendingIntent pendingIntent) {
            return e(new b(r2, charSequence, pendingIntent));
        }

        public g d0(String str) {
            this.L = str;
            return this;
        }

        @m0(21)
        public g e(b bVar) {
            this.f316c.add(bVar);
            return this;
        }

        public g e0(boolean z) {
            this.m = z;
            return this;
        }

        public g f(String str) {
            this.S.add(str);
            return this;
        }

        public g f0(int r2) {
            this.Q.icon = r2;
            return this;
        }

        public Notification g() {
            return new androidx.core.app.q(this).c();
        }

        public g g0(int r2, int r3) {
            Notification notification = this.Q;
            notification.icon = r2;
            notification.iconLevel = r3;
            return this;
        }

        public g h(j jVar) {
            jVar.a(this);
            return this;
        }

        public g h0(String str) {
            this.x = str;
            return this;
        }

        @p0({p0.a.LIBRARY_GROUP_PREFIX})
        public RemoteViews i() {
            return this.H;
        }

        public g i0(Uri uri) {
            Notification notification = this.Q;
            notification.sound = uri;
            notification.audioStreamType = -1;
            if (Build.VERSION.SDK_INT >= 21) {
                notification.audioAttributes = new AudioAttributes.Builder().setContentType(4).setUsage(5).build();
            }
            return this;
        }

        @i0
        @p0({p0.a.LIBRARY_GROUP_PREFIX})
        public f j() {
            return this.P;
        }

        public g j0(Uri uri, int r4) {
            Notification notification = this.Q;
            notification.sound = uri;
            notification.audioStreamType = r4;
            if (Build.VERSION.SDK_INT >= 21) {
                notification.audioAttributes = new AudioAttributes.Builder().setContentType(4).setLegacyStreamType(r4).build();
            }
            return this;
        }

        @p0({p0.a.LIBRARY_GROUP_PREFIX})
        public int k() {
            return this.D;
        }

        public g k0(AbstractC0026p abstractC0026p) {
            if (this.p != abstractC0026p) {
                this.p = abstractC0026p;
                if (abstractC0026p != null) {
                    abstractC0026p.r(this);
                }
            }
            return this;
        }

        @p0({p0.a.LIBRARY_GROUP_PREFIX})
        public RemoteViews l() {
            return this.G;
        }

        public g l0(CharSequence charSequence) {
            this.q = r(charSequence);
            return this;
        }

        public Bundle m() {
            if (this.C == null) {
                this.C = new Bundle();
            }
            return this.C;
        }

        public g m0(CharSequence charSequence) {
            this.Q.tickerText = r(charSequence);
            return this;
        }

        @p0({p0.a.LIBRARY_GROUP_PREFIX})
        public RemoteViews n() {
            return this.I;
        }

        public g n0(CharSequence charSequence, RemoteViews remoteViews) {
            this.Q.tickerText = r(charSequence);
            this.h = remoteViews;
            return this;
        }

        @Deprecated
        public Notification o() {
            return g();
        }

        public g o0(long j) {
            this.M = j;
            return this;
        }

        @p0({p0.a.LIBRARY_GROUP_PREFIX})
        public int p() {
            return this.l;
        }

        public g p0(boolean z) {
            this.n = z;
            return this;
        }

        @p0({p0.a.LIBRARY_GROUP_PREFIX})
        public long q() {
            if (this.m) {
                return this.Q.when;
            }
            return 0L;
        }

        public g q0(long[] jArr) {
            this.Q.vibrate = jArr;
            return this;
        }

        public g r0(int r1) {
            this.E = r1;
            return this;
        }

        public g s0(long j) {
            this.Q.when = j;
            return this;
        }

        @h0
        public g t(boolean z) {
            this.O = z;
            return this;
        }

        public g u(boolean z) {
            N(16, z);
            return this;
        }

        public g v(int r1) {
            this.K = r1;
            return this;
        }

        @h0
        public g w(@i0 f fVar) {
            this.P = fVar;
            return this;
        }

        public g x(String str) {
            this.B = str;
            return this;
        }

        public g y(@h0 String str) {
            this.J = str;
            return this;
        }

        @m0(24)
        @h0
        public g z(boolean z) {
            this.o = z;
            this.C.putBoolean(p.K, z);
            return this;
        }
    }

    public static final class h implements j {

        @p0({p0.a.LIBRARY_GROUP_PREFIX})
        static final String d = "android.car.EXTENSIONS";
        private static final String e = "large_icon";
        private static final String f = "car_conversation";
        private static final String g = "app_color";

        @p0({p0.a.LIBRARY_GROUP_PREFIX})
        static final String h = "invisible_actions";
        private static final String i = "author";
        private static final String j = "text";
        private static final String k = "messages";
        private static final String l = "remote_input";
        private static final String m = "on_reply";
        private static final String n = "on_read";
        private static final String o = "participants";
        private static final String p = "timestamp";

        /* renamed from: a, reason: collision with root package name */
        private Bitmap f317a;

        /* renamed from: b, reason: collision with root package name */
        private a f318b;

        /* renamed from: c, reason: collision with root package name */
        private int f319c;

        @Deprecated
        public static class a {

            /* renamed from: a, reason: collision with root package name */
            private final String[] f320a;

            /* renamed from: b, reason: collision with root package name */
            private final w f321b;

            /* renamed from: c, reason: collision with root package name */
            private final PendingIntent f322c;
            private final PendingIntent d;
            private final String[] e;
            private final long f;

            /* renamed from: androidx.core.app.p$h$a$a, reason: collision with other inner class name */
            public static class C0025a {

                /* renamed from: a, reason: collision with root package name */
                private final List<String> f323a = new ArrayList();

                /* renamed from: b, reason: collision with root package name */
                private final String f324b;

                /* renamed from: c, reason: collision with root package name */
                private w f325c;
                private PendingIntent d;
                private PendingIntent e;
                private long f;

                public C0025a(String str) {
                    this.f324b = str;
                }

                public C0025a a(String str) {
                    this.f323a.add(str);
                    return this;
                }

                public a b() {
                    List<String> list = this.f323a;
                    return new a((String[]) list.toArray(new String[list.size()]), this.f325c, this.e, this.d, new String[]{this.f324b}, this.f);
                }

                public C0025a c(long j) {
                    this.f = j;
                    return this;
                }

                public C0025a d(PendingIntent pendingIntent) {
                    this.d = pendingIntent;
                    return this;
                }

                public C0025a e(PendingIntent pendingIntent, w wVar) {
                    this.f325c = wVar;
                    this.e = pendingIntent;
                    return this;
                }
            }

            a(String[] strArr, w wVar, PendingIntent pendingIntent, PendingIntent pendingIntent2, String[] strArr2, long j) {
                this.f320a = strArr;
                this.f321b = wVar;
                this.d = pendingIntent2;
                this.f322c = pendingIntent;
                this.e = strArr2;
                this.f = j;
            }

            public long a() {
                return this.f;
            }

            public String[] b() {
                return this.f320a;
            }

            public String c() {
                String[] strArr = this.e;
                if (strArr.length > 0) {
                    return strArr[0];
                }
                return null;
            }

            public String[] d() {
                return this.e;
            }

            public PendingIntent e() {
                return this.d;
            }

            public w f() {
                return this.f321b;
            }

            public PendingIntent g() {
                return this.f322c;
            }
        }

        public h() {
            this.f319c = 0;
        }

        public h(Notification notification) {
            this.f319c = 0;
            if (Build.VERSION.SDK_INT < 21) {
                return;
            }
            Bundle bundle = p.j(notification) == null ? null : p.j(notification).getBundle(d);
            if (bundle != null) {
                this.f317a = (Bitmap) bundle.getParcelable(e);
                this.f319c = bundle.getInt(g, 0);
                this.f318b = f(bundle.getBundle(f));
            }
        }

        @m0(21)
        private static Bundle b(@h0 a aVar) {
            Bundle bundle = new Bundle();
            String str = (aVar.d() == null || aVar.d().length <= 1) ? null : aVar.d()[0];
            int length = aVar.b().length;
            Parcelable[] parcelableArr = new Parcelable[length];
            for (int r2 = 0; r2 < length; r2++) {
                Bundle bundle2 = new Bundle();
                bundle2.putString(j, aVar.b()[r2]);
                bundle2.putString(i, str);
                parcelableArr[r2] = bundle2;
            }
            bundle.putParcelableArray(k, parcelableArr);
            w wVarF = aVar.f();
            if (wVarF != null) {
                bundle.putParcelable(l, new RemoteInput.Builder(wVarF.n()).setLabel(wVarF.m()).setChoices(wVarF.g()).setAllowFreeFormInput(wVarF.e()).addExtras(wVarF.l()).build());
            }
            bundle.putParcelable(m, aVar.g());
            bundle.putParcelable(n, aVar.e());
            bundle.putStringArray(o, aVar.d());
            bundle.putLong("timestamp", aVar.a());
            return bundle;
        }

        @m0(21)
        private static a f(@i0 Bundle bundle) {
            String[] strArr;
            boolean z;
            if (bundle == null) {
                return null;
            }
            Parcelable[] parcelableArray = bundle.getParcelableArray(k);
            if (parcelableArray != null) {
                int length = parcelableArray.length;
                String[] strArr2 = new String[length];
                for (int r7 = 0; r7 < length; r7++) {
                    if (parcelableArray[r7] instanceof Bundle) {
                        strArr2[r7] = ((Bundle) parcelableArray[r7]).getString(j);
                        if (strArr2[r7] != null) {
                        }
                    }
                    z = false;
                    break;
                }
                z = true;
                if (!z) {
                    return null;
                }
                strArr = strArr2;
            } else {
                strArr = null;
            }
            PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable(n);
            PendingIntent pendingIntent2 = (PendingIntent) bundle.getParcelable(m);
            RemoteInput remoteInput = (RemoteInput) bundle.getParcelable(l);
            String[] stringArray = bundle.getStringArray(o);
            if (stringArray == null || stringArray.length != 1) {
                return null;
            }
            return new a(strArr, remoteInput != null ? new w(remoteInput.getResultKey(), remoteInput.getLabel(), remoteInput.getChoices(), remoteInput.getAllowFreeFormInput(), Build.VERSION.SDK_INT >= 29 ? remoteInput.getEditChoicesBeforeSending() : 0, remoteInput.getExtras(), null) : null, pendingIntent2, pendingIntent, stringArray, bundle.getLong("timestamp"));
        }

        @Override // androidx.core.app.p.j
        public g a(g gVar) {
            if (Build.VERSION.SDK_INT < 21) {
                return gVar;
            }
            Bundle bundle = new Bundle();
            Bitmap bitmap = this.f317a;
            if (bitmap != null) {
                bundle.putParcelable(e, bitmap);
            }
            int r1 = this.f319c;
            if (r1 != 0) {
                bundle.putInt(g, r1);
            }
            a aVar = this.f318b;
            if (aVar != null) {
                bundle.putBundle(f, b(aVar));
            }
            gVar.m().putBundle(d, bundle);
            return gVar;
        }

        @androidx.annotation.k
        public int c() {
            return this.f319c;
        }

        public Bitmap d() {
            return this.f317a;
        }

        @Deprecated
        public a e() {
            return this.f318b;
        }

        public h g(@androidx.annotation.k int r1) {
            this.f319c = r1;
            return this;
        }

        public h h(Bitmap bitmap) {
            this.f317a = bitmap;
            return this;
        }

        @Deprecated
        public h i(a aVar) {
            this.f318b = aVar;
            return this;
        }
    }

    public static class i extends AbstractC0026p {
        private static final int e = 3;

        private RemoteViews s(RemoteViews remoteViews, boolean z) throws Resources.NotFoundException {
            int r9;
            boolean z2 = true;
            RemoteViews remoteViewsC = c(true, a.g.notification_template_custom_big, false);
            remoteViewsC.removeAllViews(a.e.actions);
            List<b> listU = u(this.f329a.f315b);
            if (!z || listU == null || (r9 = Math.min(listU.size(), 3)) <= 0) {
                z2 = false;
            } else {
                for (int r4 = 0; r4 < r9; r4++) {
                    remoteViewsC.addView(a.e.actions, t(listU.get(r4)));
                }
            }
            int r2 = z2 ? 0 : 8;
            remoteViewsC.setViewVisibility(a.e.actions, r2);
            remoteViewsC.setViewVisibility(a.e.action_divider, r2);
            e(remoteViewsC, remoteViews);
            return remoteViewsC;
        }

        private RemoteViews t(b bVar) {
            boolean z = bVar.k == null;
            RemoteViews remoteViews = new RemoteViews(this.f329a.f314a.getPackageName(), z ? a.g.notification_action_tombstone : a.g.notification_action);
            remoteViews.setImageViewBitmap(a.e.action_image, j(bVar.f(), this.f329a.f314a.getResources().getColor(a.b.notification_action_color_filter)));
            remoteViews.setTextViewText(a.e.action_text, bVar.j);
            if (!z) {
                remoteViews.setOnClickPendingIntent(a.e.action_container, bVar.k);
            }
            if (Build.VERSION.SDK_INT >= 15) {
                remoteViews.setContentDescription(a.e.action_container, bVar.j);
            }
            return remoteViews;
        }

        private static List<b> u(List<b> list) {
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (b bVar : list) {
                if (!bVar.k()) {
                    arrayList.add(bVar);
                }
            }
            return arrayList;
        }

        @Override // androidx.core.app.p.AbstractC0026p
        @p0({p0.a.LIBRARY_GROUP_PREFIX})
        public void b(androidx.core.app.o oVar) {
            if (Build.VERSION.SDK_INT >= 24) {
                oVar.a().setStyle(new Notification.DecoratedCustomViewStyle());
            }
        }

        @Override // androidx.core.app.p.AbstractC0026p
        @p0({p0.a.LIBRARY_GROUP_PREFIX})
        public RemoteViews n(androidx.core.app.o oVar) {
            if (Build.VERSION.SDK_INT >= 24) {
                return null;
            }
            RemoteViews remoteViewsI = this.f329a.i();
            if (remoteViewsI == null) {
                remoteViewsI = this.f329a.l();
            }
            if (remoteViewsI == null) {
                return null;
            }
            return s(remoteViewsI, true);
        }

        @Override // androidx.core.app.p.AbstractC0026p
        @p0({p0.a.LIBRARY_GROUP_PREFIX})
        public RemoteViews o(androidx.core.app.o oVar) {
            if (Build.VERSION.SDK_INT < 24 && this.f329a.l() != null) {
                return s(this.f329a.l(), false);
            }
            return null;
        }

        @Override // androidx.core.app.p.AbstractC0026p
        @p0({p0.a.LIBRARY_GROUP_PREFIX})
        public RemoteViews p(androidx.core.app.o oVar) {
            if (Build.VERSION.SDK_INT >= 24) {
                return null;
            }
            RemoteViews remoteViewsN = this.f329a.n();
            RemoteViews remoteViewsL = remoteViewsN != null ? remoteViewsN : this.f329a.l();
            if (remoteViewsN == null) {
                return null;
            }
            return s(remoteViewsL, true);
        }
    }

    public interface j {
        g a(g gVar);
    }

    @Retention(RetentionPolicy.SOURCE)
    @p0({p0.a.LIBRARY_GROUP_PREFIX})
    public @interface k {
    }

    public static class l extends AbstractC0026p {
        private ArrayList<CharSequence> e = new ArrayList<>();

        public l() {
        }

        public l(g gVar) {
            r(gVar);
        }

        @Override // androidx.core.app.p.AbstractC0026p
        @p0({p0.a.LIBRARY_GROUP_PREFIX})
        public void b(androidx.core.app.o oVar) {
            if (Build.VERSION.SDK_INT >= 16) {
                Notification.InboxStyle bigContentTitle = new Notification.InboxStyle(oVar.a()).setBigContentTitle(this.f330b);
                if (this.d) {
                    bigContentTitle.setSummaryText(this.f331c);
                }
                Iterator<CharSequence> it = this.e.iterator();
                while (it.hasNext()) {
                    bigContentTitle.addLine(it.next());
                }
            }
        }

        public l s(CharSequence charSequence) {
            this.e.add(g.r(charSequence));
            return this;
        }

        public l t(CharSequence charSequence) {
            this.f330b = g.r(charSequence);
            return this;
        }

        public l u(CharSequence charSequence) {
            this.f331c = g.r(charSequence);
            this.d = true;
            return this;
        }
    }

    public static class m extends AbstractC0026p {
        public static final int i = 25;
        private final List<a> e = new ArrayList();
        private v f;

        @i0
        private CharSequence g;

        @i0
        private Boolean h;

        public static final class a {
            static final String g = "text";
            static final String h = "time";
            static final String i = "sender";
            static final String j = "type";
            static final String k = "uri";
            static final String l = "extras";
            static final String m = "person";
            static final String n = "sender_person";

            /* renamed from: a, reason: collision with root package name */
            private final CharSequence f326a;

            /* renamed from: b, reason: collision with root package name */
            private final long f327b;

            /* renamed from: c, reason: collision with root package name */
            @i0
            private final v f328c;
            private Bundle d;

            @i0
            private String e;

            @i0
            private Uri f;

            public a(CharSequence charSequence, long j2, @i0 v vVar) {
                this.d = new Bundle();
                this.f326a = charSequence;
                this.f327b = j2;
                this.f328c = vVar;
            }

            @Deprecated
            public a(CharSequence charSequence, long j2, CharSequence charSequence2) {
                this(charSequence, j2, new v.a().f(charSequence2).a());
            }

            @h0
            static Bundle[] a(List<a> list) {
                Bundle[] bundleArr = new Bundle[list.size()];
                int size = list.size();
                for (int r2 = 0; r2 < size; r2++) {
                    bundleArr[r2] = list.get(r2).l();
                }
                return bundleArr;
            }

            @i0
            static a e(Bundle bundle) {
                try {
                    if (bundle.containsKey(g) && bundle.containsKey(h)) {
                        a aVar = new a(bundle.getCharSequence(g), bundle.getLong(h), bundle.containsKey(m) ? v.b(bundle.getBundle(m)) : (!bundle.containsKey(n) || Build.VERSION.SDK_INT < 28) ? bundle.containsKey(i) ? new v.a().f(bundle.getCharSequence(i)).a() : null : v.a((Person) bundle.getParcelable(n)));
                        if (bundle.containsKey("type") && bundle.containsKey(k)) {
                            aVar.k(bundle.getString("type"), (Uri) bundle.getParcelable(k));
                        }
                        if (bundle.containsKey(l)) {
                            aVar.d().putAll(bundle.getBundle(l));
                        }
                        return aVar;
                    }
                } catch (ClassCastException unused) {
                }
                return null;
            }

            @h0
            static List<a> f(Parcelable[] parcelableArr) {
                a aVarE;
                ArrayList arrayList = new ArrayList(parcelableArr.length);
                for (int r1 = 0; r1 < parcelableArr.length; r1++) {
                    if ((parcelableArr[r1] instanceof Bundle) && (aVarE = e((Bundle) parcelableArr[r1])) != null) {
                        arrayList.add(aVarE);
                    }
                }
                return arrayList;
            }

            private Bundle l() {
                Bundle bundle = new Bundle();
                CharSequence charSequence = this.f326a;
                if (charSequence != null) {
                    bundle.putCharSequence(g, charSequence);
                }
                bundle.putLong(h, this.f327b);
                v vVar = this.f328c;
                if (vVar != null) {
                    bundle.putCharSequence(i, vVar.f());
                    if (Build.VERSION.SDK_INT >= 28) {
                        bundle.putParcelable(n, this.f328c.j());
                    } else {
                        bundle.putBundle(m, this.f328c.l());
                    }
                }
                String str = this.e;
                if (str != null) {
                    bundle.putString("type", str);
                }
                Uri uri = this.f;
                if (uri != null) {
                    bundle.putParcelable(k, uri);
                }
                Bundle bundle2 = this.d;
                if (bundle2 != null) {
                    bundle.putBundle(l, bundle2);
                }
                return bundle;
            }

            @i0
            public String b() {
                return this.e;
            }

            @i0
            public Uri c() {
                return this.f;
            }

            @h0
            public Bundle d() {
                return this.d;
            }

            @i0
            public v g() {
                return this.f328c;
            }

            @i0
            @Deprecated
            public CharSequence h() {
                v vVar = this.f328c;
                if (vVar == null) {
                    return null;
                }
                return vVar.f();
            }

            @h0
            public CharSequence i() {
                return this.f326a;
            }

            public long j() {
                return this.f327b;
            }

            public a k(String str, Uri uri) {
                this.e = str;
                this.f = uri;
                return this;
            }
        }

        private m() {
        }

        public m(@h0 v vVar) {
            if (TextUtils.isEmpty(vVar.f())) {
                throw new IllegalArgumentException("User's name must not be empty.");
            }
            this.f = vVar;
        }

        @Deprecated
        public m(@h0 CharSequence charSequence) {
            this.f = new v.a().f(charSequence).a();
        }

        private boolean B() {
            for (int size = this.e.size() - 1; size >= 0; size--) {
                a aVar = this.e.get(size);
                if (aVar.g() != null && aVar.g().f() == null) {
                    return true;
                }
            }
            return false;
        }

        @h0
        private TextAppearanceSpan D(int r8) {
            return new TextAppearanceSpan(null, 0, 0, ColorStateList.valueOf(r8), null);
        }

        private CharSequence E(a aVar) {
            b.i.n.a aVarC = b.i.n.a.c();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            boolean z = Build.VERSION.SDK_INT >= 21;
            int r3 = z ? f0.t : -1;
            CharSequence charSequenceF = aVar.g() == null ? "" : aVar.g().f();
            if (TextUtils.isEmpty(charSequenceF)) {
                charSequenceF = this.f.f();
                if (z && this.f329a.k() != 0) {
                    r3 = this.f329a.k();
                }
            }
            CharSequence charSequenceM = aVarC.m(charSequenceF);
            spannableStringBuilder.append(charSequenceM);
            spannableStringBuilder.setSpan(D(r3), spannableStringBuilder.length() - charSequenceM.length(), spannableStringBuilder.length(), 33);
            spannableStringBuilder.append((CharSequence) "  ").append(aVarC.m(aVar.i() != null ? aVar.i() : ""));
            return spannableStringBuilder;
        }

        @i0
        public static m v(Notification notification) {
            Bundle bundleJ = p.j(notification);
            if (bundleJ != null && !bundleJ.containsKey(p.T) && !bundleJ.containsKey(p.U)) {
                return null;
            }
            try {
                m mVar = new m();
                mVar.q(bundleJ);
                return mVar;
            } catch (ClassCastException unused) {
                return null;
            }
        }

        @i0
        private a w() {
            for (int size = this.e.size() - 1; size >= 0; size--) {
                a aVar = this.e.get(size);
                if (aVar.g() != null && !TextUtils.isEmpty(aVar.g().f())) {
                    return aVar;
                }
            }
            if (this.e.isEmpty()) {
                return null;
            }
            return this.e.get(r0.size() - 1);
        }

        @Deprecated
        public CharSequence A() {
            return this.f.f();
        }

        public boolean C() {
            g gVar = this.f329a;
            if (gVar != null && gVar.f314a.getApplicationInfo().targetSdkVersion < 28 && this.h == null) {
                return this.g != null;
            }
            Boolean bool = this.h;
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        }

        public m F(@i0 CharSequence charSequence) {
            this.g = charSequence;
            return this;
        }

        public m G(boolean z) {
            this.h = Boolean.valueOf(z);
            return this;
        }

        @Override // androidx.core.app.p.AbstractC0026p
        public void a(Bundle bundle) {
            super.a(bundle);
            bundle.putCharSequence(p.T, this.f.f());
            bundle.putBundle(p.U, this.f.l());
            bundle.putCharSequence(p.Y, this.g);
            if (this.g != null && this.h.booleanValue()) {
                bundle.putCharSequence(p.V, this.g);
            }
            if (!this.e.isEmpty()) {
                bundle.putParcelableArray(p.W, a.a(this.e));
            }
            Boolean bool = this.h;
            if (bool != null) {
                bundle.putBoolean(p.X, bool.booleanValue());
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:47:0x00ec  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x0106  */
        /* JADX WARN: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
        @Override // androidx.core.app.p.AbstractC0026p
        @androidx.annotation.p0({androidx.annotation.p0.a.LIBRARY_GROUP_PREFIX})
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void b(androidx.core.app.o r11) {
            /*
                Method dump skipped, instructions count: 348
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.p.m.b(androidx.core.app.o):void");
        }

        @Override // androidx.core.app.p.AbstractC0026p
        @p0({p0.a.LIBRARY_GROUP_PREFIX})
        protected void q(Bundle bundle) {
            this.e.clear();
            this.f = bundle.containsKey(p.U) ? v.b(bundle.getBundle(p.U)) : new v.a().f(bundle.getString(p.T)).a();
            CharSequence charSequence = bundle.getCharSequence(p.V);
            this.g = charSequence;
            if (charSequence == null) {
                this.g = bundle.getCharSequence(p.Y);
            }
            Parcelable[] parcelableArray = bundle.getParcelableArray(p.W);
            if (parcelableArray != null) {
                this.e.addAll(a.f(parcelableArray));
            }
            if (bundle.containsKey(p.X)) {
                this.h = Boolean.valueOf(bundle.getBoolean(p.X));
            }
        }

        public m s(a aVar) {
            this.e.add(aVar);
            if (this.e.size() > 25) {
                this.e.remove(0);
            }
            return this;
        }

        public m t(CharSequence charSequence, long j, v vVar) {
            s(new a(charSequence, j, vVar));
            return this;
        }

        @Deprecated
        public m u(CharSequence charSequence, long j, CharSequence charSequence2) {
            this.e.add(new a(charSequence, j, new v.a().f(charSequence2).a()));
            if (this.e.size() > 25) {
                this.e.remove(0);
            }
            return this;
        }

        @i0
        public CharSequence x() {
            return this.g;
        }

        public List<a> y() {
            return this.e;
        }

        public v z() {
            return this.f;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @p0({p0.a.LIBRARY_GROUP_PREFIX})
    public @interface n {
    }

    @Retention(RetentionPolicy.SOURCE)
    @p0({p0.a.LIBRARY_GROUP_PREFIX})
    public @interface o {
    }

    /* renamed from: androidx.core.app.p$p, reason: collision with other inner class name */
    public static abstract class AbstractC0026p {

        /* renamed from: a, reason: collision with root package name */
        @p0({p0.a.LIBRARY_GROUP_PREFIX})
        protected g f329a;

        /* renamed from: b, reason: collision with root package name */
        CharSequence f330b;

        /* renamed from: c, reason: collision with root package name */
        CharSequence f331c;
        boolean d = false;

        private int f() throws Resources.NotFoundException {
            Resources resources = this.f329a.f314a.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(a.c.notification_top_pad);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(a.c.notification_top_pad_large_text);
            float fG = (g(resources.getConfiguration().fontScale, 1.0f, 1.3f) - 1.0f) / 0.29999995f;
            return Math.round(((1.0f - fG) * dimensionPixelSize) + (fG * dimensionPixelSize2));
        }

        private static float g(float f, float f2, float f3) {
            return f < f2 ? f2 : f > f3 ? f3 : f;
        }

        private Bitmap i(int r2, int r3, int r4) {
            return k(IconCompat.q(this.f329a.f314a, r2), r3, r4);
        }

        private Bitmap k(IconCompat iconCompat, int r5, int r6) {
            Drawable drawableD = iconCompat.D(this.f329a.f314a);
            int intrinsicWidth = r6 == 0 ? drawableD.getIntrinsicWidth() : r6;
            if (r6 == 0) {
                r6 = drawableD.getIntrinsicHeight();
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(intrinsicWidth, r6, Bitmap.Config.ARGB_8888);
            drawableD.setBounds(0, 0, intrinsicWidth, r6);
            if (r5 != 0) {
                drawableD.mutate().setColorFilter(new PorterDuffColorFilter(r5, PorterDuff.Mode.SRC_IN));
            }
            drawableD.draw(new Canvas(bitmapCreateBitmap));
            return bitmapCreateBitmap;
        }

        private Bitmap l(int r3, int r4, int r5, int r6) {
            int r0 = a.d.notification_icon_background;
            if (r6 == 0) {
                r6 = 0;
            }
            Bitmap bitmapI = i(r0, r6, r4);
            Canvas canvas = new Canvas(bitmapI);
            Drawable drawableMutate = this.f329a.f314a.getResources().getDrawable(r3).mutate();
            drawableMutate.setFilterBitmap(true);
            int r42 = (r4 - r5) / 2;
            int r52 = r5 + r42;
            drawableMutate.setBounds(r42, r42, r52, r52);
            drawableMutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_ATOP));
            drawableMutate.draw(canvas);
            return bitmapI;
        }

        private void m(RemoteViews remoteViews) {
            remoteViews.setViewVisibility(a.e.title, 8);
            remoteViews.setViewVisibility(a.e.text2, 8);
            remoteViews.setViewVisibility(a.e.text, 8);
        }

        @p0({p0.a.LIBRARY_GROUP_PREFIX})
        public void a(Bundle bundle) {
        }

        @p0({p0.a.LIBRARY_GROUP_PREFIX})
        public void b(androidx.core.app.o oVar) {
        }

        /* JADX WARN: Removed duplicated region for block: B:67:0x018c  */
        /* JADX WARN: Removed duplicated region for block: B:72:0x0195  */
        /* JADX WARN: Removed duplicated region for block: B:76:0x01b7  */
        /* JADX WARN: Removed duplicated region for block: B:86:0x0209  */
        /* JADX WARN: Removed duplicated region for block: B:89:0x020e  */
        /* JADX WARN: Removed duplicated region for block: B:90:0x0210  */
        /* JADX WARN: Removed duplicated region for block: B:94:0x021a  */
        @androidx.annotation.p0({androidx.annotation.p0.a.LIBRARY_GROUP_PREFIX})
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public android.widget.RemoteViews c(boolean r13, int r14, boolean r15) throws android.content.res.Resources.NotFoundException {
            /*
                Method dump skipped, instructions count: 544
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.p.AbstractC0026p.c(boolean, int, boolean):android.widget.RemoteViews");
        }

        public Notification d() {
            g gVar = this.f329a;
            if (gVar != null) {
                return gVar.g();
            }
            return null;
        }

        @p0({p0.a.LIBRARY_GROUP_PREFIX})
        public void e(RemoteViews remoteViews, RemoteViews remoteViews2) {
            m(remoteViews);
            remoteViews.removeAllViews(a.e.notification_main_column);
            remoteViews.addView(a.e.notification_main_column, remoteViews2.clone());
            remoteViews.setViewVisibility(a.e.notification_main_column, 0);
            if (Build.VERSION.SDK_INT >= 21) {
                remoteViews.setViewPadding(a.e.notification_main_column_container, 0, f(), 0, 0);
            }
        }

        @p0({p0.a.LIBRARY_GROUP_PREFIX})
        public Bitmap h(int r2, int r3) {
            return i(r2, r3, 0);
        }

        Bitmap j(IconCompat iconCompat, int r3) {
            return k(iconCompat, r3, 0);
        }

        @p0({p0.a.LIBRARY_GROUP_PREFIX})
        public RemoteViews n(androidx.core.app.o oVar) {
            return null;
        }

        @p0({p0.a.LIBRARY_GROUP_PREFIX})
        public RemoteViews o(androidx.core.app.o oVar) {
            return null;
        }

        @p0({p0.a.LIBRARY_GROUP_PREFIX})
        public RemoteViews p(androidx.core.app.o oVar) {
            return null;
        }

        @p0({p0.a.LIBRARY_GROUP_PREFIX})
        protected void q(Bundle bundle) {
        }

        public void r(g gVar) {
            if (this.f329a != gVar) {
                this.f329a = gVar;
                if (gVar != null) {
                    gVar.k0(this);
                }
            }
        }
    }

    public static final class q implements j {
        private static final String A = "displayIntent";
        private static final String B = "pages";
        private static final String C = "background";
        private static final String D = "contentIcon";
        private static final String E = "contentIconGravity";
        private static final String F = "contentActionIndex";
        private static final String G = "customSizePreset";
        private static final String H = "customContentHeight";
        private static final String I = "gravity";
        private static final String J = "hintScreenTimeout";
        private static final String K = "dismissalId";
        private static final String L = "bridgeTag";
        private static final int M = 1;
        private static final int N = 2;
        private static final int O = 4;
        private static final int P = 8;
        private static final int Q = 16;
        private static final int R = 32;
        private static final int S = 64;
        private static final int T = 1;
        private static final int U = 8388613;
        private static final int V = 80;
        public static final int o = -1;

        @Deprecated
        public static final int p = 0;

        @Deprecated
        public static final int q = 1;

        @Deprecated
        public static final int r = 2;

        @Deprecated
        public static final int s = 3;

        @Deprecated
        public static final int t = 4;

        @Deprecated
        public static final int u = 5;

        @Deprecated
        public static final int v = 0;

        @Deprecated
        public static final int w = -1;
        private static final String x = "android.wearable.EXTENSIONS";
        private static final String y = "actions";
        private static final String z = "flags";

        /* renamed from: a, reason: collision with root package name */
        private ArrayList<b> f332a;

        /* renamed from: b, reason: collision with root package name */
        private int f333b;

        /* renamed from: c, reason: collision with root package name */
        private PendingIntent f334c;
        private ArrayList<Notification> d;
        private Bitmap e;
        private int f;
        private int g;
        private int h;
        private int i;
        private int j;
        private int k;
        private int l;
        private String m;
        private String n;

        public q() {
            this.f332a = new ArrayList<>();
            this.f333b = 1;
            this.d = new ArrayList<>();
            this.g = 8388613;
            this.h = -1;
            this.i = 0;
            this.k = 80;
        }

        public q(Notification notification) {
            this.f332a = new ArrayList<>();
            this.f333b = 1;
            this.d = new ArrayList<>();
            this.g = 8388613;
            this.h = -1;
            this.i = 0;
            this.k = 80;
            Bundle bundleJ = p.j(notification);
            Bundle bundle = bundleJ != null ? bundleJ.getBundle(x) : null;
            if (bundle != null) {
                ArrayList parcelableArrayList = bundle.getParcelableArrayList(y);
                if (Build.VERSION.SDK_INT >= 16 && parcelableArrayList != null) {
                    int size = parcelableArrayList.size();
                    b[] bVarArr = new b[size];
                    for (int r9 = 0; r9 < size; r9++) {
                        int r10 = Build.VERSION.SDK_INT;
                        if (r10 >= 20) {
                            bVarArr[r9] = p.b((Notification.Action) parcelableArrayList.get(r9));
                        } else if (r10 >= 16) {
                            bVarArr[r9] = s.g((Bundle) parcelableArrayList.get(r9));
                        }
                    }
                    Collections.addAll(this.f332a, bVarArr);
                }
                this.f333b = bundle.getInt(z, 1);
                this.f334c = (PendingIntent) bundle.getParcelable(A);
                Notification[] notificationArrO = p.o(bundle, B);
                if (notificationArrO != null) {
                    Collections.addAll(this.d, notificationArrO);
                }
                this.e = (Bitmap) bundle.getParcelable(C);
                this.f = bundle.getInt(D);
                this.g = bundle.getInt(E, 8388613);
                this.h = bundle.getInt(F, -1);
                this.i = bundle.getInt(G, 0);
                this.j = bundle.getInt(H);
                this.k = bundle.getInt(I, 80);
                this.l = bundle.getInt(J);
                this.m = bundle.getString(K);
                this.n = bundle.getString(L);
            }
        }

        private void N(int r1, boolean z2) {
            int r12;
            if (z2) {
                r12 = r1 | this.f333b;
            } else {
                r12 = (~r1) & this.f333b;
            }
            this.f333b = r12;
        }

        @m0(20)
        private static Notification.Action i(b bVar) {
            Notification.Action.Builder builder;
            if (Build.VERSION.SDK_INT >= 23) {
                IconCompat iconCompatF = bVar.f();
                builder = new Notification.Action.Builder(iconCompatF == null ? null : iconCompatF.J(), bVar.j(), bVar.a());
            } else {
                IconCompat iconCompatF2 = bVar.f();
                builder = new Notification.Action.Builder((iconCompatF2 == null || iconCompatF2.y() != 2) ? 0 : iconCompatF2.t(), bVar.j(), bVar.a());
            }
            Bundle bundle = bVar.d() != null ? new Bundle(bVar.d()) : new Bundle();
            bundle.putBoolean("android.support.allowGeneratedReplies", bVar.b());
            if (Build.VERSION.SDK_INT >= 24) {
                builder.setAllowGeneratedReplies(bVar.b());
            }
            builder.addExtras(bundle);
            w[] wVarArrG = bVar.g();
            if (wVarArrG != null) {
                for (RemoteInput remoteInput : w.d(wVarArrG)) {
                    builder.addRemoteInput(remoteInput);
                }
            }
            return builder.build();
        }

        @Deprecated
        public boolean A() {
            return (this.f333b & 4) != 0;
        }

        @Deprecated
        public List<Notification> B() {
            return this.d;
        }

        public boolean C() {
            return (this.f333b & 8) != 0;
        }

        @Deprecated
        public q D(Bitmap bitmap) {
            this.e = bitmap;
            return this;
        }

        public q E(String str) {
            this.n = str;
            return this;
        }

        public q F(int r1) {
            this.h = r1;
            return this;
        }

        @Deprecated
        public q G(int r1) {
            this.f = r1;
            return this;
        }

        @Deprecated
        public q H(int r1) {
            this.g = r1;
            return this;
        }

        public q I(boolean z2) {
            N(1, z2);
            return this;
        }

        @Deprecated
        public q J(int r1) {
            this.j = r1;
            return this;
        }

        @Deprecated
        public q K(int r1) {
            this.i = r1;
            return this;
        }

        public q L(String str) {
            this.m = str;
            return this;
        }

        @Deprecated
        public q M(PendingIntent pendingIntent) {
            this.f334c = pendingIntent;
            return this;
        }

        @Deprecated
        public q O(int r1) {
            this.k = r1;
            return this;
        }

        @Deprecated
        public q P(boolean z2) {
            N(32, z2);
            return this;
        }

        @Deprecated
        public q Q(boolean z2) {
            N(16, z2);
            return this;
        }

        public q R(boolean z2) {
            N(64, z2);
            return this;
        }

        @Deprecated
        public q S(boolean z2) {
            N(2, z2);
            return this;
        }

        @Deprecated
        public q T(int r1) {
            this.l = r1;
            return this;
        }

        @Deprecated
        public q U(boolean z2) {
            N(4, z2);
            return this;
        }

        public q V(boolean z2) {
            N(8, z2);
            return this;
        }

        @Override // androidx.core.app.p.j
        public g a(g gVar) {
            ArrayList<? extends Parcelable> arrayList;
            Parcelable parcelableI;
            Bundle bundle = new Bundle();
            if (!this.f332a.isEmpty()) {
                if (Build.VERSION.SDK_INT >= 16) {
                    arrayList = new ArrayList<>(this.f332a.size());
                    Iterator<b> it = this.f332a.iterator();
                    while (it.hasNext()) {
                        b next = it.next();
                        int r6 = Build.VERSION.SDK_INT;
                        if (r6 >= 20) {
                            parcelableI = i(next);
                        } else if (r6 >= 16) {
                            parcelableI = s.j(next);
                        }
                        arrayList.add(parcelableI);
                    }
                } else {
                    arrayList = null;
                }
                bundle.putParcelableArrayList(y, arrayList);
            }
            int r1 = this.f333b;
            if (r1 != 1) {
                bundle.putInt(z, r1);
            }
            PendingIntent pendingIntent = this.f334c;
            if (pendingIntent != null) {
                bundle.putParcelable(A, pendingIntent);
            }
            if (!this.d.isEmpty()) {
                ArrayList<Notification> arrayList2 = this.d;
                bundle.putParcelableArray(B, (Parcelable[]) arrayList2.toArray(new Notification[arrayList2.size()]));
            }
            Bitmap bitmap = this.e;
            if (bitmap != null) {
                bundle.putParcelable(C, bitmap);
            }
            int r12 = this.f;
            if (r12 != 0) {
                bundle.putInt(D, r12);
            }
            int r13 = this.g;
            if (r13 != 8388613) {
                bundle.putInt(E, r13);
            }
            int r14 = this.h;
            if (r14 != -1) {
                bundle.putInt(F, r14);
            }
            int r15 = this.i;
            if (r15 != 0) {
                bundle.putInt(G, r15);
            }
            int r16 = this.j;
            if (r16 != 0) {
                bundle.putInt(H, r16);
            }
            int r17 = this.k;
            if (r17 != 80) {
                bundle.putInt(I, r17);
            }
            int r18 = this.l;
            if (r18 != 0) {
                bundle.putInt(J, r18);
            }
            String str = this.m;
            if (str != null) {
                bundle.putString(K, str);
            }
            String str2 = this.n;
            if (str2 != null) {
                bundle.putString(L, str2);
            }
            gVar.m().putBundle(x, bundle);
            return gVar;
        }

        public q b(b bVar) {
            this.f332a.add(bVar);
            return this;
        }

        public q c(List<b> list) {
            this.f332a.addAll(list);
            return this;
        }

        @Deprecated
        public q d(Notification notification) {
            this.d.add(notification);
            return this;
        }

        @Deprecated
        public q e(List<Notification> list) {
            this.d.addAll(list);
            return this;
        }

        public q f() {
            this.f332a.clear();
            return this;
        }

        @Deprecated
        public q g() {
            this.d.clear();
            return this;
        }

        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public q clone() {
            q qVar = new q();
            qVar.f332a = new ArrayList<>(this.f332a);
            qVar.f333b = this.f333b;
            qVar.f334c = this.f334c;
            qVar.d = new ArrayList<>(this.d);
            qVar.e = this.e;
            qVar.f = this.f;
            qVar.g = this.g;
            qVar.h = this.h;
            qVar.i = this.i;
            qVar.j = this.j;
            qVar.k = this.k;
            qVar.l = this.l;
            qVar.m = this.m;
            qVar.n = this.n;
            return qVar;
        }

        public List<b> j() {
            return this.f332a;
        }

        @Deprecated
        public Bitmap k() {
            return this.e;
        }

        public String l() {
            return this.n;
        }

        public int m() {
            return this.h;
        }

        @Deprecated
        public int n() {
            return this.f;
        }

        @Deprecated
        public int o() {
            return this.g;
        }

        public boolean p() {
            return (this.f333b & 1) != 0;
        }

        @Deprecated
        public int q() {
            return this.j;
        }

        @Deprecated
        public int r() {
            return this.i;
        }

        public String s() {
            return this.m;
        }

        @Deprecated
        public PendingIntent t() {
            return this.f334c;
        }

        @Deprecated
        public int u() {
            return this.k;
        }

        @Deprecated
        public boolean v() {
            return (this.f333b & 32) != 0;
        }

        @Deprecated
        public boolean w() {
            return (this.f333b & 16) != 0;
        }

        public boolean x() {
            return (this.f333b & 64) != 0;
        }

        @Deprecated
        public boolean y() {
            return (this.f333b & 2) != 0;
        }

        @Deprecated
        public int z() {
            return this.l;
        }
    }

    @Deprecated
    public p() {
    }

    public static b a(Notification notification, int r4) {
        int r02 = Build.VERSION.SDK_INT;
        if (r02 >= 20) {
            return b(notification.actions[r4]);
        }
        if (r02 >= 19) {
            Notification.Action action = notification.actions[r4];
            SparseArray sparseParcelableArray = notification.extras.getSparseParcelableArray(r.e);
            return s.l(action.icon, action.title, action.actionIntent, sparseParcelableArray != null ? (Bundle) sparseParcelableArray.get(r4) : null);
        }
        if (r02 >= 16) {
            return s.e(notification, r4);
        }
        return null;
    }

    @m0(20)
    static b b(Notification.Action action) {
        w[] wVarArr;
        int r8;
        RemoteInput[] remoteInputs = action.getRemoteInputs();
        if (remoteInputs == null) {
            wVarArr = null;
        } else {
            w[] wVarArr2 = new w[remoteInputs.length];
            for (int r6 = 0; r6 < remoteInputs.length; r6++) {
                RemoteInput remoteInput = remoteInputs[r6];
                wVarArr2[r6] = new w(remoteInput.getResultKey(), remoteInput.getLabel(), remoteInput.getChoices(), remoteInput.getAllowFreeFormInput(), Build.VERSION.SDK_INT >= 29 ? remoteInput.getEditChoicesBeforeSending() : 0, remoteInput.getExtras(), null);
            }
            wVarArr = wVarArr2;
        }
        boolean z2 = Build.VERSION.SDK_INT >= 24 ? action.getExtras().getBoolean("android.support.allowGeneratedReplies") || action.getAllowGeneratedReplies() : action.getExtras().getBoolean("android.support.allowGeneratedReplies");
        boolean z3 = action.getExtras().getBoolean("android.support.action.showsUserInterface", true);
        int semanticAction = Build.VERSION.SDK_INT >= 28 ? action.getSemanticAction() : action.getExtras().getInt("android.support.action.semanticAction", 0);
        boolean zIsContextual = Build.VERSION.SDK_INT >= 29 ? action.isContextual() : false;
        if (Build.VERSION.SDK_INT < 23) {
            return new b(action.icon, action.title, action.actionIntent, action.getExtras(), wVarArr, (w[]) null, z2, semanticAction, z3, zIsContextual);
        }
        if (action.getIcon() != null || (r8 = action.icon) == 0) {
            return new b(action.getIcon() != null ? IconCompat.h(action.getIcon()) : null, action.title, action.actionIntent, action.getExtras(), wVarArr, (w[]) null, z2, semanticAction, z3, zIsContextual);
        }
        return new b(r8, action.title, action.actionIntent, action.getExtras(), wVarArr, (w[]) null, z2, semanticAction, z3, zIsContextual);
    }

    public static int c(Notification notification) {
        int r02 = Build.VERSION.SDK_INT;
        if (r02 < 19) {
            if (r02 >= 16) {
                return s.f(notification);
            }
            return 0;
        }
        Notification.Action[] actionArr = notification.actions;
        if (actionArr != null) {
            return actionArr.length;
        }
        return 0;
    }

    public static boolean d(Notification notification) {
        if (Build.VERSION.SDK_INT >= 29) {
            return notification.getAllowSystemGeneratedContextualActions();
        }
        return false;
    }

    public static int e(Notification notification) {
        if (Build.VERSION.SDK_INT >= 26) {
            return notification.getBadgeIconType();
        }
        return 0;
    }

    @i0
    public static f f(@h0 Notification notification) {
        if (Build.VERSION.SDK_INT >= 29) {
            return f.a(notification.getBubbleMetadata());
        }
        return null;
    }

    public static String g(Notification notification) {
        if (Build.VERSION.SDK_INT >= 21) {
            return notification.category;
        }
        return null;
    }

    public static String h(Notification notification) {
        if (Build.VERSION.SDK_INT >= 26) {
            return notification.getChannelId();
        }
        return null;
    }

    @m0(19)
    public static CharSequence i(Notification notification) {
        return notification.extras.getCharSequence(v);
    }

    @i0
    public static Bundle j(Notification notification) {
        int r02 = Build.VERSION.SDK_INT;
        if (r02 >= 19) {
            return notification.extras;
        }
        if (r02 >= 16) {
            return s.k(notification);
        }
        return null;
    }

    public static String k(Notification notification) {
        Bundle bundleK;
        int r02 = Build.VERSION.SDK_INT;
        if (r02 >= 20) {
            return notification.getGroup();
        }
        if (r02 >= 19) {
            bundleK = notification.extras;
        } else {
            if (r02 < 16) {
                return null;
            }
            bundleK = s.k(notification);
        }
        return bundleK.getString(r.f339b);
    }

    public static int l(Notification notification) {
        if (Build.VERSION.SDK_INT >= 26) {
            return notification.getGroupAlertBehavior();
        }
        return 0;
    }

    @m0(21)
    public static List<b> m(Notification notification) {
        Bundle bundle;
        ArrayList arrayList = new ArrayList();
        Bundle bundle2 = notification.extras.getBundle("android.car.EXTENSIONS");
        if (bundle2 != null && (bundle = bundle2.getBundle("invisible_actions")) != null) {
            for (int r1 = 0; r1 < bundle.size(); r1++) {
                arrayList.add(s.g(bundle.getBundle(Integer.toString(r1))));
            }
        }
        return arrayList;
    }

    public static boolean n(Notification notification) {
        Bundle bundleK;
        int r02 = Build.VERSION.SDK_INT;
        if (r02 >= 20) {
            return (notification.flags & 256) != 0;
        }
        if (r02 >= 19) {
            bundleK = notification.extras;
        } else {
            if (r02 < 16) {
                return false;
            }
            bundleK = s.k(notification);
        }
        return bundleK.getBoolean(r.f338a);
    }

    static Notification[] o(Bundle bundle, String str) {
        Parcelable[] parcelableArray = bundle.getParcelableArray(str);
        if ((parcelableArray instanceof Notification[]) || parcelableArray == null) {
            return (Notification[]) parcelableArray;
        }
        Notification[] notificationArr = new Notification[parcelableArray.length];
        for (int r2 = 0; r2 < parcelableArray.length; r2++) {
            notificationArr[r2] = (Notification) parcelableArray[r2];
        }
        bundle.putParcelableArray(str, notificationArr);
        return notificationArr;
    }

    public static String p(Notification notification) {
        if (Build.VERSION.SDK_INT >= 26) {
            return notification.getShortcutId();
        }
        return null;
    }

    public static String q(Notification notification) {
        Bundle bundleK;
        int r02 = Build.VERSION.SDK_INT;
        if (r02 >= 20) {
            return notification.getSortKey();
        }
        if (r02 >= 19) {
            bundleK = notification.extras;
        } else {
            if (r02 < 16) {
                return null;
            }
            bundleK = s.k(notification);
        }
        return bundleK.getString(r.d);
    }

    public static long r(Notification notification) {
        if (Build.VERSION.SDK_INT >= 26) {
            return notification.getTimeoutAfter();
        }
        return 0L;
    }

    public static boolean s(Notification notification) {
        Bundle bundleK;
        int r02 = Build.VERSION.SDK_INT;
        if (r02 >= 20) {
            return (notification.flags & 512) != 0;
        }
        if (r02 >= 19) {
            bundleK = notification.extras;
        } else {
            if (r02 < 16) {
                return false;
            }
            bundleK = s.k(notification);
        }
        return bundleK.getBoolean(r.f340c);
    }
}
