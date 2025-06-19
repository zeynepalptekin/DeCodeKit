package c.a.b.c.b;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.annotation.h0;
import androidx.annotation.i0;

/* loaded from: classes.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    private long f1949a;

    /* renamed from: b, reason: collision with root package name */
    private long f1950b;

    /* renamed from: c, reason: collision with root package name */
    @i0
    private TimeInterpolator f1951c;
    private int d;
    private int e;

    public i(long j, long j2) {
        this.f1949a = 0L;
        this.f1950b = 300L;
        this.f1951c = null;
        this.d = 0;
        this.e = 1;
        this.f1949a = j;
        this.f1950b = j2;
    }

    public i(long j, long j2, @h0 TimeInterpolator timeInterpolator) {
        this.f1949a = 0L;
        this.f1950b = 300L;
        this.f1951c = null;
        this.d = 0;
        this.e = 1;
        this.f1949a = j;
        this.f1950b = j2;
        this.f1951c = timeInterpolator;
    }

    @h0
    static i b(@h0 ValueAnimator valueAnimator) {
        i iVar = new i(valueAnimator.getStartDelay(), valueAnimator.getDuration(), f(valueAnimator));
        iVar.d = valueAnimator.getRepeatCount();
        iVar.e = valueAnimator.getRepeatMode();
        return iVar;
    }

    private static TimeInterpolator f(@h0 ValueAnimator valueAnimator) {
        TimeInterpolator interpolator = valueAnimator.getInterpolator();
        return ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) ? a.f1936b : interpolator instanceof AccelerateInterpolator ? a.f1937c : interpolator instanceof DecelerateInterpolator ? a.d : interpolator;
    }

    public void a(@h0 Animator animator) {
        animator.setStartDelay(c());
        animator.setDuration(d());
        animator.setInterpolator(e());
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(g());
            valueAnimator.setRepeatMode(h());
        }
    }

    public long c() {
        return this.f1949a;
    }

    public long d() {
        return this.f1950b;
    }

    @i0
    public TimeInterpolator e() {
        TimeInterpolator timeInterpolator = this.f1951c;
        return timeInterpolator != null ? timeInterpolator : a.f1936b;
    }

    public boolean equals(@i0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (c() == iVar.c() && d() == iVar.d() && g() == iVar.g() && h() == iVar.h()) {
            return e().getClass().equals(iVar.e().getClass());
        }
        return false;
    }

    public int g() {
        return this.d;
    }

    public int h() {
        return this.e;
    }

    public int hashCode() {
        return (((((((((int) (c() ^ (c() >>> 32))) * 31) + ((int) (d() ^ (d() >>> 32)))) * 31) + e().getClass().hashCode()) * 31) + g()) * 31) + h();
    }

    @h0
    public String toString() {
        return '\n' + i.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + c() + " duration: " + d() + " interpolator: " + e().getClass() + " repeatCount: " + g() + " repeatMode: " + h() + "}\n";
    }
}
