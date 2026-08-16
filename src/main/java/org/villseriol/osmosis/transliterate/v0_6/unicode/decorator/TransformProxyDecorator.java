// This software is released into the Public Domain.  See copying.txt for details.
package org.villseriol.osmosis.transliterate.v0_6.unicode.decorator;

import org.villseriol.osmosis.transliterate.v0_6.unicode.transform.NoTransform;
import org.villseriol.osmosis.transliterate.v0_6.unicode.types.Unimap;


public class TransformProxyDecorator implements Unimap {
    private Unimap proxy = new NoTransform();

    @Override
    public String action(String input) {
        return proxy.action(input);
    }


    @Override
    public void action(StringBuffer input) {
        proxy.action(input);
    }


    public Unimap getProxy() {
        return proxy;
    }


    public void setProxy(Unimap proxy) {
        this.proxy = proxy;
    }

}
