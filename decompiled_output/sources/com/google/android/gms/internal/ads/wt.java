package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Display;
import android.view.WindowManager;
import javax.annotation.concurrent.GuardedBy;

/* loaded from: classes.dex */
final class wt implements SensorEventListener {

    /* renamed from: a, reason: collision with root package name */
    private final SensorManager f5886a;

    /* renamed from: c, reason: collision with root package name */
    private final Display f5888c;

    @GuardedBy("sensorThreadLock")
    private float[] f;
    private Handler g;
    private yt h;
    private final float[] d = new float[9];
    private final float[] e = new float[9];

    /* renamed from: b, reason: collision with root package name */
    private final Object f5887b = new Object();

    wt(Context context) {
        this.f5886a = (SensorManager) context.getSystemService("sensor");
        this.f5888c = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
    }

    private final void e(int r4, int r5) {
        float[] fArr = this.e;
        float f = fArr[r4];
        fArr[r4] = fArr[r5];
        fArr[r5] = f;
    }

    final void a() {
        if (this.g != null) {
            return;
        }
        Sensor defaultSensor = this.f5886a.getDefaultSensor(11);
        if (defaultSensor == null) {
            tr.g("No Sensor of TYPE_ROTATION_VECTOR");
            return;
        }
        HandlerThread handlerThread = new HandlerThread("OrientationMonitor");
        handlerThread.start();
        lu1 lu1Var = new lu1(handlerThread.getLooper());
        this.g = lu1Var;
        if (this.f5886a.registerListener(this, defaultSensor, 0, lu1Var)) {
            return;
        }
        tr.g("SensorManager.registerListener failed.");
        b();
    }

    final void b() {
        if (this.g == null) {
            return;
        }
        this.f5886a.unregisterListener(this);
        this.g.post(new vt(this));
        this.g = null;
    }

    final void c(yt ytVar) {
        this.h = ytVar;
    }

    final boolean d(float[] fArr) {
        synchronized (this.f5887b) {
            if (this.f == null) {
                return false;
            }
            System.arraycopy(this.f, 0, fArr, 0, this.f.length);
            return true;
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int r2) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        float[] fArr = sensorEvent.values;
        if (fArr[0] == 0.0f && fArr[1] == 0.0f && fArr[2] == 0.0f) {
            return;
        }
        synchronized (this.f5887b) {
            if (this.f == null) {
                this.f = new float[9];
            }
        }
        SensorManager.getRotationMatrixFromVector(this.d, fArr);
        int rotation = this.f5888c.getRotation();
        if (rotation == 1) {
            SensorManager.remapCoordinateSystem(this.d, 2, 129, this.e);
        } else if (rotation == 2) {
            SensorManager.remapCoordinateSystem(this.d, 129, 130, this.e);
        } else if (rotation != 3) {
            System.arraycopy(this.d, 0, this.e, 0, 9);
        } else {
            SensorManager.remapCoordinateSystem(this.d, 130, 1, this.e);
        }
        e(1, 3);
        e(2, 6);
        e(5, 7);
        synchronized (this.f5887b) {
            System.arraycopy(this.e, 0, this.f, 0, 9);
        }
        yt ytVar = this.h;
        if (ytVar != null) {
            ytVar.a();
        }
    }
}
