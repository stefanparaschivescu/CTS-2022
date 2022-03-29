package com.stefan.cts;

import com.stefan.cts.Familie.Autobuz;
import com.stefan.cts.Familie.MijlocTransport;
import com.stefan.cts.Familie.Tramvai;
import com.stefan.cts.Familie.Troleibuz;

public class Factory {
    public MijlocTransport createObject(TipTransport tipTransport, String numarInmatriculare) {
        switch (tipTransport) {
            case AUTOBUZ:
                return new Autobuz(numarInmatriculare);
            case TRAMVAI:
                return new Tramvai(numarInmatriculare);
            case TROLEIBUZ:
                return new Troleibuz(numarInmatriculare);
            default:
                return null;
        }
    }
}
