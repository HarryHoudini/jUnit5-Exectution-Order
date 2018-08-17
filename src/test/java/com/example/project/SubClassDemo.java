/*
 * Copyright 2015-2018 the original author or authors.
 *
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v2.0 which
 * accompanies this distribution and is available at
 *
 * http://www.eclipse.org/legal/epl-v20.html
 */

package com.example.project;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import static org.junit.jupiter.api.Assertions.fail;

class SubClassDemo extends SingleClassDemo {

    @Test
    void subTest1() {
        logTestName();
    }
 
    @Test
    void subTest2() {
        logTestName();
    }

    @Test
    void subTest3() {
        fail(getFailMessage());
    }

    @Disabled("Ignored message for demo purposes")
    @Test
    void subTest4() {
        logSkipTest();
    }
}
