// This software is released into the Public Domain.  See copying.txt for details.
package org.villseriol.osmosis.kakasi.v0_6.transform;

import org.villseriol.osmosis.shared.Transform;


public class TransformProxy implements Transform {
    private Transform proxy = new NoTransform();

    @Override
    public String action(String input) {
        return proxy.action(input);
    }


    public Transform getProxy() {
        return proxy;
    }


    public void setProxy(Transform proxy) {
        this.proxy = proxy;
    }


    @Override
    public void action(StringBuffer input) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'action'");
    }
}
