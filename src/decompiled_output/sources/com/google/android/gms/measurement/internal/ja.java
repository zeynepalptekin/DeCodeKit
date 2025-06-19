package com.google.android.gms.measurement.internal;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes.dex */
final class ja extends SSLSocketFactory {

    /* renamed from: a, reason: collision with root package name */
    private final SSLSocketFactory f6422a;

    ja() {
        this(HttpsURLConnection.getDefaultSSLSocketFactory());
    }

    private ja(SSLSocketFactory sSLSocketFactory) {
        this.f6422a = sSLSocketFactory;
    }

    private final SSLSocket a(SSLSocket sSLSocket) {
        return new ia(this, sSLSocket);
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket() throws IOException {
        return a((SSLSocket) this.f6422a.createSocket());
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int r3) throws IOException {
        return a((SSLSocket) this.f6422a.createSocket(str, r3));
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(String str, int r3, InetAddress inetAddress, int r5) throws IOException {
        return a((SSLSocket) this.f6422a.createSocket(str, r3, inetAddress, r5));
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int r3) throws IOException {
        return a((SSLSocket) this.f6422a.createSocket(inetAddress, r3));
    }

    @Override // javax.net.SocketFactory
    public final Socket createSocket(InetAddress inetAddress, int r3, InetAddress inetAddress2, int r5) throws IOException {
        return a((SSLSocket) this.f6422a.createSocket(inetAddress, r3, inetAddress2, r5));
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final Socket createSocket(Socket socket, String str, int r4, boolean z) throws IOException {
        return a((SSLSocket) this.f6422a.createSocket(socket, str, r4, z));
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getDefaultCipherSuites() {
        return this.f6422a.getDefaultCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public final String[] getSupportedCipherSuites() {
        return this.f6422a.getSupportedCipherSuites();
    }
}
