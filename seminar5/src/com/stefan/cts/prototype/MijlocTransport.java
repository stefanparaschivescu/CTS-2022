package com.stefan.cts.prototype;

public interface MijlocTransport extends Cloneable {
    MijlocTransport copiaza() throws CloneNotSupportedException;
}
