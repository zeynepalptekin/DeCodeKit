package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.h0;
import androidx.annotation.i0;
import androidx.annotation.p0;
import androidx.annotation.s0;
import androidx.annotation.t0;
import java.util.Collection;

@p0({p0.a.LIBRARY_GROUP})
/* loaded from: classes.dex */
public interface f<S> extends Parcelable {
    @h0
    Collection<Long> A();

    @i0
    S G();

    void Q(long j);

    @h0
    View S(@h0 LayoutInflater layoutInflater, @i0 ViewGroup viewGroup, @i0 Bundle bundle, @h0 a aVar, @h0 s<S> sVar);

    @s0
    int T();

    @h0
    String n(Context context);

    @t0
    int o(Context context);

    @h0
    Collection<b.i.o.f<Long, Long>> r();

    void v(@h0 S s);

    boolean x();
}
