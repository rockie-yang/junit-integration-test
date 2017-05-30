package com.rockieyang.test.integration.mockito;

import org.junit.Test;
import org.junit.runner.RunWith;

import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.powermock.api.mockito.PowerMockito.mock;
import static org.powermock.api.mockito.PowerMockito.when;
import static org.powermock.api.mockito.PowerMockito.whenNew;

@RunWith(PowerMockRunner.class)
@PrepareForTest(Instance.class)
public class MockClassMethod {
    @Test
    public void test() throws Exception {
        Instance inst = mock(Instance.class);


        whenNew(Instance.class).withAnyArguments().thenReturn(inst);

        when(inst.fun("hello")).thenReturn("changed");

        Factory factory = new Factory();
        Instance real = factory.newInstance();
        String actual = real.fun("hello");

        System.out.println(actual);

    }
}
