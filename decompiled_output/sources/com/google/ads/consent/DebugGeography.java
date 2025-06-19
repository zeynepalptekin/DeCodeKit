package com.google.ads.consent;

/* loaded from: classes.dex */
public enum DebugGeography {
    DEBUG_GEOGRAPHY_DISABLED(0),
    DEBUG_GEOGRAPHY_EEA(1),
    DEBUG_GEOGRAPHY_NOT_EEA(2);

    private final int value;

    DebugGeography(int value) {
        this.value = value;
    }

    public Integer e() {
        return Integer.valueOf(this.value);
    }
}
