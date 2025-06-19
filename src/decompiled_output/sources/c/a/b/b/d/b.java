package c.a.b.b.d;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.r;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@com.google.android.gms.common.annotation.a
/* loaded from: classes.dex */
public class b implements ServiceConnection {
    private boolean d = false;
    private final BlockingQueue<IBinder> e = new LinkedBlockingQueue();

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    public IBinder a() throws InterruptedException {
        r.j("BlockingServiceConnection.getService() called on main thread");
        if (this.d) {
            throw new IllegalStateException("Cannot call get on this connection more than once");
        }
        this.d = true;
        return this.e.take();
    }

    @RecentlyNonNull
    @com.google.android.gms.common.annotation.a
    public IBinder b(@RecentlyNonNull long j, @RecentlyNonNull TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        r.j("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (this.d) {
            throw new IllegalStateException("Cannot call get on this connection more than once");
        }
        this.d = true;
        IBinder iBinderPoll = this.e.poll(j, timeUnit);
        if (iBinderPoll != null) {
            return iBinderPoll;
        }
        throw new TimeoutException("Timed out waiting for the service connection");
    }

    @Override // android.content.ServiceConnection
    public void onServiceConnected(@RecentlyNonNull ComponentName componentName, @RecentlyNonNull IBinder iBinder) {
        this.e.add(iBinder);
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(@RecentlyNonNull ComponentName componentName) {
    }
}
