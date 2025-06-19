package androidx.core.app;

import android.app.Service;
import android.app.job.JobInfo;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobServiceEngine;
import android.app.job.JobWorkItem;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Build;
import android.os.IBinder;
import android.os.PowerManager;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.annotation.m0;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class m extends Service {
    static final String k = "JobIntentService";
    static final boolean l = false;
    static final Object m = new Object();
    static final HashMap<ComponentName, h> n = new HashMap<>();
    b d;
    h e;
    a f;
    boolean g = false;
    boolean h = false;
    boolean i = false;
    final ArrayList<d> j;

    final class a extends AsyncTask<Void, Void, Void> {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void doInBackground(Void... voidArr) {
            while (true) {
                e eVarA = m.this.a();
                if (eVarA == null) {
                    return null;
                }
                m.this.h(eVarA.getIntent());
                eVarA.a();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onCancelled(Void r1) {
            m.this.j();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Void r1) {
            m.this.j();
        }
    }

    interface b {
        e a();

        IBinder b();
    }

    static final class c extends h {
        private final Context d;
        private final PowerManager.WakeLock e;
        private final PowerManager.WakeLock f;
        boolean g;
        boolean h;

        c(Context context, ComponentName componentName) {
            super(componentName);
            this.d = context.getApplicationContext();
            PowerManager powerManager = (PowerManager) context.getSystemService("power");
            PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(1, componentName.getClassName() + ":launch");
            this.e = wakeLockNewWakeLock;
            wakeLockNewWakeLock.setReferenceCounted(false);
            PowerManager.WakeLock wakeLockNewWakeLock2 = powerManager.newWakeLock(1, componentName.getClassName() + ":run");
            this.f = wakeLockNewWakeLock2;
            wakeLockNewWakeLock2.setReferenceCounted(false);
        }

        @Override // androidx.core.app.m.h
        void a(Intent intent) {
            Intent intent2 = new Intent(intent);
            intent2.setComponent(this.f291a);
            if (this.d.startService(intent2) != null) {
                synchronized (this) {
                    if (!this.g) {
                        this.g = true;
                        if (!this.h) {
                            this.e.acquire(60000L);
                        }
                    }
                }
            }
        }

        @Override // androidx.core.app.m.h
        public void c() {
            synchronized (this) {
                if (this.h) {
                    if (this.g) {
                        this.e.acquire(60000L);
                    }
                    this.h = false;
                    this.f.release();
                }
            }
        }

        @Override // androidx.core.app.m.h
        public void d() {
            synchronized (this) {
                if (!this.h) {
                    this.h = true;
                    this.f.acquire(600000L);
                    this.e.release();
                }
            }
        }

        @Override // androidx.core.app.m.h
        public void e() {
            synchronized (this) {
                this.g = false;
            }
        }
    }

    final class d implements e {

        /* renamed from: a, reason: collision with root package name */
        final Intent f283a;

        /* renamed from: b, reason: collision with root package name */
        final int f284b;

        d(Intent intent, int r3) {
            this.f283a = intent;
            this.f284b = r3;
        }

        @Override // androidx.core.app.m.e
        public void a() {
            m.this.stopSelf(this.f284b);
        }

        @Override // androidx.core.app.m.e
        public Intent getIntent() {
            return this.f283a;
        }
    }

    interface e {
        void a();

        Intent getIntent();
    }

    @m0(26)
    static final class f extends JobServiceEngine implements b {
        static final String d = "JobServiceEngineImpl";
        static final boolean e = false;

        /* renamed from: a, reason: collision with root package name */
        final m f286a;

        /* renamed from: b, reason: collision with root package name */
        final Object f287b;

        /* renamed from: c, reason: collision with root package name */
        JobParameters f288c;

        final class a implements e {

            /* renamed from: a, reason: collision with root package name */
            final JobWorkItem f289a;

            a(JobWorkItem jobWorkItem) {
                this.f289a = jobWorkItem;
            }

            @Override // androidx.core.app.m.e
            public void a() {
                synchronized (f.this.f287b) {
                    if (f.this.f288c != null) {
                        f.this.f288c.completeWork(this.f289a);
                    }
                }
            }

            @Override // androidx.core.app.m.e
            public Intent getIntent() {
                return this.f289a.getIntent();
            }
        }

        f(m mVar) {
            super(mVar);
            this.f287b = new Object();
            this.f286a = mVar;
        }

        @Override // androidx.core.app.m.b
        public e a() {
            synchronized (this.f287b) {
                if (this.f288c == null) {
                    return null;
                }
                JobWorkItem jobWorkItemDequeueWork = this.f288c.dequeueWork();
                if (jobWorkItemDequeueWork == null) {
                    return null;
                }
                jobWorkItemDequeueWork.getIntent().setExtrasClassLoader(this.f286a.getClassLoader());
                return new a(jobWorkItemDequeueWork);
            }
        }

        @Override // androidx.core.app.m.b
        public IBinder b() {
            return getBinder();
        }

        @Override // android.app.job.JobServiceEngine
        public boolean onStartJob(JobParameters jobParameters) {
            this.f288c = jobParameters;
            this.f286a.e(false);
            return true;
        }

        @Override // android.app.job.JobServiceEngine
        public boolean onStopJob(JobParameters jobParameters) {
            boolean zB = this.f286a.b();
            synchronized (this.f287b) {
                this.f288c = null;
            }
            return zB;
        }
    }

    @m0(26)
    static final class g extends h {
        private final JobInfo d;
        private final JobScheduler e;

        g(Context context, ComponentName componentName, int r5) {
            super(componentName);
            b(r5);
            this.d = new JobInfo.Builder(r5, this.f291a).setOverrideDeadline(0L).build();
            this.e = (JobScheduler) context.getApplicationContext().getSystemService("jobscheduler");
        }

        @Override // androidx.core.app.m.h
        void a(Intent intent) {
            this.e.enqueue(this.d, new JobWorkItem(intent));
        }
    }

    static abstract class h {

        /* renamed from: a, reason: collision with root package name */
        final ComponentName f291a;

        /* renamed from: b, reason: collision with root package name */
        boolean f292b;

        /* renamed from: c, reason: collision with root package name */
        int f293c;

        h(ComponentName componentName) {
            this.f291a = componentName;
        }

        abstract void a(Intent intent);

        void b(int r4) {
            if (!this.f292b) {
                this.f292b = true;
                this.f293c = r4;
            } else {
                if (this.f293c == r4) {
                    return;
                }
                throw new IllegalArgumentException("Given job ID " + r4 + " is different than previous " + this.f293c);
            }
        }

        public void c() {
        }

        public void d() {
        }

        public void e() {
        }
    }

    public m() {
        this.j = Build.VERSION.SDK_INT >= 26 ? null : new ArrayList<>();
    }

    public static void c(@h0 Context context, @h0 ComponentName componentName, int r4, @h0 Intent intent) {
        if (intent == null) {
            throw new IllegalArgumentException("work must not be null");
        }
        synchronized (m) {
            h hVarF = f(context, componentName, true, r4);
            hVarF.b(r4);
            hVarF.a(intent);
        }
    }

    public static void d(@h0 Context context, @h0 Class<?> cls, int r3, @h0 Intent intent) {
        c(context, new ComponentName(context, cls), r3, intent);
    }

    static h f(Context context, ComponentName componentName, boolean z, int r5) {
        h cVar;
        h hVar = n.get(componentName);
        if (hVar != null) {
            return hVar;
        }
        if (Build.VERSION.SDK_INT < 26) {
            cVar = new c(context, componentName);
        } else {
            if (!z) {
                throw new IllegalArgumentException("Can't be here without a job id");
            }
            cVar = new g(context, componentName, r5);
        }
        h hVar2 = cVar;
        n.put(componentName, hVar2);
        return hVar2;
    }

    e a() {
        b bVar = this.d;
        if (bVar != null) {
            return bVar.a();
        }
        synchronized (this.j) {
            if (this.j.size() <= 0) {
                return null;
            }
            return this.j.remove(0);
        }
    }

    boolean b() {
        a aVar = this.f;
        if (aVar != null) {
            aVar.cancel(this.g);
        }
        this.h = true;
        return i();
    }

    void e(boolean z) {
        if (this.f == null) {
            this.f = new a();
            h hVar = this.e;
            if (hVar != null && z) {
                hVar.d();
            }
            this.f.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    public boolean g() {
        return this.h;
    }

    protected abstract void h(@h0 Intent intent);

    public boolean i() {
        return true;
    }

    void j() {
        ArrayList<d> arrayList = this.j;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.f = null;
                if (this.j != null && this.j.size() > 0) {
                    e(false);
                } else if (!this.i) {
                    this.e.c();
                }
            }
        }
    }

    public void k(boolean z) {
        this.g = z;
    }

    @Override // android.app.Service
    public IBinder onBind(@h0 Intent intent) {
        b bVar = this.d;
        if (bVar != null) {
            return bVar.b();
        }
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        if (Build.VERSION.SDK_INT >= 26) {
            this.d = new f(this);
            this.e = null;
        } else {
            this.d = null;
            this.e = f(this, new ComponentName(this, (Class<?>) m.class), false, 0);
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        ArrayList<d> arrayList = this.j;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.i = true;
                this.e.c();
            }
        }
    }

    @Override // android.app.Service
    public int onStartCommand(@i0 Intent intent, int r4, int r5) {
        if (this.j == null) {
            return 2;
        }
        this.e.e();
        synchronized (this.j) {
            ArrayList<d> arrayList = this.j;
            if (intent == null) {
                intent = new Intent();
            }
            arrayList.add(new d(intent, r5));
            e(true);
        }
        return 3;
    }
}
