// This software is released into the Public Domain.  See copying.txt for details.
package org.villseriol.osmosis.normalize.v0_6.transform.decorators;

import org.villseriol.osmosis.normalize.v0_6.transform.NoTransform;
import org.villseriol.osmosis.shared.Transform;


public class TransformProxyDecorator implements Transform {
    private Transform proxy = new NoTransform();

    @Override
    public String action(String input) {
        return proxy.action(input);
    }


    @Override
    public void action(StringBuffer input) {
        proxy.action(input);
    }


    public Transform getProxy() {
        return proxy;
    }


    public void setProxy(Transform proxy) {
        this.proxy = proxy;
    }

}
