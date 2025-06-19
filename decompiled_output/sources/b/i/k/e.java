package b.i.k;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import androidx.annotation.h0;
import androidx.annotation.i0;
import java.lang.reflect.InvocationTargetException;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private static final String f1057a = "HandlerCompat";

    private e() {
    }

    @h0
    public static Handler a(@h0 Looper looper) {
        int r0 = Build.VERSION.SDK_INT;
        if (r0 >= 28) {
            return Handler.createAsync(looper);
        }
        if (r0 >= 16) {
            try {
                return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
            } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
                Log.v(f1057a, "Unable to invoke Handler(Looper, Callback, boolean) constructor");
            } catch (InvocationTargetException e) {
                Throwable cause = e.getCause();
                if (cause instanceof RuntimeException) {
                    throw ((RuntimeException) cause);
                }
                if (cause instanceof Error) {
                    throw ((Error) cause);
                }
                throw new RuntimeException(cause);
            }
        }
        return new Handler(looper);
    }

    @h0
    public static Handler b(@h0 Looper looper, @h0 Handler.Callback callback) {
        int r0 = Build.VERSION.SDK_INT;
        if (r0 >= 28) {
            return Handler.createAsync(looper, callback);
        }
        if (r0 >= 16) {
            try {
                return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, callback, Boolean.TRUE);
            } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
                Log.v(f1057a, "Unable to invoke Handler(Looper, Callback, boolean) constructor");
            } catch (InvocationTargetException e) {
                Throwable cause = e.getCause();
                if (cause instanceof RuntimeException) {
                    throw ((RuntimeException) cause);
                }
                if (cause instanceof Error) {
                    throw ((Error) cause);
                }
                throw new RuntimeException(cause);
            }
        }
        return new Handler(looper, callback);
    }

    public static boolean c(@h0 Handler handler, @h0 Runnable runnable, @i0 Object obj, long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            return handler.postDelayed(runnable, obj, j);
        }
        Message messageObtain = Message.obtain(handler, runnable);
        messageObtain.obj = obj;
        return handler.sendMessageDelayed(messageObtain, j);
    }
}
