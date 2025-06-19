package c.a.b.b.g.c;

import android.annotation.TargetApi;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.Context;
import android.os.Build;
import android.os.UserHandle;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@TargetApi(24)
/* loaded from: classes.dex */
public final class h6 {

    /* renamed from: b, reason: collision with root package name */
    @androidx.annotation.i0
    private static final Method f1706b = c();

    /* renamed from: c, reason: collision with root package name */
    @androidx.annotation.i0
    private static final Method f1707c = d();

    /* renamed from: a, reason: collision with root package name */
    private final JobScheduler f1708a;

    private h6(JobScheduler jobScheduler) {
        this.f1708a = jobScheduler;
    }

    private final int a(JobInfo jobInfo, String str, int r7, String str2) {
        Method method = f1706b;
        if (method != null) {
            try {
                return ((Integer) method.invoke(this.f1708a, jobInfo, str, Integer.valueOf(r7), str2)).intValue();
            } catch (IllegalAccessException | InvocationTargetException e) {
                Log.e(str2, "error calling scheduleAsPackage", e);
            }
        }
        return this.f1708a.schedule(jobInfo);
    }

    public static int b(Context context, JobInfo jobInfo, String str, String str2) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        return (f1706b == null || context.checkSelfPermission("android.permission.UPDATE_DEVICE_STATS") != 0) ? jobScheduler.schedule(jobInfo) : new h6(jobScheduler).a(jobInfo, str, e(), str2);
    }

    @androidx.annotation.i0
    private static Method c() {
        if (Build.VERSION.SDK_INT < 24) {
            return null;
        }
        try {
            return JobScheduler.class.getDeclaredMethod("scheduleAsPackage", JobInfo.class, String.class, Integer.TYPE, String.class);
        } catch (NoSuchMethodException unused) {
            if (!Log.isLoggable("JobSchedulerCompat", 6)) {
                return null;
            }
            Log.e("JobSchedulerCompat", "No scheduleAsPackage method available, falling back to schedule");
            return null;
        }
    }

    @androidx.annotation.i0
    private static Method d() {
        if (Build.VERSION.SDK_INT >= 24) {
            try {
                return UserHandle.class.getDeclaredMethod("myUserId", null);
            } catch (NoSuchMethodException unused) {
                if (Log.isLoggable("JobSchedulerCompat", 6)) {
                    Log.e("JobSchedulerCompat", "No myUserId method available");
                }
            }
        }
        return null;
    }

    private static int e() {
        Method method = f1707c;
        if (method != null) {
            try {
                return ((Integer) method.invoke(null, new Object[0])).intValue();
            } catch (IllegalAccessException | InvocationTargetException e) {
                if (Log.isLoggable("JobSchedulerCompat", 6)) {
                    Log.e("JobSchedulerCompat", "myUserId invocation illegal", e);
                }
            }
        }
        return 0;
    }
}
