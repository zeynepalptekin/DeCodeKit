package com.google.firebase.components;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public class q extends r {
    private final List<f<?>> d;

    public q(List<f<?>> list) {
        super("Dependency cycle detected: " + Arrays.toString(list.toArray()));
        this.d = list;
    }

    public List<f<?>> a() {
        return this.d;
    }
}
