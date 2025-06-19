package androidx.core.app;

import android.app.Activity;
import android.app.SharedElementCallback;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.DragEvent;
import android.view.View;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.annotation.m0;
import androidx.annotation.p0;
import androidx.core.app.z;
import com.google.android.material.transformation.FabTransformationScrimBehavior;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class a extends b.i.c.c {
    private static c d;

    /* renamed from: androidx.core.app.a$a, reason: collision with other inner class name */
    class RunnableC0020a implements Runnable {
        final /* synthetic */ String[] d;
        final /* synthetic */ Activity e;
        final /* synthetic */ int f;

        RunnableC0020a(String[] strArr, Activity activity, int r3) {
            this.d = strArr;
            this.e = activity;
            this.f = r3;
        }

        @Override // java.lang.Runnable
        public void run() {
            int[] r0 = new int[this.d.length];
            PackageManager packageManager = this.e.getPackageManager();
            String packageName = this.e.getPackageName();
            int length = this.d.length;
            for (int r4 = 0; r4 < length; r4++) {
                r0[r4] = packageManager.checkPermission(this.d[r4], packageName);
            }
            ((b) this.e).onRequestPermissionsResult(this.f, this.d, r0);
        }
    }

    public interface b {
        void onRequestPermissionsResult(int r1, @h0 String[] strArr, @h0 int[] r3);
    }

    public interface c {
        boolean a(@h0 Activity activity, @androidx.annotation.z(from = FabTransformationScrimBehavior.j) int r2, int r3, @i0 Intent intent);

        boolean b(@h0 Activity activity, @h0 String[] strArr, @androidx.annotation.z(from = FabTransformationScrimBehavior.j) int r3);
    }

    @p0({p0.a.LIBRARY_GROUP_PREFIX})
    public interface d {
        void c(int r1);
    }

    @m0(21)
    private static class e extends SharedElementCallback {

        /* renamed from: a, reason: collision with root package name */
        private final z f258a;

        /* renamed from: androidx.core.app.a$e$a, reason: collision with other inner class name */
        class C0021a implements z.a {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ SharedElementCallback.OnSharedElementsReadyListener f259a;

            C0021a(SharedElementCallback.OnSharedElementsReadyListener onSharedElementsReadyListener) {
                this.f259a = onSharedElementsReadyListener;
            }

            @Override // androidx.core.app.z.a
            public void a() {
                this.f259a.onSharedElementsReady();
            }
        }

        e(z zVar) {
            this.f258a = zVar;
        }

        @Override // android.app.SharedElementCallback
        public Parcelable onCaptureSharedElementSnapshot(View view, Matrix matrix, RectF rectF) {
            return this.f258a.b(view, matrix, rectF);
        }

        @Override // android.app.SharedElementCallback
        public View onCreateSnapshotView(Context context, Parcelable parcelable) {
            return this.f258a.c(context, parcelable);
        }

        @Override // android.app.SharedElementCallback
        public void onMapSharedElements(List<String> list, Map<String, View> map) {
            this.f258a.d(list, map);
        }

        @Override // android.app.SharedElementCallback
        public void onRejectSharedElements(List<View> list) {
            this.f258a.e(list);
        }

        @Override // android.app.SharedElementCallback
        public void onSharedElementEnd(List<String> list, List<View> list2, List<View> list3) {
            this.f258a.f(list, list2, list3);
        }

        @Override // android.app.SharedElementCallback
        public void onSharedElementStart(List<String> list, List<View> list2, List<View> list3) {
            this.f258a.g(list, list2, list3);
        }

        @Override // android.app.SharedElementCallback
        @m0(23)
        public void onSharedElementsArrived(List<String> list, List<View> list2, SharedElementCallback.OnSharedElementsReadyListener onSharedElementsReadyListener) {
            this.f258a.h(list, list2, new C0021a(onSharedElementsReadyListener));
        }
    }

    protected a() {
    }

    public static void A(@h0 Activity activity) {
        if (Build.VERSION.SDK_INT < 28 && androidx.core.app.d.i(activity)) {
            return;
        }
        activity.recreate();
    }

    @i0
    public static b.i.p.e B(Activity activity, DragEvent dragEvent) {
        return b.i.p.e.b(activity, dragEvent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void C(@h0 Activity activity, @h0 String[] strArr, @androidx.annotation.z(from = FabTransformationScrimBehavior.j) int r4) {
        c cVar = d;
        if (cVar == null || !cVar.b(activity, strArr, r4)) {
            if (Build.VERSION.SDK_INT >= 23) {
                if (activity instanceof d) {
                    ((d) activity).c(r4);
                }
                activity.requestPermissions(strArr, r4);
            } else if (activity instanceof b) {
                new Handler(Looper.getMainLooper()).post(new RunnableC0020a(strArr, activity, r4));
            }
        }
    }

    @h0
    public static <T extends View> T D(@h0 Activity activity, @androidx.annotation.w int r3) {
        if (Build.VERSION.SDK_INT >= 28) {
            return (T) activity.requireViewById(r3);
        }
        T t = (T) activity.findViewById(r3);
        if (t != null) {
            return t;
        }
        throw new IllegalArgumentException("ID does not reference a View inside this Activity");
    }

    public static void E(@h0 Activity activity, @i0 z zVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            activity.setEnterSharedElementCallback(zVar != null ? new e(zVar) : null);
        }
    }

    public static void F(@h0 Activity activity, @i0 z zVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            activity.setExitSharedElementCallback(zVar != null ? new e(zVar) : null);
        }
    }

    public static void G(@i0 c cVar) {
        d = cVar;
    }

    public static boolean H(@h0 Activity activity, @h0 String str) {
        if (Build.VERSION.SDK_INT >= 23) {
            return activity.shouldShowRequestPermissionRationale(str);
        }
        return false;
    }

    public static void I(@h0 Activity activity, @h0 Intent intent, int r4, @i0 Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            activity.startActivityForResult(intent, r4, bundle);
        } else {
            activity.startActivityForResult(intent, r4);
        }
    }

    public static void J(@h0 Activity activity, @h0 IntentSender intentSender, int r4, @i0 Intent intent, int r6, int r7, int r8, @i0 Bundle bundle) throws IntentSender.SendIntentException {
        if (Build.VERSION.SDK_INT >= 16) {
            activity.startIntentSenderForResult(intentSender, r4, intent, r6, r7, r8, bundle);
        } else {
            activity.startIntentSenderForResult(intentSender, r4, intent, r6, r7, r8);
        }
    }

    public static void K(@h0 Activity activity) {
        if (Build.VERSION.SDK_INT >= 21) {
            activity.startPostponedEnterTransition();
        }
    }

    public static void u(@h0 Activity activity) {
        if (Build.VERSION.SDK_INT >= 16) {
            activity.finishAffinity();
        } else {
            activity.finish();
        }
    }

    public static void v(@h0 Activity activity) {
        if (Build.VERSION.SDK_INT >= 21) {
            activity.finishAfterTransition();
        } else {
            activity.finish();
        }
    }

    @p0({p0.a.LIBRARY_GROUP_PREFIX})
    public static c w() {
        return d;
    }

    @i0
    public static Uri x(@h0 Activity activity) {
        if (Build.VERSION.SDK_INT >= 22) {
            return activity.getReferrer();
        }
        Intent intent = activity.getIntent();
        Uri uri = (Uri) intent.getParcelableExtra("android.intent.extra.REFERRER");
        if (uri != null) {
            return uri;
        }
        String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
        if (stringExtra != null) {
            return Uri.parse(stringExtra);
        }
        return null;
    }

    @Deprecated
    public static boolean y(Activity activity) {
        activity.invalidateOptionsMenu();
        return true;
    }

    public static void z(@h0 Activity activity) {
        if (Build.VERSION.SDK_INT >= 21) {
            activity.postponeEnterTransition();
        }
    }
}
