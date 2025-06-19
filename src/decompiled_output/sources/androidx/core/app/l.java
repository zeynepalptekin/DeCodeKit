package androidx.core.app;

import android.app.Activity;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.SparseIntArray;
import android.view.FrameMetrics;
import android.view.Window;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.annotation.m0;
import androidx.annotation.p0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class l {

    /* renamed from: b, reason: collision with root package name */
    public static final int f275b = 0;

    /* renamed from: c, reason: collision with root package name */
    public static final int f276c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 4;
    public static final int g = 5;
    public static final int h = 6;
    public static final int i = 7;
    public static final int j = 8;
    private static final int k = 8;
    public static final int l = 1;
    public static final int m = 2;
    public static final int n = 4;
    public static final int o = 8;
    public static final int p = 16;
    public static final int q = 32;
    public static final int r = 64;
    public static final int s = 128;
    public static final int t = 256;
    public static final int u = 511;

    /* renamed from: a, reason: collision with root package name */
    private b f277a;

    @m0(24)
    private static class a extends b {
        private static final int e = 1000000;
        private static final int f = 500000;
        private static HandlerThread g;
        private static Handler h;

        /* renamed from: a, reason: collision with root package name */
        int f278a;

        /* renamed from: b, reason: collision with root package name */
        SparseIntArray[] f279b = new SparseIntArray[9];

        /* renamed from: c, reason: collision with root package name */
        private ArrayList<WeakReference<Activity>> f280c = new ArrayList<>();
        Window.OnFrameMetricsAvailableListener d = new WindowOnFrameMetricsAvailableListenerC0023a();

        /* renamed from: androidx.core.app.l$a$a, reason: collision with other inner class name */
        class WindowOnFrameMetricsAvailableListenerC0023a implements Window.OnFrameMetricsAvailableListener {
            WindowOnFrameMetricsAvailableListenerC0023a() {
            }

            @Override // android.view.Window.OnFrameMetricsAvailableListener
            public void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int r11) {
                a aVar = a.this;
                if ((aVar.f278a & 1) != 0) {
                    aVar.f(aVar.f279b[0], frameMetrics.getMetric(8));
                }
                a aVar2 = a.this;
                if ((aVar2.f278a & 2) != 0) {
                    aVar2.f(aVar2.f279b[1], frameMetrics.getMetric(1));
                }
                a aVar3 = a.this;
                if ((aVar3.f278a & 4) != 0) {
                    aVar3.f(aVar3.f279b[2], frameMetrics.getMetric(3));
                }
                a aVar4 = a.this;
                if ((aVar4.f278a & 8) != 0) {
                    aVar4.f(aVar4.f279b[3], frameMetrics.getMetric(4));
                }
                a aVar5 = a.this;
                if ((aVar5.f278a & 16) != 0) {
                    aVar5.f(aVar5.f279b[4], frameMetrics.getMetric(5));
                }
                a aVar6 = a.this;
                if ((aVar6.f278a & 64) != 0) {
                    aVar6.f(aVar6.f279b[6], frameMetrics.getMetric(7));
                }
                a aVar7 = a.this;
                if ((aVar7.f278a & 32) != 0) {
                    aVar7.f(aVar7.f279b[5], frameMetrics.getMetric(6));
                }
                a aVar8 = a.this;
                if ((aVar8.f278a & 128) != 0) {
                    aVar8.f(aVar8.f279b[7], frameMetrics.getMetric(0));
                }
                a aVar9 = a.this;
                if ((aVar9.f278a & 256) != 0) {
                    aVar9.f(aVar9.f279b[8], frameMetrics.getMetric(2));
                }
            }
        }

        a(int r2) {
            this.f278a = r2;
        }

        @Override // androidx.core.app.l.b
        public void a(Activity activity) {
            if (g == null) {
                HandlerThread handlerThread = new HandlerThread("FrameMetricsAggregator");
                g = handlerThread;
                handlerThread.start();
                h = new Handler(g.getLooper());
            }
            for (int r0 = 0; r0 <= 8; r0++) {
                SparseIntArray[] sparseIntArrayArr = this.f279b;
                if (sparseIntArrayArr[r0] == null && (this.f278a & (1 << r0)) != 0) {
                    sparseIntArrayArr[r0] = new SparseIntArray();
                }
            }
            activity.getWindow().addOnFrameMetricsAvailableListener(this.d, h);
            this.f280c.add(new WeakReference<>(activity));
        }

        @Override // androidx.core.app.l.b
        public SparseIntArray[] b() {
            return this.f279b;
        }

        @Override // androidx.core.app.l.b
        public SparseIntArray[] c(Activity activity) {
            Iterator<WeakReference<Activity>> it = this.f280c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                WeakReference<Activity> next = it.next();
                if (next.get() == activity) {
                    this.f280c.remove(next);
                    break;
                }
            }
            activity.getWindow().removeOnFrameMetricsAvailableListener(this.d);
            return this.f279b;
        }

        @Override // androidx.core.app.l.b
        public SparseIntArray[] d() {
            SparseIntArray[] sparseIntArrayArr = this.f279b;
            this.f279b = new SparseIntArray[9];
            return sparseIntArrayArr;
        }

        @Override // androidx.core.app.l.b
        public SparseIntArray[] e() {
            for (int size = this.f280c.size() - 1; size >= 0; size--) {
                WeakReference<Activity> weakReference = this.f280c.get(size);
                Activity activity = weakReference.get();
                if (weakReference.get() != null) {
                    activity.getWindow().removeOnFrameMetricsAvailableListener(this.d);
                    this.f280c.remove(size);
                }
            }
            return this.f279b;
        }

        void f(SparseIntArray sparseIntArray, long j) {
            if (sparseIntArray != null) {
                int r1 = (int) ((500000 + j) / 1000000);
                if (j >= 0) {
                    sparseIntArray.put(r1, sparseIntArray.get(r1) + 1);
                }
            }
        }
    }

    private static class b {
        b() {
        }

        public void a(Activity activity) {
        }

        public SparseIntArray[] b() {
            return null;
        }

        public SparseIntArray[] c(Activity activity) {
            return null;
        }

        public SparseIntArray[] d() {
            return null;
        }

        public SparseIntArray[] e() {
            return null;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @p0({p0.a.LIBRARY_GROUP_PREFIX})
    public @interface c {
    }

    public l() {
        this(1);
    }

    public l(int r3) {
        if (Build.VERSION.SDK_INT >= 24) {
            this.f277a = new a(r3);
        } else {
            this.f277a = new b();
        }
    }

    public void a(@h0 Activity activity) {
        this.f277a.a(activity);
    }

    @i0
    public SparseIntArray[] b() {
        return this.f277a.b();
    }

    @i0
    public SparseIntArray[] c(@h0 Activity activity) {
        return this.f277a.c(activity);
    }

    @i0
    public SparseIntArray[] d() {
        return this.f277a.d();
    }

    @i0
    public SparseIntArray[] e() {
        return this.f277a.e();
    }
}
